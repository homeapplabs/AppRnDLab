package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseElectricityDAO;


public class ElectricityDAO extends BaseElectricityDAO implements com.myhome.model.dao.iface.ElectricityDAO {

	public ElectricityDAO () {}
	
	public ElectricityDAO (Session session) {
		super(session);
	}


}