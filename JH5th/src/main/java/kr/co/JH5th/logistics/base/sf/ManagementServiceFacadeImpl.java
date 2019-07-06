package kr.co.JH5th.logistics.base.sf;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.co.JH5th.logistics.base.application.ManagementApplicationService;
import kr.co.JH5th.logistics.base.to.CompanyTO;
import kr.co.JH5th.logistics.base.to.DeptTO;
import kr.co.JH5th.logistics.base.to.PositionTO;
import kr.co.JH5th.logistics.base.to.WorkplaceTO;


@Service
public class ManagementServiceFacadeImpl implements ManagementServiceFacade{

	@Autowired
	private ManagementApplicationService managementApplicationService;

	@Override
	public List<DeptTO> findDeptList() {
		// TODO Auto-generated method stub
		return managementApplicationService.findDeptList();
	}

	@Override
	public List<CompanyTO> findCompanyList() {
		// TODO Auto-generated method stub
		return managementApplicationService.findCompanyList();
	}

	@Override
	public List<WorkplaceTO> findWorkplaceList() {
		// TODO Auto-generated method stub
		return managementApplicationService.findWorkplaceList();
	}

	@Override
	public List<PositionTO> findPositionList() {
		// TODO Auto-generated method stub
		return managementApplicationService.findPositionList();
	}

	@Override
	public void registDepartment(List<DeptTO> registDeptList) {
		// TODO Auto-generated method stub
		managementApplicationService.registDepartment(registDeptList);

	}



}
