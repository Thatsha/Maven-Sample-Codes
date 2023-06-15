package com.amazon;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.base.Base_Class;

public class User_Test extends Base_Class {
	
	public static void main(String[] args) throws IOException, AWTException {
		getDriver("chrome");
		
		getUrl("https://www.amazon.com/");
		
		maximize();
		
		screenShot("Picture");
		
		robot();
		
		allWindow();
		
		WebElement a = driver.findElement(By.id(null));
		inputValue(a,"Thatsha");
	}
}
