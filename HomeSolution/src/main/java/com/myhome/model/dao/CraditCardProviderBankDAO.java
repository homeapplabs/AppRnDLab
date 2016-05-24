package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseCraditCardProviderBankDAO;


public class CraditCardProviderBankDAO extends BaseCraditCardProviderBankDAO implements com.myhome.model.dao.iface.CraditCardProviderBankDAO {

	public CraditCardProviderBankDAO () {}
	
	public CraditCardProviderBankDAO (Session session) {
		super(session);
	}


}