package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "userName")
	private WebElement user;
	
	@FindBy(id = "passWord")
	private WebElement pass;
	
	@FindBy(xpath = "//input[@type = 'image']")
	private WebElement loginBot;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void setLogin(String un,String pas) {
		user.sendKeys(un);
		pass.sendKeys(pas);
		loginBot.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
