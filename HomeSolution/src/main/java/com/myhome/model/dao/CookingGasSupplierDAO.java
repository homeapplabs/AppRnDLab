package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseCookingGasSupplierDAO;


public class CookingGasSupplierDAO extends BaseCookingGasSupplierDAO implements com.myhome.model.dao.iface.CookingGasSupplierDAO {

	public CookingGasSupplierDAO () {}
	
	public CookingGasSupplierDAO (Session session) {
		super(session);
	}


}