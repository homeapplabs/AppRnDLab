package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseRegistrationDAO;


public class RegistrationDAO extends BaseRegistrationDAO implements com.myhome.model.dao.iface.RegistrationDAO {

	public RegistrationDAO () {}
	
	public RegistrationDAO (Session session) {
		super(session);
	}


}