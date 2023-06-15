package com.TestNG;

import org.testng.annotations.Test;

public class Priority_TestNG {
	
	@Test (priority=1)
	public void firstTestCase() {
		System.out.println("Login");
	}
	
	@Test(priority=2)
	public void secondTestCase() {
		System.out.println("Create");
	}
	
	@Test(priority=3)
	public void thirdTestCase() {
		System.out.println("Edit");
	}
	
	@Test(priority=4)
	public void fourthTestCase() {
		System.out.println("Delete");
	}
	
	@Test(priority=0)                         //0 value has higher priority                                                                                                                                                                                                                                                                                                             
	public void fifthTestCase() {
		System.out.println("Logout");
	}

}
