package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseTVServiceProviderDAO;


public class TVServiceProviderDAO extends BaseTVServiceProviderDAO implements com.myhome.model.dao.iface.TVServiceProviderDAO {

	public TVServiceProviderDAO () {}
	
	public TVServiceProviderDAO (Session session) {
		super(session);
	}


}