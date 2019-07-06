package kr.co.JH5th.logistics.production.sf;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.production.applicationService.ProductionApplicationService;
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

@Service
public class ProductionServiceFacadeImpl implements ProductionServiceFacade{


	@Autowired
	private ProductionApplicationService productionApplicationService;

	@Override
	public List<MpsTO> findMpsList() {
		// TODO Auto-generated method stub
		return productionApplicationService.findMpsList();
	}

	@Override
	public void registerMps(List<MpsTO> mpsList, List<ContractDetailTO> contractDetailList) {
		// TODO Auto-generated method stub
		productionApplicationService.registerMps(mpsList, contractDetailList);
	}

	@Override
	public List<MrpTO> findMrpList() {
		// TODO Auto-generated method stub
		return productionApplicationService.findMrpList();
	}
////////여기부터 실험대상들
	@Override
	public List<MrpGatheringTO> findMrpGatheringList(HashMap<String,Object> map) {
		// TODO Auto-generated method stub
		return productionApplicationService.findMrpGatheringList(map);
	}

	@Override
	public List<WorkInstructionTO> findWorkInstructionList() {
		// TODO Auto-generated method stub
		return productionApplicationService.findWorkInstructionList();
	}

	@Override
	public void bathMrpGathering(List<MrpGatheringTO> mrpGatheringList) {
		// TODO Auto-generated method stub
		productionApplicationService.bathMrpGathering(mrpGatheringList);
	}

	@Override
	public void registWorkInstruction(List<WorkInstructionTO> workInstructionList,
			List<MrpGatheringTO> mrpGatheringList, List<MaterialPaymentTO> materialPaymentList,
			List<StockTO> stockList
			) {
		// TODO Auto-generated method stub
		productionApplicationService.registWorkInstruction(workInstructionList,mrpGatheringList,materialPaymentList,stockList);

	}

	@Override
	public List<PrmTO> findPrmList() {
		// TODO Auto-generated method stub
		return productionApplicationService.findPrmList();
	}

	@Override
	public void registPrm(List<WorkInstructionTO> workInstructionList, List<PrmTO> prmList, List<StockTO> stockList , List<WarehousingTO> warehousingList ) {
		// TODO Auto-generated method stub
		productionApplicationService.registPrm(workInstructionList, prmList, stockList, warehousingList);
	}

	@Override
	public List<MrpOpenTempTO> findMrpOpenTempProcessList(String mpsNo) {
		// TODO Auto-generated method stub
		return productionApplicationService.findMrpOpenTempProcessList(mpsNo);
	}

	@Override
	public List<MrpGatheringTO2> findMrpGatheringList2(List<MrpTO> mrpList) {
		// TODO Auto-generated method stub
		return productionApplicationService.findMrpGatheringList2(mrpList);
	}

	@Override
	public List<MrpOpenTempTO> findMrpOpenTempProcessList(HashMap<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return productionApplicationService.findMrpOpenTempProcessList(paramMap);
	}

	@Override
	public void registMrp(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub

		productionApplicationService.registMrp(paramMap);
	}


	@Override
	public void registMrpGathering(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		productionApplicationService.registMrpGathering(paramMap);
	}
	
	//작업지시 프로시저 20190110
	@Override
	public void findMaterialCheckOpen(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		productionApplicationService.findMaterialCheckOpen(map);
	}

	@Override
	public void findWorkInstructionOpen(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		productionApplicationService.findWorkInstructionOpen(map);
		
	}

}
