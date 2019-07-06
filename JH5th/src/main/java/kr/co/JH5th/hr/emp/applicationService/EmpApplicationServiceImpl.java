package kr.co.JH5th.hr.emp.applicationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.JH5th.hr.emp.dao.EmployeeDAO;
import kr.co.JH5th.hr.emp.to.EmployeeTO;

@Component
public class EmpApplicationServiceImpl implements EmpApplicationService{
	@Autowired
	private EmployeeDAO employeeDAO;
	
	
	@Override
	public List<EmployeeTO> findEmployeeList() {
		// TODO Auto-generated method stub
		return employeeDAO.selectEmployeeList();
	}

}
