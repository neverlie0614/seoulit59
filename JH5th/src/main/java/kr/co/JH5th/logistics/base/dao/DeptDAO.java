package kr.co.JH5th.logistics.base.dao;

import java.util.List;

import kr.co.JH5th.logistics.base.to.DeptTO;

public interface DeptDAO {

	public List<DeptTO> selectDeptList();

	public void insertDepartment(DeptTO registDeptList) ;
	public void updateDepartment(DeptTO registDeptList) ;
	public void deleteDepartment(DeptTO registDeptList) ;

}
