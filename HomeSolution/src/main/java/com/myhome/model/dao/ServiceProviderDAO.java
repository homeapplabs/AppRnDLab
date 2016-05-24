package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseServiceProviderDAO;


public class ServiceProviderDAO extends BaseServiceProviderDAO implements com.myhome.model.dao.iface.ServiceProviderDAO {

	public ServiceProviderDAO () {}
	
	public ServiceProviderDAO (Session session) {
		super(session);
	}


}