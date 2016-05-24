package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BasePhoneMobileDAO;


public class PhoneMobileDAO extends BasePhoneMobileDAO implements com.myhome.model.dao.iface.PhoneMobileDAO {

	public PhoneMobileDAO () {}
	
	public PhoneMobileDAO (Session session) {
		super(session);
	}


}