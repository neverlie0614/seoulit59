
package kr.co.JH5th.base.applicationService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.JH5th.base.dao.CodeDAO;
import kr.co.JH5th.base.dao.CodeDetailDAO;
import kr.co.JH5th.base.dao.MenuDAO;
import kr.co.JH5th.base.to.CodeDetailTO;
import kr.co.JH5th.base.to.CodeTO;
import kr.co.JH5th.base.to.MenuTO;

@Component
public class BaseApplicationServiceImpl implements BaseApplicationService{
	
	@Autowired
	private CodeDAO codeDAO;
	@Autowired
	private CodeDetailDAO codeDetailDAO;
	@Autowired
	private MenuDAO menuDAO;
	

	@Override
	public List<CodeTO> findCodeList() {
		// TODO Auto-generated method stub
		return codeDAO.selectCodeList();
	}

	@Override
	public List<CodeDetailTO> findCodeDetailList() {
		// TODO Auto-generated method stub
		return codeDetailDAO.selectCodeDetailList();
	}

	@Override
	public void batchDetailCode(List<CodeDetailTO> codeDetailList) {
		// TODO Auto-generated method stub
		
		for(CodeDetailTO codeDetailTO : codeDetailList) {
			
			switch(codeDetailTO.getStatus()) {
			case "insert" : codeDetailDAO.insertDetailCode(codeDetailTO); break;
			case "update" : codeDetailDAO.updateDetailCode(codeDetailTO); break;
			case "delete" : codeDetailDAO.deleteDetailCode(codeDetailTO); break;
					
			}
					
		}
	}

	
	@Override
	public List<MenuTO> findMenuList() {
		// TODO Auto-generated method stub
		return menuDAO.selectMenuList();
	}

}
