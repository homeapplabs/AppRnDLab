package com.myhome.action;
import com.opensymphony.xwork2.ModelDriven;


public class BillsAction implements ModelDriven {

	@Override
	public Object getModel() {
		return null;
	}
	
	public String addBill(){
		return "success"; 
	}

}
