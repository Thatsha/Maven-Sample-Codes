package com.TestNG;

import org.testng.annotations.Test;

public class InvocationCount_TestNG {
	
	@Test (invocationCount = 2,priority = 1)
	public void firstTestCase() {
		System.out.println("Login");
	}
	
	@Test(invocationCount = 2,priority=2)
	public void secondTestCase() {
		System.out.println("Create");
	}
	
	@Test(invocationCount = 4,priority=3)
	public void thirdTestCase() {
		System.out.println("Edit");
	}
	
	@Test(invocationCount = 2,priority=4)
	public void fourthTestCase() {
		System.out.println("Delete");
	}
	
	@Test(priority=5)                                                                                                                                                                                                                                                                                                                                 
	public void fifthTestCase() {
		System.out.println("Logout");
	}
}
