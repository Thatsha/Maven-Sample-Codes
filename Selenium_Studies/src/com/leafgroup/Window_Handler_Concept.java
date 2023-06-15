package com.leafgroup;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handler_Concept {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Selenium_Studies\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		Robot robot=new Robot();
		
		WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
		actions.contextClick(sell).build().perform();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		actions.contextClick(mobile).build().perform();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		actions.contextClick(fashion).build().perform();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
		actions.contextClick(computers).build().perform();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		//It will return the parent window name as a string
		String parent = driver.getWindowHandle();
		Set<String>s=driver.getWindowHandles();
		
		//for get windows size--size is used to count the number of windows
		int size = driver.getWindowHandles().size();
		System.out.println("Window Size:"+size);
		
	
		
		
		
		
		
		
		
		
		
		
		
		
	}


}
