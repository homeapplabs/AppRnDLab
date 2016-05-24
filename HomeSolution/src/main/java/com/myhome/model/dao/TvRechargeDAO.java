package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseTvRechargeDAO;


public class TvRechargeDAO extends BaseTvRechargeDAO implements com.myhome.model.dao.iface.TvRechargeDAO {

	public TvRechargeDAO () {}
	
	public TvRechargeDAO (Session session) {
		super(session);
	}


}