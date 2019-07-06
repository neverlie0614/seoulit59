package kr.co.JH5th.logistics.purchase.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_materialPayment")
public class MaterialPaymentTO extends BaseTO{

	String itemCode, paymentDate, workInstructionNo, itemName,
	paymentAmount, unitPayment, description;

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(String paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getWorkInstructionNo() {
		return workInstructionNo;
	}

	public void setWorkInstructionNo(String workInstructionNo) {
		this.workInstructionNo = workInstructionNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getPaymentAmount() {
		return paymentAmount;
	}

	public void setPaymentAmount(String paymentAmount) {
		this.paymentAmount = paymentAmount;
	}

	public String getUnitPayment() {
		return unitPayment;
	}

	public void setUnitPayment(String unitPayment) {
		this.unitPayment = unitPayment;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




}
