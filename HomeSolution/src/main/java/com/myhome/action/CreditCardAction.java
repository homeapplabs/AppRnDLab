package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class CreditCardAction implements ModelDriven{

	@Override
	public Object getModel() {
		return null;
	}
    public String addCreditCardBill(){
    	return "success";
    }
}
