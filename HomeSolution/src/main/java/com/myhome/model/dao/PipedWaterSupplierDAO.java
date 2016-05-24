package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BasePipedWaterSupplierDAO;


public class PipedWaterSupplierDAO extends BasePipedWaterSupplierDAO implements com.myhome.model.dao.iface.PipedWaterSupplierDAO {

	public PipedWaterSupplierDAO () {}
	
	public PipedWaterSupplierDAO (Session session) {
		super(session);
	}


}