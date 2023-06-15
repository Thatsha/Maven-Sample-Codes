package com.demoselenium;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java_Script_Executor_Concept {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Selenium_Studies\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor js= (JavascriptExecutor)driver;//narrowing cast
//accurate scroll-down--
	//js.executeScript("arguments[0].scrollIntoView();", WebElementName)//Accurate Scroll_down
		
		//WebElement sellAmazon = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		//js.executeAsyncScript("arguments[0]. scrollIntoView();",sellAmazon);
		
//random scroll-down
		//js.executeScript("window.scrollBy(0,range);")
		js.executeScript("window.scrollBy(0,2000);");
		
//click
		WebElement sellAmazon = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		 js.executeScript("arguments[0].click();", sellAmazon );
	}

}
