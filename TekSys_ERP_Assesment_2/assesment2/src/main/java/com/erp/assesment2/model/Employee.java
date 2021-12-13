package com.erp.assesment2.model;

import java.sql.Date;

/*
 * Author - Solomon Gugsa
 * ERP-Assesment Question 2
 * Date - 12/12/2021
 * This Demo is about modifying existing Employee class to give flexibility to support the new part-time employee notion.
 * */

public class Employee {
	
	public boolean managerFlag;
	public String name;
    public Date dateHired;
    
    /*
     * To Be flexible with the new part-time employee , Change ID data type from <int> to <String>.
     * For Part-time Employee ID will start with PT-and follow by numbers, for Full-time Employee only number.
     * Then add one more boolean field for Full time employee flag.
     * Add a method in Employee Service class.This method  returns True for full time and False for part time employee.
     * 
     */
    public String id;
    public boolean fullTimeEmployeeFlag;
    
    //Getters and Setters

	public boolean isFullTimeEmployeeFlag() {
		return fullTimeEmployeeFlag;
	}

	public void setFullTimeEmployeeFlag(boolean fullTimeEmployeeFlag) {
		this.fullTimeEmployeeFlag = fullTimeEmployeeFlag;
	}

	public boolean isManagerFlag() {
		return managerFlag;
	}

	public void setManagerFlag(boolean managerFlag) {
		this.managerFlag = managerFlag;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateHired() {
		return dateHired;
	}

	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
    
    
}
