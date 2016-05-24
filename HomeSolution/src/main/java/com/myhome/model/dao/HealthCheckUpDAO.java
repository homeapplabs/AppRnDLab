package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseHealthCheckUpDAO;


public class HealthCheckUpDAO extends BaseHealthCheckUpDAO implements com.myhome.model.dao.iface.HealthCheckUpDAO {

	public HealthCheckUpDAO () {}
	
	public HealthCheckUpDAO (Session session) {
		super(session);
	}


}