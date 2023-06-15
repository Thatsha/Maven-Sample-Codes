package net.phptravels;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_Test {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://phptravels.net/api/admin");
		
		driver.manage().window().maximize();
		
		WebElement email_Element = driver.findElement(By.name("email"));
		email_Element.sendKeys("admin@phptravels.com");
		
		WebElement password_Element = driver.findElement(By.name("password"));	
		password_Element.sendKeys("demoadmin");
		
		WebElement login_Button_Element = driver.findElement(By.xpath("//button[@type='submit']"));
		login_Button_Element.click();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\ThatshaMaven\\ScreenShot\\\\Screenshot.png");
		FileUtils.copyFile(source, destination);
		
		
	}

}
