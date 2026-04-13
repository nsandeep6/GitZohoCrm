package com.zoho.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class Deepthi {
	public void test()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Reporter.log("true");

}
}
