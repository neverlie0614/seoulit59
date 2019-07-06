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
import kr.co.JH5th.logistics.purchase.to.ItemTO;

@Controller
public class ItemController {

	@Autowired
	private PurchaseServiceFacade purchaseServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@RequestMapping("logistics/purchase/findItemList.do")
	public void findItemList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<ItemTO> itemList = purchaseServiceFacade.findItemList();

		datasetBeanMapper.beansToDataset(outData, itemList, ItemTO.class);

	}
	
	@RequestMapping("logistics/purchase/batchItem.do")
	public void batchItem(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<ItemTO> itemList = datasetBeanMapper.datasetToBeans(inData, ItemTO.class);

		purchaseServiceFacade.batchItem(itemList);

		findItemList(request, response);

	}
	
}
