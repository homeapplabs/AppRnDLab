package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseSavingPolicyProviderDAO;


public class SavingPolicyProviderDAO extends BaseSavingPolicyProviderDAO implements com.myhome.model.dao.iface.SavingPolicyProviderDAO {

	public SavingPolicyProviderDAO () {}
	
	public SavingPolicyProviderDAO (Session session) {
		super(session);
	}


}