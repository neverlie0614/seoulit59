package kr.co.JH5th.logistics.base.dao;

import java.util.List;

import kr.co.JH5th.logistics.base.to.WorkplaceTO;

public interface WorkplaceDAO {

	public List<WorkplaceTO> selectWorkplaceList();
	
}
