package kr.co.JH5th.logistics.business.controller;

import java.util.List;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.business.sf.BusinessServiceFacade;
import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.business.to.ContractTO;
import kr.co.JH5th.logistics.business.to.DeliveryResultTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;

@Controller
public class DeliveryResultController{
	@Autowired
	private BusinessServiceFacade businessServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/business/findDeliveryResultList.do")
	public void findDeliveryResultList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<DeliveryResultTO> deliveryResultList= businessServiceFacade.findDeliveryResultList();

        datasetBeanMapper.beansToDataset(outData, deliveryResultList, DeliveryResultTO.class);

	}

	@RequestMapping("logistics/business/registDeliveryResult.do")
	public void registDeliveryResult(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<ContractTO> contractList = datasetBeanMapper.datasetToBeans(inData, ContractTO.class);

		List<ContractDetailTO> contractDetailList = datasetBeanMapper.datasetToBeans(inData, ContractDetailTO.class);

		List<StockTO> stockList = datasetBeanMapper.datasetToBeans(inData, StockTO.class);

		List<DeliveryResultTO> deliveryResultList = datasetBeanMapper.datasetToBeans(inData, DeliveryResultTO.class);

		businessServiceFacade.registDeliveryResult(contractList,contractDetailList,stockList,deliveryResultList);

		findDeliveryResultList(request, response);


	}


}
