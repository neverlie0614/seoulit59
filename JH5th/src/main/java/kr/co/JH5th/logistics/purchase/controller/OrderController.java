package kr.co.JH5th.logistics.purchase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.purchase.sf.PurchaseServiceFacade;
import kr.co.JH5th.logistics.purchase.to.OrderDetailTO;
import kr.co.JH5th.logistics.purchase.to.OrderGatheringTO;
import kr.co.JH5th.logistics.purchase.to.OrderInfoTO;


@Controller
public class OrderController {

	@Autowired
	private PurchaseServiceFacade purchaseServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/purchase/findOrderInfoList.do")
	public void findOrderInfoList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<OrderInfoTO> orderInfoList = purchaseServiceFacade.findOrderInfoList();

		datasetBeanMapper.beansToDataset(outData, orderInfoList, OrderInfoTO.class);

	}

	@RequestMapping("logistics/purchase/findOrderDetailList.do")
	public void findOrderDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<OrderDetailTO> orderDetailList = purchaseServiceFacade.findOrderDetailList();

		datasetBeanMapper.beansToDataset(outData, orderDetailList, OrderDetailTO.class);

	}

	@RequestMapping("logistics/purchase/findOrderGatheringList.do")
	public void findOrderGatheringList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<OrderGatheringTO> orderGatheringList = purchaseServiceFacade.findOrderGatheringList();

		datasetBeanMapper.beansToDataset(outData, orderGatheringList, OrderGatheringTO.class);

	}

	@RequestMapping("logistics/purchase/registerOrder.do")
	public void registerOrder(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<OrderInfoTO> orderInfoList = datasetBeanMapper.datasetToBeans(inData, OrderInfoTO.class);

		List<OrderDetailTO> orderDetailList = datasetBeanMapper.datasetToBeans(inData, OrderDetailTO.class);

		List<MrpGatheringTO> mrpGatheringList = datasetBeanMapper.datasetToBeans(inData, MrpGatheringTO.class);

		purchaseServiceFacade.registerOrder(orderInfoList, orderDetailList, mrpGatheringList);

		findOrderInfoList(request, response);
		findOrderDetailList(request, response);

	}

}
