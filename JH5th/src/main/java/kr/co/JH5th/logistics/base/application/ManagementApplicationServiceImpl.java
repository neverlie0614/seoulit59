package kr.co.JH5th.logistics.base.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import kr.co.JH5th.logistics.base.dao.CompanyDAO;
import kr.co.JH5th.logistics.base.dao.DeptDAO;
import kr.co.JH5th.logistics.base.dao.PositionDAO;
import kr.co.JH5th.logistics.base.dao.WorkplaceDAO;
import kr.co.JH5th.logistics.base.to.CompanyTO;
import kr.co.JH5th.logistics.base.to.DeptTO;
import kr.co.JH5th.logistics.base.to.PositionTO;
import kr.co.JH5th.logistics.base.to.WorkplaceTO;

@Component
public class ManagementApplicationServiceImpl implements ManagementApplicationService{
	@Autowired
	private DeptDAO deptDAO;
	@Autowired
	private CompanyDAO companyDAO;
	@Autowired
	private WorkplaceDAO workplaceDAO;
	@Autowired
	private PositionDAO positionDAO;



	@Override
	public List<DeptTO> findDeptList() {
		// TODO Auto-generated method stub
		return deptDAO.selectDeptList();
	}

	@Override
	public List<CompanyTO> findCompanyList() {
		// TODO Auto-generated method stub
		return companyDAO.selectCompanyList();
	}

	@Override
	public List<WorkplaceTO> findWorkplaceList() {
		// TODO Auto-generated method stub
		return workplaceDAO.selectWorkplaceList();
	}

	@Override
	public List<PositionTO> findPositionList() {
		// TODO Auto-generated method stub
		return positionDAO.selectPositionList();
	}

	public void registDepartment(List<DeptTO> registDeptList) {
		for(DeptTO deptTo :registDeptList) {

			switch(deptTo.getStatus()) {

			case "insert" : deptDAO.insertDepartment(deptTo); break;

			case "update" : deptDAO.updateDepartment(deptTo); break;

			case "delete" : deptDAO.deleteDepartment(deptTo); break;
			}
		}

	}


}
