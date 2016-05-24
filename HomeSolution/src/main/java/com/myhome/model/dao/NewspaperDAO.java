package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseNewspaperDAO;


public class NewspaperDAO extends BaseNewspaperDAO implements com.myhome.model.dao.iface.NewspaperDAO {

	public NewspaperDAO () {}
	
	public NewspaperDAO (Session session) {
		super(session);
	}


}