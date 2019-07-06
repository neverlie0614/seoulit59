package kr.co.JH5th.logistics.purchase.dao;

import java.util.List;

import kr.co.JH5th.logistics.purchase.to.BomDeployTO;
import kr.co.JH5th.logistics.purchase.to.BomTO;



public interface BomDAO {

	public List<BomTO> selectBomList();

	public List<BomDeployTO> selectBomDeployList(String itemCode, String deployCondition);
	public List<BomDeployTO> selectBomDeployList2(String itemCode, String deployCondition);

}
