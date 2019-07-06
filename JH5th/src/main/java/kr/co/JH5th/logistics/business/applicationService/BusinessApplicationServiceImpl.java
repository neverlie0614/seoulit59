package kr.co.JH5th.logistics.business.applicationService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.JH5th.logistics.business.dao.ContractDAO;
import kr.co.JH5th.logistics.business.dao.ContractDetailDAO;
import kr.co.JH5th.logistics.business.dao.CustomerDAO;
import kr.co.JH5th.logistics.business.dao.DeliveryResultDAO;
import kr.co.JH5th.logistics.business.dao.EstimateDAO;
import kr.co.JH5th.logistics.business.dao.EstimateDetailDAO;
import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.business.to.ContractReportTO;
import kr.co.JH5th.logistics.business.to.ContractTO;
import kr.co.JH5th.logistics.business.to.CustomerTO;
import kr.co.JH5th.logistics.business.to.DeliveryResultTO;
import kr.co.JH5th.logistics.business.to.EstimateDetailTO;
import kr.co.JH5th.logistics.business.to.EstimateTO;
import kr.co.JH5th.logistics.purchase.applicationService.PurchaseApplicationService;
import kr.co.JH5th.logistics.purchase.to.StockTO;

@Component
public class BusinessApplicationServiceImpl implements BusinessApplicationService{
	@Autowired
	private EstimateDAO estimateDAO;
	@Autowired
	private EstimateDetailDAO estimateDetailDAO;
	@Autowired
	private ContractDAO contractDAO;
	@Autowired
	private ContractDetailDAO contractDetailDAO;
	@Autowired
	private CustomerDAO customerDAO;
	@Autowired
	private DeliveryResultDAO deliveryResultDAO;
	@Autowired
	private PurchaseApplicationService purchaseApplicationService;
	




	@Override
	public List<EstimateTO> findEstimateList() {
		// TODO Auto-generated method stub
		return estimateDAO.selectEstimateList();
	}

	@Override
	public List<EstimateDetailTO> findEstimateDetailList() {
		// TODO Auto-generated method stub
		return estimateDetailDAO.selectEstimateDetailList();
	}

	@Override
	public List<ContractTO> findContractList() {
		// TODO Auto-generated method stub
		return contractDAO.selectContractList();
	}

	@Override
	public List<ContractDetailTO> findContractDetailList() {
		// TODO Auto-generated method stub
		return contractDetailDAO.selectContractDetailList();
	}

	@Override
	public List<CustomerTO> findCustomerList() {
		// TODO Auto-generated method stub
		return customerDAO.selectCustomerList();
	}

	@Override
	public void batchEstimate(List<EstimateTO> estimateList,List<EstimateDetailTO> estimateDetailList) {
		// TODO Auto-generated method stub

		for(EstimateTO estimateTO : estimateList) {
			
			switch(estimateTO.getStatus()) {

			case "insert" : estimateDAO.insertEstimate(estimateTO); break;
			case "update" : estimateDAO.updateEstimate(estimateTO); break;
			case "delete" : estimateDAO.deleteEstimate(estimateTO); break;
			}
		}

		if(estimateDetailList!=null) {
			for(EstimateDetailTO estimateDetailTO : estimateDetailList) {
				switch(estimateDetailTO.getStatus()) {
				case "insert" : estimateDetailDAO.insertEstimateDetail(estimateDetailTO); break;
				case "update" : estimateDetailDAO.updateEstimateDetail(estimateDetailTO); break;
				case "delete" : estimateDetailDAO.deleteEstimateDetail(estimateDetailTO); break;
				}
			}
		}
	}



	@Override
	public List<EstimateTO> findEstimateDialog() {
		// TODO Auto-generated method stub
		return estimateDAO.selectEstimateDialog();
	}


	@Override
	public void updateEstimateStatus(List<EstimateTO> estimateList, List<EstimateDetailTO> estimateDetailList) {
		
		for(EstimateTO estimateTO : estimateList){
				estimateDAO.updateEstimateStatus(estimateTO);
			}
	}
	
	


	@Override
	public void batchContract(List<ContractTO> contractList, List<ContractDetailTO> contractDetailList) {
		// TODO Auto-generated method stub

		List<EstimateTO> estimateList = null;
		EstimateTO estimateTO = null;

		if(contractList!=null) {

		for(ContractTO contractTO : contractList) {
			
			switch(contractTO.getStatus()) {
			case "insert" : contractDAO.insertContract(contractTO);
							estimateList = new ArrayList<>();
							//EstimateTO estimateTO = new EstimateTO();
							estimateTO = new EstimateTO();
							estimateTO.setEstimateNo(contractTO.getEstimateNo());
							estimateTO.setContractStatus("Y");
							estimateTO.setStatus("update");
							estimateList.add(estimateTO);
							//estimateDAO.updateEstimate(estimateTO);

			break;
			case "update" : contractDAO.updateContract(contractTO); break;
			case "delete" : contractDAO.deleteContract(contractTO); 
							estimateList = new ArrayList<>();
							estimateTO = new EstimateTO();
							estimateTO.setEstimateNo(contractTO.getEstimateNo());
							estimateTO.setContractStatus("N");
							estimateTO.setStatus("update");
							estimateList.add(estimateTO);
			break;

			}

		}

		}


		if(estimateList!=null) {

			updateEstimateStatus(estimateList,null);

		}



		if(contractDetailList!=null) {

		for(ContractDetailTO contractDetailTO : contractDetailList) {

			switch(contractDetailTO.getStatus()) {

			case "insert" : contractDetailDAO.insertContractDetail(contractDetailTO); break;
			case "update" : contractDetailDAO.updateContractDetail(contractDetailTO); break;
			case "delete" : contractDetailDAO.deleteContractDetail(contractDetailTO); break;

			}

		}

		}



	}



	@Override
	public List<DeliveryResultTO> findDeliveryResultList() {
		// TODO Auto-generated method stub
		return deliveryResultDAO.selectDeliveryResultList();
	}



	@Override
	public void registDeliveryResult(List<ContractTO> contractList, List<ContractDetailTO> contractDetailList,
			List<StockTO> stockList, List<DeliveryResultTO> deliveryResultList) {
		// TODO Auto-generated method stub

		for(DeliveryResultTO deliveryResultTO : deliveryResultList) {

			switch(deliveryResultTO.getStatus()) {

			case "insert" : deliveryResultDAO.insertDeliveryResult(deliveryResultTO); break;
			//case "update" : deliveryResultDAO.updateDeliveryResult(deliveryResultTO); break;
			//case "delete" : deliveryResultDAO.deleteDeliveryResult(deliveryResultTO); break;

			}

		}

		batchContract(contractList,contractDetailList);

		purchaseApplicationService.bathStock(stockList);


	}



	@Override
	public void batchCustomer(List<CustomerTO> customerList) {
		for(CustomerTO customerTO : customerList){
			switch(customerTO.getStatus()){
				case "insert" : customerDAO.insertCustomer(customerTO); break;
				case "update" : customerDAO.updateCustomer(customerTO); break;
				case "delete" : customerDAO.deleteCustomer(customerTO); break;
			}
		}
	}
	@Override
	public List<ContractReportTO> findContractReporList(String contractNo) {
		// TODO Auto-generated method stub
		return contractDAO.selectContractReporList(contractNo);
	}
	
	@Override
	public void batchContract(List<CustomerTO> customerList) {
		for(CustomerTO customerTO : customerList){
			switch(customerTO.getStatus()){
				case "insert" : customerDAO.insertCustomer(customerTO); break;
				case "update" : customerDAO.updateCustomer(customerTO); break;
				case "delete" : customerDAO.deleteCustomer(customerTO); break;
			}
		}
	}
	
	
	
}
