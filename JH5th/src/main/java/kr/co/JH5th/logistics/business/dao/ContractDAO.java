package kr.co.JH5th.logistics.business.dao;

import java.util.List;

import kr.co.JH5th.logistics.business.to.ContractReportTO;
import kr.co.JH5th.logistics.business.to.ContractTO;


public interface ContractDAO {


	public List<ContractTO> selectContractList();

	public void insertContract(ContractTO contractTO);

	public void updateContract(ContractTO contractTO);

	public void deleteContract(ContractTO contractTO);

	public List<ContractReportTO> selectContractReporList(String contractNo);
}
