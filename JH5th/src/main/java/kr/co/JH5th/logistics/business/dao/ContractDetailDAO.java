package kr.co.JH5th.logistics.business.dao;

import java.util.List;

import kr.co.JH5th.logistics.business.to.ContractDetailTO;


public interface ContractDetailDAO {

	public List<ContractDetailTO> selectContractDetailList();
	
	public void insertContractDetail(ContractDetailTO contractDetailTO);
	
	public void updateContractDetail(ContractDetailTO contractDetailTO);
	
	public void deleteContractDetail(ContractDetailTO contractDetailTO);
}
