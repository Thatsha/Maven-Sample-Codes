package com.leafgroup;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Selenium_Studies\\Driver\\chromedriver.exe");
				
		//need to create object for webdriver class
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/");
		
		driver.navigate().to("https://www.leafground.com/select.xhtml;jsessionid=node01i9hi8kfxgkhu1t7za2qrpe0ju346857.node0");
		
		driver.manage().window().maximize();
		
//single_dropdown
		WebElement automationTool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
		
		//need to create object for select class
		Select s=new Select(automationTool);
		s.selectByIndex(2); //index
		Thread.sleep(3000); 
		s.selectByVisibleText("Puppeteer"); //visibletext
		
		driver.navigate().to("https://demoqa.com/select-menu");
		
//multiple_dropdown
		WebElement multiSelect = driver.findElement(By.xpath("//select[@id='cars']"));
		Select select=new Select(multiSelect);

//isMultiple
		if (select.isMultiple()==true) {
		select.selectByIndex(3);
		select.selectByValue("opel");
		select.selectByVisibleText("Saab");
		}

//getOptions
		//List<WebElement> options = select.getOptions();
		//int a=options.size();
		//System.out.println(a);
		
//getAllSelectedOptions
		//List<WebElement> options = select.getAllSelectedOptions();
		//int a=options.size();
		//System.out.println(a);
		
//getFirstSelectedOption
	String b = select.getFirstSelectedOption().getAttribute("value");
	System.out.println(b);
		
		Thread.sleep(3000);
		
		select.deselectByVisibleText("Saab");	
		
	}

}
