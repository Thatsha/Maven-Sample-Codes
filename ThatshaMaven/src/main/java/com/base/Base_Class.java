package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {
	
	//Initialise the driver in globe level
	public static WebDriver driver;
	
	//Initialise robot in globe level
	public static Robot r;
	
	
	//Browser launch (choose from Chrome & Firefox)
	public static void getDriver(String value) {
		if (value.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Driver\\chromedriver.exe");
			driver=new ChromeDriver();//object creation for chrome driver
		}
		else if (value.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Driver\\chromedriver.exe");
			//driver=new FireFoxDriver();//object creation for firefox driver
		}}
	
	
	//Application launch
	public static void getUrl(String url) {
		driver.get(url);
	}
	
	
	//Maximize the application
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	
	//Screenshot-File_Utils
	public static void screenShot(String a) throws IOException {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\ScreenShot\\" +a+ ".png");
		FileUtils.copyFile(source, destination);
	}
	
	
	//Robot
	public static void robot(String type) throws AWTException {
		r=new Robot();
		if(type.equalsIgnoreCase("up")) {
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		else if(type.equalsIgnoreCase("down")) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		else if(type.equalsIgnoreCase("left")) {
			r.keyPress(KeyEvent.VK_LEFT);
			r.keyRelease(KeyEvent.VK_LEFT);
		}
		else if(type.equalsIgnoreCase("right")) {
			r.keyPress(KeyEvent.VK_RIGHT);
			r.keyRelease(KeyEvent.VK_RIGHT);
		}
		else if(type.equalsIgnoreCase("enter")) {
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}}
		
	
	//Windows Title--get titles of all the windows
	public static void allWindow() {
		Set<String> allwindow=driver.getWindowHandles();
		for(String cp:allwindow) {
		String title=driver.switchTo().window(cp).getTitle();
		System.out.println(title);
	}}	
	
	
	//sendKeys
	public static void inputValue(WebElement a, String b) {
		a.sendKeys(b);

	}
	
	//click
	public static void click(WebElement a) {
		a.click();
	}
	
	//Actions
	public static void actionsClass(String actionName, WebElement element) {
		try {
		Actions a=new Actions(driver);
		if(actionName.equalsIgnoreCase("Clickon")) {
			a.click(element).build().perform();
		}
		else if(actionName.equalsIgnoreCase("Doubleclick")) {
			a.doubleClick(element).build().perform();
		}
		else if (actionName.equalsIgnoreCase("Moveto")) {
			a.moveToElement(element).build().perform();
		}}
		catch(Exception e) {
			e.printStackTrace();
		}}
	
	
	//Drop_Down_Deselect
	public static void drop_Down_Deselect(WebElement element, String type, String value) {
		Select select=new Select (element);
	
		if(type.equalsIgnoreCase("byvalue")) {
			select.deselectByValue(value);
		}
		else if(type.equalsIgnoreCase("byVisibleText")) {
			select.deselectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("byIndex")) {
			int index=Integer.parseInt(value);
			select.deselectByIndex(index);
		}}
	
	
	//Drop_Down_Select
	public static void drop_Down_select(WebElement element, String type, String value) {
		Select select=new Select (element);
		if(type.equalsIgnoreCase("byvalue")) {
			select.selectByValue(value);
		}
		else if(type.equalsIgnoreCase("byVisibleText")) {
			select.selectByVisibleText(value);
		}
		else if (type.equalsIgnoreCase("byIndex")) {
			int index=Integer.parseInt(value);
			select.selectByIndex(index);
		}}
	
	
	//using Frames
	public static void get_Back() {
		driver.switchTo().defaultContent();
	}
	
	//using frame name
	public static void fName() {
		driver.switchTo().frame(0);
	}
	
	//using frame ID
	public static void fId(int value) {
		driver.switchTo().frame(value);
	}
	//Using frame webelement
		public static void fWebElement() {
			driver.switchTo().activeElement();
	}
	
	//Refresh
	public static void refresh() {
		driver.navigate().refresh();
	}
	
	//forward
	public static void forward() {
		driver.navigate().forward();
	}
	
	//Back
	public static void back() {
		driver.navigate().back();
	}
	
	//navigate to another URL
	public static void navigateToUrl(String Url) {
		driver.navigate().to(Url);
	}
	
	//Using Sleep
	public static void sleep(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		}catch (Exception e) {
			e.printStackTrace();
		}}	
}

	
	
	
		
		
		
		

