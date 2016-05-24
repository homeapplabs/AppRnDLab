package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseRWAChargesDAO;


public class RWAChargesDAO extends BaseRWAChargesDAO implements com.myhome.model.dao.iface.RWAChargesDAO {

	public RWAChargesDAO () {}
	
	public RWAChargesDAO (Session session) {
		super(session);
	}


}