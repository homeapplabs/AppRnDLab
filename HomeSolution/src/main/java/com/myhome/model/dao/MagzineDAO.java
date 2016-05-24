package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseMagzineDAO;


public class MagzineDAO extends BaseMagzineDAO implements com.myhome.model.dao.iface.MagzineDAO {

	public MagzineDAO () {}
	
	public MagzineDAO (Session session) {
		super(session);
	}


}