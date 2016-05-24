package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseBottledWaterSupplyDAO;


public class BottledWaterSupplyDAO extends BaseBottledWaterSupplyDAO implements com.myhome.model.dao.iface.BottledWaterSupplyDAO {

	public BottledWaterSupplyDAO () {}
	
	public BottledWaterSupplyDAO (Session session) {
		super(session);
	}


}