package kr.co.JH5th.logistics.purchase.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.purchase.applicationService.PurchaseApplicationService;
import kr.co.JH5th.logistics.purchase.to.BomDeployTO;
import kr.co.JH5th.logistics.purchase.to.BomTO;
import kr.co.JH5th.logistics.purchase.to.ItemTO;
import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.JH5th.logistics.purchase.to.OrderDetailTO;
import kr.co.JH5th.logistics.purchase.to.OrderGatheringTO;
import kr.co.JH5th.logistics.purchase.to.OrderInfoTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;
import kr.co.JH5th.logistics.purchase.to.WarehousingTO;

@Service
public class PurchaseServiceFacadeImpl implements PurchaseServiceFacade{
	@Autowired
	private PurchaseApplicationService purchaseApplicationService;


	@Override
	public List<ItemTO> findItemList() {

		return purchaseApplicationService.findItemList();
	}

	@Override
	public List<ItemTO> batchItem(List<ItemTO> itemList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<BomTO> findBomList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findBomList();
	}

	@Override
	public List<BomDeployTO> findBomDeployList(String itemCode, String deployCondition) {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findBomDeployList(itemCode, deployCondition);
	}

	@Override
	public List<OrderInfoTO> findOrderInfoList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findOrderInfoList();
	}

	@Override
	public List<OrderDetailTO> findOrderDetailList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findOrderDetailList();
	}

	@Override
	public void registerOrder(List<OrderInfoTO> orderInfoList, List<OrderDetailTO> orderDetailList,
			List<MrpGatheringTO> mrpGatheringList) {
		// TODO Auto-generated method stub
	purchaseApplicationService.registerOrder(orderInfoList,orderDetailList,mrpGatheringList);
	}

	@Override
	public List<OrderGatheringTO> findOrderGatheringList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findOrderGatheringList();
	}

	@Override
	public List<StockTO> findStockList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findStockList();
	}

	@Override
	public void bathStock(List<StockTO> stockList) {
		// TODO Auto-generated method stub
		purchaseApplicationService.bathStock(stockList);
	}

	@Override
	public List<MaterialPaymentTO> findMaterialPaymentList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findMaterialPaymentList();
	}

	@Override
	public void registMaterialPayment(List<MaterialPaymentTO> materialPaymentList) {
		// TODO Auto-generated method stub
		purchaseApplicationService.registMaterialPayment(materialPaymentList);
	}

	@Override
	public List<WarehousingTO> findWarehousingList() {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findWarehousingList();
	}


	@Override
	public void registWarehousing(List<OrderInfoTO> orderInfoList, List<OrderDetailTO> orderDetailList,
			List<StockTO> stockList, List<WarehousingTO> warehousingList) {
		// TODO Auto-generated method stub
		purchaseApplicationService.registWarehousing(orderInfoList,orderDetailList,stockList,warehousingList);
	}

	@Override
	public List<BomDeployTO> findBomDeployList2(String itemCode, String deployCondition) {
		// TODO Auto-generated method stub
		return purchaseApplicationService.findBomDeployList2(itemCode, deployCondition);
	}

}
