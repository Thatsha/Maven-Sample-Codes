package com.TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
 
public class Data_Provider_TestNG {
	String [][] data= {
			{"admin1","admin2"},
			{"admin3","admin4"},
			{"admin5","admin6"},
	};
	
	@DataProvider(name="loginData")
	public String [][]TestDataProvider(){
		return data;
	}
	
	@Test(dataProvider="loginData")
	public void login(String username, String password) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\TestNG\\Chrome_Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		
		WebElement email_element = driver.findElement(By.id("email"));
		email_element.sendKeys(username);
		
		WebElement password_element = driver.findElement(By.id("pass"));
		password_element.sendKeys(password);	
	}}

