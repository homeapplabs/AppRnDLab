package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseCountryDAO;


public class CountryDAO extends BaseCountryDAO implements com.myhome.model.dao.iface.CountryDAO {

	public CountryDAO () {}
	
	public CountryDAO (Session session) {
		super(session);
	}


}