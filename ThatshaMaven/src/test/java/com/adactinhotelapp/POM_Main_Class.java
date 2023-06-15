package com.adactinhotelapp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.adactin.Login_Page;
import com.adactin.Search_Hotel_Page;
import com.base.Base_Class;

public class POM_Main_Class extends Base_Class {
	
	public static void main(String[] args) {
		getDriver("chrome");
		getUrl("https://adactinhotelapp.com/");
		maximize();
		
		Login_Page login=new Login_Page(driver);
		inputValue(login.getUserName(), "thadchayathu");
		inputValue(login.getPassword(), "Vanakkam123");
		click(login.getLogin());
		
		Search_Hotel_Page search=new Search_Hotel_Page(driver);
		drop_Down_select(search.getLocation(),"byVisibleText","London");
		
		
		
		
	}
}
