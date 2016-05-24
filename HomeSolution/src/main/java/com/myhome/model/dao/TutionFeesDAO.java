package com.myhome.model.dao;

import org.hibernate.Session;

import com.myhome.model.base.BaseTutionFeesDAO;


public class TutionFeesDAO extends BaseTutionFeesDAO implements com.myhome.model.dao.iface.TutionFeesDAO {

	public TutionFeesDAO () {}
	
	public TutionFeesDAO (Session session) {
		super(session);
	}


}