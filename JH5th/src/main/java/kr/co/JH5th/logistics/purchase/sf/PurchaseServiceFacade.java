package kr.co.JH5th.logistics.purchase.sf;

import java.util.List;

import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.purchase.to.BomDeployTO;
import kr.co.JH5th.logistics.purchase.to.BomTO;
import kr.co.JH5th.logistics.purchase.to.ItemTO;
import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.JH5th.logistics.purchase.to.OrderDetailTO;
import kr.co.JH5th.logistics.purchase.to.OrderGatheringTO;
import kr.co.JH5th.logistics.purchase.to.OrderInfoTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;
import kr.co.JH5th.logistics.purchase.to.WarehousingTO;

public interface PurchaseServiceFacade {

	public List<ItemTO> findItemList();

	public List<ItemTO> batchItem(List<ItemTO> itemList);

	public List<BomTO> findBomList();

	public List<BomDeployTO> findBomDeployList(String itemCode,String deployCondition);
	public List<BomDeployTO> findBomDeployList2(String itemCode,String deployCondition);

	public List<OrderInfoTO> findOrderInfoList();

	public List<OrderDetailTO> findOrderDetailList();

	public List<OrderGatheringTO> findOrderGatheringList();

	public void registerOrder(List<OrderInfoTO> orderInfoList,List<OrderDetailTO> orderDetailList,List<MrpGatheringTO> mrpGatheringList);

	public List<StockTO> findStockList();

	public void bathStock(List<StockTO> stockList);

	public List<MaterialPaymentTO> findMaterialPaymentList();

	public void registMaterialPayment(List<MaterialPaymentTO> WarehousingList);

	public List<WarehousingTO> findWarehousingList();

	public void registWarehousing(List<OrderInfoTO> orderInfoList, List<OrderDetailTO> orderDetailList, List<StockTO> stockList,List<WarehousingTO> warehousingList);


}
