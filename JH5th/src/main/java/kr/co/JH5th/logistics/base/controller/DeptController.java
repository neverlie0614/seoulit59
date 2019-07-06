package kr.co.JH5th.logistics.base.controller;

import java.util.List;

import com.tobesoft.xplatform.data.PlatformData;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.base.sf.ManagementServiceFacade;
import kr.co.JH5th.logistics.base.to.DeptTO;

@Controller
public class DeptController {
	@Autowired
	private ManagementServiceFacade managementServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@RequestMapping("logistics/base/findDeptList.do")
	public void findDeptList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<DeptTO> deptList = managementServiceFacade.findDeptList();

		datasetBeanMapper.beansToDataset(outData, deptList, DeptTO.class);

	}
	
	@RequestMapping("logistics/base/registDepartment.do")
	public void registDepartment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<DeptTO> registDeptList = datasetBeanMapper.datasetToBeans(inData, DeptTO.class);
		
		managementServiceFacade.registDepartment(registDeptList);
	}

}
