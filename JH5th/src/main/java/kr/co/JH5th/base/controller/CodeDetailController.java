package kr.co.JH5th.base.controller;


import java.util.List;

import com.tobesoft.xplatform.data.PlatformData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.JH5th.base.sf.BaseServiceFacade;
import kr.co.JH5th.base.to.CodeDetailTO;
import kr.co.JH5th.common.mapper.DatasetBeanMapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class CodeDetailController {
	@Autowired
	private BaseServiceFacade baseServiceFacade;

	@Autowired
	private DatasetBeanMapper datasetBeanMapper;

	@RequestMapping("base/findCodeDetailList.do")
	public void findCodeDetailList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData outData = (PlatformData) request.getAttribute("outData");
		List<CodeDetailTO> codeDetailList = baseServiceFacade.findCodeDetailList();
		datasetBeanMapper.beansToDataset(outData, codeDetailList, CodeDetailTO.class);

	}
	@RequestMapping("base/batchDetailCode.do")
	public void batchDetailCode(HttpServletRequest request, HttpServletResponse response) throws Exception {
		PlatformData inData = (PlatformData) request.getAttribute("inData");
		List<CodeDetailTO> codeDetailList = datasetBeanMapper.datasetToBeans(inData, CodeDetailTO.class);
		baseServiceFacade.batchDetailCode(codeDetailList);
		findCodeDetailList(request, response);

	}

}
