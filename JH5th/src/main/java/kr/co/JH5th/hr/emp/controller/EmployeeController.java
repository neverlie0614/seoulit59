package kr.co.JH5th.hr.emp.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tobesoft.xplatform.data.PlatformData;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.hr.emp.sf.EmpServiceFacade;
import kr.co.JH5th.hr.emp.to.EmployeeTO;


@Controller
public class EmployeeController {

	@Autowired
	private EmpServiceFacade empServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;


	@RequestMapping("hr/emp/findEmployeeList.do")
	public void findEmployeeList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<EmployeeTO> employeeList = empServiceFacade.findEmployeeList();
		datasetBeanMapper.beansToDataset(outData, employeeList, EmployeeTO.class);
		
	}
	
	
	
}
