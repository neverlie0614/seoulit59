package kr.co.JH5th.logistics.business.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tobesoft.xplatform.data.PlatformData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.ModelMap;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.business.sf.BusinessServiceFacade;
import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.business.to.ContractReportTO;
import kr.co.JH5th.logistics.business.to.ContractTO;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@Controller
public class ContractController {
	@Autowired
	private BusinessServiceFacade businessServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@RequestMapping("logistics/business/findContractList.do")
	public void findContractList(HttpServletRequest request, HttpServletResponse response) throws Exception {
			PlatformData outData = (PlatformData) request.getAttribute("outData");
			List<ContractTO> contractList = businessServiceFacade.findContractList();
			
			datasetBeanMapper.beansToDataset(outData, contractList, ContractTO.class);
			
	}
	
	@RequestMapping("logistics/business/findContractDetailList.do")
	public void findContractDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<ContractDetailTO> contractDetailList = businessServiceFacade.findContractDetailList();
		
		datasetBeanMapper.beansToDataset(outData, contractDetailList, ContractDetailTO.class);
		
	}
	
	@RequestMapping("logistics/business/batchContract.do")
	public void batchContract(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<ContractTO> contractList = datasetBeanMapper.datasetToBeans(inData, ContractTO.class); 
		
		List<ContractDetailTO> contractDetailList = datasetBeanMapper.datasetToBeans(inData, ContractDetailTO.class);
		
		businessServiceFacade.batchContract(contractList,contractDetailList);
		
		findContractList(request, response);
		findContractDetailList(request, response);
		
	}
	
	@RequestMapping("logistics/business/printContractPDF.do")
	public ModelAndView printContractPDF(HttpServletRequest request, HttpServletResponse response) throws Exception {
		String format = request.getParameter("format");
		String contractNo = request.getParameter("contractNo");
		List<ContractReportTO> contractList = businessServiceFacade.findContractReporList(contractNo);
		JRBeanCollectionDataSource source = new JRBeanCollectionDataSource(contractList);

		ModelMap modelMap = new ModelMap();
		modelMap.put("format", format);
		modelMap.put("source", source);
		ModelAndView modelAndView = new ModelAndView("multiformat-view", modelMap);

		request.setAttribute("outData", null);
		return modelAndView;
	}
	
}
