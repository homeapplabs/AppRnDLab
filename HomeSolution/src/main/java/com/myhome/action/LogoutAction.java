package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class LogoutAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}

	public String logout() throws Exception{
		return "success";
	}
}
