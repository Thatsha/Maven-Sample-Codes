package com.TestNG;
import org.testng.annotations.Test;
public class TimeOut_TestNG {
	
	@Test(timeOut = 5000)
	public void userTest() throws InterruptedException {
		
		System.out.println("Browser_Launch");
		Thread.sleep(2500);	//2500--pass to run
		
		System.out.println("Url");
		Thread.sleep(1500);//400--pass to run
		
		System.out.println("maximize");
		Thread.sleep(1000);//5000--pass to run
		
		System.out.println("User_Name");//--fail to run
		
		System.out.println("Password");//--fail to run
		
		System.out.println("Login_Button");//--fail to run
	}
}
