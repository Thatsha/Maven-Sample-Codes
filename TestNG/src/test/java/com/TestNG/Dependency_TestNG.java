package com.TestNG;

import org.testng.annotations.Test;

public class Dependency_TestNG {
	@Test (priority=1)
	public void firstTestCase() {
		System.out.println("Login");
	}
	
	@Test(dependsOnMethods = "firstTestCase")
	public void secondTestCase() {
		System.out.println("Create");
	}
	
	@Test(dependsOnMethods = "secondTestCase")
	public void thirdTestCase() {
		System.out.println("Edit");
	}
	
	@Test(dependsOnMethods ="thirdTestCase")
	public void fourthTestCase() {
		System.out.println("Delete");
	}
	
	@Test(dependsOnMethods ="fourthTestCase")                                                                                                                                                                                                                                                                                                                                      
	public void fifthTestCase() {
		System.out.println("Logout");
	}

}
