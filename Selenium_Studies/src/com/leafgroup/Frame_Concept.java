package com.leafgroup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_Concept {
public static void main(String[] args) throws InterruptedException {
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Selenium_Studies\\Driver\\chromedriver.exe");

WebDriver driver=new ChromeDriver();

driver.get("https://demo.automationtesting.in/Frames.html");

driver.manage().window().maximize();

//Single Frame
			//switchto by using Index
driver.switchTo().frame(0);//Switch from Application page to the first advertisement page

WebElement frame1 = driver.findElement(By.xpath("//input[@type='text'][1]"));//find the textbox inside the advertisement page
frame1.sendKeys("THATSHA");//send some value inside the textbox.

Thread.sleep(3000);

driver.switchTo().defaultContent();//from advertisement to application page

//Nested Frame
WebElement nestedFrame = driver.findElement(By.xpath("//a[@href='#Multiple']"));//click the button in application page
nestedFrame.click();//to click the button

			//switchto by using web-element
WebElement outerFrame = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));//to go to the first advertisement
driver.switchTo().frame(outerFrame);//to switch to the first advertisement

			//switchto by using web-element
WebElement innerFrame = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));//to go to the second advertisement
driver.switchTo().frame(innerFrame);//to switch to the secondy advertisement

WebElement innerText = driver.findElement(By.xpath("//input[@type='text'][1]"));//find the textbox inside the advertisement page
innerText.sendKeys("Amma");//send some value inside the textbox.





}
}
