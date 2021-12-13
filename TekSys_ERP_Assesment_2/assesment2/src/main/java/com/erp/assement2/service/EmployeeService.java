package com.erp.assement2.service;

/*
 * Author - Solomon Gugsa
 * 	For ERP Assesmnet*/

public class EmployeeService {
	
	/*
	 * This Method will be tested in TestEmployeeService Class */
	
	public boolean isFullTimeEmployee(String id) {
		boolean status = true;
		
		if(id.startsWith("PT")) {
			status = false;
		}
		return status;
	}

}
