package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseInsurancePremiumDAO;


public class InsurancePremiumDAO extends BaseInsurancePremiumDAO implements com.myhome.model.dao.iface.InsurancePremiumDAO {

	public InsurancePremiumDAO () {}
	
	public InsurancePremiumDAO (Session session) {
		super(session);
	}


}