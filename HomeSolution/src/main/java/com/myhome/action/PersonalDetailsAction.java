package com.myhome.action;

import com.opensymphony.xwork2.ModelDriven;

public class PersonalDetailsAction implements ModelDriven {

	@Override
	public Object getModel() {
				return null;
	}
	public String loadPersonal(){
		return "success";
	}
}
