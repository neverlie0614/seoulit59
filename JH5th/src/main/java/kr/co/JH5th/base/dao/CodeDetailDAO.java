package kr.co.JH5th.base.dao;

import java.util.List;

import kr.co.JH5th.base.to.CodeDetailTO;

public interface CodeDetailDAO {

	public List<CodeDetailTO> selectCodeDetailList();
	// 상세코드 리스트 조회
	
	public void insertDetailCode(CodeDetailTO codeDetailTO);

	public void updateDetailCode(CodeDetailTO codeDetailTO);
	
	public void deleteDetailCode(CodeDetailTO codeDetailTOt);
	
	
}
