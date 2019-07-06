package kr.co.JH5th.logistics.production.dao;

import java.util.List;

import kr.co.JH5th.logistics.production.to.PrmTO;

public interface PrmDAO {

	public List<PrmTO> selectPrmList();

	public void insertPrm(PrmTO prmTO);

}
