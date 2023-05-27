package com.test;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.constants.AutomationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.QuantityAlertPage;
import com.utilities.ExcelUtils;
import com.utilities.PropertyUtils;
import com.utilities.WaitUtils;
import com.utilities.WebBrowserUtils;

public class QuantityAlertPageTest extends AutomationBase {

	// WebDriver driver;

	WebBrowserUtils webbrowser;

	LoginPage login;
	HomePage home;
	QuantityAlertPage qtyalrt;
	PropertyUtils propertyutil;
	Properties prop;
	ExcelUtils excelutils;
	WaitUtils wait;
	AutomationConstants constants;

	/*@BeforeMethod
	public void preRun() throws Exception {
		// driver = getDriver();
		login = new LoginPage(driver);
		// webbrowser = new WebBrowserUtils();
		home = new HomePage(driver);
		qtyalrt = new QuantityAlertPage(driver);
		wait = new WaitUtils();
		// constants = new AutomationConstants();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();

		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		qtyalrt = home.quantityalert();
		wait.toApplyImplicitWait(driver, 10);

	}*/

	@Test(enabled = true, priority = 1)
	public void validateQuantityAlertPageFields() {
		// driver = getDriver();
		login = new LoginPage(driver);
		// webbrowser = new WebBrowserUtils();
		home = new HomePage(driver);
		qtyalrt = new QuantityAlertPage(driver);
		wait = new WaitUtils();
		// constants = new AutomationConstants();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();

		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		qtyalrt = home.quantityalert();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(qtyalrt.isShowDropdownDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isSearchBoxDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isPaginationDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isProductNameDisplayedInTable(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isProductCodeDisplayedInTable(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isQuantityDisplayedInTable(), AutomationConstants.FieldCheck);
		soft.assertTrue(qtyalrt.isAlertQuantityDisplayedInTable(), AutomationConstants.FieldCheck);
		soft.assertAll();

	}

	@AfterMethod

	public void postRun() {

		home.toLogOut();
	}

}
