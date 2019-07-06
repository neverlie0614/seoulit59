package kr.co.JH5th.logistics.base.sf;

import java.util.List;

import kr.co.JH5th.logistics.base.to.CompanyTO;
import kr.co.JH5th.logistics.base.to.DeptTO;
import kr.co.JH5th.logistics.base.to.PositionTO;
import kr.co.JH5th.logistics.base.to.WorkplaceTO;

public interface ManagementServiceFacade {

	public List<DeptTO> findDeptList();

	public List<CompanyTO> findCompanyList();

	public List<WorkplaceTO> findWorkplaceList();

	public List<PositionTO> findPositionList();

	public void registDepartment(List<DeptTO> registDeptList);

}
