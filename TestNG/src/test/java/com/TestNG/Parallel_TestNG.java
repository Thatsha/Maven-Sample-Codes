package com.TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Parallel_TestNG {
	public static WebDriver driver;
	
	@Test
	public void instagram() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\TestNG\\Chrome_Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.close();
	}
	
	@Test
	public void faceBook() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\TestNG\\Chrome_Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/"); 
		driver.close();
	}
	
	@Test
	public void youtube() {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\TestNG\\Chrome_Driver\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.close();
	}}