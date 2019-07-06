package kr.co.JH5th.logistics.business.applicationService;

import java.util.List;

import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.business.to.ContractReportTO;
import kr.co.JH5th.logistics.business.to.ContractTO;
import kr.co.JH5th.logistics.business.to.CustomerTO;
import kr.co.JH5th.logistics.business.to.DeliveryResultTO;
import kr.co.JH5th.logistics.business.to.EstimateDetailTO;
import kr.co.JH5th.logistics.business.to.EstimateTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;

public interface BusinessApplicationService {

	public List<EstimateTO> findEstimateList();

	public List<EstimateTO> findEstimateDialog();

	public void batchEstimate(List<EstimateTO> estimateList,List<EstimateDetailTO> estimateDetailList);

	public List<EstimateDetailTO> findEstimateDetailList();

	public List<ContractTO> findContractList();

	public List<ContractDetailTO> findContractDetailList();

	public void batchContract(List<ContractTO> contractList,List<ContractDetailTO> contractDetailList);

	public List<CustomerTO> findCustomerList();

	public List<DeliveryResultTO> findDeliveryResultList();

	public void registDeliveryResult(List<ContractTO> contractList,List<ContractDetailTO> contractDetailList,List<StockTO> stockList, List<DeliveryResultTO> deliveryResultList);
	
	
	
	public void batchCustomer(List<CustomerTO> customerList);
	
	public void updateEstimateStatus(List<EstimateTO> estimateList, List<EstimateDetailTO> estimateDetailList);

	public List<ContractReportTO> findContractReporList(String contractNo);

	public void batchContract(List<CustomerTO> customerList);
	
}
