package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class HealthCheckUpAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
    public String addHealthCheckUp(){
    	return "success";
    }
}
