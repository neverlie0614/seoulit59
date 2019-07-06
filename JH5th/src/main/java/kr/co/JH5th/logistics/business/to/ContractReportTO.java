package kr.co.JH5th.logistics.business.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_contractReport")
public class ContractReportTO extends BaseTO{

	String contractNo, contractDate, businessLicenseNumber, customerName,
	contractRequester, customerBasicAddress, customerBusinessConditions,
	customerBusinessItems, empName, itemCode, itemName, dueDateOfContract,
	unitOfContract, contractAmount, unitPriceOfContract, sumPriceOfContract,
	sumPrice, sumTax, sumTotalPrice;

	public String getContractNo() {
		return contractNo;
	}

	public void setContractNo(String contractNo) {
		this.contractNo = contractNo;
	}

	public String getContractDate() {
		return contractDate;
	}

	public void setContractDate(String contractDate) {
		this.contractDate = contractDate;
	}

	public String getBusinessLicenseNumber() {
		return businessLicenseNumber;
	}

	public void setBusinessLicenseNumber(String businessLicenseNumber) {
		this.businessLicenseNumber = businessLicenseNumber;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getContractRequester() {
		return contractRequester;
	}

	public void setContractRequester(String contractRequester) {
		this.contractRequester = contractRequester;
	}

	public String getCustomerBasicAddress() {
		return customerBasicAddress;
	}

	public void setCustomerBasicAddress(String customerBasicAddress) {
		this.customerBasicAddress = customerBasicAddress;
	}

	public String getCustomerBusinessConditions() {
		return customerBusinessConditions;
	}

	public void setCustomerBusinessConditions(String customerBusinessConditions) {
		this.customerBusinessConditions = customerBusinessConditions;
	}

	public String getCustomerBusinessItems() {
		return customerBusinessItems;
	}

	public void setCustomerBusinessItems(String customerBusinessItems) {
		this.customerBusinessItems = customerBusinessItems;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

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

	public String getDueDateOfContract() {
		return dueDateOfContract;
	}

	public void setDueDateOfContract(String dueDateOfContract) {
		this.dueDateOfContract = dueDateOfContract;
	}

	public String getUnitOfContract() {
		return unitOfContract;
	}

	public void setUnitOfContract(String unitOfContract) {
		this.unitOfContract = unitOfContract;
	}

	public String getContractAmount() {
		return contractAmount;
	}

	public void setContractAmount(String contractAmount) {
		this.contractAmount = contractAmount;
	}

	public String getUnitPriceOfContract() {
		return unitPriceOfContract;
	}

	public void setUnitPriceOfContract(String unitPriceOfContract) {
		this.unitPriceOfContract = unitPriceOfContract;
	}

	public String getSumPriceOfContract() {
		return sumPriceOfContract;
	}

	public void setSumPriceOfContract(String sumPriceOfContract) {
		this.sumPriceOfContract = sumPriceOfContract;
	}

	public String getSumPrice() {
		return sumPrice;
	}

	public void setSumPrice(String sumPrice) {
		this.sumPrice = sumPrice;
	}

	public String getSumTax() {
		return sumTax;
	}

	public void setSumTax(String sumTax) {
		this.sumTax = sumTax;
	}

	public String getSumTotalPrice() {
		return sumTotalPrice;
	}

	public void setSumTotalPrice(String sumTotalPrice) {
		this.sumTotalPrice = sumTotalPrice;
	}





}
