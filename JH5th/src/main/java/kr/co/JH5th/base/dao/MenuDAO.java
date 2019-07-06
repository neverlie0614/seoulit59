package kr.co.JH5th.base.dao;

import java.util.List;

import kr.co.JH5th.base.to.MenuTO;

public interface MenuDAO {

	public List<MenuTO> selectMenuList();
}
