package com.leafgroup;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Utils {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Thatsha_Selenium\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://goddiva.co.uk/");
		
		driver.manage().window().maximize();
		
	//need to take the screenshot of the homepage
		//TakeScreenshot is the pre-defined method
		TakesScreenshot ts=(TakesScreenshot) driver;//narrowing casting
		
	//now need to store the screenshot in file format
		//source means where the screenshot is from
		//getScreenshotAs is like a button function of mobile
		
		File source=ts.getScreenshotAs(OutputType.FILE);//took the screenshot
		
	//need to define the location to store 
		//in mobile, the screenshot will be automatically store in galary folder
		//same sa that, in selenium we have to create a folder to store the screenshot
		//screenshots need to be store in png or jpj format
		//at the end of the path we have to define the image format.
		
		File destination=new File("C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Thatsha_Selenium\\Capture screenshot\\Screenshot.png");
		FileUtils.copyFile(source, destination);
		
		//FileUtils.copyFile(source, destination);

}
}
