package kr.co.JH5th.logistics.business.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_estimate")
public class EstimateTO extends BaseTO{

	String estimateNo, customerCode, estimateDate, contractStatus,
	estimateRequester, effectiveDate, personCodeInCharge, description;

	public String getEstimateNo() {
		return estimateNo;
	}

	public void setEstimateNo(String estimateNo) {
		this.estimateNo = estimateNo;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public String getEstimateDate() {
		return estimateDate;
	}

	public void setEstimateDate(String estimateDate) {
		this.estimateDate = estimateDate;
	}

	public String getContractStatus() {
		return contractStatus;
	}

	public void setContractStatus(String contractStatus) {
		this.contractStatus = contractStatus;
	}

	public String getEstimateRequester() {
		return estimateRequester;
	}

	public void setEstimateRequester(String estimateRequester) {
		this.estimateRequester = estimateRequester;
	}

	public String getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(String effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPersonCodeInCharge() {
		return personCodeInCharge;
	}

	public void setPersonCodeInCharge(String personCodeInCharge) {
		this.personCodeInCharge = personCodeInCharge;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
	
}
