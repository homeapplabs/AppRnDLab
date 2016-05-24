package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseCraditCardDAO;


public class CraditCardDAO extends BaseCraditCardDAO implements com.myhome.model.dao.iface.CraditCardDAO {

	public CraditCardDAO () {}
	
	public CraditCardDAO (Session session) {
		super(session);
	}


}