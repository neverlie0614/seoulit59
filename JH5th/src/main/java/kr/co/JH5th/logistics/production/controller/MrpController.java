package kr.co.JH5th.logistics.production.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.tobesoft.xplatform.data.PlatformData;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.JH5th.common.mapper.DatasetBeanMapper;
import kr.co.JH5th.logistics.production.sf.ProductionServiceFacade;
import kr.co.JH5th.logistics.production.to.MpsTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO;
import kr.co.JH5th.logistics.production.to.MrpGatheringTO2;
import kr.co.JH5th.logistics.production.to.MrpOpenTempTO;
import kr.co.JH5th.logistics.production.to.MrpTO;


@Controller
public class MrpController{

	@Autowired
	private ProductionServiceFacade productionServiceFacade;
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("logistics/production/findMrpList.do")
	public void findMrpList (HttpServletRequest request, HttpServletResponse response) throws Exception {
//		HashMap<String,Object> map = new HashMap<>();
//		PlatformData inData = (PlatformData) request.getAttribute("inData");
//		PlatformData outData = (PlatformData) request.getAttribute("outData");
//		String mrpGatheringStatus = inData.getVariable("mrpGatheringStatus").getString();
//		map.put("mrpGatheringStatus", mrpGatheringStatus);
//		List<MrpTO> mrpList = productionServiceFacade.findMrpList(map);
//		datasetBeanMapper.beansToDataset(outData, mrpList, MrpTO.class);
		 PlatformData outData = (PlatformData) request.getAttribute("outData");

	        List<MrpTO> mrpList = productionServiceFacade.findMrpList();

	        datasetBeanMapper.beansToDataset(outData, mrpList, MrpTO.class);


	}


	@RequestMapping("logistics/production/findMrpGatheringList.do")
	public void findMrpGatheringList (HttpServletRequest request, HttpServletResponse response) throws Exception {
		HashMap<String,Object> map = new HashMap<>();
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		String gatheringStatus = inData.getVariable("gatheringStatus").getString();
		map.put("gatheringStatus", gatheringStatus);
		List<MrpGatheringTO> mrpGatheringList = productionServiceFacade.findMrpGatheringList(map);
		datasetBeanMapper.beansToDataset(outData, mrpGatheringList, MrpGatheringTO.class);


	}


	@RequestMapping("logistics/production/findMrpOpenTempProcessList.do")
	public void findMrpOpenTempProcessList (HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		String mpsNo = inData.getVariable("mpsNo").getString();

		List<MrpOpenTempTO> mrpOpenTempList = productionServiceFacade.findMrpOpenTempProcessList(mpsNo);

		datasetBeanMapper.beansToDataset(outData, mrpOpenTempList, MrpOpenTempTO.class);

	}



	@RequestMapping("logistics/production/bathMrpGathering.do")
	public void bathMrpGathering (HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<MrpGatheringTO> mrpGatheringList = datasetBeanMapper.datasetToBeans(inData, MrpGatheringTO.class);

		productionServiceFacade.bathMrpGathering(mrpGatheringList);

		findMrpList(request, response);
		findMrpGatheringList(request, response);

	}


	@RequestMapping("logistics/production/findMrpGatheringList2.do")
	public void findMrpGatheringList2 (HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		PlatformData inData = (PlatformData) request.getAttribute("inData");
	    List<MrpTO> mrpList = datasetBeanMapper.datasetToBeans(inData, MrpTO.class);

	    List<MrpGatheringTO2> mrpGatheringList = productionServiceFacade.findMrpGatheringList2(mrpList);

	    datasetBeanMapper.beansToDataset(outData, mrpGatheringList, MrpGatheringTO2.class);

	}

	//소요량전개 프로시저 
	@RequestMapping("logistics/production/findMrpOpenTempProcessList2.do")
	public void findMrpOpenTempProcessList2 (HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		
		HashMap<String, Object> paramMap = new HashMap<>();
		
	   List<MpsTO> mpsList = datasetBeanMapper.datasetToBeans(inData, MpsTO.class);
	   int flag=0;
	   for(MpsTO mp :mpsList){
	      flag++;
	   }
	   String[] mpsNo=new String[flag];
	   int index=0;
	   for(MpsTO mpt :mpsList){
	      System.out.println(mpt.getMpsNo());
	      mpsNo[index]=(String)mpt.getMpsNo();
	      index++;
	      //System.out.println(index+"uuu"+mpsNo[index-1]);
	   }
		
		paramMap.put("paramArray", mpsNo);
		
		productionServiceFacade.findMrpOpenTempProcessList(paramMap);
		List<MrpOpenTempTO> mrpOpenTempList = (List<MrpOpenTempTO>)paramMap.get("result");
				
		datasetBeanMapper.beansToDataset(outData, mrpOpenTempList, MrpOpenTempTO.class);
		
		
	}
	
	/*
	// 소요량 전개 MRP_OPEN_TEMP 프로시져

		PlatformData inData = (PlatformData) request.getAttribute("inData");

		PlatformData outData = (PlatformData) request.getAttribute("outData");

	// result Object 생성





	// 소요량 전개 MRP INSERT 프로시져
	public void registMrp(HttpServletRequest request, HttpServletResponse response) throws Exception{

		Map<String, Object> paramMap = new HashMap<>();

	productionServiceFacade.registMrp(paramMap);


	}
	*/

	// 소요량 취합 프로시져
	@RequestMapping("logistics/production/registMrpGathering.do")
	public void registMrpGathering(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		HashMap<String, Object> paramMap = new HashMap<>();
				
		   List<MrpTO> mrpList = datasetBeanMapper.datasetToBeans(inData, MrpTO.class);
		   int flag=0;
		   String mpsn="a";
		   for(MrpTO mr :mrpList){
			   if(!(mpsn).equals(mr.getMpsNo())) {
				   mpsn=mr.getMpsNo();
				   flag++;
			   }
		   }
		   String[] mrpNo=new String[flag];
		   int index=0;
		   for(MrpTO mrp :mrpList){
		      System.out.println(mrp.getMpsNo());
		      //mrpNo[index]=(String)mrp.getMpsNo();
		      if(index==0) {
		    	  mrpNo[index]=(String)mrp.getMpsNo();
		    	  index++;
		      }
		      if(index!=0) {
		    	  if(!(mrpNo[index-1]).equals(mrp.getMpsNo())) {
		    		  //System.out.println(index+"들어갈 소요량취합"+mrp.getMpsNo());
		    		  //System.out.println(index+"들어갈 소요량취합"+mrpNo[index-1]);
		    		  mrpNo[index]=(String)mrp.getMpsNo();
		    		  index++;
		    	  }else {
		    		  //System.out.println("진입실패"); 
		    	  }
		      }
		      //System.out.println(index+"소요량취합번호"+mrpNo[index-1]);
		   }
			
			paramMap.put("paramArray", mrpNo);
			
			productionServiceFacade.registMrpGathering(paramMap);
					

	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	///여기부터 실험용
	// 소요량 전개 MRP_OPEN_TEMP 프로시져
/*
	public void findMrpOpenTempList(PlatformData inData ,PlatformData outData) throws Exception {
	// result Object 생성

	HashMap<String, Object> paramMap = new HashMap<>();

	String[] mpsNo = {"PS2018101601", "PS2018101602"};

	paramMap.put("paramArray", mpsNo);

	List<MrpOpenTempTO> mrpOpenTempList = productionServiceFacade.findMrpOpenTempProcessList(paramMap);




	datasetBeanMapper.beansToDataset(outData, mrpOpenTempList, MrpOpenTempTO.class);


	}



	// 소요량 전개 MRP INSERT 프로시져
	//@RequestMapping("logistics/production/registMrp.do")
	public void registMrp(PlatformData inData ,PlatformData outData) throws Exception{

		Map<String, Object> paramMap = new HashMap<>();

	productionServiceFacade.registMrp(paramMap);


	}


	// 소요량 취합 프로시져
	//@RequestMapping("logistics/production/registMrpGathering.do")
	public void registMrpGathering(PlatformData inData ,PlatformData outData) throws Exception{

	HashMap<String,Object> paramMap = new HashMap<>();

	String[] mpsNo = {"PS2018101601", "PS2018101602"};

	paramMap.put("paramArray", mpsNo);


	productionServiceFacade.registMrpGathering(paramMap);

		findMrpList(inData, outData);
		findMrpGatheringList(inData, outData);

	}*/


}
