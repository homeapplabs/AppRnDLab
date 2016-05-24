package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseAddressDAO;


public class AddressDAO extends BaseAddressDAO implements com.myhome.model.dao.iface.AddressDAO {

	public AddressDAO () {}
	
	public AddressDAO (Session session) {
		super(session);
	}


}