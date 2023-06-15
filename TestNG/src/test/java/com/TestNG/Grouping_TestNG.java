package com.TestNG;

import org.testng.annotations.Test;

public class Grouping_TestNG {
	@Test (groups = "a")
	public void firstTestCase() {
		System.out.println("Login");
	}
	
	@Test(groups = "b")
	public void secondTestCase() {
		System.out.println("Create");
	}
	
	@Test(groups = "c")
	public void thirdTestCase() {
		System.out.println("Edit");
	}
	
	@Test(groups = "d")
	public void fourthTestCase() {
		System.out.println("Delete");
	}
	
	@Test(groups = "e")                                                                                                                                                                                                                                                                                                                                 
	public void fifthTestCase() {
		System.out.println("Logout");
	}
}
