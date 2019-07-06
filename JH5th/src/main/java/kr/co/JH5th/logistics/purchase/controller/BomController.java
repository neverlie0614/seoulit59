package kr.co.JH5th.logistics.purchase.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.purchase.sf.PurchaseServiceFacade;
import kr.co.JH5th.logistics.purchase.to.BomDeployTO;
import kr.co.JH5th.logistics.purchase.to.BomTO;


public class BomController {

	@Autowired
	private PurchaseServiceFacade purchaseServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@RequestMapping("logistics/purchase/findBomList.do")
	public void findBomList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<BomTO> bomList= purchaseServiceFacade.findBomList();

        datasetBeanMapper.beansToDataset(outData, bomList, BomTO.class);

	}

	@RequestMapping("logistics/purchase/findBomDeployList.do")
	public void findBomDeployList(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		 String itemCode = inData.getVariable("itemCode").getString();
		 String deployCondition = inData.getVariable("deployCondition").getString();

		List<BomDeployTO> bomDeployList = purchaseServiceFacade.findBomDeployList(itemCode,deployCondition);


		datasetBeanMapper.beansToDataset(outData, bomDeployList, BomDeployTO.class);
	}


	@RequestMapping("logistics/purchase/findBomDeployList2.do")
	public void findBomDeployList2(HttpServletRequest request, HttpServletResponse response) throws Exception {

		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		 String itemCode = inData.getVariable("itemCode").getString();
		 String deployCondition = inData.getVariable("deployCondition").getString();

		List<BomDeployTO> bomDeployList = purchaseServiceFacade.findBomDeployList2(itemCode,deployCondition);

		datasetBeanMapper.beansToDataset(outData, bomDeployList, BomDeployTO.class);
	}

}
