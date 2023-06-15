package com.leafground;

import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Drop_Down\\Driver\\chromedriver.exe");
	
	WedDriver driver=new ChromeDriver();
	
	driver.get("https://www.leafground.com/");
	driver.manage().maximize();
	
	driver.navihate().to("https://www.leafground.com/select.xhtml");
	
	driver.findElement
	
	
}
}
