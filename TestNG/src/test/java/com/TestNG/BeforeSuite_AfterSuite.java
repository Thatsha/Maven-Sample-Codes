package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite {
	
	public static WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	private void browserLaunch() {
		 startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\TestNG\\Chrome_Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	
	@Test
	public void instagram() {
		driver.get("https://www.instagram.com/");
	}
	
	@Test
	public void faceBook() {
		driver.get("https://en-gb.facebook.com/"); 
	}
	
	@Test
	public void youtube() {
		driver.get("https://www.youtube.com/");
	}
	@AfterSuite
	public void close() {
		 endTime = System.currentTimeMillis();
		long totalTime=endTime-startTime;
		System.out.println(totalTime);
		driver.quit();
		

	}
}
	
