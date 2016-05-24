package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class ForgotPasswordAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
	
	public String forgotPassword(){
		return "success";
	}

}
