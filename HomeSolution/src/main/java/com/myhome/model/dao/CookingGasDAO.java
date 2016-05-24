package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseCookingGasDAO;


public class CookingGasDAO extends BaseCookingGasDAO implements com.myhome.model.dao.iface.CookingGasDAO {

	public CookingGasDAO () {}
	
	public CookingGasDAO (Session session) {
		super(session);
	}


}