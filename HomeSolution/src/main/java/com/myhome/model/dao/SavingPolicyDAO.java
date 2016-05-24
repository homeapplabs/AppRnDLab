package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseSavingPolicyDAO;


public class SavingPolicyDAO extends BaseSavingPolicyDAO implements com.myhome.model.dao.iface.SavingPolicyDAO {

	public SavingPolicyDAO () {}
	
	public SavingPolicyDAO (Session session) {
		super(session);
	}


}