package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BasePipedWaterSupplyDAO;


public class PipedWaterSupplyDAO extends BasePipedWaterSupplyDAO implements com.myhome.model.dao.iface.PipedWaterSupplyDAO {

	public PipedWaterSupplyDAO () {}
	
	public PipedWaterSupplyDAO (Session session) {
		super(session);
	}


}