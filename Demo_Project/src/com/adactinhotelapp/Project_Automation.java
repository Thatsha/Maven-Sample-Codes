package com.adactinhotelapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Project_Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Thatsha\\eclipse-workspace\\Selenium_1\\Thatsha_Java_Projects\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		
		WebElement User_Name_Element = driver.findElement(By.id("username"));
		User_Name_Element.sendKeys("thadchayathu");
		
		WebElement Password_Element = driver.findElement(By.id("password"));
		Password_Element.sendKeys("Vanakkam123");
		
		WebElement Login_Button_Element = driver.findElement(By.id("login"));
		Login_Button_Element.click();
		
		WebElement Location_Element = driver.findElement(By.id("location"));
		Select select=new Select(Location_Element);
		select.selectByVisibleText("Paris");
		
		WebElement Hotels_Element = driver.findElement(By.id("hotels"));
		Select select1=new Select(Hotels_Element);
		select1.selectByVisibleText("Hotel Sunshine");
		
		WebElement Room_Type_Element = driver.findElement(By.id("room_type"));
		Select select2=new Select(Room_Type_Element);
		select2.selectByVisibleText("Super Deluxe");
		
		WebElement NumberOfRooms_Element = driver.findElement(By.id("room_nos"));
		Select select3=new Select(NumberOfRooms_Element);
		select3.selectByVisibleText("1 - One");
		
		WebElement CheckInDate_Element = driver.findElement(By.id("datepick_in"));
		CheckInDate_Element.sendKeys("27/10/2022");
		
		WebElement CheckOutDate_Element = driver.findElement(By.id("datepick_out"));
		CheckOutDate_Element.sendKeys("30/10/2022");
		
		WebElement AdultsRoom_Element = driver.findElement(By.id("adult_room"));
		Select select4=new Select(AdultsRoom_Element);
		select4.selectByVisibleText("2 - Two");
		
		WebElement ChildrenRoom_Element = driver.findElement(By.id("child_room"));
		Select select5=new Select(ChildrenRoom_Element);
		select5.selectByVisibleText("4 - Four");
		
		WebElement Search_Button_Element = driver.findElement(By.id("Submit"));
		Search_Button_Element.click();
		
		WebElement Select_Button_Element = driver.findElement(By.id("radiobutton_0"));
		Select_Button_Element.click();
		
		WebElement Continue_Button_Element = driver.findElement(By.id("continue"));
		Continue_Button_Element.click();
		
		WebElement First_Name_Element = driver.findElement(By.id("first_name"));
		First_Name_Element.sendKeys("Thadcha");
		
		WebElement Last_Name_Element = driver.findElement(By.id("last_name"));
		Last_Name_Element.sendKeys("Yathu");
		
		WebElement Address_Element = driver.findElement(By.id("address"));
		Address_Element.sendKeys("34,Uppukkulam,Mannar,India");
		
		WebElement Credit_Card_Element = driver.findElement(By.id("cc_num"));
		Credit_Card_Element.sendKeys("4444 5555 6666 8888");
		
		WebElement CreditCardType_Element = driver.findElement(By.id("cc_type"));
		Select select6=new Select(CreditCardType_Element);
		select6.selectByVisibleText("Master Card");
		
		WebElement Expiry_Month_Element = driver.findElement(By.id("cc_exp_month"));
		Select select7=new Select(Expiry_Month_Element);
		select7.selectByVisibleText("August");
		
		WebElement Expiry_Year_Element = driver.findElement(By.id("cc_exp_year"));
		Select select8=new Select(Expiry_Year_Element);
		select8.selectByVisibleText("2022");
		
		WebElement CVV_Number_Element = driver.findElement(By.id("cc_cvv"));
		CVV_Number_Element.sendKeys("444");
		
		WebElement BookNow_Button = driver.findElement(By.id("book_now"));
		BookNow_Button.click();
		
	}

}
