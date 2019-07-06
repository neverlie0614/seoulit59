package kr.co.JH5th.base.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_codeDetail")
public class CodeDetailTO extends BaseTO{

	String divisionCodeNo, detailCode, detailCodeName, codeUseCheck, description;

	public String getDivisionCodeNo() {
		return divisionCodeNo;
	}

	public void setDivisionCodeNo(String divisionCodeNo) {
		this.divisionCodeNo = divisionCodeNo;
	}

	public String getDetailCode() {
		return detailCode;
	}

	public void setDetailCode(String detailCode) {
		this.detailCode = detailCode;
	}

	public String getDetailCodeName() {
		return detailCodeName;
	}

	public void setDetailCodeName(String detailCodeName) {
		this.detailCodeName = detailCodeName;
	}

	public String getCodeUseCheck() {
		return codeUseCheck;
	}

	public void setCodeUseCheck(String codeUseCheck) {
		this.codeUseCheck = codeUseCheck;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
