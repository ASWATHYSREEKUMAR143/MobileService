package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.ActionUtils;
import com.utilities.GenericUtils;
import com.utilities.WaitUtils;
import com.utilities.WebActionUtils;
import com.utilities.WebBrowserUtils;

public class CustomersPage {

	WebDriver driver;
	WebBrowserUtils brwsr = new WebBrowserUtils();
	WebActionUtils webaction = new WebActionUtils();
	GenericUtils generic = new GenericUtils();
	ActionUtils actn = new ActionUtils();
	WaitUtils wait = new WaitUtils();

	@FindBy(xpath = "//button[@class='add_c btn btn-primary']")
	WebElement add_client_tab;

	@FindBy(xpath = "//select[@class='form-control input-sm select input-xs']")
	WebElement show_dropdwn_clientpg;

	@FindBy(xpath = "//button[@class='dt-button buttons-collection buttons-colvis']")
	public WebElement changecolmns_clientpg;

	@FindBy(xpath = "//div[@class='dt-button-collection fixed two-column']")
	WebElement changecolmnspopup;

	@FindBy(xpath = "(//button[@class='dt-button buttons-columnVisibility active'])[5]")
	public WebElement emailtabinpopup;

	@FindBy(xpath = "//button[@class='dt-button buttons-columnVisibility']")
	public WebElement emailtabinpopup_aftrrmvl;

	@FindBy(xpath = "(//button[@class='dt-button buttons-columnVisibility active'])[6]")
	public WebElement tphntabinpopup;

	@FindBy(xpath = "(//table[@id='dynamic-table']//td[4])[1]")
	public WebElement addresscell;

	@FindBy(xpath = "//input[@class='form-control input-sm input-xs']")
	public WebElement searchbox_clientpg;

	@FindBy(xpath = "(//button[@class='btn btn-default btn-xs btn-primary dropdown-toggle'])[1]")
	WebElement actionsicon_clientpg;

	@FindBy(xpath = "//table[@id='dynamic-table']")
	public WebElement table_clientpg;

	@FindBy(xpath = "(//table[@id='dynamic-table']//td[2])[1]")
	public WebElement table_cell2;

	@FindBy(xpath = "//table[@id='dynamic-table']//td[1]")
	public WebElement table_cell;

	@FindBy(xpath = "//input[@id='name1']")
	public WebElement clientnamefld;

	@FindBy(xpath = "//input[@id='company1']")
	WebElement companynamefld;

	@FindBy(xpath = "//input[@id='autocomplete']")
	WebElement geolocfld;

	@FindBy(xpath = "//input[@id='route']")
	public WebElement addressfld;

	@FindBy(xpath = "//input[@id='locality']")
	WebElement cityfld;

	@FindBy(xpath = "//input[@id='postal_code']")
	WebElement postlcodfld;

	@FindBy(xpath = "//input[@id='telephone']")
	WebElement telphnfld;

	@FindBy(xpath = "//input[@id='email1']")
	WebElement emailfld;

	@FindBy(xpath = "//input[@id='vat1']")
	public WebElement vatfld;

	@FindBy(xpath = "//input[@id='cf1']")
	WebElement ssnfld;

	@FindBy(xpath = "//span[text()='Browse']")
	public WebElement browsebtn;

	@FindBy(xpath = "//textarea[@id='comment1']")
	WebElement commentfld;

	@FindBy(xpath = "//button[@id='submit'] ")
	WebElement addclientsubmtbtn_clientpg;

	@FindBy(xpath = "(//button[@class='pull-left btn btn-default'])[2]")
	WebElement gobckbtn_clientpg;

	@FindBy(xpath = "(//button[@data-dismiss='modal'])[7]")
	public WebElement closebtn_clientpg;

	@FindBy(xpath = "(//table[@class='display compact table table-bordered table-striped dataTable']//th[2])[1]")
	WebElement clientname_clienttbl;

	@FindBy(xpath = "(//table[@class='display compact table table-bordered table-striped dataTable']//th[3])[1]")
	WebElement cmpnyname_clienttbl;

	@FindBy(xpath = "(//table[@class='display compact table table-bordered table-striped dataTable']//th[4])[1]")
	WebElement address_clienttbl;

	@FindBy(xpath = "(//table[@class='display compact table table-bordered table-striped dataTable']//th[5])[1]")
	WebElement email_clienttbl;

	@FindBy(xpath = "(//table[@class='display compact table table-bordered table-striped dataTable']//th[6])[1]")
	WebElement telphn_clienttbl;

	@FindBy(xpath = "(//table[@class='display compact table table-bordered table-striped dataTable']//th[7])[1]")
	WebElement actions_clienttbl;

	@FindBy(xpath = "(//button[@class='btn btn-default btn-xs btn-primary dropdown-toggle'])[1]")
	WebElement actiondrpdwn_clienttbl;

	@FindBy(xpath = "(//a[@class='view_client'])[1]")
	WebElement viewclient_option;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	public WebElement gobckbtn_viewclintpg;

	@FindBy(xpath = "//button[@id='modify_client']")
	public WebElement mdfybtn_viewclintpg;

	@FindBy(xpath = "//button[@id='delete_client']")
	public WebElement deletebtn_viewclintpg;

	@FindBy(xpath = "//button[@id='submit'] ")
	WebElement savechangebtn;

	@FindBy(xpath = "(//button[@class='btn btn-primary'])[4]")
	public WebElement deletecnfrmbtn;

	@FindBy(xpath = "(//a[text()=' View Client Repairs'])[1]")
	WebElement viewclntrepiroptn;

	@FindBy(xpath = "(//a[@id='view_image'])[1]")
	WebElement viewimageoptn;

	@FindBy(xpath = "//button[@class='bootbox-close-button close']")
	public WebElement viewimageclosebtn;

	@FindBy(xpath = "(//a[@id='modify_client'])[1]")
	WebElement editclientoptn;

	@FindBy(xpath = "(//a[@id='delete_client'])[1]")
	WebElement deleteclientoptn;

	@FindBy(xpath = "//button[@class='btn btn-default']")
	WebElement deleteclientcnclbtn;

	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[3]")
	public WebElement chckbx1;

	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[4]")
	public WebElement chckbx2;

	@FindBy(xpath = "(//ins[@class='iCheck-helper'])[5]")
	public WebElement chckbx3;

	@FindBy(xpath = "//a[@class='dropdown-toggle btn-round btn btn-default']")
	WebElement rightcrnractionsbtn;

	@FindBy(xpath = "//a[@class='bpo']")
	WebElement deleteselectedoptn;

	@FindBy(xpath = "//button[@class='btn-icon btn btn-danger']")
	WebElement ysimsurebtn;

	@FindBy(xpath = "//div[@class='alert alert-success']")
	public WebElement removlsuccesspopup;

	@FindBy(xpath = "//span[@id='v_city']")
	public WebElement cityfldinviwclnt;

	@FindBy(xpath = "//span[@id='v_postal_code']")
	public WebElement postlcdinviwclnt;

	@FindBy(xpath = "//span[@id='v_telephone']")
	public WebElement telphninviwclnt;

	@FindBy(xpath = "//span[@id='v_email']")
	public WebElement emailfldinviwclnt;

	public CustomersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isAddClientTabDisplayed() {
		boolean flag = webaction.isElementEnable(driver, add_client_tab);

		return flag;
	}

	public void clickOnAddClientTab() {

		webaction.clickOnTheElement(driver, add_client_tab);

	}

	public boolean isShowDrpDwnInClintPgDisplayed() {
		boolean flag = webaction.isElementEnable(driver, show_dropdwn_clientpg);

		return flag;
	}

	public void toSelectTheValueFromShowDropdwn(String text) {

		generic.selectOPtionByVisibleTextFromDropDown(driver, show_dropdwn_clientpg, text);

	}

	public boolean isAdChangeColumnsTabDisplayed() {
		boolean flag = webaction.isElementEnable(driver, changecolmns_clientpg);

		return flag;
	}

	public void clickOnChangeColumnTab() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, changecolmns_clientpg);
		webaction.clickOnTheElement(driver, changecolmns_clientpg);

	}

	public boolean isChangeColumnsPopUpDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, changecolmnspopup);

		return flag;
	}

	public boolean isSearchBxInClntPgDisplayed() {
		boolean flag = webaction.isElementEnable(driver, searchbox_clientpg);

		return flag;
	}

	public void enterValueToSearchBox(String text) {

		webaction.enterTheValue(driver, searchbox_clientpg, text);

	}

	public void clearTheValueInSearchBox() {

		webaction.clearTheElement(driver, searchbox_clientpg);

	}

	public void searchName(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, searchbox_clientpg);
		clearTheValueInSearchBox();
		enterValueToSearchBox(text);
		wait.toApplyWaitTillTextToBePresentInElement(driver, 9, table_cell2, text);

	}

	public void searchAddress(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, searchbox_clientpg);
		clearTheValueInSearchBox();
		enterValueToSearchBox(text);
		wait.toApplyWaitTillTextToBePresentInElement(driver, 9, addresscell, text);

	}

	public boolean isActionsIconInClntPgDisplayed() {
		boolean flag = webaction.isElementEnable(driver, actionsicon_clientpg);

		return flag;
	}

	public boolean isTableInClntPgDisplayed() {
		boolean flag = webaction.isElementEnable(driver, table_clientpg);

		return flag;
	}

	public boolean isClientNameFieldInAddClientDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, clientnamefld);
		boolean flag = webaction.isElementDisplayed(driver, clientnamefld);

		return flag;
	}

	public void enterClientName(String text) {

		webaction.enterTheValue(driver, clientnamefld, text);

	}

	public boolean isCompanyNameFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, companynamefld);

		return flag;
	}

	public void enterCompanyName(String text) {

		webaction.enterTheValue(driver, companynamefld, text);

	}

	public boolean isGeoLocationFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, geolocfld);

		return flag;
	}

	public void enterGeoLoc(String text) {

		webaction.enterTheValue(driver, geolocfld, text);

	}

	public boolean isAddressFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addressfld);

		return flag;
	}

	public void enterAddress(String text) {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, addressfld);
		webaction.clearTheElement(driver, addressfld);
		webaction.enterTheValue(driver, addressfld, text);

	}

	public void clearTheAddressField() {

		webaction.clearTheElement(driver, addressfld);

	}

	public boolean isCityFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, cityfld);

		return flag;
	}

	public void enterCity(String text) {
		webaction.clearTheElement(driver, cityfld);

		webaction.enterTheValue(driver, cityfld, text);

	}

	public void clearTheCityField() {

		webaction.clearTheElement(driver, cityfld);
	}

	public String toGetTheTextFromCityField() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, cityfldinviwclnt);

		String text = webaction.getTheElementText(driver, cityfldinviwclnt);
		return text;
	}

	public boolean isPostalCodeFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, postlcodfld);

		return flag;
	}

	public void enterPostalCode(String text) {
		webaction.clearTheElement(driver, postlcodfld);

		webaction.enterTheValue(driver, postlcodfld, text);

	}

	public void clearThePostalCodeField() {

		webaction.clearTheElement(driver, postlcodfld);

	}

	public String toGetTheTextFromPostalCodeField() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, postlcdinviwclnt);

		String text = webaction.getTheElementText(driver, postlcdinviwclnt);
		return text;
	}

	public boolean isTelPhnFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, telphnfld);

		return flag;
	}

	public void enterTelPhnNmbr(String text) {
		webaction.clearTheElement(driver, telphnfld);

		webaction.enterTheValue(driver, telphnfld, text);

	}

	public void clearTheTelPhnNmbrField() {

		webaction.clearTheElement(driver, telphnfld);

	}

	public String toGetTheTextFromTelPhnField() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, telphninviwclnt);

		String text = webaction.getTheElementText(driver, telphninviwclnt);
		return text;
	}

	public boolean isEmailFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, emailfld);

		return flag;
	}

	public void enterEmail(String text) {
		webaction.clearTheElement(driver, emailfld);

		webaction.enterTheValue(driver, emailfld, text);

	}

	public void clearEmailField() {

		webaction.clearTheElement(driver, emailfld);
	}

	public String toGetTheTextFromEmailField() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, emailfldinviwclnt);
		String text = webaction.getTheElementText(driver, emailfldinviwclnt);
		return text;
	}

	public boolean isVatFieldInAddClientDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 10, vatfld);
		boolean flag = webaction.isElementDisplayed(driver, vatfld);

		return flag;
	}

	public void enterVatNmbr(String text) {

		webaction.enterTheValue(driver, vatfld, text);

	}

	public boolean isSsnFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, ssnfld);

		return flag;
	}

	public void enterSsn(String text) {

		webaction.enterTheValue(driver, ssnfld, text);

	}

	public boolean isBrowsebtnInAddClientDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 10, browsebtn);
		boolean flag = webaction.isElementDisplayed(driver, browsebtn);

		return flag;
	}

	public boolean isCommentFieldInAddClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, commentfld);

		return flag;
	}

	public void enterTheTextInComment(String text) {

		webaction.enterTheValue(driver, commentfld, text);

	}

	public boolean isAddClientSubmtBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addclientsubmtbtn_clientpg);

		return flag;
	}

	public void clickOnAddClientSubmtBtn() {

		webaction.clickOnTheElement(driver, addclientsubmtbtn_clientpg);
		brwsr.navigateBack(driver);
		brwsr.navigateToNextPage(driver);

	}

	public boolean isAddClientGoBcktBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, gobckbtn_clientpg);

		return flag;
	}

	public boolean isAddClientClosetBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, closebtn_clientpg);

		return flag;
	}

	public void clickOnAddClientCloseBtn() {

		webaction.clickOnTheElement(driver, closebtn_clientpg);

	}

	public boolean isActionsInClintTableDisplayed() {
		boolean flag = webaction.isElementEnable(driver, actions_clienttbl);

		return flag;
	}

	public boolean isTelephnInClintTableDisplayed() {
		boolean flag = webaction.isElementEnable(driver, telphn_clienttbl);

		return flag;
	}

	public String getTheTextFromTphnField() {
		String text = webaction.getTheElementText(driver, telphn_clienttbl);

		return text;
	}

	public boolean isClientNameInClintTableDisplayed() {
		boolean flag = webaction.isElementEnable(driver, clientname_clienttbl);

		return flag;
	}

	public boolean isEmailInClintTableDisplayed() {
		boolean flag = webaction.isElementEnable(driver, email_clienttbl);

		return flag;

	}

	public String togetTheTextFromEmailFieldInTable() {

		String text = webaction.getTheElementText(driver, email_clienttbl);
		return text;
	}

	public void clickOnTheEmailTabInPopUp() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, emailtabinpopup);

		webaction.clickOnTheElement(driver, emailtabinpopup);
		brwsr.navigateBack(driver);
		brwsr.navigateToNextPage(driver);
	}

	public void clickOnTheTelPhnTabInPopUp() {

		webaction.clickOnTheElement(driver, tphntabinpopup);

	}

	public String getTheTextFromEmailField() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, table_clientpg);
		String text = webaction.getTheElementText(driver, email_clienttbl);

		return text;
	}

	public boolean isAddressInClintTableDisplayed() {
		boolean flag = webaction.isElementEnable(driver, address_clienttbl);

		return flag;
	}

	public boolean isCompanyNameInClintTableDisplayed() {
		boolean flag = webaction.isElementEnable(driver, cmpnyname_clienttbl);

		return flag;
	}

	public void clickOnTheActionDrpDwnInTbl() {

		webaction.clickOnTheElement(driver, actiondrpdwn_clienttbl);
	}

	public boolean isViewClientOptionDisplayed() {
		boolean flag = webaction.isElementEnable(driver, viewclient_option);

		return flag;
	}

	public void clickOnViewClientOption() {

		webaction.clickOnTheElement(driver, viewclient_option);
	}

	public boolean isGoBckBtnInViewClientOptionDisplayed() {
		boolean flag = webaction.isElementEnable(driver, gobckbtn_viewclintpg);

		return flag;
	}

	public void clickOnGoBckBtnInViewClientPg() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, gobckbtn_viewclintpg);

		webaction.clickOnTheElement(driver, gobckbtn_viewclintpg);
	}

	public boolean isModfyBtnInViewClientOptionDisplayed() {
		boolean flag = webaction.isElementEnable(driver, mdfybtn_viewclintpg);

		return flag;
	}

	public void clickOnModifyBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, mdfybtn_viewclintpg);
		webaction.clickOnTheElement(driver, mdfybtn_viewclintpg);
	}

	public boolean isDeleteBtnInViewClientOptionDisplayed() {
		boolean flag = webaction.isElementEnable(driver, deletebtn_viewclintpg);

		return flag;
	}

	public void clickOnDeleteBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, deletebtn_viewclintpg);
		webaction.clickOnTheElement(driver, deletebtn_viewclintpg);
	}

	public boolean isSaveChangeBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, savechangebtn);

		return flag;
	}

	public void clickOnSaveChangeBtnBtn() {

		webaction.clickOnTheElement(driver, savechangebtn);
		backWrd();
		forWrd();
	}

	public boolean isDeleteBtnConfirmDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, deletecnfrmbtn);
		boolean flag = webaction.isElementDisplayed(driver, deletecnfrmbtn);

		return flag;
	}

	public void clickOnDeleteCnfrmBtn() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 8, deletecnfrmbtn);
		webaction.clickOnTheElement(driver, deletecnfrmbtn);
	}

	public boolean isViewClientRepairsOptnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, viewclntrepiroptn);

		return flag;
	}

	public boolean isViewImageOptnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, viewimageoptn);

		return flag;
	}

	public void clickOnViewImageOption() {

		webaction.clickOnTheElement(driver, viewimageoptn);
	}

	public boolean isViewImageCloseBtnDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 7, viewimageclosebtn);
		boolean flag = webaction.isElementDisplayed(driver, viewimageclosebtn);

		return flag;
	}

	public void clickOnViewImageCloseBtn() {

		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 7, viewimageclosebtn);

		webaction.clickOnTheElement(driver, viewimageclosebtn);
	}

	public boolean isEditClientOptionDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, editclientoptn);

		return flag;
	}

	public void clickOnEditClientOption() {

		webaction.clickOnTheElement(driver, editclientoptn);
	}

	public boolean isDeleteClientOptionDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, deleteclientoptn);

		return flag;
	}

	public void clickOnDeleteClientOption() {

		webaction.clickOnTheElement(driver, deleteclientoptn);
	}

	public boolean isDeleteClientCancelBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, deleteclientcnclbtn);

		return flag;
	}

	public void clickOnDeleteClientCancelOption() {

		webaction.clickOnTheElement(driver, deleteclientcnclbtn);
	}

	public void clickOnCheckBox1() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 5, chckbx1);

		webaction.clickOnTheElement(driver, chckbx1);
	}

	public void clickOnCheckBox2() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 5, chckbx2);

		webaction.clickOnTheElement(driver, chckbx2);
	}

	public void clickOnCheckBox3() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 5, chckbx3);
		webaction.clickOnTheElement(driver, chckbx3);
	}

	public boolean isCheckBox1Enabled() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 7, chckbx1);
		boolean flag = webaction.isElementEnable(driver, chckbx1);

		return flag;
	}

	public boolean isCheckBox2Enabled() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 7, chckbx2);
		boolean flag = webaction.isElementEnable(driver, chckbx2);

		return flag;
	}

	public boolean isCheckBox3Enabled() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 7, chckbx3);
		boolean flag = webaction.isElementEnable(driver, chckbx3);

		return flag;
	}

	public boolean isRightCornerActionsBtnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, rightcrnractionsbtn);

		return flag;
	}

	public boolean isRemovlSuccessPopupDisplayed() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 9, removlsuccesspopup);
		boolean flag = webaction.isElementDisplayed(driver, removlsuccesspopup);

		return flag;
	}

	public void clickOnRightCrnrActionBtn() {

		webaction.clickOnTheElement(driver, rightcrnractionsbtn);
	}

	public boolean isDeleteSelectedOptnDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, deleteselectedoptn);

		return flag;
	}

	public void clickOnDeleteSelectedOptn() {

		webaction.clickOnTheElement(driver, deleteselectedoptn);
	}

	public String toGetTheTextFromNameCell() {

		String text = webaction.getTheElementText(driver, table_cell2);
		return text;
	}

	public void clickOnEmailTabInPopUpForAdding() {

		webaction.clickOnTheElement(driver, emailtabinpopup_aftrrmvl);
		brwsr.navigateBack(driver);
		brwsr.navigateToNextPage(driver);
	}

	public String toGetSelectedOptionFromShowDropDown() {

		String option = generic.getFirstSelectedOptionFromDropDown(driver, show_dropdwn_clientpg);
		return option;
	}

	public String toGetTheTextFromAddressCell() {

		String text = webaction.getTheElementText(driver, addresscell);
		return text;
	}

	public void backWrd() {

		brwsr.navigateBack(driver);

	}

	public void forWrd() {

		brwsr.navigateToNextPage(driver);

	}

	public String toGetTheTextFromTableCell() {
		String text = webaction.getTheElementText(driver, table_cell);
		return text;
	}

	public void clickOnYesImSureButton() {

		webaction.clickOnTheElement(driver, ysimsurebtn);
	}

	public void deleteCancelActn(String value) {
		searchName(value);
		clickOnTheActionDrpDwnInTbl();
		clickOnDeleteClientOption();
		clickOnDeleteClientCancelOption();
	}

	public void deleteCnfrmActn(String value) {
		searchName(value);
		clickOnTheActionDrpDwnInTbl();
		clickOnDeleteClientOption();
		clickOnDeleteCnfrmBtn();
	}

}
