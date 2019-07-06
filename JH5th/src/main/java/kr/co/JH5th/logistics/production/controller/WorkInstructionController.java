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
import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.production.to.WorkInstructionTO;
import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;

public class WorkInstructionController {


	@Autowired
	private ProductionServiceFacade productionServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/production/findWorkInstructionList.do")
	public void findWorkInstructionList (HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<WorkInstructionTO> workInstructionList = productionServiceFacade.findWorkInstructionList();

		datasetBeanMapper.beansToDataset(outData, workInstructionList, WorkInstructionTO.class);


	}

	@RequestMapping("logistics/production/registWorkInstruction.do")
	public void registWorkInstruction(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<WorkInstructionTO> workInstruction = datasetBeanMapper.datasetToBeans(inData, WorkInstructionTO.class);
		List<MrpGatheringTO> mrpGatheringlList = datasetBeanMapper.datasetToBeans(inData, MrpGatheringTO.class);
		List<MaterialPaymentTO> materialPaymentList = datasetBeanMapper.datasetToBeans(inData, MaterialPaymentTO.class);
		List<StockTO> stockList = datasetBeanMapper.datasetToBeans(inData, StockTO.class);
		productionServiceFacade.registWorkInstruction(workInstruction,mrpGatheringlList,materialPaymentList,stockList);
		findWorkInstructionList(request, response);

	}


}
