package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseInternetServiceProviderDAO;


public class InternetServiceProviderDAO extends BaseInternetServiceProviderDAO implements com.myhome.model.dao.iface.InternetServiceProviderDAO {

	public InternetServiceProviderDAO () {}
	
	public InternetServiceProviderDAO (Session session) {
		super(session);
	}


}