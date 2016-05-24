package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseLoanProviderDAO;


public class LoanProviderDAO extends BaseLoanProviderDAO implements com.myhome.model.dao.iface.LoanProviderDAO {

	public LoanProviderDAO () {}
	
	public LoanProviderDAO (Session session) {
		super(session);
	}


}