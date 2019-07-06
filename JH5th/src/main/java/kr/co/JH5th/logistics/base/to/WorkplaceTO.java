package kr.co.JH5th.logistics.base.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_workplace")
public class WorkplaceTO extends BaseTO{

	String workplaceCode, companyCode, workplaceName, businessLicenseNumber, corporationLicenseNumber,
	workplaceCeoName, workplaceBusinessConditions, workplaceBusinessItems, workplaceZipCode,
	workplaceBasicAddress, workplaceDetailAddress, workplaceTelNubmer, workplaceFaxNumber,
	workplaceEstablishDate, workplaceOpenDate, workplaceCloseDate, isMainOffice;


	public String getWorkplaceCode() {
		return workplaceCode;
	}

	public void setWorkplaceCode(String workplaceCode) {
		this.workplaceCode = workplaceCode;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

	public String getBusinessLicenseNumber() {
		return businessLicenseNumber;
	}

	public void setBusinessLicenseNumber(String businessLicenseNumber) {
		this.businessLicenseNumber = businessLicenseNumber;
	}

	public String getCorporationLicenseNumber() {
		return corporationLicenseNumber;
	}

	public void setCorporationLicenseNumber(String corporationLicenseNumber) {
		this.corporationLicenseNumber = corporationLicenseNumber;
	}

	public String getWorkplaceCeoName() {
		return workplaceCeoName;
	}

	public void setWorkplaceCeoName(String workplaceCeoName) {
		this.workplaceCeoName = workplaceCeoName;
	}

	public String getWorkplaceBusinessConditions() {
		return workplaceBusinessConditions;
	}

	public void setWorkplaceBusinessConditions(String workplaceBusinessConditions) {
		this.workplaceBusinessConditions = workplaceBusinessConditions;
	}

	public String getWorkplaceBusinessItems() {
		return workplaceBusinessItems;
	}

	public void setWorkplaceBusinessItems(String workplaceBusinessItems) {
		this.workplaceBusinessItems = workplaceBusinessItems;
	}

	public String getWorkplaceZipCode() {
		return workplaceZipCode;
	}

	public void setWorkplaceZipCode(String workplaceZipCode) {
		this.workplaceZipCode = workplaceZipCode;
	}

	public String getWorkplaceBasicAddress() {
		return workplaceBasicAddress;
	}

	public void setWorkplaceBasicAddress(String workplaceBasicAddress) {
		this.workplaceBasicAddress = workplaceBasicAddress;
	}

	public String getWorkplaceDetailAddress() {
		return workplaceDetailAddress;
	}

	public void setWorkplaceDetailAddress(String workplaceDetailAddress) {
		this.workplaceDetailAddress = workplaceDetailAddress;
	}

	public String getWorkplaceTelNubmer() {
		return workplaceTelNubmer;
	}

	public void setWorkplaceTelNubmer(String workplaceTelNubmer) {
		this.workplaceTelNubmer = workplaceTelNubmer;
	}

	public String getWorkplaceFaxNumber() {
		return workplaceFaxNumber;
	}

	public void setWorkplaceFaxNumber(String workplaceFaxNumber) {
		this.workplaceFaxNumber = workplaceFaxNumber;
	}

	public String getWorkplaceEstablishDate() {
		return workplaceEstablishDate;
	}

	public void setWorkplaceEstablishDate(String workplaceEstablishDate) {
		this.workplaceEstablishDate = workplaceEstablishDate;
	}

	public String getWorkplaceOpenDate() {
		return workplaceOpenDate;
	}

	public void setWorkplaceOpenDate(String workplaceOpenDate) {
		this.workplaceOpenDate = workplaceOpenDate;
	}

	public String getWorkplaceCloseDate() {
		return workplaceCloseDate;
	}

	public void setWorkplaceCloseDate(String workplaceCloseDate) {
		this.workplaceCloseDate = workplaceCloseDate;
	}

	public String getIsMainOffice() {
		return isMainOffice;
	}

	public void setIsMainOffice(String isMainOffice) {
		this.isMainOffice = isMainOffice;
	}




}
