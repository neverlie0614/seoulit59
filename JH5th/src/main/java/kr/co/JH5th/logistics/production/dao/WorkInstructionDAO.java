package kr.co.JH5th.logistics.production.dao;

import java.util.HashMap;
import java.util.List;

import kr.co.JH5th.logistics.production.to.MaterialCheckTO;
import kr.co.JH5th.logistics.production.to.WorkInstructionTO;

public interface WorkInstructionDAO {

	public List<WorkInstructionTO> selectWorkInstructionList();

	public void insertWorkInstruction(WorkInstructionTO workInstructionTO);

	public void updateWorkInstruction(WorkInstructionTO workInstructionTO);

	public void deleteWorkInstruction(WorkInstructionTO workInstructionTO);

	//작업지시 프로시저 20190121
	public List<MaterialCheckTO> selectdWorkInstructionOpen(HashMap<String, Object> map); 
	//작업지시 프로시저 20190110
	public List<MaterialCheckTO> selectMaterialCheckOpen(HashMap<String, Object> map); 

}
