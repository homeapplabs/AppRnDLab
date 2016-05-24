package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class ContactUsAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}

	public String contactUs() {
		return "success";
	}
}
