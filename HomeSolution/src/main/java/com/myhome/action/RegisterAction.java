package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class RegisterAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}

	public String customerRegistration(){
		return "success";
	}
}
