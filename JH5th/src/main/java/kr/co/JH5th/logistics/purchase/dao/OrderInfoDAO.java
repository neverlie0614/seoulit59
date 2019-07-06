package kr.co.JH5th.logistics.purchase.dao;

import java.util.List;

import kr.co.JH5th.logistics.purchase.to.OrderInfoTO;

public interface OrderInfoDAO {

	public List<OrderInfoTO> selectOrderInfoList();

	public void insertOrderInfo(OrderInfoTO orderInfoTO);

	public void updateOrderInfo(OrderInfoTO orderInfoTO);

}
