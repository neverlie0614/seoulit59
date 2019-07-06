package kr.co.JH5th.base.applicationService;

import java.util.List;

import kr.co.JH5th.base.to.CodeDetailTO;
import kr.co.JH5th.base.to.CodeTO;
import kr.co.JH5th.base.to.MenuTO;

public interface BaseApplicationService {

	public List<CodeTO> findCodeList();
	// 코드리스트 조회
	
	public List<CodeDetailTO> findCodeDetailList();
	// 상세코드리스트 조회
	
	public void batchDetailCode(List<CodeDetailTO> codeDetailList); 
	// DetailCode 변경저장
	
	public List<MenuTO> findMenuList();
	



}



변경이 되는지 확인을 위한 글