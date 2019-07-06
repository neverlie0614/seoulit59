package kr.co.JH5th.base.controller;

import java.util.List;

import com.tobesoft.xplatform.data.PlatformData;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.JH5th.base.sf.BaseServiceFacade;
import kr.co.JH5th.base.to.MenuTO;
import kr.co.JH5th.common.mapper.DatasetBeanMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class MenuController {
	@Autowired
	private BaseServiceFacade baseServiceFacade;
	
	@Autowired
	private DatasetBeanMapper datasetBeanMapper;
	
	@RequestMapping("base/findMenuList.do")
	public void findMenuList(HttpServletRequest request, HttpServletResponse response) throws Exception{
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<MenuTO> menuList= baseServiceFacade.findMenuList();
        
        datasetBeanMapper.beansToDataset(outData, menuList, MenuTO.class);
        
	}
	
}
