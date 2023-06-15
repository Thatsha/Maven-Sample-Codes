package com.TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Assert_TestNG {
	
//Verification
	@Test
	private void practice() {
		String userName="Thatsha";
		String userName1="Thatsha1";
		
		System.out.println("Login Page");
		SoftAssert SA=new SoftAssert();
		SA.assertEquals(userName, userName1);
		System.out.println("Hompe Page");
	}
	
//Validation
	@SuppressWarnings("deprecation")
	@Test
	private void practice1() {
		String Name="Thatsha";
		String Name1="Thatsha1";
		System.out.println("Login Page");
		Assert.assertEquals(Name, Name1);
		System.out.println("Hompe Page");
	}
	

}
