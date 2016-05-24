package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class ServiceAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addServiceBill(){
    	return "success";
    }
}
