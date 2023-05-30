package com.test;

import java.awt.AWTException;
import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.AutomationBase;
import com.constants.AutomationConstants;
import com.pages.HomePage;
import com.pages.LoginPage;
import com.pages.OrderAndReparationPage;
import com.utilities.ExcelUtils;
import com.utilities.GenericUtils;
import com.utilities.PropertyUtils;
import com.utilities.WaitUtils;

public class OrderAndReparationPageTest extends AutomationBase {
	WaitUtils wait;
	LoginPage login;
	HomePage home;
	PropertyUtils propertyutil;
	Properties prop;
	ExcelUtils excelutils;
	GenericUtils generic;
	OrderAndReparationPage orderandreparation;
	
	@Test(enabled =false, priority = 1)
	public void validateOrderAndReparationPage() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		soft.assertTrue(orderandreparation.isFilterResultDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isAddReparationDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isColumnVisibilityDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isReparationTableDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isReparationTableSearchBoxDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isPdfDwnldIcnDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isExcelDwnldIcnDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isPendingRepaiTabDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isCompletedRepaiTabDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.clickOnPdfDwnldIcn();
		soft.assertTrue(orderandreparation.isPdfDwnldIcnEnabled(), "Failure message : Pdf downloading is failed ");
		orderandreparation.clickOnExcelDwnldIcn();
		soft.assertTrue(orderandreparation.isExcelDwnldIcnEnabled(), "Failure message : Excel downloading is failed ");
		soft.assertAll();
	}

	@Test(enabled = false, priority = 3)
	public void validateFilterResultPage() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.clickOnFilterResultPlusIcon();
		soft.assertTrue(orderandreparation.isFilterRsltPlusIconEnabled(), AutomationConstants.FieldEnableCheck);
		soft.assertTrue(orderandreparation.isTimePeriodDrpDownEnabled(), AutomationConstants.FieldEnableCheck);
		orderandreparation.toSelectTimePeriod(excelutils.readStringData("OrderAndReparation", 3, 2));
		orderandreparation.toApplyTimePeriod();
		soft.assertTrue(orderandreparation.isMapkaDrpDownEnabled(), AutomationConstants.FieldEnableCheck);
		orderandreparation.toSelectMapka(excelutils.readStringData("OrderAndReparation", 4, 2));
		soft.assertTrue(orderandreparation.isHasWarrantyDownEnabled(), AutomationConstants.FieldEnableCheck);
		orderandreparation.toSelectHasWarranty(excelutils.readStringData("OrderAndReparation", 5, 2));
		soft.assertTrue(orderandreparation.isStatusDrpDownEnabled(), AutomationConstants.FieldEnableCheck);
		orderandreparation.toSelectStatus(excelutils.readStringData("OrderAndReparation", 6, 2));
		orderandreparation.clickOnFilterRsltBtn();
		soft.assertEquals(orderandreparation.getTheTextFromRow(), "No data available in table",
				AutomationConstants.ResultCheck);
		soft.assertAll();
	}

	@Test(enabled =true, priority = 2)
	public void validateStatusUpdation() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.enterTheValueToSearchBox(excelutils.readStringData("OrderAndReparation", 10, 2));
		orderandreparation.clickOnStatusRow();
		orderandreparation.toSelectStatusFromUpdate(excelutils.readStringData("OrderAndReparation", 11, 2));
		orderandreparation.clickOnUpdateBtn();
		soft.assertTrue(orderandreparation.isUpdateSuccessfullPopUpDisplayed(), AutomationConstants.PopUpCheck);
		orderandreparation.enterTheValueToSearchBox(excelutils.readStringData("OrderAndReparation", 10, 2));
		soft.assertEquals(orderandreparation.getTheTextFromStatusRw(), "Job done! ready to deliver",
				AutomationConstants.ResultCheck);
		soft.assertAll();

	}

	@Test(enabled = false, priority = 4)
	public void validateAddReparation() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		generic=new GenericUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.clickOnAddReparationButton();
		soft.assertTrue(orderandreparation.isImeiFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isClientDropDownFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isCategoryFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isTaxRateFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isAssignedToFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isManufacturerFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isModelFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isDefectFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isErrorCodeFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isServiceChargesFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isExpectedCloseDateFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isPurchaseDateFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isHasWarrantyFieldFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isWarrantyFieldFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isWarrantyCardNmbrFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isRepairTypeFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isClientRecieveDateFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isAddItemFieldDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isGoBackBtnDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isStatusDrpDwnInAddReparationDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isReparationsCodeDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isUploadPicDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isSendAutmtcTxtDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isSignRepairDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isAddReparationSendEmailDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isPreRepairChkListDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isAddReparationTabDisplayed(), AutomationConstants.FieldCheck);
		String imei=generic.generateAlphaNumericData(5);
		orderandreparation.enterValueToImeiField(imei); // "abcde"//excelutils.readStringData("OrderAndReparation", 14, 2)
		orderandreparation.toSelectClientFromDropDown(excelutils.readIntegerData("OrderAndReparation", 15, 2)); // 2
		orderandreparation.enterValueToCategoryField(excelutils.readStringData("OrderAndReparation", 16, 2)); // "note"
		orderandreparation.toSelectTaxRateFromDropDown(excelutils.readStringData("OrderAndReparation", 17, 2)); // "VAT"
		orderandreparation.toSelectAssignedToFromDropDown(excelutils.readStringData("OrderAndReparation", 18, 2));// "Joe																													// Jacobs"
		orderandreparation.enterValueToManufacturerField(excelutils.readStringData("OrderAndReparation", 19, 2)); // "Samsung"
		orderandreparation.enterValueToModelField(excelutils.readStringData("OrderAndReparation", 20, 2)); // "notebook																											// 15"
		orderandreparation.enterValueToDefectField(excelutils.readStringData("OrderAndReparation", 21, 2)); // "display																										// issue"
		orderandreparation.toSelectErrorCodeFromDropDown(excelutils.readIntegerData("OrderAndReparation", 22, 2)); // 0
		orderandreparation.enterValueToServiceChargesField(excelutils.readStringData("OrderAndReparation", 23, 2)); // "1500"
		orderandreparation.enterValueToExpectedCloseDateField(excelutils.readStringData("OrderAndReparation", 24, 2)); // "02-05-2023"
		orderandreparation.enterValueToPurchaseDateField(excelutils.readStringData("OrderAndReparation", 25, 2)); // "05-01-2023"
		orderandreparation.toSelectHasWarrantyField(excelutils.readStringData("OrderAndReparation", 26, 2)); // "In	// Warranty"
		orderandreparation.toSelectWarrantyField(excelutils.readStringData("OrderAndReparation", 27, 2));// "4 Month"
		String warrantycrdnmbr=generic.generateAlphaNumericData(6);
		orderandreparation.enterValueToWarrantyCardNmbrField(warrantycrdnmbr); // "134526"//excelutils.readStringData("OrderAndReparation", 28, 2)
	String repairtype=generic.generateAlphabeticData(6);
		orderandreparation.enterValueToRepairTypeField(repairtype); // "gdghff"//excelutils.readStringData("OrderAndReparation", 29, 2)
		orderandreparation.enterValueToClientRecieveDateField(excelutils.readStringData("OrderAndReparation", 30, 2)); // "15-04-2023"
		orderandreparation.enterValueToAddItemField(excelutils.readStringData("OrderAndReparation", 31, 2)); // "screen// guard"
		orderandreparation.clickOnAddReparationTab();
		orderandreparation.toHandlePrintPage();
		String repcode = orderandreparation.getTheTextFromReparationCodeFld();
		orderandreparation.closeTheTab();
		orderandreparation.searchCode(repcode);
		// orderandreparation.enterTheValueToSearchBox(repcode);
		// wait.toApplyWaitTillTextToBePresentInElement(driver,
		// 8,orderandreparation.repartncoderow , repcode);
		soft.assertEquals(orderandreparation.getTheTextFromReparationCodeRow(), repcode,
				AutomationConstants.ResultCheck);
		soft.assertAll();

	}

	@Test(enabled =false, priority = 5)
	public void validatePaymentDetailsPage() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.searchCode(excelutils.readStringData("OrderAndReparation", 34, 2));
		orderandreparation.editPayment();
		soft.assertTrue(orderandreparation.isPaymentStatusPopUpDisplayed(), AutomationConstants.PopUpCheck);
		orderandreparation.searchCode(excelutils.readStringData("OrderAndReparation", 34, 2));
		orderandreparation.deletePayment();
		soft.assertTrue(orderandreparation.isAreYouSureButtonDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.clickOnTheAreYouSureBtn();
		soft.assertTrue(orderandreparation.isPaymentDeletedPopUpDisplayed(), AutomationConstants.PopUpCheck);
		orderandreparation.searchCode(excelutils.readStringData("OrderAndReparation", 34, 2));
		orderandreparation.clickOnTheActionsButton();
		orderandreparation.clickOnTheAddPaymntOpButton();
		orderandreparation.enterValueToDateFieldInAddPymntPg(excelutils.readStringData("OrderAndReparation", 35, 2));
		orderandreparation.enterValueToAmountFieldInAddPymntPg(excelutils.readStringData("OrderAndReparation", 36, 2));
		orderandreparation.selectValueFromPayByList(excelutils.readStringData("OrderAndReparation", 38, 2));
		orderandreparation.enterTextInNoteField(excelutils.readStringData("OrderAndReparation", 37, 2));
		orderandreparation.clickOnAddPaymentTab();
		soft.assertTrue(orderandreparation.isPaymentAddedSuccPopUpplayed(), AutomationConstants.PopUpCheck);
		soft.assertAll();

	}

	@Test(enabled = false, priority = 6, retryAnalyzer = com.analyzer.RetryAnalyzer.class) // not worked
	public void validateAddAttachment() throws AWTException {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.searchCode(excelutils.readStringData("OrderAndReparation", 34, 2));
		orderandreparation.clickOnTheActionsButton();
		soft.assertTrue(orderandreparation.isViewAttachmentsoptionDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.clickOnViewAttachments();
		soft.assertTrue(orderandreparation.isFileBrowseBtnDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.clickOnFileBrowseBtn();
		orderandreparation
				.toUploadFile("C:\\Users\\ammu0\\Desktop\\ObsFrramework\\src\\test\\resources\\Screenshot (1).png");
		soft.assertTrue(orderandreparation.isFileUploadBtnEnabled(), "Failure message :Unable to  upload file");
		orderandreparation.clickOnFileBrowseBtn();
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 7, orderandreparation.doneprogressbar);
		soft.assertTrue(orderandreparation.isDoneProgressBarDisplayed(), "Failure message :Failed to attach the file");
		orderandreparation.clickOnFAttachmentCloseBtn(); // NOT WORKED
		soft.assertAll();
	}

	@Test(enabled = false, priority = 7)
	public void validateEmailInvoiceAction() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.searchCode(excelutils.readStringData("OrderAndReparation", 34, 2));
		orderandreparation.clickOnTheActionsButton();
		soft.assertTrue(orderandreparation.isInvoiceOptionDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isEmailInvoiceOptionDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isViewLogOptionDisplayed(), AutomationConstants.FieldCheck);
		soft.assertTrue(orderandreparation.isPrintBarcodeOptionDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.clickOnEmailInvoiceOption();
		soft.assertTrue(orderandreparation.isEmailIdFieldForInvoiceDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.enterEmailIdForInvoice(excelutils.readStringData("OrderAndReparation", 42, 2));
		soft.assertTrue(orderandreparation.isEmailIdOkButtonEnabled(), "Failure message :Unable to send the invoice ");
		orderandreparation.clickOnEmailIdOkButton();
		orderandreparation.searchCode(excelutils.readStringData("OrderAndReparation", 34, 2));
		orderandreparation.barcodePrinting();
		soft.assertTrue(orderandreparation.isPrintBarcodePopupDisplayed(), AutomationConstants.PopUpCheck);
		soft.assertAll();
	}

	@Test(enabled = false, priority = 8, retryAnalyzer = com.analyzer.RetryAnalyzer.class)
	public void validateColumnVisibilityInReparationTable() {
		login = new LoginPage(driver);
		home = new HomePage(driver);
		orderandreparation = new OrderAndReparationPage(driver);
		wait = new WaitUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		excelutils = new ExcelUtils();
		home = login.login(prop.getProperty("username"), prop.getProperty("password"));
		orderandreparation = home.navigateToOrderAndReparation();
		wait.toApplyImplicitWait(driver, 10);
		SoftAssert soft = new SoftAssert();
		orderandreparation.toDeselectOptionsFromCoumnVisibility();
		soft.assertFalse(orderandreparation.isCreateByColumnDisplayed(), AutomationConstants.FieldDisplayed);
		soft.assertFalse(orderandreparation.isLastModifiedColumnDisplayed(), AutomationConstants.FieldDisplayed);
		orderandreparation.toSelectOptionsFromCoumnVisibility();
		soft.assertTrue(orderandreparation.isCreateByColumnDisplayed(), AutomationConstants.FieldCheck);
		orderandreparation.clickOnPendingRepairTab();
		soft.assertEquals(orderandreparation.getTheTextFromStatusRw1(),
				excelutils.readStringData("OrderAndReparation", 45, 2), AutomationConstants.ResultCheck);
		soft.assertEquals(orderandreparation.getTheTextFromStatusRw2(),
				excelutils.readStringData("OrderAndReparation", 46, 2), AutomationConstants.ResultCheck);
		orderandreparation.clickOnCompletedRepairTab();
		soft.assertEquals(orderandreparation.getTheTextFromCompletedTableStatusRw(),
				excelutils.readStringData("OrderAndReparation", 47, 2), AutomationConstants.ResultCheck);
		soft.assertAll();
	}

	@AfterMethod

	public void postRun() {

		home.toLogOut();
	}

}
