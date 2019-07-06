package kr.co.JH5th.logistics.base.dao;

import java.util.List;

import kr.co.JH5th.logistics.base.to.PositionTO;

public interface PositionDAO {

	List<PositionTO> selectPositionList();
	
}
