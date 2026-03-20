package com.zoho.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CreateCampaignPage {
	
	@FindBy(xpath = "//input[@name='property(Campaign Name)']")
	private WebElement campNameTextB;
	
	@FindBy(xpath = "//textarea[@name='property(Description)']")
	private WebElement DescriptionText;
	
	@FindBy(xpath = "(//input[@value='Save'])[2]")
	private WebElement SaveB;
	
	@FindBy(xpath = "//select[@name='property(Type)']")
	private WebElement TypeList;
	
	@FindBy(xpath = "//select[@name='property(Status)']")
	private WebElement StatusList;
	
	
	@FindBy(name = "property(Start Date)")
	private WebElement StartDate;
	
	@FindBy(name = "property(End Date)")
	private WebElement EndDate;

	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getCampNameTextB() {
		return campNameTextB;
	}

	public WebElement getDescriptionText() {
		return DescriptionText;
	}

	public WebElement getSaveB() {
		return SaveB;
	}

	public WebElement getStartDate() {
		return StartDate;
	}

	public WebElement getEndDate() {
		return EndDate;
	}
	
	public void  selectTypeList(String SelectType) {
		Select s = new Select(TypeList);
		s.selectByValue(SelectType);
	}

	public void SelectStatusList(String SelectStatus) {
		Select s = new Select(StatusList);
		s.selectByValue(SelectStatus);
	}	
}
 