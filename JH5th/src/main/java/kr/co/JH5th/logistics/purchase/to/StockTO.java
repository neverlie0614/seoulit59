package kr.co.JH5th.logistics.purchase.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_stock")
public class StockTO extends BaseTO{

	String warehouseCode, itemCode, deliveryNo, productionResultNo,
	inputItemNo, itemName, unitOfStock, safetyAllowanceAmount,
	stockAmount, description;

	public String getWarehouseCode() {
		return warehouseCode;
	}

	public void setWarehouseCode(String warehouseCode) {
		this.warehouseCode = warehouseCode;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public String getDeliveryNo() {
		return deliveryNo;
	}

	public void setDeliveryNo(String deliveryNo) {
		this.deliveryNo = deliveryNo;
	}

	public String getProductionResultNo() {
		return productionResultNo;
	}

	public void setProductionResultNo(String productionResultNo) {
		this.productionResultNo = productionResultNo;
	}

	public String getInputItemNo() {
		return inputItemNo;
	}

	public void setInputItemNo(String inputItemNo) {
		this.inputItemNo = inputItemNo;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getUnitOfStock() {
		return unitOfStock;
	}

	public void setUnitOfStock(String unitOfStock) {
		this.unitOfStock = unitOfStock;
	}

	public String getSafetyAllowanceAmount() {
		return safetyAllowanceAmount;
	}

	public void setSafetyAllowanceAmount(String safetyAllowanceAmount) {
		this.safetyAllowanceAmount = safetyAllowanceAmount;
	}

	public String getStockAmount() {
		return stockAmount;
	}

	public void setStockAmount(String stockAmount) {
		this.stockAmount = stockAmount;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}




}
