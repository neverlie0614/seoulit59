package kr.co.JH5th.logistics.base.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_company")
public class CompanyTO extends BaseTO{

	String companyCode, companyName, compnayDivision, businessLicenseNumber, corporationLicenseNumber,
	companyCeoName, companyBusinessConditions, companyBusinessItem, companyZipCode, companyBasicAddress,
	companyDetailAddress, companyTelNumber, companyFaxNumber, companyEstablishmentDate, companyOpneDate, homepage;





	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompnayDivision() {
		return compnayDivision;
	}

	public void setCompnayDivision(String compnayDivision) {
		this.compnayDivision = compnayDivision;
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

	public String getCompanyCeoName() {
		return companyCeoName;
	}

	public void setCompanyCeoName(String companyCeoName) {
		this.companyCeoName = companyCeoName;
	}

	public String getCompanyBusinessConditions() {
		return companyBusinessConditions;
	}

	public void setCompanyBusinessConditions(String companyBusinessConditions) {
		this.companyBusinessConditions = companyBusinessConditions;
	}

	public String getCompanyBusinessItem() {
		return companyBusinessItem;
	}

	public void setCompanyBusinessItem(String companyBusinessItem) {
		this.companyBusinessItem = companyBusinessItem;
	}

	public String getCompanyZipCode() {
		return companyZipCode;
	}

	public void setCompanyZipCode(String companyZipCode) {
		this.companyZipCode = companyZipCode;
	}

	public String getCompanyBasicAddress() {
		return companyBasicAddress;
	}

	public void setCompanyBasicAddress(String companyBasicAddress) {
		this.companyBasicAddress = companyBasicAddress;
	}

	public String getCompanyDetailAddress() {
		return companyDetailAddress;
	}

	public void setCompanyDetailAddress(String companyDetailAddress) {
		this.companyDetailAddress = companyDetailAddress;
	}

	public String getCompanyTelNumber() {
		return companyTelNumber;
	}

	public void setCompanyTelNumber(String companyTelNumber) {
		this.companyTelNumber = companyTelNumber;
	}

	public String getCompanyFaxNumber() {
		return companyFaxNumber;
	}

	public void setCompanyFaxNumber(String companyFaxNumber) {
		this.companyFaxNumber = companyFaxNumber;
	}

	public String getCompanyEstablishmentDate() {
		return companyEstablishmentDate;
	}

	public void setCompanyEstablishmentDate(String companyEstablishmentDate) {
		this.companyEstablishmentDate = companyEstablishmentDate;
	}

	public String getCompanyOpneDate() {
		return companyOpneDate;
	}

	public void setCompanyOpneDate(String companyOpneDate) {
		this.companyOpneDate = companyOpneDate;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}



}
