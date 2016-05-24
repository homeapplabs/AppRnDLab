package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseElectricitySupplierDAO;


public class ElectricitySupplierDAO extends BaseElectricitySupplierDAO implements com.myhome.model.dao.iface.ElectricitySupplierDAO {

	public ElectricitySupplierDAO () {}
	
	public ElectricitySupplierDAO (Session session) {
		super(session);
	}


}