package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class PhoneMobileAction implements ModelDriven{

	@Override
	public Object getModel() {
				return null;
	}
	public String addPhoneMobileBill(){
     return "success";
}
}
