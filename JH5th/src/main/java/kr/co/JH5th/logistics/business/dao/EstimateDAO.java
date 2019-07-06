package kr.co.JH5th.logistics.business.dao;

import java.util.List;

import kr.co.JH5th.logistics.business.to.EstimateTO;

public interface EstimateDAO {

	public List<EstimateTO> selectEstimateList();

	public List<EstimateTO> selectEstimateDialog();
	
	public void insertEstimate(EstimateTO estimateTO);
	
	public void updateEstimate(EstimateTO estimateTO);
	
	public void updateEstimateStatus(EstimateTO estimateTO);
	
	public void deleteEstimate(EstimateTO estimateTO);
}
