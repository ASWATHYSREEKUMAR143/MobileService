package com.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.base.AutomationBase;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.PropertyUtils;
import com.utilities.WebBrowserUtils;

public class LoginTest extends AutomationBase{
	//WebDriver driver;	
	WebBrowserUtils webbrowser;	
	LoginPage login;
	HomePage home;
	PropertyUtils propertyutil;
	Properties prop;
	
	

	
	@Test(retryAnalyzer = com.analyzer.RetryAnalyzer.class)
	public void validateLogin() throws Exception
	{
		//driver=getDriver();
		login=new LoginPage(driver);
		home=new HomePage(driver);
		propertyutil=new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");		
		login.performLogin(prop.getProperty("username"), prop.getProperty("password"));
	Assert.assertTrue(home.isSuccessPopupDisplayed(),"Failure message: Unable to Login");
	}
	
	@AfterMethod
	
	public void postRun()
	{
		
		home.toLogOut();
	}

}
