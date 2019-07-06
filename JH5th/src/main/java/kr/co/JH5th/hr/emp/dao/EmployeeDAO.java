package kr.co.JH5th.hr.emp.dao;

import java.util.List;

import kr.co.JH5th.hr.emp.to.EmployeeTO;

public interface EmployeeDAO {

	public List<EmployeeTO> selectEmployeeList();
	
}
