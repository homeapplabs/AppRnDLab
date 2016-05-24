package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class HomeAction implements ModelDriven{

	@Override
	public Object getModel() {
		return null;
	}

	public String home()throws Exception{
		return "success";
	}
	
}
