package kr.co.JH5th.logistics.purchase.dao;

import java.util.List;

import kr.co.JH5th.logistics.purchase.to.MaterialPaymentTO;

public interface MaterialPaymentDAO {

	public List<MaterialPaymentTO> selectMaterialPaymentList();

	public void insertMaterialPayment(MaterialPaymentTO materialPaymentTO);


}
