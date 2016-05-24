package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseStateCountyDAO;


public class StateCountyDAO extends BaseStateCountyDAO implements com.myhome.model.dao.iface.StateCountyDAO {

	public StateCountyDAO () {}
	
	public StateCountyDAO (Session session) {
		super(session);
	}


}