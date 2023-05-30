
package com.test;

import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.AutomationBase;
import com.constants.AutomationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.ExcelUtils;
import com.utilities.PropertyUtils;
import com.utilities.WaitUtils;

public class HomePageTest extends AutomationBase {
	WaitUtils wait;
	LoginPage login;
	HomePage home;
	PropertyUtils propertyutil;
	Properties prop;
	ExcelUtils excelutils;

	@Test(enabled = true, priority = 1)
	public void validateHomePageFields() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(home.isReparationDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isInventoryProductDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isRevenueChartDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isCalendarDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isStockChartDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isQuickEmailDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isQuickSmsDisplayed(), AutomationConstants.FieldCheck);
		soft.assertAll();
	}

	@Test(enabled = true, priority = 2)
	public void validateTopPanelFields() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(home.isServiceManagementDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isSideBarToggleDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isAlertIconDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isPlusIconDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isLoggedUserNameDisplayedOnTopPanel(), AutomationConstants.FieldCheck);
		home.clickOnTheAlertIcon();
		soft.assertTrue(home.isNumberOfAlertDisplayed(), AutomationConstants.FieldCheck);
		home.clickOnThePlusIcon();
		soft.assertTrue(home.isAddClientButtonDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isAddReparationButtonDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isSendSmsButtonDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isSendEmailButtonDisplayed(), AutomationConstants.FieldCheck);
		soft.assertAll();
	}

	@Test(enabled = true, priority = 3)
	public void validateLeftPanelFields() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(home.isLoggedUserNameDisplayedOnLeftPanel(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isSearchReparationDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isMainNavigationDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isHomeButtonDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isSettingsDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(home.isLoggedUserNameDisplayedOnLeftPanel(), AutomationConstants.FieldCheck);
		home.clickOnTheSettings();
		soft.assertTrue(home.isSettingsOptionsDisplayed(), AutomationConstants.FieldCheck);
		soft.assertAll();
	}

	@Test(enabled = true, priority = 4)
	public void validateQuickSmsAndQuickEmail() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		home.enterValueToEmailTo(excelutils.readStringData("Home", 3, 2));
		home.enterTheSubject(excelutils.readStringData("Home", 4, 2));
		home.enterTheMessage(excelutils.readStringData("Home", 5, 2));
		home.clickOnTheEmailSendButton();
		soft.assertTrue(home.isEmailSendBtnEnabled(), "Failure Message : Email not delivered");
		home.enterThePhoneNumber(excelutils.readStringData("Home", 9, 2));
		home.enterTheSms(excelutils.readStringData("Home", 10, 2));
		home.clickOnTheSmsSendButton();
		soft.assertTrue(home.isSmsSendBtnEnabled(), "Failure Message : SMS NOT DELIVERED");
		soft.assertAll();
	}

	@AfterMethod

	public void postRun() {

		home.toLogOut();
	}

}
