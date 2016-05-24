package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseServiceDAO;


public class ServiceDAO extends BaseServiceDAO implements com.myhome.model.dao.iface.ServiceDAO {

	public ServiceDAO () {}
	
	public ServiceDAO (Session session) {
		super(session);
	}


}