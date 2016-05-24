package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseNewsAgencyDAO;


public class NewsAgencyDAO extends BaseNewsAgencyDAO implements com.myhome.model.dao.iface.NewsAgencyDAO {

	public NewsAgencyDAO () {}
	
	public NewsAgencyDAO (Session session) {
		super(session);
	}


}