package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseLoanPremiumDAO;


public class LoanPremiumDAO extends BaseLoanPremiumDAO implements com.myhome.model.dao.iface.LoanPremiumDAO {

	public LoanPremiumDAO () {}
	
	public LoanPremiumDAO (Session session) {
		super(session);
	}


}