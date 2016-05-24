package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseMilkSupplyDAO;


public class MilkSupplyDAO extends BaseMilkSupplyDAO implements com.myhome.model.dao.iface.MilkSupplyDAO {

	public MilkSupplyDAO () {}
	
	public MilkSupplyDAO (Session session) {
		super(session);
	}


}