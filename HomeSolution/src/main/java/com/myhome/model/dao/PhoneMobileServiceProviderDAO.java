package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BasePhoneMobileServiceProviderDAO;


public class PhoneMobileServiceProviderDAO extends BasePhoneMobileServiceProviderDAO implements com.myhome.model.dao.iface.PhoneMobileServiceProviderDAO {

	public PhoneMobileServiceProviderDAO () {}
	
	public PhoneMobileServiceProviderDAO (Session session) {
		super(session);
	}


}