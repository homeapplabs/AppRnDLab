package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseBottledWaterSupplierDAO;


public class BottledWaterSupplierDAO extends BaseBottledWaterSupplierDAO implements com.myhome.model.dao.iface.BottledWaterSupplierDAO {

	public BottledWaterSupplierDAO () {}
	
	public BottledWaterSupplierDAO (Session session) {
		super(session);
	}


}