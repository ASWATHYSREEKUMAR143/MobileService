package com.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.utilities.ActionUtils;
import com.utilities.GenericUtils;
import com.utilities.WaitUtils;
import com.utilities.WebActionUtils;
import com.utilities.WebBrowserUtils;

public class OrderAndReparationPage {
	WebDriver driver;
	WebActionUtils webaction = new WebActionUtils();
	GenericUtils generic = new GenericUtils();
	WebBrowserUtils brwsr = new WebBrowserUtils();
	ActionUtils action = new ActionUtils();
	WaitUtils wait = new WaitUtils();
	Select selct;

	@FindBy(xpath = "//div[@class='box-header with-border']")
	WebElement filterresult;

	@FindBy(xpath = "//button[@class='add_reparation btn btn-primary']")
	WebElement addreparationbutton;

	@FindBy(xpath = "//input[@id='imei']")
	WebElement imeifield;

	@FindBy(xpath = "//select[@id='client_name']")
	WebElement clientfield;

	@FindBy(xpath = "//input[@id='category']")
	WebElement categoryfield;

	@FindBy(xpath = "//select[@id='potax2']")
	WebElement taxratefield;

	@FindBy(xpath = "//select[@id='assigned_to']")
	WebElement assignedtofield;

	@FindBy(xpath = "//input[@id='reparation_manufacturer']")
	WebElement manufactrurfield;

	@FindBy(xpath = "//input[@id='reparation_model']")
	WebElement modelfield;

	@FindBy(xpath = "//input[@id='defect']")
	WebElement defectfield;

	@FindBy(xpath = "//select[@id='error_code']")
	WebElement errorcodefield;

	@FindBy(xpath = "//input[@id='service_charges']")
	WebElement servicechrgsfield;

	@FindBy(xpath = "//input[@id='expected_close_date']")
	WebElement expectedclosedatefield;

	@FindBy(xpath = "//input[@id='date_of_purchase']")
	WebElement purchasedatefield;

	@FindBy(xpath = "//select[@id='has_warranty']")
	WebElement haswarrantyfield;

	@FindBy(xpath = "//select[@id='warranty']")
	WebElement warrantyfield;

	@FindBy(xpath = "//input[@id='warranty_card_number']")
	WebElement warrantycardnumberfield;

	@FindBy(xpath = "//input[@id='repair_type']")
	WebElement repairtypefield;

	@FindBy(xpath = "//input[@id='client_date']")
	WebElement clientrecvdatefield;

	@FindBy(xpath = "//input[@id='add_item']")
	WebElement additemfield;

	@FindBy(xpath = "//button[@class='pull-left btn btn-default']")
	WebElement gobackbutton;

	@FindBy(xpath = "//select[@id='status_edit']")
	WebElement addreparationstatusdrpdwn;

	@FindBy(xpath = "//input[@id='code']")
	WebElement reparationscodebox;

	@FindBy(xpath = "//span[@id='rv_rep_code']")
	WebElement reparationscode;

	@FindBy(xpath = "//button[@id='upload_modal_btn']")
	WebElement upldpicbtn;

	@FindBy(xpath = "//span[@class='pull-left label label-info label-xs']")
	WebElement snd_automatic_txtbtn;

	@FindBy(xpath = "//span[@class='pull-left label label-warning label-xs']")
	WebElement snd_email;

	@FindBy(xpath = "//button[@id='sign_repair']")
	WebElement sign_repair_btn;

	@FindBy(xpath = "//button[@class='prerepair_show btn btn-primary']")
	WebElement pre_repair_chklst;

	@FindBy(xpath = "//button[@id='repair_submit']")
	WebElement add_reparation_tab;

	@FindBy(xpath = "(//button[@class='dt-button buttons-collection buttons-colvis'])[1]")
	WebElement columnvisibility;

	@FindBy(xpath = "//table[@id='dynamic-table']")
	WebElement reparationtable;

	@FindBy(xpath = "(//input[@class='form-control input-sm input-xs'])[1]")
	public WebElement reparationtablesearchbox;

	@FindBy(xpath = "(//a[@class='pull-right btn btn-primary'])[2]")
	WebElement pdfdwnldicon;

	@FindBy(xpath = "(//a[@class='pull-right btn btn-primary'])[1]")
	WebElement exceldwnldicon;

	@FindBy(xpath = "//a[text()='Pending Repairs']")
	WebElement pendingrepairstab;

	@FindBy(xpath = "//a[text()='Completed Repairs']")
	WebElement cmpltdrepairstab;

	@FindBy(xpath = "//button[@class='btn btn-box-tool']")
	WebElement filterrsltplusbtn;

	@FindBy(xpath = "//input[@name='date']")
	WebElement timeperioddropdown;

	@FindBy(xpath = "//button[@class='applyBtn btn btn-sm btn-success']")
	WebElement timeperiodapplybtn;

	@FindBy(xpath = "//select[@name='manufacturer']")
	WebElement mapkadropdown;

	@FindBy(xpath = "(//select[@name='has_warranty'])[1]")
	WebElement haswarrantydropdwn;

	@FindBy(xpath = "//select[@name='status']")
	WebElement statusdropdwn;

	@FindBy(xpath = "//input[@class='btn btn-primary input-xs']")
	WebElement filterrsltbtn;

	@FindBy(xpath = "//table[@id='dynamic-table']//td[9]")
	WebElement statusraw;

	@FindBy(xpath = "(//table[@id='dynamic-table']//td[9])[1]")
	WebElement statusraw1;

	@FindBy(xpath = "(//table[@id='dynamic-table']//td[9])[2]")
	WebElement statusraw2;

	@FindBy(xpath = "(//table[@id='dynamic-table-completed']//td[9])[1]")
	WebElement completedtablestatusraw;

	@FindBy(xpath = "//select[@class='form-control']")
	WebElement updatestatusdropdwn;

	@FindBy(xpath = "(//input[@class='btn btn-primary input-xs'])[2]")
	WebElement updatebtn;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement successfullstatusupdatepopup;

	@FindBy(xpath = "(//button[@class='close'])[1]")
	WebElement addreparclsbtn;

	/*
	 * @FindBy(xpath="//button[@class='c01123 c01154']") public WebElement
	 * printcancelbtn;
	 */

	@FindBy(xpath = "(//button[text()='actions '])[1]")
	public WebElement actionsbtn;

	@FindBy(xpath = "(//ul[@class='dropdown-menu pull-right'])[2]")
	public WebElement actionsdrpdwnlist;

	@FindBy(xpath = "(//a[text()=' View Payments'])[1]")
	WebElement viewpaymntoptn;

	@FindBy(xpath = "(//a[@data-target='#myModal2'])[2]")
	WebElement paymenteditoption;

	@FindBy(xpath = "(//input[@type='submit'])[2]")
	public WebElement editpymnt_tab;

	@FindBy(xpath = "//table[@id='dynamic-table']//td[2]")
	public WebElement repartncoderow;

	@FindBy(xpath = "//div[@class='alert alert-danger']")
	WebElement paymentstatuspopup;

	@FindBy(xpath = "//a[@class='po']")
	WebElement paymentdeletebtn;

	@FindBy(xpath = "//a[@class='btn-icon btn btn-danger']")
	public WebElement areyousurebutton;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement paymentdeletedpopup;

	@FindBy(xpath = "(//a[text()=' Add Payment'])[1]")
	WebElement addpaymntbtn;

	@FindBy(xpath = "//input[@id='date']")
	WebElement addpaymnt_date_Field;

	@FindBy(xpath = "//input[@id='reference_no']")
	WebElement addpaymnt_refnum_field;

	@FindBy(xpath = "//input[@id='amount_1']")
	WebElement addpaymnt_amnt_field;

	@FindBy(xpath = "//select[@id='paid_by_1']")
	WebElement payingbyfield;

	@FindBy(xpath = "//textarea[@id='note']")
	WebElement notefield;

	@FindBy(xpath = "//input[@name='add_payment']")
	WebElement addpayment_tab;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement paymentaddedpopup;

	@FindBy(xpath = "(//a[@id='upload_modal_btn'])[1]")
	WebElement viewatchmntoptn;

	@FindBy(xpath = "//input[@id='upload_manager']")
	WebElement filebrwsbtn;

	@FindBy(xpath = "//a[@class='btn btn-default btn-secondary fileinput-upload fileinput-upload-button']")
	WebElement fileuploadbtn;

	@FindBy(xpath = "//div[@class='progress-bar bg-success progress-bar-success']")
	public WebElement doneprogressbar;

	@FindBy(xpath = "(//button[@class='close'])[4]")
	WebElement attchmntclosebtn;

	@FindBy(xpath = "(//a[@target='_blank'])[1]")
	public WebElement invoiceoptn;

	@FindBy(xpath = "(//a[@id='email_invoice'])[1]")
	public WebElement emailinvoiceoptn;

	@FindBy(xpath = "//input[@class='bootbox-input bootbox-input-email form-control']")
	public WebElement emailid_fr_invoice;

	@FindBy(xpath = "//button[@data-bb-handler='confirm']")
	WebElement emailid_ok_btn;

	@FindBy(xpath = "//span[text()='Created By']")
	WebElement createbybtn;

	@FindBy(xpath = "//span[text()='Last Modified']")
	WebElement lastmodifiedbtn;

	@FindBy(xpath = "(//table[@id='dynamic-table']//th[text()='Created By'])[1]")
	WebElement createbycolumn;

	@FindBy(xpath = "(//table[@id='dynamic-table']//th[text()='Last Modified'])[1]")
	WebElement lastmodifiedcolumn;

	@FindBy(xpath = "(//a[text()=' View log'])[1]")
	public WebElement viewlogoptn;

	@FindBy(xpath = "(//a[text()=' Print Barcode'])[1]")
	public WebElement printbarcodeoptn;

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	WebElement printbarcodeupdatebtn;

	@FindBy(xpath = "//button[@class='btn btn-primary btn-block no-print']")
	public WebElement printbarcodeprntbtn;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement printbarcodepopup;

	@FindBy(xpath = "//table[@id='dynamic-table']//td")
	WebElement tablerowone;

	@FindBy(xpath = "//div[@id='loadingmessage']")
	WebElement loader;

	public OrderAndReparationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isFilterResultDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, filterresult);

		return flag;

	}

	public boolean isAddReparationDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addreparationbutton);

		return flag;

	}

	public void clickOnAddReparationButton() {

		webaction.clickOnTheElement(driver, addreparationbutton);
	}

	public boolean isImeiFieldDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, imeifield);
		boolean flag = webaction.isElementDisplayed(driver, imeifield);

		return flag;

	}

	public boolean isImeiFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, imeifield);

		return flag;

	}

	public void enterValueToImeiField(String text) {

		webaction.enterTheValue(driver, imeifield, text);
	}

	public boolean isClientDropDownFieldDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, clientfield);
		boolean flag = webaction.isElementDisplayed(driver, clientfield);

		return flag;

	}

	public boolean isClientDropDownFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, clientfield);

		return flag;

	}

	public void toSelectClientFromDropDown(int index) {
		generic.selectOPtionByIndexFromDropDown(driver, clientfield, index);
		;

	}

	public boolean isCategoryFieldDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, categoryfield);
		boolean flag = webaction.isElementDisplayed(driver, categoryfield);

		return flag;

	}

	public boolean isCategoryFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, categoryfield);

		return flag;

	}

	public void enterValueToCategoryField(String text) {

		webaction.enterTheValue(driver, categoryfield, text);
	}

	public boolean isTaxRateFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, taxratefield);

		return flag;
	}

	public boolean isTaxRateFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, taxratefield);

		return flag;
	}

	public void toSelectTaxRateFromDropDown(String text) {
		generic.selectOPtionByVisibleTextFromDropDown(driver, taxratefield, text);

	}

	public boolean isAssignedToFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, assignedtofield);

		return flag;

	}

	public boolean isAssignedToFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, assignedtofield);

		return flag;

	}

	public void toSelectAssignedToFromDropDown(String text) {
		generic.selectOPtionByVisibleTextFromDropDown(driver, assignedtofield, text);

	}

	public boolean isManufacturerFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, manufactrurfield);

		return flag;

	}

	public boolean isManufacturerFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, manufactrurfield);

		return flag;

	}

	public void enterValueToManufacturerField(String text) {

		webaction.enterTheValue(driver, manufactrurfield, text);
	}

	public boolean isModelFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, modelfield);

		return flag;
	}

	public boolean isModelFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, modelfield);

		return flag;
	}

	public void enterValueToModelField(String text) {

		webaction.enterTheValue(driver, modelfield, text);
	}

	public boolean isDefectFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, defectfield);

		return flag;
	}

	public boolean isDefectFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, defectfield);

		return flag;
	}

	public void enterValueToDefectField(String text) {

		webaction.enterTheValue(driver, defectfield, text);
	}

	public boolean isErrorCodeFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, errorcodefield);

		return flag;
	}

	public boolean isErrorCodeFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, errorcodefield);

		return flag;
	}

	public void toSelectErrorCodeFromDropDown(int index) {
		generic.selectOPtionByIndexFromDropDown(driver, errorcodefield, index);
		;

	}

	public boolean isServiceChargesFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, servicechrgsfield);

		return flag;

	}

	public boolean isServiceChargesFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, servicechrgsfield);

		return flag;

	}

	public void enterValueToServiceChargesField(String value) {

		webaction.enterTheValue(driver, servicechrgsfield, value);
	}

	public boolean isExpectedCloseDateFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, expectedclosedatefield);

		return flag;
	}

	public boolean isExpectedCloseDateFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, expectedclosedatefield);

		return flag;
	}

	public void enterValueToExpectedCloseDateField(String text) {

		webaction.enterTheValue(driver, expectedclosedatefield, text);
	}

	public boolean isPurchaseDateFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, purchasedatefield);

		return flag;

	}

	public boolean isPurchaseDateFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, purchasedatefield);

		return flag;

	}

	public void enterValueToPurchaseDateField(String text) {

		webaction.enterTheValue(driver, purchasedatefield, text);
	}

	public boolean isHasWarrantyFieldFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, haswarrantyfield);

		return flag;

	}

	public boolean isHasWarrantyFieldFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, haswarrantyfield);

		return flag;

	}

	public void toSelectHasWarrantyField(String text) {
		generic.selectOPtionByVisibleTextFromDropDown(driver, haswarrantyfield, text);

	}

	public boolean isWarrantyFieldFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, warrantyfield);

		return flag;

	}

	public boolean isWarrantyFieldFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, warrantyfield);

		return flag;

	}

	public void toSelectWarrantyField(String text) {
		generic.selectOPtionByVisibleTextFromDropDown(driver, warrantyfield, text);
		;

	}

	public boolean isWarrantyCardNmbrFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, warrantycardnumberfield);

		return flag;

	}

	public boolean isWarrantyCardNmbrFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, warrantycardnumberfield);

		return flag;

	}

	public void enterValueToWarrantyCardNmbrField(String text) {

		webaction.enterTheValue(driver, warrantycardnumberfield, text);
	}

	public boolean isRepairTypeFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, repairtypefield);

		return flag;

	}

	public boolean isRepairTypeFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, repairtypefield);

		return flag;
	}

	public void enterValueToRepairTypeField(String text) {

		webaction.enterTheValue(driver, repairtypefield, text);
	}

	public boolean isClientRecieveDateFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, clientrecvdatefield);

		return flag;

	}

	public boolean isClientRecieveDateFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, clientrecvdatefield);

		return flag;

	}

	public void enterValueToClientRecieveDateField(String text) {

		webaction.enterTheValue(driver, clientrecvdatefield, text);
	}

	public boolean isAddItemFieldDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, additemfield);

		return flag;

	}

	public boolean isAddItemFieldEnabled() {
		boolean flag = webaction.isElementEnable(driver, additemfield);

		return flag;

	}

	public void enterValueToAddItemField(String text) {

		webaction.enterTheValue(driver, additemfield, text);
	}

	public boolean isGoBackBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, gobackbutton);

		return flag;
	}

	public boolean isStatusDrpDwnInAddReparationDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addreparationstatusdrpdwn);

		return flag;
	}

	public boolean isReparationsCodeDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, reparationscodebox);

		return flag;
	}

	public boolean isUploadPicDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, upldpicbtn);

		return flag;
	}

	public boolean isSendAutmtcTxtDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, snd_automatic_txtbtn);

		return flag;
	}

	public boolean isAddReparationSendEmailDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, snd_email);

		return flag;
	}

	public boolean isSignRepairDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, sign_repair_btn);

		return flag;
	}

	public boolean isPreRepairChkListDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, pre_repair_chklst);

		return flag;
	}

	public boolean isAddReparationTabDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, add_reparation_tab);

		return flag;
	}

	public boolean isAddReparationTabEnabled() {
		boolean flag = webaction.isElementEnable(driver, add_reparation_tab);

		return flag;
	}

	public void clickOnAddReparationTab() {

		webaction.clickOnTheElement(driver, add_reparation_tab);

	}

	public boolean isColumnVisibilityDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, columnvisibility);

		return flag;

	}

	public void clickOnColumnVisibility() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, columnvisibility);
		webaction.clickOnTheElement(driver, columnvisibility);

	}

	public void clickOnCreatedByBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, createbybtn);
		webaction.clickOnTheElement(driver, createbybtn);
		;

	}

	public void clickOnLastModifiedBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, lastmodifiedbtn);
		webaction.clickOnTheElement(driver, lastmodifiedbtn);
		;

	}

	public boolean isCreateByColumnDisplayed() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, reparationtablesearchbox);
		boolean flag = webaction.isElementDisplayed(driver, createbycolumn);

		return flag;

	}

	public boolean isLastModifiedColumnDisplayed() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, reparationtablesearchbox);
		boolean flag = webaction.isElementDisplayed(driver, lastmodifiedcolumn);

		return flag;

	}

	public boolean isReparationTableDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, reparationtable);

		return flag;

	}

	public boolean isReparationTableSearchBoxDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, reparationtablesearchbox);

		return flag;

	}

	public void enterTheValueToSearchBox(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, reparationtablesearchbox);
		webaction.clearTheElement(driver, reparationtablesearchbox);
		webaction.enterTheValue(driver, reparationtablesearchbox, text);
	}

	public void clearTheValueInTheSearchBox() {

		webaction.clearTheElement(driver, reparationtablesearchbox);
		;
	}

	public boolean isPdfDwnldIcnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, pdfdwnldicon);

		return flag;

	}

	public void clickOnPdfDwnldIcn() {
		webaction.clickOnTheElement(driver, pdfdwnldicon);

	}

	public boolean isPdfDwnldIcnEnabled() {
		boolean flag = webaction.isElementEnable(driver, pdfdwnldicon);

		return flag;

	}

	public boolean isExcelDwnldIcnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, exceldwnldicon);

		return flag;

	}

	public void clickOnExcelDwnldIcn() {
		webaction.clickOnTheElement(driver, exceldwnldicon);

	}

	public boolean isExcelDwnldIcnEnabled() {
		boolean flag = webaction.isElementEnable(driver, exceldwnldicon);

		return flag;

	}

	public boolean isPendingRepaiTabDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, pendingrepairstab);

		return flag;

	}

	public void clickOnPendingRepairTab() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, pendingrepairstab);

		webaction.clickOnTheElement(driver, pendingrepairstab);

	}

	public boolean isCompletedRepaiTabDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, cmpltdrepairstab);

		return flag;

	}

	public void clickOnCompletedRepairTab() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, cmpltdrepairstab);

		webaction.clickOnTheElement(driver, cmpltdrepairstab);

	}

	public void clickOnFilterResultPlusIcon() {
		webaction.clickOnTheElement(driver, filterrsltplusbtn);
		;

	}

	public boolean isFilterRsltPlusIconEnabled() {
		boolean flag = webaction.isElementEnable(driver, filterrsltplusbtn);

		return flag;

	}

	public boolean isTimePeriodDrpDownEnabled() {
		boolean flag = webaction.isElementEnable(driver, timeperioddropdown);

		return flag;

	}

	public void toSelectTimePeriod(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, timeperioddropdown);
		webaction.clearTheElement(driver, timeperioddropdown);
		webaction.enterTheValue(driver, timeperioddropdown, text);

	}

	public void toApplyTimePeriod() {
		webaction.clickOnTheElement(driver, timeperiodapplybtn);

	}

	public boolean isMapkaDrpDownEnabled() {
		boolean flag = webaction.isElementEnable(driver, mapkadropdown);

		return flag;

	}

	public void toSelectMapka(String text) {

		webaction.clickOnTheElement(driver, mapkadropdown);
		generic.selectOPtionByVisibleTextFromDropDown(driver, mapkadropdown, text);
	}

	public boolean isHasWarrantyDownEnabled() {
		boolean flag = webaction.isElementEnable(driver, haswarrantydropdwn);

		return flag;

	}

	public void toSelectHasWarranty(String text) {

		generic.selectOPtionByVisibleTextFromDropDown(driver, haswarrantydropdwn, text);
	}

	public boolean isStatusDrpDownEnabled() {
		boolean flag = webaction.isElementEnable(driver, mapkadropdown);

		return flag;

	}

	public void toSelectStatus(String text) {

		generic.selectOPtionByVisibleTextFromDropDown(driver, statusdropdwn, text);
	}

	public void clickOnFilterRsltBtn() {
		webaction.clickOnTheElement(driver, filterrsltbtn);

	}

	public boolean isFilterRsltBtnEnabled() {
		boolean flag = webaction.isElementEnable(driver, filterrsltbtn);

		return flag;

	}

	public void clickOnStatusRow()

	{
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, statusraw);
		webaction.clickOnTheElement(driver, statusraw);

	}

	public boolean isStatusRowDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, statusraw);
		return flag;

	}

	public String getTheTextFromStatusRw() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, statusraw);

		return webaction.getTheElementText(driver, statusraw);
	}

	public String getTheTextFromStatusRw1() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, statusraw1);

		return webaction.getTheElementText(driver, statusraw1);
	}

	public String getTheTextFromStatusRw2() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, statusraw2);

		return webaction.getTheElementText(driver, statusraw2);
	}

	public String getTheTextFromCompletedTableStatusRw() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, completedtablestatusraw);

		return webaction.getTheElementText(driver, completedtablestatusraw);
	}

	public void toSelectStatusFromUpdate(String value) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, updatestatusdropdwn);
		generic.selectOPtionByVisibleTextFromDropDown(driver, updatestatusdropdwn, value);
		// generic.selectOPtionByValueFromDropDown(driver, updatestatusdropdwn, value);;
	}

	public boolean isUpdateStatusSelected() {

		boolean flag = webaction.isElementSelected(driver, updatestatusdropdwn);
		return flag;
	}

	public void clickOnUpdateBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, updatebtn);
		webaction.clickOnTheElement(driver, updatebtn);

	}

	public boolean isUpdateBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, updatebtn);

		return flag;

	}

	public boolean isUpdateSuccessfullPopUpDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, successfullstatusupdatepopup);

		return flag;

	}

	public void closeTheTab()

	{

		wait.waitForTheInVisibilityOfElement(driver, 10, loader);
		brwsr.navigateBack(driver);
		brwsr.navigateToNextPage(driver);
		// wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, addreparclsbtn);
		// webaction.clickOnTheElement(driver, addreparclsbtn);

	}
	/*
	 * public void clickOnPrintCanclBtn() { webaction.clickOnTheElement(driver,
	 * printcancelbtn);
	 * 
	 * } public void toBack() {
	 * 
	 * brwsr.navigateBack(driver);
	 * 
	 * }
	 */

	public boolean isActionsButtonDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, actionsbtn);

		return flag;

	}

	public void clickOnTheActionsButton() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, actionsbtn);
		webaction.clickOnTheElement(driver, actionsbtn);

	}

	public boolean isActionsDropDownListEnabled() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, actionsdrpdwnlist);
		boolean flag = webaction.isElementEnable(driver, actionsdrpdwnlist);

		return flag;

	}

	public boolean isViewPaymntOptnEnabled() {
		boolean flag = webaction.isElementEnable(driver, viewpaymntoptn);

		return flag;

	}

	public void clickOnTheViewPaymntOpButton() {

		webaction.clickOnTheElement(driver, viewpaymntoptn);

	}

	public boolean isPaymentEditOptionDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, paymenteditoption);

		return flag;

	}

	public void clickOnTheEditOption() {

		webaction.clickOnTheElement(driver, paymenteditoption);

	}

	public boolean isPaymentStatusPopUpDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, paymentstatuspopup);

		return flag;

	}

	public boolean isPaymentDeleteBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, paymentdeletebtn);

		return flag;

	}

	public void clickOnTheDeleteBtn() {

		webaction.clickOnTheElement(driver, paymentdeletebtn);

	}

	public boolean isAreYouSureButtonDisplayed()

	{
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, areyousurebutton);
		boolean flag = webaction.isElementDisplayed(driver, areyousurebutton);

		return flag;

	}

	public void clickOnTheAreYouSureBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, areyousurebutton);
		webaction.clickOnTheElement(driver, areyousurebutton);

	}

	public boolean isPaymentDeletedPopUpDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, paymentdeletedpopup);

		return flag;

	}

	public boolean isAddPaymntOptnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addpaymntbtn);

		return flag;

	}

	public void clickOnTheAddPaymntOpButton() {

		webaction.clickOnTheElement(driver, addpaymntbtn);

	}

	public boolean isEditTabDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, editpymnt_tab);
		return flag;
	}

	public void clickOnTheEditTab() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, editpymnt_tab);
		webaction.submitTheElement(driver, editpymnt_tab);
		// webaction.clickOnTheElement(driver, editpymnt_tab);
	}

	public boolean isDateDisplayedInAddPaymntPg() {

		boolean flag = webaction.isElementDisplayed(driver, addpaymnt_date_Field);
		return flag;
	}

	public void enterValueToDateFieldInAddPymntPg(String text) {
		webaction.enterTheValue(driver, addpaymnt_date_Field, text);
	}

	public boolean isRefNumbrDisplayedInAddPaymntPg() {

		boolean flag = webaction.isElementDisplayed(driver, addpaymnt_refnum_field);
		return flag;
	}

	public boolean isAmountDisplayedInAddPaymntPg() {

		boolean flag = webaction.isElementDisplayed(driver, addpaymnt_amnt_field);
		return flag;
	}

	public void enterValueToAmountFieldInAddPymntPg(String text) {
		webaction.clearTheElement(driver, addpaymnt_amnt_field);
		webaction.enterTheValue(driver, addpaymnt_amnt_field, text);
	}

	public boolean isPaymntMthdDisplayedInAddPaymntPg() {

		boolean flag = webaction.isElementDisplayed(driver, payingbyfield);
		return flag;
	}

	public void selectValueFromPayByList(String text) {
		generic.selectOPtionByVisibleTextFromDropDown(driver, payingbyfield, text);
	}

	public boolean isPaymentAddedSuccPopUpplayed() {

		boolean flag = webaction.isElementDisplayed(driver, paymentaddedpopup);
		return flag;
	}

	public boolean isAddPaymentTabEnabled() {

		boolean flag = webaction.isElementEnable(driver, addpayment_tab);
		return flag;
	}

	public void clickOnAddPaymentTab() {
		webaction.clickOnTheElement(driver, addpayment_tab);
		;
	}

	public boolean isNoteFieldDisplayedInAddPaymntPg() {

		boolean flag = webaction.isElementDisplayed(driver, notefield);
		return flag;
	}

	public void enterTextInNoteField(String text) {
		webaction.enterTheValue(driver, notefield, text);
	}

	public void clickOnFAttachmentCloseBtn() {

		webaction.clickOnTheElement(driver, attchmntclosebtn);
	}

	public boolean isDoneProgressBarDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, doneprogressbar);

		return flag;

	}

	public boolean isFileUploadBtnEnabled() {
		boolean flag = webaction.isElementEnable(driver, fileuploadbtn);

		return flag;

	}

	public void clickOnFileUploadBtn() {

		webaction.clickOnTheElement(driver, fileuploadbtn);
	}

	public void toUploadFile(String path) throws AWTException {

		action.toUploadFileUsingRobot(driver, path);

	}

	public boolean isFileBrowseBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, filebrwsbtn);

		return flag;

	}

	public void clickOnFileBrowseBtn() {

		webaction.clickOnTheElement(driver, filebrwsbtn);
	}

	public boolean isViewAttachmentsoptionDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, viewatchmntoptn);

		return flag;

	}

	public void clickOnViewAttachments() {

		webaction.clickOnTheElement(driver, viewatchmntoptn);
	}

	public boolean isInvoiceOptionDisplayed()

	{

		boolean flag = webaction.isElementDisplayed(driver, invoiceoptn);

		return flag;

	}

	public boolean isEmailInvoiceOptionDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, emailinvoiceoptn);
		boolean flag = webaction.isElementDisplayed(driver, emailinvoiceoptn);

		return flag;
	}

	public void clickOnEmailInvoiceOption() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, emailinvoiceoptn);
		webaction.clickOnTheElement(driver, emailinvoiceoptn);

	}

	public boolean isEmailIdFieldForInvoiceDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, emailid_fr_invoice);
		boolean flag = webaction.isElementDisplayed(driver, emailid_fr_invoice);

		return flag;
	}

	public void enterEmailIdForInvoice(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, emailid_fr_invoice);
		webaction.clearTheElement(driver, emailid_fr_invoice);
		webaction.enterTheValue(driver, emailid_fr_invoice, text);

	}

	public boolean isEmailIdOkButtonEnabled() {
		boolean flag = webaction.isElementEnable(driver, emailid_ok_btn);

		return flag;
	}

	public void clickOnEmailIdOkButton() {

		webaction.clickOnTheElement(driver, emailid_ok_btn);
		brwsr.navigateBack(driver);
		brwsr.navigateToNextPage(driver);

	}

	public boolean isViewLogOptionDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, viewlogoptn);
		boolean flag = webaction.isElementDisplayed(driver, viewlogoptn);

		return flag;
	}

	public boolean isPrintBarcodeOptionDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, printbarcodeoptn);
		boolean flag = webaction.isElementDisplayed(driver, printbarcodeoptn);

		return flag;
	}

	public void clickOnPrintBarcodeOption() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, printbarcodeoptn);

		webaction.clickOnTheElement(driver, printbarcodeoptn);

	}

	public boolean isPrintBarcodeUpdateBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, printbarcodeupdatebtn);

		return flag;
	}

	public void clickOnPrintBarcodeUpdateBtn() {

		webaction.clickOnTheElement(driver, printbarcodeupdatebtn);

	}

	public boolean isPrintBarcodePrintBtnDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 5, printbarcodeprntbtn);
		boolean flag = webaction.isElementDisplayed(driver, printbarcodeprntbtn);

		return flag;
	}

	public boolean isPrintBarcodePopupDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 5, printbarcodepopup);
		boolean flag = webaction.isElementDisplayed(driver, printbarcodepopup);

		return flag;
	}

	public void clickOnPrintBarcodePrintBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 5, printbarcodeprntbtn);
		webaction.clickOnTheElement(driver, printbarcodeprntbtn);
		generic.toHandleWindow(driver);
		brwsr.navigateBack(driver);

	}

	public String getTheTextFromRow() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, tablerowone);
		return webaction.getTheElementText(driver, tablerowone);

	}

	public String getTheTextFromReparationCodeFld() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, reparationscode);
		return webaction.getTheElementText(driver, reparationscode);

	}

	public String getTheTextFromReparationCodeRow() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, repartncoderow);
		return webaction.getTheElementText(driver, repartncoderow);

	}

	public void toHandlePrintPage() {

		generic.toHandleWindow(driver);

	}

	public void bckwrd() {

		brwsr.navigateBack(driver);
	}

	public void forward() {

		brwsr.navigateToNextPage(driver);
	}

	public void editPayment() {
		clickOnTheActionsButton();
		clickOnTheViewPaymntOpButton();
		clickOnTheEditOption();
		clickOnTheEditTab();

	}

	public void searchCode(String value) {
		enterTheValueToSearchBox(value);
		wait.toApplyWaitTillTextToBePresentInElement(driver, 7, repartncoderow, value);

	}

	public void deletePayment() {
		clickOnTheActionsButton();
		clickOnTheViewPaymntOpButton();
		clickOnTheDeleteBtn();

	}

	public void barcodePrinting() {
		clickOnTheActionsButton();
		clickOnPrintBarcodeOption();
		clickOnPrintBarcodeUpdateBtn();
		clickOnPrintBarcodePrintBtn();

	}

	public void toDeselectOptionsFromCoumnVisibility() {
		clickOnColumnVisibility();
		clickOnCreatedByBtn();
		clickOnLastModifiedBtn();
		bckwrd();
		forward();

	}

	public void toSelectOptionsFromCoumnVisibility() {
		clickOnColumnVisibility();
		clickOnCreatedByBtn();
		bckwrd();
		forward();

	}

}
