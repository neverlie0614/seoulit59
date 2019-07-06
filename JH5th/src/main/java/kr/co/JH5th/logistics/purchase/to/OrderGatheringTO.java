package kr.co.JH5th.logistics.purchase.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_orderGathering")
public class OrderGatheringTO extends BaseTO{

	String itemCode, itemName, unitOfOrder, deliveryScheduleDate,
	amount, orderAmount, orderGatheringStatus;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnitOfOrder() {
		return unitOfOrder;
	}

	public void setUnitOfOrder(String unitOfOrder) {
		this.unitOfOrder = unitOfOrder;
	}

	public String getDeliveryScheduleDate() {
		return deliveryScheduleDate;
	}

	public void setDeliveryScheduleDate(String deliveryScheduleDate) {
		this.deliveryScheduleDate = deliveryScheduleDate;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(String orderAmount) {
		this.orderAmount = orderAmount;
	}

	public String getOrderGatheringStatus() {
		return orderGatheringStatus;
	}

	public void setOrderGatheringStatus(String orderGatheringStatus) {
		this.orderGatheringStatus = orderGatheringStatus;
	}





}
