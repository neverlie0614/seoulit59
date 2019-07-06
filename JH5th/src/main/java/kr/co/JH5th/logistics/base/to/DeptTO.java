package kr.co.JH5th.logistics.base.to;

import kr.co.JH5th.common.annotation.Dataset;
import kr.co.JH5th.common.to.BaseTO;

@Dataset(name="gds_dept")
public class DeptTO extends BaseTO{

	String workplaceCode, deptCode, deptName, workplaceName,
	companyCode, companyName, deptStartDate, deptEndDate;

	public String getWorkplaceCode() {
		return workplaceCode;
	}

	public void setWorkplaceCode(String workplaceCode) {
		this.workplaceCode = workplaceCode;
	}

	public String getDeptCode() {
		return deptCode;
	}

	public void setDeptCode(String deptCode) {
		this.deptCode = deptCode;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getWorkplaceName() {
		return workplaceName;
	}

	public void setWorkplaceName(String workplaceName) {
		this.workplaceName = workplaceName;
	}

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

	public String getDeptStartDate() {
		return deptStartDate;
	}

	public void setDeptStartDate(String deptStartDate) {
		this.deptStartDate = deptStartDate;
	}

	public String getDeptEndDate() {
		return deptEndDate;
	}

	public void setDeptEndDate(String deptEndDate) {
		this.deptEndDate = deptEndDate;
	}



}
