package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "(//a[@class='topLink'])[6]")
	private WebElement log;
	
	@FindBy(linkText = "Campaigns")
	private WebElement campaignBt;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public WebElement getLogOut() {
		return log;
	}
	
	public WebElement getCampaign() {
		return campaignBt;
	}
	
	
	
	
	
}
