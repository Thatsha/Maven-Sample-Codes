package com.leafgroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Concept {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Selenium_Studies\\Driver\\chromedriver.exe");
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://demoqa.com/alerts");
	
	driver.manage().window().maximize();
	
	//SINGLE ALERT
	WebElement single = driver.findElement(By.xpath("//button[@id='alertButton']"));//FIND ELEMENT
	single.click();//CLICK THE FOUND ELEMENT
	org.openqa.selenium.Alert singleA = driver.switchTo().alert();//SWITCH TO THE ALERT POP-UP NOTIFICATION
	singleA.accept();//ACCEPT THE NOTIFICATION
	
	Thread.sleep(3000);
	
	//CONFIRM ALERT
	WebElement confirm = driver.findElement(By.xpath("//button[@id='confirmButton']"));//FIND ELEMENT
	confirm.click();//CLICK
	org.openqa.selenium.Alert confirmA = driver.switchTo().alert();//SWITCH TO THE ALERT POP-UP NOTIFICATION
	confirmA.dismiss();//CANCEL THE NOTIFICATION
	
	Thread.sleep(5000);
	
	//PROMPT ALERT
	WebElement prompt = driver.findElement(By.xpath("//button[@id='promtButton']"));//FIND ELEMENT
	prompt.click();//CLICK
	org.openqa.selenium.Alert promptA = driver.switchTo().alert();//SWITCH TO THE ALERT POP-UP NOTIFICATION
	promptA.sendKeys("Thatsha");//SEND SOME VALUES IN THE TEXTBOX
	promptA.getText();
	Thread.sleep(5000);
	promptA.accept();//ACCEPT THE NOTIFICATION
}
}
