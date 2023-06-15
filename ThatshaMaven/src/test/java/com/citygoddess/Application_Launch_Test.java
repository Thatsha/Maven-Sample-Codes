package com.citygoddess;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application_Launch_Test {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://34.76.235.181/test/cg-garment/public/login");
		driver.manage().window().maximize();
		
		WebElement email_Element = driver.findElement(By.id("email"));
		email_Element.sendKeys("thatshayathu@gmail.com");
		
		WebElement password_Element = driver.findElement(By.id("password"));
		password_Element.sendKeys("12345678");
		
		WebElement login_Button_Element = driver.findElement(By.xpath("//button[@type='submit']"));
		login_Button_Element.click();
	}

}
