package com.zoho.generic;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zoho.pom.HomePage;
import com.zoho.pom.LoginPage;

public class BaseClass {
public static WebDriver driver;


@BeforeTest
public void openbrowser() throws InterruptedException, IOException {
	Reporter.log("open browser",true);
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	Thread.sleep(2000);
	FileLib f = new FileLib();
	String url = f.getProData("url");
	driver.get(url);
	Thread.sleep(2000);
	
}

@AfterTest
public void closebroswer() throws InterruptedException {
	Reporter.log("close browser", true);
	Thread.sleep(2000);
	driver.quit();
}

@BeforeMethod
public void login() throws InterruptedException, IOException {
	Reporter.log("login",true);
	LoginPage lp = new LoginPage(driver);
	Thread.sleep(2000);
	FileLib f = new FileLib();
	String us = f.getProData("username");
	String ps = f.getProData("password");
	lp.setLogin(us, ps);
	Thread.sleep(2000);
	
}
@AfterMethod
public void logout() throws InterruptedException {
	Reporter.log("logout", true);
	HomePage hp = new HomePage(driver);
	Thread.sleep(6000);
	hp.getLogOut().click();
}
}
