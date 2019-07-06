package kr.co.JH5th.logistics.production.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO2;

public interface MrpGatheringDAO {


	public List<MrpGatheringTO> selectMrpGatheringList(HashMap<String,Object> map);

	public void insertMrpGathering(MrpGatheringTO mrpGatheringTO);

	public void updateMrpGathering(MrpGatheringTO mrpGatheringTO);

	public void deleteMrpGathering(MrpGatheringTO mrpGatheringTO);

	public List<MrpGatheringTO2> selectMrpGatheringList2(String mrpNo);

	//public void MrpGathering(Map<String, Object> paramMap);
	
	public List<MrpGatheringTO2> MrpGathering(Map<String, Object> paramMap);
}


