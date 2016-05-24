package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseLoginDAO;


public class LoginDAO extends BaseLoginDAO implements com.myhome.model.dao.iface.LoginDAO {

	public LoginDAO () {}
	
	public LoginDAO (Session session) {
		super(session);
	}


}