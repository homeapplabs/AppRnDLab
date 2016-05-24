package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class NewspaperAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
	
	public String addNewspaperBill(){
		return "success";
	}
}
