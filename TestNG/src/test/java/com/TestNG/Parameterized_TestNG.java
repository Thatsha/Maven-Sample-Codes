package com.TestNG;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterized_TestNG {
	
@Test
@Parameters({"UserName","Password"})
	public void credential( String UserName,
						  int Password) {
	
		System.out.println(UserName);
		System.out.println(Password);
	}
}
