package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseMilkSupplierDAO;


public class MilkSupplierDAO extends BaseMilkSupplierDAO implements com.myhome.model.dao.iface.MilkSupplierDAO {

	public MilkSupplierDAO () {}
	
	public MilkSupplierDAO (Session session) {
		super(session);
	}


}