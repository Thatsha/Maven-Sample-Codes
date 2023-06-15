package com.TestNG;

import org.testng.annotations.Test;

public class TestNG {
	
	@Test 
	public void firstTestCase() {
		System.out.println("Login");
	}
	
	@Test
	public void secondTestCase() {
		System.out.println("Create");
	}
	
	@Test
	public void thirdTestCase() {
		System.out.println("Edit");
	}
	
	@Test
	public void fourthTestCase() {
		System.out.println("Delete");
	}
	
	@Test                                                                                                                                                                                                                                                                                                                                   
	public void fifthTestCase() {
		System.out.println("Logout");
	}

}
