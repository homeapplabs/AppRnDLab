package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseDistrictDAO;


public class DistrictDAO extends BaseDistrictDAO implements com.myhome.model.dao.iface.DistrictDAO {

	public DistrictDAO () {}
	
	public DistrictDAO (Session session) {
		super(session);
	}


}