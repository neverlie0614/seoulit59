package kr.co.JH5th.logistics.production.applicationService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.production.to.MpsTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO2;
import kr.co.JH5th.logistics.production.to.MrpOpenTempTO;
import kr.co.JH5th.logistics.production.to.MrpTO;
import kr.co.JH5th.logistics.production.to.PrmTO;
import kr.co.JH5th.logistics.production.to.WorkInstructionTO;
import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;
import kr.co.JH5th.logistics.purchase.to.WarehousingTO;


public interface ProductionApplicationService {


	public List<MpsTO> findMpsList();

	public void registerMps(List<MpsTO>mpsList, List<ContractDetailTO> contractDetailList);

	public List<MrpTO> findMrpList();

	public List<MrpGatheringTO> findMrpGatheringList(HashMap<String,Object> map);

	public List<WorkInstructionTO> findWorkInstructionList();

	public void bathMrpGathering(List<MrpGatheringTO> mrpGatheringList);

	public void registWorkInstruction(List<WorkInstructionTO> workInstructionList, List<MrpGatheringTO> mrpGatheringList, List<MaterialPaymentTO> materialPaymentList, List<StockTO> stockList);

	public List<PrmTO> findPrmList();

	public void registPrm(List<WorkInstructionTO> workInstructionList, List<PrmTO> prmList, List<StockTO> stockList , List<WarehousingTO> warehousingList);

	public List<MrpOpenTempTO> findMrpOpenTempProcessList(String mpsNo);

	public List<MrpGatheringTO2> findMrpGatheringList2(List<MrpTO> mrpList);
	public void registMrp(Map<String, Object> paramMap);
	public void registMrpGathering(Map<String, Object> paramMap);

	public List<MrpOpenTempTO> findMrpOpenTempProcessList(HashMap<String, Object> paramMap);

	//작업지시 프로시저 20190121
	public void findWorkInstructionOpen(HashMap<String, Object> map);
	//작업지시 프로시저 20190110
	public void findMaterialCheckOpen(HashMap<String, Object> map);
}
