package kr.co.JH5th.base.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.JH5th.base.applicationService.BaseApplicationService;
import kr.co.JH5th.base.to.CodeDetailTO;
import kr.co.JH5th.base.to.CodeTO;
import kr.co.JH5th.base.to.MenuTO;


@Service
public class BaseServiceFacadeImpl implements BaseServiceFacade{
	@Autowired
	private BaseApplicationService baseApplicationService;
	
	
	@Override
	public List<CodeTO> findCodeList() {
		// TODO Auto-generated method stub
		return baseApplicationService.findCodeList();
	}

	@Override
	public List<CodeDetailTO> findCodeDetailList() {
		// TODO Auto-generated method stub
		return baseApplicationService.findCodeDetailList();
	}


	@Override
	public void batchDetailCode(List<CodeDetailTO> codeDetailList) {
		// TODO Auto-generated method stub
		baseApplicationService.batchDetailCode(codeDetailList);
	}


	@Override
	public List<MenuTO> findMenuList() {
		// TODO Auto-generated method stub
		return baseApplicationService.findMenuList();
	}


}
