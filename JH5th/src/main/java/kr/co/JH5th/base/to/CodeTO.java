package kr.co.JH5th.base.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_code")
public class CodeTO extends BaseTO{

	String divisionCodeNo, codeType, divisionCodeName, codeChangeAvailable, description;

	
	public String getDivisionCodeNo() {
		return divisionCodeNo;
	}

	public void setDivisionCodeNo(String divisionCodeNo) {
		this.divisionCodeNo = divisionCodeNo;
	}

	public String getCodeType() {
		return codeType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}

	public String getDivisionCodeName() {
		return divisionCodeName;
	}

	public void setDivisionCodeName(String divisionCodeName) {
		this.divisionCodeName = divisionCodeName;
	}

	public String getCodeChangeAvailable() {
		return codeChangeAvailable;
	}

	public void setCodeChangeAvailable(String codeChangeAvailable) {
		this.codeChangeAvailable = codeChangeAvailable;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
