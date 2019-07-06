package kr.co.JH5th.logistics.purchase.applicationService;

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

public interface PurchaseApplicationService {


	List<ItemTO> findItemList();

	List<ItemTO> batchItem(List<ItemTO> itemList);

	List<BomTO> findBomList();

	List<BomDeployTO> findBomDeployList(String itemCode,String deployCondition);
	List<BomDeployTO> findBomDeployList2(String itemCode,String deployCondition);

	List<OrderInfoTO> findOrderInfoList();

	List<OrderDetailTO> findOrderDetailList();

	List<OrderGatheringTO> findOrderGatheringList();

	public void registerOrder(List<OrderInfoTO> orderInfoList,List<OrderDetailTO> orderDetailList,List<MrpGatheringTO> mrpGatheringList);

	public List<StockTO> findStockList();

	public void bathStock(List<StockTO> stockList);

	public List<MaterialPaymentTO> findMaterialPaymentList();

	public void registMaterialPayment(List<MaterialPaymentTO> materialPaymentList);

	public List<WarehousingTO> findWarehousingList();

	public void registWarehousing(List<OrderInfoTO> orderInfoList, List<OrderDetailTO> orderDetailList, List<StockTO> stockList,List<WarehousingTO> warehousingList);



}
