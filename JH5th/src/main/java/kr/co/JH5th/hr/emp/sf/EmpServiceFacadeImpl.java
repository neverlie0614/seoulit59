package kr.co.JH5th.hr.emp.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.JH5th.hr.emp.applicationService.EmpApplicationService;
import kr.co.JH5th.hr.emp.to.EmployeeTO;

@Service
public class EmpServiceFacadeImpl implements EmpServiceFacade{
	@Autowired
	private EmpApplicationService empApplicationService; 
	
	@Override
	public List<EmployeeTO> findEmployeeList() {
		// TODO Auto-generated method stub
		
		return empApplicationService.findEmployeeList();
		
	}

	
	
}
