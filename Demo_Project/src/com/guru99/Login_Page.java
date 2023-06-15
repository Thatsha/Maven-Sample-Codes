package com.guru99;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Page {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Demo_Project\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
	
	driver.manage().window().maximize();
	
	WebElement acceptAll1 = driver.findElement(By.xpath("//button[@id='save']"));
	org.openqa.selenium.Alert acceptAll = driver.switchTo().alert();
	acceptAll1.click();
	
	
	Thread.sleep(2000);	
	
	driver.navigate().to("https://www.google.com/");
}

}
