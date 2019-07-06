package kr.co.JH5th.logistics.business.dao;

import java.util.List;

import kr.co.JH5th.logistics.business.to.EstimateDetailTO;


public interface EstimateDetailDAO {

	public List<EstimateDetailTO> selectEstimateDetailList();
	
	public void insertEstimateDetail(EstimateDetailTO estimateDetailTO);
	
	public void updateEstimateDetail(EstimateDetailTO estimateDetailTO);
	
	public void deleteEstimateDetail(EstimateDetailTO estimateDetailTO);
}
