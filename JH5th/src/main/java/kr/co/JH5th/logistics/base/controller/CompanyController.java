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
import kr.co.JH5th.logistics.base.to.CompanyTO;


@Controller
public class CompanyController {
	@Autowired
	private ManagementServiceFacade managementServiceFacade;
	
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@RequestMapping("logistics/base/findCompanyList.do")
	public void findCompanyList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<CompanyTO> companyList = managementServiceFacade.findCompanyList();

		datasetBeanMapper.beansToDataset(outData, companyList, CompanyTO.class);

	}


}
