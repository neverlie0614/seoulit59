package kr.co.JH5th.hr.emp.sf;

import java.util.List;

import kr.co.JH5th.hr.emp.to.EmployeeTO;

public interface EmpServiceFacade {

	public List<EmployeeTO> findEmployeeList();
	
}
