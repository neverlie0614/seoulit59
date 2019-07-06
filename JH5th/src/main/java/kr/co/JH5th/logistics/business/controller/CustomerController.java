package kr.co.JH5th.logistics.business.controller;

import java.util.List;

import com.tobesoft.xplatform.data.PlatformData;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.business.sf.BusinessServiceFacade;
import kr.co.JH5th.logistics.business.to.CustomerTO;

@Controller
public class CustomerController {

	@Autowired
	private BusinessServiceFacade businessServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/business/findCustomerList.do")
	public void findCustomerList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<CustomerTO> customerList = businessServiceFacade.findCustomerList();
		
		datasetBeanMapper.beansToDataset(outData, customerList, CustomerTO.class);
		
	}
	//거래처관리에서 저장시키는 부분
	@RequestMapping("logistics/business/batchCustomer.do")
	public void batchCustomer(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<CustomerTO> customer = datasetBeanMapper.datasetToBeans(inData, CustomerTO.class); 
		
		businessServiceFacade.batchCustomer(customer);
		
		findCustomerList(request, response);
		
	}
//거래처관리에서 저장하는부분 할려고했다가 이름을 이미 지정되어있는것과 같은 이름으로 지정하여 (batchContract는 수주관리부분 저장) 주석처리함
//	@RequestMapping("logistics/business/batchContract.do")
//	public void batchContract(HttpServletRequest request, HttpServletResponse response) throws Exception {
//		PlatformData inData = (PlatformData) request.getAttribute("inData");
//		List<CustomerTO> contract = datasetBeanMapper.datasetToBeans(inData, CustomerTO.class);
//		businessServiceFacade.batchContract(contract);
//		findCustomerList(request, response);
//	}
	
	
	
}
