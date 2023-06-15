package com.demoselenium;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Window_Handle_Concept {
public static void main(String[] args) throws AWTException {
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Demo_Project\\Driver\\chromedriver.exe");

WebDriver driver= new ChromeDriver();

driver.get("https://www.amazon.in/");

driver.manage().window().maximize();

Actions action=new Actions(driver);
Robot robot=new Robot();

 org.openqa.selenium.WebElement sell = driver.findElement(By.xpath("//a[text()='Sell']"));
 action.contextClick(sell).build().perform();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

org.openqa.selenium.WebElement mobile = driver.findElement(By.xpath("//a[text()='Mobiles']"));
action.contextClick(mobile).build().perform();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

org.openqa.selenium.WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
action.contextClick(fashion).build().perform();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

org.openqa.selenium.WebElement computers = driver.findElement(By.xpath("//a[text()='Computers']"));
action.contextClick(computers).build().perform();
robot.keyPress(KeyEvent.VK_PAGE_DOWN);
robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
robot.keyPress(KeyEvent.VK_ENTER);
robot.keyRelease(KeyEvent.VK_ENTER);

//for get windows size
//it will count the windows which are opens.(how many windows are open)
		int size=driver.getWindowHandles().size();
		System.out.println("Window Size:"+size);
		
//get ID for parent window
		String Id=driver.getWindowHandle();
		System.out.println("Parent ID:"+Id);		

//get titles of all the windows
		Set<String> allwindow=driver.getWindowHandles();
		for(String cp:allwindow) {
		String title=driver.switchTo().window(cp).getTitle();
		System.out.println(title);
		}
		
//go to the particular window
		String actual_title="Amazon.in: CrossShop3";
		for(String cp :allwindow) {
		if(driver.switchTo().window(cp).getTitle().equals(actual_title)) {
		break;
		}
		}
		
//to close window
		for(String cp1:allwindow) {
		if(!cp1.equals(Id)) {
		driver.switchTo().window(cp1);
		driver.close();
		}
		}
}
}
