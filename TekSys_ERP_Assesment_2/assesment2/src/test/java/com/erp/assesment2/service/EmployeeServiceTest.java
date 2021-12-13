package com.erp.assesment2.service;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.erp.assement2.service.EmployeeService;

/*
 * Unit Test - testing for employee status*/
public class EmployeeServiceTest {

	// This test expected to return True for full time employee.
	@Test

	public void testIsFullTimeEmployee_FullTimeEmployee() {

		EmployeeService service = new EmployeeService();

		boolean result = service.isFullTimeEmployee("12345");

		assertTrue(result);
	}

	// This test expected to return False for full time employee.
	@Test

	public void testIsFullTimeEmployee_PartTimeEmployee() {

		EmployeeService service = new EmployeeService();

		boolean result = service.isFullTimeEmployee("PT12345");

		assertFalse(result);
	}

}
