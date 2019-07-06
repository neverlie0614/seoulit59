package kr.co.JH5th.logistics.production.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.production.sf.ProductionServiceFacade;
import kr.co.JH5th.logistics.production.to.PrmTO;
import kr.co.JH5th.logistics.production.to.WorkInstructionTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;
import kr.co.JH5th.logistics.purchase.to.WarehousingTO;


@Controller
public class PrmController {

	@Autowired
	private ProductionServiceFacade productionServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/production/findPrmList.do")
	public void findPrmList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<PrmTO> mrpList = productionServiceFacade.findPrmList();
		datasetBeanMapper.beansToDataset(outData, mrpList, PrmTO.class);

	}

	@RequestMapping("logistics/production/registPrm.do")
	public void registPrm (HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<WorkInstructionTO> workInstructionList = datasetBeanMapper.datasetToBeans(inData, WorkInstructionTO.class);
		List<PrmTO> prmList = datasetBeanMapper.datasetToBeans(inData, PrmTO.class);
		List<StockTO> stockList = datasetBeanMapper.datasetToBeans(inData, StockTO.class);
		List<WarehousingTO> warehousingList = datasetBeanMapper.datasetToBeans(inData, WarehousingTO.class);
		productionServiceFacade.registPrm(workInstructionList, prmList, stockList, warehousingList);
		findPrmList(request, response);

	}

}
