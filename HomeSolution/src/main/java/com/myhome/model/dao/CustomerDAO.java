package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseCustomerDAO;


public class CustomerDAO extends BaseCustomerDAO implements com.myhome.model.dao.iface.CustomerDAO {

	public CustomerDAO () {}
	
	public CustomerDAO (Session session) {
		super(session);
	}


}