package com.leafgroup;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_Concept {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Selenium_Studies\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/droppable");
		driver.manage().window().maximize();
		
		//WebElement acceptButton = driver.findElement(By.id("L2AGLb"));
		//acceptButton.click();
		
//Normal click
		//WebElement imageOption = driver.findElement(By.xpath("//a[text()='Images']"));
		//imageOption.click();
		
//click function using action class
		//WebElement imageOption1 = driver.findElement(By.xpath("//a[text()='Images']"));//find the specific element
		Actions action=new Actions(driver);//create actions class
		//action.click(imageOption1).build().perform();//build & perform should be select in action coding to perform.
		
//click function using javascript
		JavascriptExecutor js= (JavascriptExecutor)driver;//narrowing cast
		WebElement imageOption1 = driver.findElement(By.xpath("//a[text()='Images']"));
		js.executeScript("arguments[0].click();", imageOption1 );
		
//right click
		//action.contextClick(imageOption1).build().perform();
		
//double-click
		//action.doubleClick(imageOption1).build().perform();
		
		//WebElement acceptButton1 = driver.findElement(By.id("L2AGLb"));
		//acceptButton1.click();
		
//drag & drop
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.id("droppable"));
		//action.dragAndDrop(drag, drop).build().perform();
		
//moveToElement
		action.clickAndHold(drag).moveToElement(drag).release(drop).build().perform();
	}

}
