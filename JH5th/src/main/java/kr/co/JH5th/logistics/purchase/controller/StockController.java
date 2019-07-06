package kr.co.JH5th.logistics.purchase.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tobesoft.xplatform.data.PlatformData;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.purchase.sf.PurchaseServiceFacade;
import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.JH5th.logistics.purchase.to.OrderDetailTO;
import kr.co.JH5th.logistics.purchase.to.OrderInfoTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;
import kr.co.JH5th.logistics.purchase.to.WarehousingTO;

@Controller
public class StockController {

	@Autowired
	private PurchaseServiceFacade purchaseServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/purchase/findStockList.do")
	public void findStockList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<StockTO> stockList = purchaseServiceFacade.findStockList();

		datasetBeanMapper.beansToDataset(outData, stockList, StockTO.class);

	}

	@RequestMapping("logistics/purchase/bathStock.do")
	public void bathStock(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<StockTO> stockList = datasetBeanMapper.datasetToBeans(inData, StockTO.class);

		purchaseServiceFacade.bathStock(stockList);

		findStockList(request, response);

	}

	@RequestMapping("logistics/purchase/findMaterialPaymentList.do")
	public void findMaterialPaymentList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<MaterialPaymentTO> materialPaymentList = purchaseServiceFacade.findMaterialPaymentList();

		datasetBeanMapper.beansToDataset(outData, materialPaymentList, MaterialPaymentTO.class);

	}

	@RequestMapping("logistics/purchase/registMaterialPayment.do")
	public void registMaterialPayment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<MaterialPaymentTO> materialPaymentList = datasetBeanMapper.datasetToBeans(inData, MaterialPaymentTO.class);

		purchaseServiceFacade.registMaterialPayment(materialPaymentList);

		findStockList(request, response);

	}

	@RequestMapping("logistics/purchase/findWarehousingList.do")
	public void findWarehousingList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<WarehousingTO> warehousingList = purchaseServiceFacade.findWarehousingList();

		datasetBeanMapper.beansToDataset(outData, warehousingList, WarehousingTO.class);

	}

	@RequestMapping("logistics/purchase/registWarehousing.do")
	public void registWarehousing(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<OrderInfoTO> orderInfoList = datasetBeanMapper.datasetToBeans(inData, OrderInfoTO.class);

		List<OrderDetailTO> orderDetailList = datasetBeanMapper.datasetToBeans(inData, OrderDetailTO.class);

		List<StockTO> stockList = datasetBeanMapper.datasetToBeans(inData, StockTO.class);

		List<WarehousingTO> warehousingList = datasetBeanMapper.datasetToBeans(inData, WarehousingTO.class);

		purchaseServiceFacade.registWarehousing(orderInfoList, orderDetailList, stockList, warehousingList);

		findStockList(request, response);

		findWarehousingList(request, response);

	}

}