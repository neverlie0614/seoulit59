package kr.co.JH5th.logistics.production.controller;

import java.util.List;

import com.tobesoft.xplatform.data.PlatformData;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.production.sf.ProductionServiceFacade;
import kr.co.JH5th.logistics.production.to.MpsTO;

@Controller
public class MpsController {
	@Autowired
	private ProductionServiceFacade productionServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	
	
	@RequestMapping("logistics/production/findMpsList.do")
	public void findMpsList (HttpServletRequest request, HttpServletResponse response) throws Exception {
		
//		HashMap<String,String> map = new HashMap<>();
//		PlatformData inData = (PlatformData) request.getAttribute("inData");
//		PlatformData outData = (PlatformData) request.getAttribute("outData");
//		String fromDate = inData.getVariable("fromDate").getString();
//		String toDate = inData.getVariable("toDate").getString();
//		map.put("fromDate", fromDate);
//		map.put("toDate", toDate);
//		List<MpsTO> mpsList = productionServiceFacade.findMpsList(map);
//		datasetBeanMapper.beansToDataset(outData, mpsList, MpsTO.class);
		
	    PlatformData outData = (PlatformData) request.getAttribute("outData");
        List<MpsTO> mpsList = productionServiceFacade.findMpsList();
        datasetBeanMapper.beansToDataset(outData, mpsList, MpsTO.class);
		
		
	}
	
	@RequestMapping("logistics/production/registerMps.do")
	public void registerMps(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<MpsTO> mpsList = datasetBeanMapper.datasetToBeans(inData, MpsTO.class); 
		List<ContractDetailTO> contractDetailList = datasetBeanMapper.datasetToBeans(inData, ContractDetailTO.class);
		productionServiceFacade.registerMps(mpsList,contractDetailList);
		findMpsList(request, response);
		
		
	}
	
	
	
	
}
