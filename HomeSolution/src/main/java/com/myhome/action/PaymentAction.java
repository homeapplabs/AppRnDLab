package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class PaymentAction implements ModelDriven {
	
	@Override
	public Object getModel() {
		return null;
	}
	
	public String addPayment(){
		return "success";
	}

}
