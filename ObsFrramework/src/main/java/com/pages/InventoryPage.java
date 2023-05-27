package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.GenericUtils;
import com.utilities.WaitUtils;
import com.utilities.WebActionUtils;

public class InventoryPage {

	WebDriver driver;
	WebActionUtils webaction = new WebActionUtils();
	GenericUtils generic = new GenericUtils();
	WaitUtils wait = new WaitUtils();

	@FindBy(xpath = "//h1[text()='Inventory']")
	WebElement inventorypagehaeder;

	@FindBy(xpath = "//label[text()='Show ']")
	WebElement showlabelininventorypage;

	@FindBy(xpath = "//select[@name='PRData_length']")
	WebElement showdropdowninput;

	@FindBy(xpath = "//input[@class='form-control input-sm input-xs']")
	public WebElement searchtxtboxininventorypage;

	@FindBy(xpath = "//i[@class='icon fa fa-tasks tip']")
	WebElement actionstab;

//	@FindBy(xpath="//i[@class='fas fa-plus-circle']")
	@FindBy(xpath = "//a[text()=' Add Product                            ']")
	WebElement addproductlinkbtninactionstab;

	@FindBy(xpath = "//a[@id='labelProducts']")
	WebElement printbarcodeorlabelbtninactionstab;

	@FindBy(xpath = "(//a[@id='excel'])[1]")
	WebElement exporttoexcelfileinactionstab;

	@FindBy(xpath = "(//a[@id='excel'])[2]")
	WebElement exporttopdffileinactionstab;

	@FindBy(xpath = "(//i[@class='fas fa-file-excel'])[2]")
	WebElement importproductsinactionstab;

	@FindBy(xpath = "//a[@class='bpo']")
	WebElement deleteproductsinactionstab;

	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[2]")
	WebElement checkboxofrowone;

	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[3]")
	WebElement checkboxofrowtwo;

	@FindBy(xpath = "//table[@id='PRData']")
	WebElement tableininventorypage;

	@FindBy(xpath = "(//th[@class='sorting_disabled'])[1]")
	WebElement checkboxfieldininventorytable;

	@FindBy(xpath = "(//th[text()='Image'])[1]")
	WebElement imagefieldininventorytable;

	@FindBy(xpath = "(//th[text()='Code'])[1]")
	WebElement codefieldininventorytable;

	@FindBy(xpath = "(//th[text()='Name'])[1]")
	WebElement namefieldininventorytable;

	@FindBy(xpath = "(//th[text()='Cost'])[1]")
	WebElement costfieldininventorytable;

	@FindBy(xpath = "(//th[text()='Price'])[1]")
	WebElement pricefieldininventorytable;

	@FindBy(xpath = "(//th[text()='Quantity'])[1]")
	WebElement quantityfieldininventorytable;

	@FindBy(xpath = "(//th[text()='Alert Quantity'])[1]")
	WebElement alertquantityfieldininventorytable;

	@FindBy(xpath = "(//th[text()='Actions'])[1]")
	WebElement actionsfieldininventorytable;

	@FindBy(xpath = "(//button[text()='Actions '])[1]")
	WebElement actionsbtnofrowone;

	@FindBy(xpath = "(//a[text()=' Duplicate Product'])[1]")
	WebElement duplicateproductbtninactionsdropdown;

	@FindBy(xpath = "(//a[text()=' Edit Product'])[1]")
	WebElement editproductbtninactionsdropdown;

	@FindBy(xpath = "(//a[text()=' Print Barcode/Label'])[1]")
	WebElement printbarcodebtninactionsdropdown;

	@FindBy(xpath = "(//a[text()=' Delete Product'])[1]")
	public WebElement deleteproductbtninactionsdropdown;

	@FindBy(xpath = "(//table[@id='PRData']//tr//td)[3]")
	public WebElement codeinrowone;

	@FindBy(xpath = "//div[@id='loadingmessage']")
	public WebElement loader;

	@FindBy(xpath = "//h1[text()='Product Actions']")
	WebElement productactionspageheader;

	@FindBy(xpath = "//input[@name='print']")
	WebElement updatebtninproductactionspage;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block no-print']")
	WebElement printbtninproductactionspage;

	@FindBy(xpath = "//h1[text()='Add Product']")
	WebElement addproductpageheader;

	@FindBy(xpath = "//select[@id='type']")
	WebElement producttypedropdowninaddproductspage;

	@FindBy(xpath = "//input[@id='name']")
	WebElement productnametxtbxinaddproductspage;

	@FindBy(xpath = "//input[@id='code']")
	WebElement productcodetxtbxinaddproductspage;

	@FindBy(xpath = "//select[@id='category']")
	WebElement categorydropdowninaddproductspage;

	@FindBy(xpath = "//select[@id='subcategory']")
	WebElement subcategorydropdowninaddproductspage;

	@FindBy(xpath = "//select[@id='model']")
	WebElement modeldropdowninaddproductspage;

	@FindBy(xpath = "//input[@id='alert_quantity']")
	WebElement alertquantitytxtbxinaddproductspage;

	@FindBy(xpath = "//input[@id='quantity']")
	WebElement quantitytxtbxinaddproductspage;

	@FindBy(xpath = "//textarea[@id='details']")
	WebElement productdetailstxtbxinaddproductspage;

	@FindBy(xpath = "//select[@id='supplier']")
	WebElement supplierdropdowninaddproductspage;

	@FindBy(xpath = "//input[@id='unit']")
	WebElement productunittxtbxinaddproductspage;

	@FindBy(xpath = "//input[@id='cost']")
	WebElement productcosttxtbxinaddproductspage;

	@FindBy(xpath = "//input[@id='price']")
	WebElement productpricetxtbxinaddproductspage;

	@FindBy(xpath = "(//input[@class='file-caption-name'])[1]")
	WebElement productimagetxtbxinaddproductspage;

	@FindBy(xpath = "//input[@name='add_product']")
	WebElement addproductbtninaddproductspage;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement productaddedsuccesspopup;

	@FindBy(xpath = "(//button[@class='close'])[1]")
	WebElement productaddedsuccesspopupclosebtn;

	@FindBy(xpath = "(//table[@id='PRData']//tr//td)[3]")
	WebElement productcodeofrowone;

	@FindBy(xpath = "//td[text()='Barcode & QRcode']")
	public WebElement barcodeandqrcodeinproductcard;

	@FindBy(xpath = "//td[text()='Type']")
	WebElement typeinproductcard;

	@FindBy(xpath = "//td[text()='Name']")
	WebElement nameinproductcard;

	@FindBy(xpath = "//td[text()='Code']")
	WebElement codeinproductcard;

	@FindBy(xpath = "//td[text()='Model']")
	WebElement modelinproductcard;

	@FindBy(xpath = "(//table[@class='table table-borderless table-striped dfTable table-right-left']//tr//td)[10]")
	WebElement modelvalueinproductcard;

	@FindBy(xpath = "//td[text()='Unit']")
	WebElement unitinproductcard;

	@FindBy(xpath = "//td[text()='Cost']")
	WebElement costinproductcard;

	@FindBy(xpath = "//td[text()='Price']")
	WebElement priceinproductcard;

	@FindBy(xpath = "//button[@class='btn btn-xs btn-default no-print pull-right']")
	WebElement printbtninproductcard;

	@FindBy(xpath = "//span[text()='Print Barcode/Label']")
	WebElement printbarcodeorlabelinproductcard;

	@FindBy(xpath = "//a[@class='tip btn btn-warning tip']")
	WebElement editbtninproductcard;

	@FindBy(xpath = "//span[text()='Delete']")
	WebElement deletebtninproductcard;

	@FindBy(xpath = "//h1[text()='Edit Product']")
	WebElement editproductpageheader;

	@FindBy(xpath = "//input[@name='edit_product']")
	WebElement editproductbtnineditproductpage;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement editproductsuccesspopup;

	@FindBy(xpath = "(//button[@class='close'])[1]")
	WebElement editproductsuccesspopupclosebtn;

	@FindBy(xpath = "(//button[@class='close'])[11]")
	WebElement editproductpgclosebtn;

	@FindBy(xpath = "//small[text()='Please enter a value' and @data-bv-result='INVALID']")
	WebElement suppliervalidationmsg;

	@FindBy(xpath = "//div[@class='toast-message']")
	WebElement productcodenotquniqueerrormsg;

	@FindBy(xpath = "//i[@class='fa fa-random']")
	WebElement arrowbtninproductcodefield;

	@FindBy(xpath = "(//table//tr//td)[6]")
	WebElement pricefieldofrowone;

	@FindBy(xpath = "//small[text()='Please enter a value' and @data-bv-result='INVALID']")
	public WebElement productpricevalidationmsg;

	@FindBy(xpath = "//a[@class='btn btn-danger po-delete']")
	WebElement agreedeletefordeleteproductbtninactionsdropdown;

	@FindBy(xpath = "//button[@class='btn po-close']")
	WebElement canceldeletefordeleteproductbtninactionsdropdown;

	@FindBy(xpath = "//td[@class='dataTables_empty']")
	WebElement nomatchingresultmsgaftersearch;

	@FindBy(xpath = "//button[@id='delete']")
	WebElement agreedeletefordeleteproductbtninactionstab;

	@FindBy(xpath = "//button[@class='btn bpo-close']")
	WebElement canceldeletefordeleteproductbtninactionstab;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement noproductselectedalertmsgininventorypage;

	@FindBy(xpath = "(//button[@class='close'])[1]")
	WebElement noproductselectedalertmsgclosebtnininventorypage;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement productdeletedsuccesspopup;

	public InventoryPage(WebDriver driver) // constructor of home page
	{
		this.driver = driver;
		PageFactory.initElements(driver, this); // to initialize the above mentioned elements
	}

	public boolean isInventoryPageHeaderDispayed() {
		return webaction.isElementDisplayed(driver, inventorypagehaeder);
	}

	public boolean isShowBtnInInventoryPageDispayed() {
		return webaction.isElementDisplayed(driver, showlabelininventorypage);
	}

	public void toSelectValueForShowDropdown(String text) {
		generic.selectOPtionByVisibleTextFromDropDown(driver, showdropdowninput, text);
	}

	public boolean isSearchTextBoxInInventoryPageDispayed() {
		return webaction.isElementDisplayed(driver, searchtxtboxininventorypage);
	}

	public void toEnterValueToSearchTextBoxInInventoryPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, searchtxtboxininventorypage);
		webaction.clearTheElement(driver, searchtxtboxininventorypage);
		webaction.enterTheValue(driver, searchtxtboxininventorypage, value);
	}

	public boolean isActionsTabInInventoryPageDispayed() {
		return webaction.isElementDisplayed(driver, actionstab);
	}

	public void searchCode(String value) {
		toEnterValueToSearchTextBoxInInventoryPage(value);
		wait.toApplyWaitTillTextToBePresentInElement(driver, 8, codeinrowone, value);

	}

	public void toClickOnActionsTabInInventoryPage() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, searchtxtboxininventorypage);
		webaction.clickOnTheElement(driver, actionstab);
	}

	public boolean isAddProductsLinkInActionsTabDispayed() {
		return webaction.isElementDisplayed(driver, addproductlinkbtninactionstab);
	}

	public void toClickOnAddProductsLinkInActionsTab() {
		webaction.clickOnTheElement(driver, addproductlinkbtninactionstab);
	}

	public boolean isPrintBarcodeOrLabelLinkInActionsTabDispayed()

	{
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, printbarcodeorlabelbtninactionstab);
		return webaction.isElementDisplayed(driver, printbarcodeorlabelbtninactionstab);
	}

	public void toClickOnPrintBarcodeOrLabelLinkInActionsTab() {
		webaction.clickOnTheElement(driver, printbarcodeorlabelbtninactionstab);
	}

	public boolean isExportToExcelLinkInActionsTabDispayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, exporttoexcelfileinactionstab);
		return webaction.isElementDisplayed(driver, exporttoexcelfileinactionstab);
	}

	public void toClickOnExportToExcelLinkInActionsTab() {
		webaction.clickOnTheElement(driver, exporttoexcelfileinactionstab);
	}

	public boolean isExportToPdfLinkInActionsTabDispayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, exporttopdffileinactionstab);
		return webaction.isElementDisplayed(driver, exporttopdffileinactionstab);
	}

	public void toClickOnExportToPdfLinkInActionsTab() {
		webaction.clickOnTheElement(driver, exporttopdffileinactionstab);
	}

	public boolean isImportProductsLinkInActionsTabDispayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, importproductsinactionstab);
		return webaction.isElementDisplayed(driver, importproductsinactionstab);
	}

	public void toClickOnImportProductsLinkInActionsTab() {
		webaction.clickOnTheElement(driver, importproductsinactionstab);
	}

	public boolean isDeleteProductsLinkInActionsTabDispayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, deleteproductsinactionstab);
		return webaction.isElementDisplayed(driver, deleteproductsinactionstab);
	}

	public void toClickOnDeleteProductsLinkInActionsTab() {
		webaction.clickOnTheElement(driver, deleteproductsinactionstab);
	}

	public boolean isTableInInventoryPageDispayed() {
		return webaction.isElementDisplayed(driver, tableininventorypage);
	}

	public boolean isCheckboxInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, checkboxfieldininventorytable);
	}

	public boolean isImageFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, imagefieldininventorytable);
	}

	public boolean isCodeFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, codefieldininventorytable);
	}

	public boolean isNameFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, namefieldininventorytable);
	}

	public boolean isCostFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, costfieldininventorytable);
	}

	public boolean isPriceFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, pricefieldininventorytable);
	}

	public boolean isQuantityFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, quantityfieldininventorytable);
	}

	public boolean isAlertQuantityFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, alertquantityfieldininventorytable);
	}

	public boolean isActionsFieldInInventoryTableDispayed() {
		return webaction.isElementDisplayed(driver, alertquantityfieldininventorytable);
	}

	public void toClickOnActionButttonOfRowOne() {
		webaction.clickOnTheElement(driver, actionsbtnofrowone);
	}

	public boolean isDuplicateProductBtnInActionsDropdownDisplayed() {
		return webaction.isElementDisplayed(driver, duplicateproductbtninactionsdropdown);
	}

	public void toClickOnDuplicateProductBtnInActionsDropdown() {
		webaction.clickOnTheElement(driver, duplicateproductbtninactionsdropdown);
	}

	public boolean isEditProductBtnInActionsDropdownDisplayed() {
		return webaction.isElementDisplayed(driver, editproductbtninactionsdropdown);
	}

	public void toClickOnEditProductBtnInActionsDropdown() {
		webaction.clickOnTheElement(driver, editproductbtninactionsdropdown);
	}

	public boolean isPrintBarcodeBtnInActionsDropdownDisplayed() {
		return webaction.isElementDisplayed(driver, printbarcodebtninactionsdropdown);
	}

	public boolean isDeleteProductBtnInActionsDropdownDisplayed() {
		return webaction.isElementDisplayed(driver, deleteproductbtninactionsdropdown);
	}

	public void toClickOnDeleteProductBtnInActionsDropdown() {
		webaction.clickOnTheElement(driver, deleteproductbtninactionsdropdown);
	}

	public String toGetTheCodeValueInFirstRowOfInventoryTable() {
		String code = webaction.getTheElementText(driver, codeinrowone);
		return code;
	}

	public void toSelectCheckboxOfFirstRow() {
		webaction.clickOnTheElement(driver, checkboxofrowone);
	}

	public void toSelectCheckboxOfSecondRow() {
		webaction.clickOnTheElement(driver, checkboxofrowtwo);
	}

	public boolean isProductActionsPageHeaderDisplayed() {
		return webaction.isElementDisplayed(driver, productactionspageheader);
	}

	public void toClickOnUpdateBtnInProductActionsPage() {
		webaction.clickOnTheElement(driver, updatebtninproductactionspage);
	}

	public boolean isPrintBtnInProductActionsPageDisplayed() {
		return webaction.isElementDisplayed(driver, printbtninproductactionspage);
	}

	public void toClikcOnPrintBtnInProductActionsPage() {
		webaction.isElementDisplayed(driver, printbtninproductactionspage);
	}

	public boolean isAddProductPageHeaderDisplayed() {
		return webaction.isElementDisplayed(driver, addproductpageheader);
	}

	public boolean isProductTypeDropdownInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, producttypedropdowninaddproductspage);
	}

	public void toSelectValueToProductTypeDropdownInAddProductPage(String text)

	{
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, producttypedropdowninaddproductspage);
		generic.selectOPtionByVisibleTextFromDropDown(driver, producttypedropdowninaddproductspage, text);
	}

	public boolean isProductNameTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productnametxtbxinaddproductspage);
	}

	public void toEnterValueToProductNameTxtBxInAddProductPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productnametxtbxinaddproductspage);
		webaction.enterTheValue(driver, productnametxtbxinaddproductspage, value);
	}

	public boolean isProductCodeTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productcodetxtbxinaddproductspage);
	}

	public void toEnterValueToProductCodeTxtBxInAddProductPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productcodetxtbxinaddproductspage);
		webaction.enterTheValue(driver, productcodetxtbxinaddproductspage, value);
	}

	public boolean isCategoryDropdownInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, categorydropdowninaddproductspage);
	}

	public void toSelectValueToCategoryDropdownInAddProductPage(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, categorydropdowninaddproductspage);
		generic.selectOPtionByVisibleTextFromDropDown(driver, categorydropdowninaddproductspage, text);
	}

	public boolean isSubCategoryDropdownInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, subcategorydropdowninaddproductspage);
	}

	public boolean isModelDropdownInAddProductPageDisplayed() {

		return webaction.isElementDisplayed(driver, modeldropdowninaddproductspage);
	}

	public void toSelectValueToModelDropdownInAddProductPage(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, modeldropdowninaddproductspage);
		generic.selectOPtionByVisibleTextFromDropDown(driver, modeldropdowninaddproductspage, text);
	}

	public boolean isAlertQuantityTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, alertquantitytxtbxinaddproductspage);
	}

	public void toEnterValueToAlertQuantityTxtBxInAddProductPage(String value) {
		webaction.enterTheValue(driver, alertquantitytxtbxinaddproductspage, value);
	}

	public boolean isQuantityTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, quantitytxtbxinaddproductspage);
	}

	public void toClearValueInQuantityTxtBxInAddProductPage() {
		webaction.clearTheElement(driver, quantitytxtbxinaddproductspage);
	}

	public void toEnterValueToQuantityTxtBxInAddProductPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, quantitytxtbxinaddproductspage);
		webaction.clearTheElement(driver, quantitytxtbxinaddproductspage);
		webaction.enterTheValue(driver, quantitytxtbxinaddproductspage, value);
	}

	public boolean isProductDetailsTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productdetailstxtbxinaddproductspage);
	}

	public void toEnterValueToProductDetailsTxtBxInAddProductPage(String value) {
		webaction.enterTheValue(driver, productdetailstxtbxinaddproductspage, value);
	}

	public boolean isSupplierDropdownInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, supplierdropdowninaddproductspage);
	}

	public void toSelectValueToSupplierDropdownInAddProductPage(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, supplierdropdowninaddproductspage);
		generic.selectOPtionByVisibleTextFromDropDown(driver, supplierdropdowninaddproductspage, text);
	}

	public boolean isProductUnitTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productunittxtbxinaddproductspage);
	}

	public void toEnterValueToProductUnitTxtBxInAddProductPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productunittxtbxinaddproductspage);
		webaction.enterTheValue(driver, productunittxtbxinaddproductspage, value);
	}

	public boolean isProductCostTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productcosttxtbxinaddproductspage);
	}

	public void toEnterValueToProductCostTxtBxInAddProductPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productcosttxtbxinaddproductspage);
		webaction.enterTheValue(driver, productcosttxtbxinaddproductspage, value);
	}

	public boolean isProductPriceTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productpricetxtbxinaddproductspage);
	}

	public void toClearValueFromProductPriceField() {
		webaction.clearTheElement(driver, productpricetxtbxinaddproductspage);
	}

	public void toEnterValueToProductPriceTxtBxInAddProductPage(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productpricetxtbxinaddproductspage);
		webaction.clearTheElement(driver, productpricetxtbxinaddproductspage);
		webaction.enterTheValue(driver, productpricetxtbxinaddproductspage, value);
	}

	public boolean isProductImageTxtBxInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, productimagetxtbxinaddproductspage);
	}

	public boolean isAddProductButtonInAddProductPageDisplayed() {
		return webaction.isElementDisplayed(driver, addproductbtninaddproductspage);
	}

	public void toClickOnAddProductButtonInAddProductPage() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, addproductbtninaddproductspage);
		webaction.clickOnTheElement(driver, addproductbtninaddproductspage);
	}

	public boolean isProductAddedSuccessPopupDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productaddedsuccesspopup);
		return webaction.isElementDisplayed(driver, productaddedsuccesspopup);
	}

	public void toCloseProductAddedSuccessPopup() {
		webaction.clickOnTheElement(driver, productaddedsuccesspopupclosebtn);
	}

	public String toGetTheProductCodeAfterSearch() {

		String productcode = webaction.getTheElementText(driver, productcodeofrowone);
		return productcode;
	}

	public void toClickOnProductCodeOfRowone() {
		webaction.clickOnTheElement(driver, productcodeofrowone);
	}

	public boolean isBarcodeAndQRCodeFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, barcodeandqrcodeinproductcard);
		return webaction.isElementDisplayed(driver, barcodeandqrcodeinproductcard);
	}

	public boolean isTypeFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, typeinproductcard);
		return webaction.isElementDisplayed(driver, typeinproductcard);
	}

	public boolean isNameFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, nameinproductcard);
		return webaction.isElementDisplayed(driver, nameinproductcard);
	}

	public boolean isCodeFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, codeinproductcard);
		return webaction.isElementDisplayed(driver, codeinproductcard);
	}

	public boolean isModelFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, modelinproductcard);
		return webaction.isElementDisplayed(driver, modelinproductcard);
	}

	public String toGetValueOfModelInProductCard() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, modelvalueinproductcard);
		String modelvalue = webaction.getTheElementText(driver, modelvalueinproductcard);
		return modelvalue;
	}

	public boolean isUnitFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, unitinproductcard);
		return webaction.isElementDisplayed(driver, unitinproductcard);
	}

	public boolean isCostFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, costinproductcard);
		return webaction.isElementDisplayed(driver, costinproductcard);
	}

	public boolean isPriceFieldInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, priceinproductcard);
		return webaction.isElementDisplayed(driver, priceinproductcard);
	}

	public boolean isPrintBtnInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, printbtninproductcard);
		return webaction.isElementDisplayed(driver, printbtninproductcard);
	}

	public boolean isPrintBarcodeOrLabelBtnInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, printbarcodeorlabelinproductcard);
		return webaction.isElementDisplayed(driver, printbarcodeorlabelinproductcard);
	}

	public boolean isEditBtnInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, editbtninproductcard);
		return webaction.isElementDisplayed(driver, editbtninproductcard);
	}

	public void toClickOnEditBtnInProductCard() {
		webaction.clickOnTheElement(driver, editbtninproductcard);
	}

	public boolean isDeleteBtnInProductCardDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, deletebtninproductcard);
		return webaction.isElementDisplayed(driver, deletebtninproductcard);
	}

	public boolean isEditProductPageHeaderDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, editproductpageheader);
		return webaction.isElementDisplayed(driver, editproductpageheader);
	}

	public void toClickOnEditProductBtnInEditProductPage() {
		webaction.clickOnTheElement(driver, editproductbtnineditproductpage);
	}

	public boolean isEditProductSuccessPopupDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, editproductsuccesspopup);
		return webaction.isElementDisplayed(driver, editproductsuccesspopup);
	}

	public void toCloseEditProductsuccesspopup() {
		webaction.clickOnTheElement(driver, editproductsuccesspopupclosebtn);
	}

	public boolean isValidationMsgForSupplierDisplayed() {
		return webaction.isElementDisplayed(driver, suppliervalidationmsg);
	}

	public boolean isValidationMsgForUniqueProductCodeDisplayed() {
		return webaction.isElementDisplayed(driver, productcodenotquniqueerrormsg);
	}

	public void toClickOnArrowBtnInProductField() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, arrowbtninproductcodefield);
		webaction.clickOnTheElement(driver, arrowbtninproductcodefield);
	}

	public String toGetProductCodeInAddProductPage() {
		// String productcoderandom=webaction.getTheElementText(driver,
		// productcodetxtbxinaddproductspage);
		String productcoderandom = webaction.getTheElementAttribute(driver, productcodetxtbxinaddproductspage, "value");
		return productcoderandom;
	}

	public String toGetPriceInInventoryTableOfRowOne() {
		String price = webaction.getTheElementText(driver, pricefieldofrowone);
		return price;
	}

	public boolean isProductPriceMandatoryMsgDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, productpricevalidationmsg);
		return webaction.isElementDisplayed(driver, productpricevalidationmsg);
	}

	public void toClearValueFromSearchTxtboxInInventorypage() {
		webaction.clearTheElement(driver, searchtxtboxininventorypage);
	}

	public void toClickOnAgreeDeleteForDeleteProductBtnInActionsDropdown() {
		webaction.clickOnTheElement(driver, agreedeletefordeleteproductbtninactionsdropdown);
	}

	public void toClickOnCancelDeleteForDeleteProductBtnInActionsDropdown() {
		webaction.clickOnTheElement(driver, canceldeletefordeleteproductbtninactionsdropdown);
	}

	public boolean isNoMatchingRecordMsgDisplayedAfterSearch() {
		return webaction.isElementDisplayed(driver, nomatchingresultmsgaftersearch);
	}

	public void toClickOnAgreeDeleteProductInActionsTab() {
		webaction.clickOnTheElement(driver, agreedeletefordeleteproductbtninactionstab);
	}

	public void toClickOnCancelDeleteProductInActionsTab() {
		webaction.clickOnTheElement(driver, canceldeletefordeleteproductbtninactionstab);
	}

	public boolean isNoProductSelectedMsgDisplayedAfterDelete() {
		return webaction.isElementDisplayed(driver, noproductselectedalertmsgininventorypage);
	}

	public void toCloseNoProductSelectedMsg() {
		webaction.clickOnTheElement(driver, noproductselectedalertmsgclosebtnininventorypage);
	}

	public boolean isProductDeletedSuccessPopupDisplayed() {
		return webaction.isElementDisplayed(driver, productdeletedsuccesspopup);
	}

	public void toCloseEditPage() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, editproductpgclosebtn);
		webaction.clickOnTheElement(driver, editproductpgclosebtn);

	}

	public void toHandlePrintPage() {

		generic.toHandleWindow(driver);

	}

	public void exportPdf() {

		toClickOnActionsTabInInventoryPage();
		toClickOnExportToPdfLinkInActionsTab();
	}

	public void printBarCode() {
		toClickOnActionsTabInInventoryPage();
		toClickOnPrintBarcodeOrLabelLinkInActionsTab();

	}

	public void deleteBeforeSelection() {
		toClickOnActionsTabInInventoryPage();
		toClickOnDeleteProductsLinkInActionsTab();
		toClickOnAgreeDeleteProductInActionsTab();

	}

	public void deleteAfterSelection() {
		toSelectCheckboxOfFirstRow();
		toSelectCheckboxOfSecondRow();
		toClickOnActionsTabInInventoryPage();
		toClickOnDeleteProductsLinkInActionsTab();
		toClickOnAgreeDeleteProductInActionsTab();

	}

	public void deleteActionFromActionDropDown() {
		toClickOnActionButttonOfRowOne();
		toClickOnDeleteProductBtnInActionsDropdown();
		toClickOnCancelDeleteForDeleteProductBtnInActionsDropdown();
		toClickOnDeleteProductBtnInActionsDropdown();
		toClickOnAgreeDeleteForDeleteProductBtnInActionsDropdown();

	}

}
