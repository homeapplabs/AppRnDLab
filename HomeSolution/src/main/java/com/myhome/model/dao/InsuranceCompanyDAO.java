package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseInsuranceCompanyDAO;


public class InsuranceCompanyDAO extends BaseInsuranceCompanyDAO implements com.myhome.model.dao.iface.InsuranceCompanyDAO {

	public InsuranceCompanyDAO () {}
	
	public InsuranceCompanyDAO (Session session) {
		super(session);
	}


}