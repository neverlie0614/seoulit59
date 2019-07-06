package kr.co.JH5th.logistics.production.applicationService;



import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.JH5th.logistics.business.applicationService.BusinessApplicationService;
import kr.co.JH5th.logistics.business.to.ContractDetailTO;
import kr.co.JH5th.logistics.production.dao.MpsDAO;
import kr.co.JH5th.logistics.production.dao.MrpDAO;
import kr.co.JH5th.logistics.production.dao.MrpGatheringDAO;
import kr.co.JH5th.logistics.production.dao.PrmDAO;
import kr.co.JH5th.logistics.production.dao.WorkInstructionDAO;
import kr.co.JH5th.logistics.production.to.MpsTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO2;
import kr.co.JH5th.logistics.production.to.MrpOpenTempTO;
import kr.co.JH5th.logistics.production.to.MrpTO;
import kr.co.JH5th.logistics.production.to.PrmTO;
import kr.co.JH5th.logistics.production.to.WorkInstructionTO;
import kr.co.JH5th.logistics.purchase.applicationService.PurchaseApplicationService;
import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;
import kr.co.JH5th.logistics.purchase.to.StockTO;
import kr.co.JH5th.logistics.purchase.to.WarehousingTO;


@Component
public class ProductionApplicationServiceImpl implements ProductionApplicationService{
	@Autowired
	private MpsDAO mpsDAO;
	@Autowired
	private MrpDAO mrpDAO;
	@Autowired
	private MrpGatheringDAO mrpGatheringDAO;
	@Autowired
	private WorkInstructionDAO workInstructionDAO;
	@Autowired
	private PrmDAO prmDAO;
	@Autowired
	private PurchaseApplicationService purchaseApplicationSerivce;
	@Autowired
	private BusinessApplicationService businessApplicationService;


	@Override
	public List<MpsTO> findMpsList() {
		// TODO Auto-generated method stub
		return mpsDAO.selectMpsList();
	}

	@Override
	public void registerMps(List<MpsTO> mpsList, List<ContractDetailTO> contractDetailList) {
		// TODO Auto-generated method stub


		if(mpsList!=null) {

		for(MpsTO mpsTO : mpsList) {

			switch(mpsTO.getStatus()) {

			case "insert" : mpsDAO.insertMps(mpsTO);	break;
			//case "update" : contractDAO.updateContract(contractTO); break;
			//case "delete" : contractDAO.deleteContract(contractTO); break;

			}

		}

		}


		if(contractDetailList!=null) {

			//businessApplicationService.registerContract(null, contractDetailList);
			businessApplicationService.batchContract(null, contractDetailList);

		}

	}


	@Override
	public List<MrpTO> findMrpList() {
		// TODO Auto-generated method stub
		return mrpDAO.selectMrpList();
	}



	@Override
	public List<MrpGatheringTO> findMrpGatheringList(HashMap<String,Object> map) {
		// TODO Auto-generated method stub
		return mrpGatheringDAO.selectMrpGatheringList(map);
	}

	@Override
	public List<WorkInstructionTO> findWorkInstructionList() {
		// TODO Auto-generated method stub
		return workInstructionDAO.selectWorkInstructionList();
	}

	@Override
	public void bathMrpGathering(List<MrpGatheringTO> mrpGatheringList) {
		// TODO Auto-generated method stub

		for(MrpGatheringTO mrpGatheringTO : mrpGatheringList) {

			System.out.println(mrpGatheringTO.getStatus());

			switch(mrpGatheringTO.getStatus()) {
			case "insert" : mrpGatheringDAO.insertMrpGathering(mrpGatheringTO); break;
			case "update" : mrpGatheringDAO.updateMrpGathering(mrpGatheringTO); break;
			case "delete" : mrpGatheringDAO.deleteMrpGathering(mrpGatheringTO); break;

			}

		}

	}


	@Override
	public void registWorkInstruction(List<WorkInstructionTO> workInstructionList,
			List<MrpGatheringTO> mrpGatheringList, List<MaterialPaymentTO> materialPaymentList, List<StockTO> stockList) {
		// TODO Auto-generated method stub



		for(WorkInstructionTO workInstructionTO : workInstructionList) {



			switch(workInstructionTO.getStatus()) {
			case "insert" : workInstructionDAO.insertWorkInstruction(workInstructionTO); break;
			case "update" : workInstructionDAO.updateWorkInstruction(workInstructionTO); break;
			case "delete" : workInstructionDAO.deleteWorkInstruction(workInstructionTO); break;

			}

		}


		if(mrpGatheringList!=null) {
		bathMrpGathering(mrpGatheringList);
		}

		if(materialPaymentList!=null) {
			purchaseApplicationSerivce.registMaterialPayment(materialPaymentList);
		}

		if(stockList!=null) {
			purchaseApplicationSerivce.bathStock(stockList);
		}

	}

	@Override
	public List<PrmTO> findPrmList() {
		// TODO Auto-generated method stub
		return prmDAO.selectPrmList();
	}



	@Override
	public void registPrm(List<WorkInstructionTO> workInstructionList, List<PrmTO> prmList, List<StockTO> stockList , List<WarehousingTO> warehousingList) {
		// TODO Auto-generated method stub


		for(PrmTO prmTO : prmList) {

			switch(prmTO.getStatus()) {
			case "insert" : prmDAO.insertPrm(prmTO); break;
			//case "update" : prmDAO.updatePrm(prmTO); break;
			//case "delete" : prmDAO.deletePrm(prmTO); break;

			}

		}

		registWorkInstruction(workInstructionList,null,null,null);

		purchaseApplicationSerivce.bathStock(stockList);

		purchaseApplicationSerivce.registWarehousing(null,null,null,warehousingList);
	}

	@Override
	public List<MrpOpenTempTO> findMrpOpenTempProcessList(String mpsNo) {
		// TODO Auto-generated method stub

		         MpsTO  mpsTO = new MpsTO();
		         mpsTO.setMpsNo(mpsNo);
		         mpsTO.setStatus("update");
		         mpsTO.setMrpApplyStatus("Y");
		         mpsDAO.updeteMps(mpsTO);


				 MrpTO  mrpTO = null;
		         List<MrpOpenTempTO> mrpOpenList = mrpDAO.MrpOpenTempProcessList(mpsNo);

		         int number = 1;

		         for(MrpOpenTempTO mrpOpenTO:mrpOpenList) {
		         mrpTO = new MrpTO();
		         String mpsNumber = mrpOpenTO.getMpsNo();
		         String mrpNo = "MR"+mpsNumber.substring(3)+Integer.toString(number);


		         mrpTO.setMrpNo(mrpNo);
		         mrpTO.setMpsNo(mpsNumber);
		         mrpTO.setItemClassification(mrpOpenTO.getItemClassification());
		         mrpTO.setItemCode(mrpOpenTO.getItemCode());
		         mrpTO.setItemName(mrpOpenTO.getItemName());
		         mrpTO.setUnitOfMrp(mrpOpenTO.getUnitOfMrp());
		         mrpTO.setRequiredAmount(mrpOpenTO.getRequiredAmount());
		         mrpTO.setOrderDate(mrpOpenTO.getOrderDate());
		         mrpTO.setRequiredDate(mrpOpenTO.getRequiredDate());
		         mrpTO.setMrpGatheringStatus("N");
		         mrpDAO.insertMrp(mrpTO);
		         number++;
		         }

		      return mrpOpenList;

	}


	@Override
	public List<MrpGatheringTO2> findMrpGatheringList2(List<MrpTO> mrplist) {
		// TODO Auto-generated method stub

		String mrpNo = "";

		MrpTO  mrpTO = new MrpTO();

	      for(MrpTO mrpto : mrplist) {
	         mrpNo += mrpto.getMrpNo()+",";
	      }

	      if(mrpNo.length()!=0) {
	      mrpNo = mrpNo.substring(0, mrpNo.length()-1);
	      }


	      List<MrpGatheringTO2> mrpGatheringList = mrpGatheringDAO.selectMrpGatheringList2(mrpNo);


	      for(MrpGatheringTO2 mrpGatheringTO2 : mrpGatheringList) {

	         if(mrpGatheringTO2.getMrpNo().length() < 14) {

	         mrpTO.setMrpNo(mrpGatheringTO2.getMrpNo());
	         mrpTO.setMrpGatheringStatus("Y");
	         mrpDAO.updateMrp(mrpTO);    // mrp취합여부 업데이트
	         }else {

	            String[] array = mrpGatheringTO2.getMrpNo().split(",");
	            for(int i=0;i<array.length;i++) {
	            	System.out.println("qqqqqqqqqq"+mrpGatheringTO2.getMrpGatheringNo());
	               mrpTO.setMrpNo(array[i]);
	               mrpTO.setMrpGatheringNo(mrpGatheringTO2.getMrpGatheringNo());
	               mrpTO.setMrpGatheringStatus("Y");
	               mrpDAO.updateMrp(mrpTO);;
	               }
	         }

	         MrpGatheringTO mrpgatheringTO = new MrpGatheringTO();
	         //mrpgatheringTO.setMrpNo(mrpGatheringTO.getMrpNo());
	         mrpgatheringTO.setMrpGatheringNo(mrpGatheringTO2.getMrpGatheringNo());
	         mrpgatheringTO.setOrderOrProductionStatus(mrpGatheringTO2.getOrderOrProductionStatus());
	         mrpgatheringTO.setItemCode(mrpGatheringTO2.getItemCode());
	         mrpgatheringTO.setItemName(mrpGatheringTO2.getItemName());
	         mrpgatheringTO.setUnitOfMrpGathering(mrpGatheringTO2.getUnitOfMrpGathering());
	         mrpgatheringTO.setNecessaryAmount(mrpGatheringTO2.getNecessaryAmount());
	         mrpgatheringTO.setDueDate(mrpGatheringTO2.getDueDate());
	         mrpgatheringTO.setClaimDate(mrpGatheringTO2.getClaimDate());
	         mrpgatheringTO.setOnGoingProcessStatus("N");
	         mrpGatheringDAO.insertMrpGathering(mrpgatheringTO);      // mrpGathering 인서트
	      }
	      return mrpGatheringList;
	}
	
	public List<MrpOpenTempTO> findMrpOpenTempProcessList(HashMap<String, Object> paramMap) {
		// TODO Auto-generated method stub
		return mrpDAO.MrpOpenTempProcessList(paramMap);
	}

////////여기부터 실험대상들
	@Override
	public void registMrp(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub

		mrpDAO.MrpInsertProcess(paramMap);

	}

	@Override
	public void registMrpGathering(Map<String, Object> paramMap) {
		// TODO Auto-generated method stub
		mrpGatheringDAO.MrpGathering(paramMap);
	}

	//작업지시 프로시저 20190110
	@Override
	public void findMaterialCheckOpen(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		workInstructionDAO.selectMaterialCheckOpen(map);
	}

	@Override
	public void findWorkInstructionOpen(HashMap<String, Object> map) {
		// TODO Auto-generated method stub
		workInstructionDAO.selectdWorkInstructionOpen(map);
		
	}




}
