package com.zoho.testscript;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.zoho.generic.BaseClass;
import com.zoho.pom.CampaignPage;
import com.zoho.pom.CreateCampaignPage;
import com.zoho.pom.HomePage;

public class CreateCampin extends BaseClass {

	@Test
	public void createcampin() throws InterruptedException {
		Reporter.log("created", true);
		
		HomePage h = new HomePage(driver);
		h.getCampaign().click();
		
		CampaignPage cp = new CampaignPage(driver);
		cp.getNewCampaignBt().click();
		
		CreateCampaignPage cc = new CreateCampaignPage(driver);
		cc.getCampNameTextB().sendKeys("saikikikk");
		Thread.sleep(2000);
		cc.getDescriptionText().sendKeys("sasasasasassasasas");
		Thread.sleep(2000);
		
		cc.selectTypeList("Email");
		Thread.sleep(2000);
		
		cc.SelectStatusList("Active");
		Thread.sleep(2000);
		
		cc.getStartDate().sendKeys("10/03/2025");
		Thread.sleep(2000);
		
		cc.getEndDate().sendKeys("12/11/2025");
		Thread.sleep(2000);
		
		
		cc.getSaveB().click();	
		Thread.sleep(2000);
		
	}
}
