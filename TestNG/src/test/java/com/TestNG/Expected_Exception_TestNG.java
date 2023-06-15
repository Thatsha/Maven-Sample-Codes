package com.TestNG;

import org.testng.annotations.Test;

public class Expected_Exception_TestNG {
	
	@Test(expectedExceptions = Exception.class)
public void expected_Exception_Test() {
	String s=null;
	System.out.println("Done");
	System.out.println(s.length());
}
}
