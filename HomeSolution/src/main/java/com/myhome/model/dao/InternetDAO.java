package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseInternetDAO;


public class InternetDAO extends BaseInternetDAO implements com.myhome.model.dao.iface.InternetDAO {

	public InternetDAO () {}
	
	public InternetDAO (Session session) {
		super(session);
	}


}