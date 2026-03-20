package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignPage {

	@FindBy(xpath = "//input[@value='New Campaign']")
	private WebElement NewCampaignBt;
	
	public CampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getNewCampaignBt() {
		return NewCampaignBt;
	}

	
	
	
	
	
	
	
}
