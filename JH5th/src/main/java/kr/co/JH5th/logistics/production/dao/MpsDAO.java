package kr.co.JH5th.logistics.production.dao;

import java.util.List;

import kr.co.JH5th.logistics.production.to.MpsTO;

public interface MpsDAO {

	public List<MpsTO> selectMpsList();

	public void insertMps(MpsTO mpsTO);

	public void updeteMps(MpsTO mpsTO);

}
