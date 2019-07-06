package kr.co.JH5th.logistics.production.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.JH5th.logistics.production.to.MrpOpenTempTO;
import kr.co.JH5th.logistics.production.to.MrpTO;

public interface MrpDAO {

	public List<MrpTO> selectMrpList();

	public void insertMrp(MrpTO mrpTO);

	public void updateMrp(MrpTO mrpTO);

	public List<MrpOpenTempTO> MrpOpenTempProcessList(String mpsNo);

	///////여기부터 실험대상

	public List<MrpOpenTempTO> MrpOpenTempProcessList(Map<String,Object> parameters);


	public void MrpInsertProcess(Map<String,Object> parameters);


	public void MrpGathering(Map<String,Object> parameters);

}
