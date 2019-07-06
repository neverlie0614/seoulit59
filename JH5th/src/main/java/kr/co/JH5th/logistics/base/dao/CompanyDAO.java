package kr.co.JH5th.logistics.base.dao;

import java.util.List;

import kr.co.JH5th.logistics.base.to.CompanyTO;


public interface CompanyDAO {

	public List<CompanyTO> selectCompanyList();

}
