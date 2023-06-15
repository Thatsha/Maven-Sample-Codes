package com.demoselenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tables_Concept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Demo_Project\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		System.out.println("Print All the Data");
		List<WebElement> findElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
		
		for(WebElement alldata: findElements) {
			System.out.println(alldata.getText());
		}
	}

}
