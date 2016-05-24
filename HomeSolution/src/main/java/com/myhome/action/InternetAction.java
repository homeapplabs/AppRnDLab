package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class InternetAction implements ModelDriven{

	@Override
	public Object getModel() {
		return null;
	}
    public String addInternetBill(){
	   return "success";
}
}
