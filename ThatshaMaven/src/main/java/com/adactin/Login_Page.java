package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	public static WebDriver driver;
	
@FindBy(id="username") private WebElement userName;
@FindBy(id="password") private WebElement password;
@FindBy(id="login") private WebElement login;


public WebElement getUserName() {
	return userName;
}

public WebElement getPassword() {
	return password;
}

public WebElement getLogin() {
	return login;
}

public Login_Page(WebDriver driver2) {
	this.driver=driver2;
	
PageFactory.initElements(driver, this);
	
}





	
	
	
	
	
	
		

	

}
