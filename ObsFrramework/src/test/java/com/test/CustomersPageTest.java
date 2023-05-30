package com.test;

import java.util.Properties;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.AutomationBase;
import com.constants.AutomationConstants;
import com.datasupplier.DataSupplier;
import com.pages.CustomersPage;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.utilities.ExcelUtils;
import com.utilities.PropertyUtils;
import com.utilities.WaitUtils;
import com.utilities.WebBrowserUtils;

public class CustomersPageTest extends AutomationBase {
	WebBrowserUtils webbrowser;
	WaitUtils wait;
	LoginPage login;
	HomePage home;
	CustomersPage customers;
	PropertyUtils propertyutil;
	Properties prop;
	ExcelUtils excelutils;

	@Test(enabled = true, priority = 1, dataProvider = "addclient", dataProviderClass = DataSupplier.class,groups=("smoke"))
	public void validateCustomersPage(String name, String company, String address, String city, String phn,
			String mail) {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(customers.isAddClientTabDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isShowDrpDwnInClintPgDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAdChangeColumnsTabDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isSearchBxInClntPgDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isActionsIconInClntPgDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isTableInClntPgDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnAddClientTab();
		soft.assertTrue(customers.isClientNameFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCompanyNameFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isGeoLocationFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAddressFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCityFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isPostalCodeFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isTelPhnFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isEmailFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isVatFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isSsnFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isBrowsebtnInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCommentFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAddClientGoBcktBtnDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAddClientSubmtBtnDisplayed(), AutomationConstants.FieldCheck);
		customers.enterClientName(name);// excelutils.readStringData("Customers", 3, 2)
		customers.enterCompanyName(company);// excelutils.readStringData("Customers", 4, 2)
		customers.enterAddress(address);// excelutils.readStringData("Customers", 6, 2)
		customers.enterCity(city);// excelutils.readStringData("Customers", 7, 2)
		customers.enterTelPhnNmbr(phn);// excelutils.readStringData("Customers", 9, 2)
		customers.enterEmail(mail);// excelutils.readStringData("Customers", 10, 2)
		customers.clickOnAddClientSubmtBtn();
		customers.searchName(name);
		soft.assertEquals(customers.toGetTheTextFromNameCell(), name, AutomationConstants.ResultCheck);

		// wait.toApplyExplicitWaitTillElmntIsVisible(driver, 20,
		// customers.closebtn_clientpg);
		// customers.clickOnAddClientCloseBtn();
		// soft.assertTrue(customers.isAddClientClosetBtnDisplayed(), "Failure
		// message : Close button is not displayed in Add client page");

		soft.assertAll();

	}

	@Test(enabled = true, priority = 2)
	public void validateClientTable() {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(customers.isClientNameInClintTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCompanyNameInClintTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAddressInClintTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isEmailInClintTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isTelephnInClintTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isActionsInClintTableDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnChangeColumnTab();
		soft.assertTrue(customers.isChangeColumnsPopUpDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnTheEmailTabInPopUp();
		soft.assertNotEquals(customers.getTheTextFromEmailField(), "Email",
				"Unable to Remove The Email field from the table");
		customers.clickOnChangeColumnTab();
		customers.clickOnEmailTabInPopUpForAdding();
		soft.assertEquals(customers.getTheTextFromEmailField(), "Email", AutomationConstants.ResultCheck);
		customers.toSelectTheValueFromShowDropdwn("50");
		soft.assertEquals(customers.toGetSelectedOptionFromShowDropDown(), "50", AutomationConstants.ResultCheck);
		soft.assertAll();

	}

	@Test(enabled = true, priority = 3)
	public void validateCustomerViewOption() {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		customers.searchName(excelutils.readStringData("Customers", 16, 2));
		customers.clickOnTheActionDrpDwnInTbl();
		customers.clickOnViewClientOption();
		soft.assertTrue(customers.isModfyBtnInViewClientOptionDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isGoBckBtnInViewClientOptionDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isDeleteBtnInViewClientOptionDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnModifyBtn();
		customers.enterAddress(excelutils.readStringData("Customers", 17, 2));
		customers.clickOnSaveChangeBtnBtn();
		customers.clickOnGoBckBtnInViewClientPg();
		customers.searchAddress(excelutils.readStringData("Customers", 17, 2));
		soft.assertEquals(customers.toGetTheTextFromAddressCell(), excelutils.readStringData("Customers", 17, 2),
				AutomationConstants.UpdateCheck);
		customers.backWrd();
		soft.assertAll();

	}

	@Test(enabled = true, priority = 4)
	public void validateDeleteAction() {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		customers.searchName(excelutils.readStringData("Customers", 20, 2));
		customers.clickOnTheActionDrpDwnInTbl();
		customers.clickOnViewClientOption();
		customers.clickOnDeleteBtn();
		soft.assertTrue(customers.isDeleteBtnConfirmDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnDeleteCnfrmBtn();
		customers.searchName(excelutils.readStringData("Customers", 20, 2));
		soft.assertNotEquals(customers.toGetTheTextFromTableCell(), excelutils.readStringData("Customers", 20, 2),
				"Failure message : Unable to Delete the client from data base");
		soft.assertAll();

	}

	@Test(enabled = true, priority = 5)
	public void validateViewClientRepairOption() {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		customers.clickOnTheActionDrpDwnInTbl();
		soft.assertTrue(customers.isViewClientRepairsOptnDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnViewImageOption();
		soft.assertTrue(customers.isViewImageCloseBtnDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnViewImageCloseBtn();
		soft.assertAll();

	}

	@Test(enabled = true, priority = 6, dataProvider = "clientupdate", dataProviderClass = DataSupplier.class)
	public void validateEditClientOption(String city, String poscode, String phnnmbr, String mailid) {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		customers.searchName(excelutils.readStringData("Customers", 16, 2));
		customers.clickOnTheActionDrpDwnInTbl();
		customers.clickOnEditClientOption();
		soft.assertTrue(customers.isClientNameFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCompanyNameFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isGeoLocationFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAddressFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCityFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isPostalCodeFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isTelPhnFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isEmailFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isSsnFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isVatFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isBrowsebtnInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isCommentFieldInAddClientDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isAddClientGoBcktBtnDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(customers.isSaveChangeBtnDisplayed(), AutomationConstants.FieldCheck);
		customers.enterCity(city);// excelutils.readStringData("Customers", 24, 2)
		customers.enterPostalCode(poscode);// excelutils.readStringData("Customers", 25, 2)
		customers.enterTelPhnNmbr(phnnmbr);// excelutils.readStringData("Customers", 26, 2)
		customers.enterEmail(mailid);// excelutils.readStringData("Customers", 27, 2)
		customers.clickOnSaveChangeBtnBtn();
		customers.searchName(excelutils.readStringData("Customers", 16, 2));
		customers.clickOnTheActionDrpDwnInTbl();
		customers.clickOnViewClientOption();
		soft.assertEquals(customers.toGetTheTextFromCityField(), city, AutomationConstants.UpdateCheck);
		soft.assertEquals(customers.toGetTheTextFromPostalCodeField(), poscode, AutomationConstants.UpdateCheck);
		soft.assertEquals(customers.toGetTheTextFromTelPhnField(), phnnmbr, AutomationConstants.UpdateCheck);
		soft.assertEquals(customers.toGetTheTextFromEmailField(), mailid, AutomationConstants.UpdateCheck);
		customers.clickOnAddClientCloseBtn();
		soft.assertAll();
	}

	@Test(enabled = true, priority = 7)
	public void validateDeleteClientOption() {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		customers.deleteCancelActn(excelutils.readStringData("Customers", 21, 2));
		customers.deleteCnfrmActn(excelutils.readStringData("Customers", 21, 2));
		customers.searchName(excelutils.readStringData("Customers", 21, 2));
		soft.assertNotEquals(customers.toGetTheTextFromTableCell(), excelutils.readStringData("Customers", 21, 2),
				"Failure message : Unable to Delete the client from data base");
		soft.assertAll();

	}

	@Test(enabled = true, priority = 8)
	public void validateMultipleClientRemovel() {
		login = new LoginPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		customers = home.navigateToClientPage();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(customers.isCheckBox1Enabled(), "Failure message : Unable to select the check box ");
		customers.clickOnCheckBox1();
		soft.assertTrue(customers.isCheckBox2Enabled(), "Failure message : Unable to select the check box ");
		customers.clickOnCheckBox2();
		soft.assertTrue(customers.isCheckBox3Enabled(), "Failure message : Unable to select the check box ");
		customers.clickOnCheckBox3();
		customers.clickOnRightCrnrActionBtn();
		soft.assertTrue(customers.isDeleteSelectedOptnDisplayed(), AutomationConstants.FieldCheck);
		customers.clickOnDeleteSelectedOptn();
		customers.clickOnYesImSureButton();
		soft.assertTrue(customers.isRemovlSuccessPopupDisplayed(), AutomationConstants.PopUpCheck);
		soft.assertAll();
	}

	@AfterMethod

	public void postRun() {

		home.toLogOut();
	}

}
