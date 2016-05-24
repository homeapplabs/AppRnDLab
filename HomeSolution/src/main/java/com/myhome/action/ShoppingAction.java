package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;


public class ShoppingAction implements ModelDriven {

	@Override
	public Object getModel() {
				return null;
	}
	public String addShopping(){
		return "success"; 
	}
	
	public String shoppingList(){
		return "success";
	}
}
