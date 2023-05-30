package com.test;

import java.util.Properties;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.base.AutomationBase;
import com.constants.AutomationConstants;
import com.pages.HomePage;
import com.pages.InventoryPage;
import com.pages.LoginPage;
import com.utilities.ActionUtils;
import com.utilities.ExcelUtils;
import com.utilities.PropertyUtils;
import com.utilities.WaitUtils;
import com.utilities.WebBrowserUtils;

public class InventoryPageTest extends AutomationBase {
	LoginPage login;
	HomePage home;
	WebBrowserUtils webbrowser;
	InventoryPage inventorypp;
	WaitUtils wait=new WaitUtils();
	ActionUtils action=new ActionUtils();
	PropertyUtils propertyutil;
	Properties prop;
	ExcelUtils excelutils;
		
@Test(enabled=true,priority=1,groups=("smoke"))
public void validateInventoryPage()  
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	soft.assertTrue(inventorypp.isShowBtnInInventoryPageDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isSearchTextBoxInInventoryPageDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isActionsTabInInventoryPageDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isTableInInventoryPageDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCheckboxInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isImageFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCodeFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isNameFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCostFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isPriceFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isQuantityFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isAlertQuantityFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCheckboxInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isActionsFieldInInventoryTableDispayed(),AutomationConstants.FieldCheck);
	inventorypp.toClickOnActionButttonOfRowOne();
	soft.assertTrue(inventorypp.isDuplicateProductBtnInActionsDropdownDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isEditProductBtnInActionsDropdownDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isPrintBarcodeBtnInActionsDropdownDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isDeleteProductBtnInActionsDropdownDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toSelectValueForShowDropdown(excelutils.readStringData("Inventory", 2, 2));
	inventorypp.searchCode(excelutils.readStringData("Inventory", 3, 2));
	soft.assertEquals(inventorypp.toGetTheCodeValueInFirstRowOfInventoryTable(),excelutils.readStringData("Inventory", 3, 2) , AutomationConstants.ResultCheck) ;	
	soft.assertAll();	
}

@Test(enabled=true,priority=2)
public void validateActionsIconInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.toClickOnActionsTabInInventoryPage();
	soft.assertTrue(inventorypp.isAddProductsLinkInActionsTabDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isPrintBarcodeOrLabelLinkInActionsTabDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isExportToExcelLinkInActionsTabDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isExportToPdfLinkInActionsTabDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isImportProductsLinkInActionsTabDispayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isDeleteProductsLinkInActionsTabDispayed(),AutomationConstants.FieldCheck);
	inventorypp.toSelectCheckboxOfFirstRow();
	inventorypp.toSelectCheckboxOfSecondRow();
	inventorypp.toClickOnExportToExcelLinkInActionsTab();
	inventorypp.exportPdf();
	inventorypp.printBarCode();
	soft.assertTrue(inventorypp.isProductActionsPageHeaderDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toClickOnUpdateBtnInProductActionsPage();
	soft.assertTrue(inventorypp.isPrintBtnInProductActionsPageDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toClikcOnPrintBtnInProductActionsPage();
	inventorypp.toHandlePrintPage();
	soft.assertAll();	
}

@Test(enabled=true,priority=3)
public void validateAddProductFunctionalityInActionsIconInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.toClickOnActionsTabInInventoryPage();
	inventorypp.toClickOnAddProductsLinkInActionsTab();
	soft.assertTrue(inventorypp.isAddProductPageHeaderDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductTypeDropdownInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductNameTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductCodeTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCategoryDropdownInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isSubCategoryDropdownInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isModelDropdownInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isAlertQuantityTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isQuantityTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isSupplierDropdownInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductUnitTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductCostTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductPriceTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductImageTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isProductDetailsTxtBxInAddProductPageDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toSelectValueToProductTypeDropdownInAddProductPage(excelutils.readStringData("Inventory", 6, 2));
	inventorypp.toEnterValueToProductNameTxtBxInAddProductPage(excelutils.readStringData("Inventory", 7, 2));
	inventorypp.toEnterValueToProductCodeTxtBxInAddProductPage(excelutils.readStringData("Inventory", 8, 2));
	inventorypp.toSelectValueToCategoryDropdownInAddProductPage(excelutils.readStringData("Inventory", 9, 2));
	inventorypp.toSelectValueToModelDropdownInAddProductPage(excelutils.readStringData("Inventory", 10, 2));
	inventorypp.toEnterValueToQuantityTxtBxInAddProductPage(excelutils.readStringData("Inventory", 11, 2));
	inventorypp.toSelectValueToSupplierDropdownInAddProductPage(excelutils.readStringData("Inventory", 12, 2));
	inventorypp.toEnterValueToProductUnitTxtBxInAddProductPage(excelutils.readStringData("Inventory", 13, 2));
	inventorypp.toEnterValueToProductCostTxtBxInAddProductPage(excelutils.readStringData("Inventory", 14, 2));
	inventorypp.toEnterValueToProductPriceTxtBxInAddProductPage(excelutils.readStringData("Inventory", 15, 2));
	inventorypp.toClickOnAddProductButtonInAddProductPage();
	soft.assertTrue(inventorypp.isProductAddedSuccessPopupDisplayed(),AutomationConstants.PopUpCheck);
	inventorypp.searchCode(excelutils.readStringData("Inventory", 8, 2));
	soft.assertEquals(inventorypp.toGetTheProductCodeAfterSearch(),excelutils.readStringData("Inventory", 8, 2) , AutomationConstants.ResultCheck);
	soft.assertAll();
}

@Test(enabled=true,priority=4)
public void validateEditProductFunctionalityInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.searchCode(excelutils.readStringData("Inventory", 18, 2));
	inventorypp.toClickOnProductCodeOfRowone();
	soft.assertTrue(inventorypp.isBarcodeAndQRCodeFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isTypeFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isNameFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCodeFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isModelFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isUnitFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isCostFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isPriceFieldInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isPrintBarcodeOrLabelBtnInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isEditBtnInProductCardDisplayed(),AutomationConstants.FieldCheck);
	soft.assertTrue(inventorypp.isDeleteBtnInProductCardDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toClickOnEditBtnInProductCard();
	soft.assertTrue(inventorypp.isEditProductPageHeaderDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toSelectValueToModelDropdownInAddProductPage(excelutils.readStringData("Inventory", 19, 2));
	inventorypp.toClickOnEditProductBtnInEditProductPage();
	soft.assertTrue(inventorypp.isEditProductSuccessPopupDisplayed(),AutomationConstants.PopUpCheck);
	inventorypp.toCloseEditProductsuccesspopup();
	inventorypp.searchCode(excelutils.readStringData("Inventory", 18, 2));
	inventorypp.toClickOnProductCodeOfRowone();
	soft.assertEquals(inventorypp.toGetValueOfModelInProductCard(),excelutils.readStringData("Inventory", 19, 2), AutomationConstants.UpdateCheck);
	inventorypp.toCloseEditPage();
	soft.assertAll();
}
@Test(enabled=true,priority=5,retryAnalyzer = com.analyzer.RetryAnalyzer.class)
public void validateDuplicateProductFunctionalityInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.toClickOnActionButttonOfRowOne();
	inventorypp.toClickOnDuplicateProductBtnInActionsDropdown();
	inventorypp.toClickOnAddProductButtonInAddProductPage();
	soft.assertTrue(inventorypp.isValidationMsgForSupplierDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toSelectValueToSupplierDropdownInAddProductPage(excelutils.readStringData("Inventory", 22, 2));
	inventorypp.toClickOnAddProductButtonInAddProductPage();
	soft.assertTrue(inventorypp.isValidationMsgForUniqueProductCodeDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toClickOnArrowBtnInProductField();
	String productcodenew=inventorypp.toGetProductCodeInAddProductPage();
	inventorypp.toClickOnAddProductButtonInAddProductPage();
	soft.assertTrue(inventorypp.isProductAddedSuccessPopupDisplayed(),AutomationConstants.PopUpCheck);
	inventorypp.searchCode(productcodenew);
	String productcodeaftersearch=inventorypp.toGetTheProductCodeAfterSearch();
	soft.assertEquals(productcodeaftersearch, productcodenew,"Failure message:Product not duplicated");
	soft.assertAll();
}

@Test(enabled=true,priority=6,groups=("smoke"))
public void validateEditProductFunctionalityFromActionsDropdownInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.searchCode(excelutils.readStringData("Inventory", 25, 2));
	inventorypp.toClickOnActionButttonOfRowOne();
	inventorypp.toClickOnEditProductBtnInActionsDropdown();
	soft.assertTrue(inventorypp.isEditProductPageHeaderDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toClearValueFromProductPriceField();
	inventorypp.toClickOnEditProductBtnInEditProductPage();
	soft.assertTrue(inventorypp.isProductPriceMandatoryMsgDisplayed(),AutomationConstants.FieldCheck);
	inventorypp.toEnterValueToProductPriceTxtBxInAddProductPage(excelutils.readStringData("Inventory", 26, 2));
	inventorypp.toClickOnEditProductBtnInEditProductPage();
	soft.assertTrue(inventorypp.isEditProductSuccessPopupDisplayed(),AutomationConstants.PopUpCheck);
	inventorypp.toCloseEditProductsuccesspopup();
	inventorypp.searchCode(excelutils.readStringData("Inventory", 25, 2));
	soft.assertEquals(inventorypp.toGetPriceInInventoryTableOfRowOne(),"40,000.00", AutomationConstants.UpdateCheck);
	soft.assertAll();
}
@Test(enabled=true,priority=7)
public void validateDeleteProductFunctionalityFromActionsDropdownInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.searchCode(excelutils.readStringData("Inventory", 29, 2));
	inventorypp.deleteActionFromActionDropDown();
	inventorypp.searchCode(excelutils.readStringData("Inventory", 29, 2));
	soft.assertTrue(inventorypp.isNoMatchingRecordMsgDisplayedAfterSearch(),"Failure message:Product not deleted");
}
@Test(enabled=true,priority=8)
  
public void validateDeleteProductFunctionalityFromActionsIconInInventoryPage()
{
	login=new LoginPage(driver);
	home=new HomePage(driver);
	inventorypp=new InventoryPage(driver);
	propertyutil = new PropertyUtils();
	prop = PropertyUtils.getProperty("config.properties");
	excelutils = new ExcelUtils();
	home = login.login(prop.getProperty("username"), prop.getProperty("password"));
	inventorypp=home.navigateToInventoryPage();
	wait.toApplyImplicitWait(driver, 10);
	SoftAssert soft=new SoftAssert();
	inventorypp.deleteBeforeSelection();
	soft.assertTrue(inventorypp.isNoProductSelectedMsgDisplayedAfterDelete(),AutomationConstants.PopUpCheck);
	inventorypp.deleteAfterSelection();
	soft.assertTrue(inventorypp.isProductDeletedSuccessPopupDisplayed(),AutomationConstants.PopUpCheck);
	
}
@AfterMethod

public void postRun() {

	home.toLogOut();
}
}


