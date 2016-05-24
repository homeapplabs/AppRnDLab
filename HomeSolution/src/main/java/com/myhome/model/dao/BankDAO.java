package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseBankDAO;


public class BankDAO extends BaseBankDAO implements com.myhome.model.dao.iface.BankDAO {

	public BankDAO () {}
	
	public BankDAO (Session session) {
		super(session);
	}


}