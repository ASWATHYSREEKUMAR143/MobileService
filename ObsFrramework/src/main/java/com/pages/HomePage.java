package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WaitUtils;
import com.utilities.WebActionUtils;

public class HomePage {

	WebDriver driver;

	WebActionUtils webaction = new WebActionUtils();
	WaitUtils wait = new WaitUtils();

	@FindBy(xpath = "//div[@class='alert alert-success']")
	WebElement sucessfulpopup;

	@FindBy(xpath = "//p[text()='Reparation']")
	WebElement reparation;

	@FindBy(xpath = "(//a[text()='More Info '])[1]")
	WebElement reparationlink;

	@FindBy(xpath = "//p[text()='Client']")
	WebElement client;

	@FindBy(xpath = "(//a[text()='More Info '])[2]")
	WebElement clientlink;

	@FindBy(xpath = "//p[text()='Inventory Products']")
	WebElement inventorypdct;

	@FindBy(xpath = "(//a[text()='More Info '])[3]")
	WebElement inventorypdctlink;

	@FindBy(xpath = "//h3[text()='Revenue Chart']")
	WebElement revenuecharttext;

	@FindBy(xpath = "(//button[@class='btn btn-info btn-sm'])[1]")
	WebElement revenuechartclosebtn;

	@FindBy(xpath = "//div[@id='calendar']")
	WebElement calendar;

	@FindBy(xpath = "//div[@id='stock-chart']")
	WebElement stockchart;
	@FindBy(xpath = "(//button[@class='btn btn-sm'])[1]")
	WebElement stockchartminsbtn;
	@FindBy(xpath = "(//button[@class='btn btn-sm'])[2]")
	WebElement stockchartclosebtn;

	@FindBy(xpath = "//span[@class='label label-danger pull-right']")
	WebElement numofalertbtn;

	@FindBy(xpath = "//a[@class='add_c']")
	WebElement addclientbtn;

	@FindBy(xpath = "(//button[@class='close'])[7]")
	WebElement addclientpopupclosebtn;

	@FindBy(xpath = "//a[@class='add_reparation']")
	WebElement addreparationbtn;

	@FindBy(xpath = "(//button[@class='close'])[2]")
	WebElement addreparationpopupclosebtn;

	@FindBy(xpath = "//a[@data-target='#sendSMSModal']")
	WebElement sendsmsbtn;

	@FindBy(xpath = "(//button[@class='close'])[9]")
	WebElement sendsmspopupclosebtn;

	@FindBy(xpath = "//a[@data-target='#sendEmailModal']")
	WebElement sendemailbtn;

	@FindBy(xpath = "(//button[@class='close'])[10]")
	WebElement sendemailpopupclosebtn;

	@FindBy(xpath = "//form[@id='send_email_form']")
	WebElement quickemail;

	@FindBy(xpath = "//input[@id='emailto_']")
	WebElement emailto;

	@FindBy(xpath = "//input[@id='subject_']")
	WebElement subject;

	@FindBy(xpath = "//textarea[@id='body_']")
	WebElement message;

	@FindBy(xpath = "//button[@form='send_email_form']")
	WebElement emailsendbtn;

	@FindBy(xpath = "//form[@id='send_quicksms']")
	WebElement quicksms;

	@FindBy(xpath = "//input[@id='phone_number']")
	WebElement phonenmbr;

	@FindBy(xpath = "(//textarea[@id='fastsms'])[1]")
	WebElement smstext;

	@FindBy(xpath = "//button[@form='send_quicksms']")
	WebElement smssendbtn;

	@FindBy(xpath = "//b[text()='Service Management']")
	WebElement servicemngmnt;

	@FindBy(xpath = "//a[@class='sidebar-toggle']")
	WebElement sidebartoggle;

	@FindBy(xpath = "//i[@class='fa fa-exclamation-triangle']")
	WebElement alert;

	@FindBy(xpath = "//i[@class='fa fa-plus-circle']")
	WebElement plusicon;

	@FindBy(xpath = "(//span[text()='Joe Jacobs'])[1]")
	WebElement toppanellgdusername;

	@FindBy(xpath = "//a[@class='btn btn-default btn-flat']")
	WebElement signout;

	@FindBy(xpath = "//p[text()='Joe Jacobs']")
	WebElement leftpanellgdusername;

	@FindBy(xpath = "//input[@name='q']")
	WebElement searchreparationtxtbx;

	@FindBy(xpath = "//button[@id='search-btn']")
	WebElement searchreparationsearchbtn;

	@FindBy(xpath = "//li[text()='MAIN NAVIGATION']")
	WebElement mainnavgtn;

	@FindBy(xpath = "//i[@class='fa fa-cog']")
	WebElement settings;
	@FindBy(xpath = "//ul[@class='treeview-menu']")
	WebElement settingsmenuoptions;
	@FindBy(xpath = "(//i[@class='far fa-circle'])[1]")
	WebElement settingsmenuoptionone;

	@FindBy(xpath = "//i[@class='fa fa-home']")
	WebElement homebutton;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isSuccessPopupDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, sucessfulpopup);

		return flag;
	}

	public boolean isReparationDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, reparation);

		return flag;
	}

	public void clickReparationLink() {
		webaction.clickOnTheElement(driver, reparationlink);

	}

	public boolean isClientDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, client);

		return flag;
	}

	public void clickClientLink() {
		webaction.clickOnTheElement(driver, clientlink);

	}

	public boolean isInventoryProductDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, inventorypdct);

		return flag;
	}

	public void clickInventoryProductLink() {
		webaction.clickOnTheElement(driver, inventorypdctlink);

	}

	public boolean isRevenueChartDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, revenuecharttext);

		return flag;
	}

	public void clickOnRevenueChartCloseButton() {
		webaction.clickOnTheElement(driver, revenuechartclosebtn);

	}

	public boolean isCalendarDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, calendar);

		return flag;
	}

	public boolean isStockChartDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, stockchart);

		return flag;
	}

	public void clickOnStockChartMinusButton() {

		webaction.clickOnTheElement(driver, stockchartminsbtn);
	}

	public void clickOnStckChrtCloseButton() {

		webaction.clickOnTheElement(driver, stockchartclosebtn);
	}

	public boolean isQuickEmailDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, quickemail);

		return flag;
	}

	public boolean isEmailToFieldEnabled() {

		boolean flag = webaction.isElementEnable(driver, emailto);
		return flag;
	}

	public void enterValueToEmailTo(String emailid) {
		webaction.enterTheValue(driver, emailto, emailid);

	}

	public boolean isSubjectFieldEnabled() {

		boolean flag = webaction.isElementEnable(driver, subject);
		return flag;

	}

	public void enterTheSubject(String sbjct) {
		webaction.enterTheValue(driver, subject, sbjct);

	}

	public boolean isMessageFieldEnabled() {

		boolean flag = webaction.isElementEnable(driver, message);
		return flag;
	}

	public void enterTheMessage(String msg) {
		webaction.enterTheValue(driver, message, msg);

	}

	public boolean isEmailSendBtnEnabled() {

		boolean flag = webaction.isElementEnable(driver, emailsendbtn);
		return flag;
	}

	public void clickOnTheEmailSendButton()

	{
		webaction.clickOnTheElement(driver, emailsendbtn);
	}

	public boolean isQuickSmsDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, quicksms);

		return flag;

	}

	public boolean isPhoneNmbrFieldEnabled() {

		boolean flag = webaction.isElementDisplayed(driver, phonenmbr);

		return flag;

	}

	public void enterThePhoneNumber(String value) {

		webaction.enterTheValue(driver, phonenmbr, value);
		;

	}

	public boolean isSmsFieldEnabled() {

		boolean flag = webaction.isElementDisplayed(driver, smstext);

		return flag;

	}

	public void enterTheSms(String sms) {
		webaction.enterTheValue(driver, smstext, sms);

	}

	public boolean isSmsSendBtnEnabled() {

		boolean flag = webaction.isElementDisplayed(driver, smssendbtn);

		return flag;

	}

	public void clickOnTheSmsSendButton()

	{
		webaction.clickOnTheElement(driver, smssendbtn);
	}

	public boolean isServiceManagementDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, servicemngmnt);

		return flag;

	}

	public boolean isSideBarToggleDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, sidebartoggle);
		return flag;
	}

	public void clickOnTheSideBarToggle()

	{
		webaction.clickOnTheElement(driver, sidebartoggle);
	}

	public boolean isAlertIconDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, alert);
		return flag;
	}

	public void clickOnTheAlertIcon()

	{
		webaction.clickOnTheElement(driver, alert);
	}

	public boolean isNumberOfAlertDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, numofalertbtn);

		return flag;

	}

	public void clickOnTheNumOfAlrtBtn() {
		webaction.clickOnTheElement(driver, numofalertbtn);
	}

	public boolean isPlusIconDisplayed()

	{
		boolean flag = webaction.isElementDisplayed(driver, plusicon);
		return flag;
	}

	public void clickOnThePlusIcon()

	{
		webaction.clickOnTheElement(driver, plusicon);
	}

	public boolean isAddClientButtonDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addclientbtn);
		return flag;
	}

	public void clickOnAddClientBtn() {
		webaction.clickOnTheElement(driver, addclientbtn);
	}

	public void clickOnTheAddClientCloseBtn() {
		webaction.clickOnTheElement(driver, addclientpopupclosebtn);
	}

	public boolean isAddReparationButtonDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, addreparationbtn);
		return flag;
	}

	public void clickOnAddReparationBtn() {
		webaction.clickOnTheElement(driver, addreparationbtn);
	}

	public void clickOnTheAddReparationCloseBtn() {
		webaction.clickOnTheElement(driver, addreparationpopupclosebtn);
	}

	public boolean isSendSmsButtonDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, sendsmsbtn);
		return flag;
	}

	public void clickOnSendSmsBtn() {
		webaction.clickOnTheElement(driver, sendsmsbtn);
	}

	public void clickOnSendSmsCloseBtn() {
		webaction.clickOnTheElement(driver, sendsmspopupclosebtn);
	}

	public boolean isSendEmailButtonDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, sendemailbtn);
		return flag;
	}

	public void clickOnSendEmailBtn() {
		webaction.clickOnTheElement(driver, sendemailbtn);
	}

	public void clickOnSendEmailCloseBtn() {
		webaction.clickOnTheElement(driver, sendemailpopupclosebtn);
	}

	public boolean isLoggedUserNameDisplayedOnTopPanel() {
		boolean flag = webaction.isElementDisplayed(driver, toppanellgdusername);
		return flag;
	}

	public void clickOnTopPanelLoggedUserName() {
		webaction.clickOnTheElement(driver, toppanellgdusername);
	}

	public void clickOnSignout() {
		webaction.clickOnTheElement(driver, signout);
	}

	public boolean isLoggedUserNameDisplayedOnLeftPanel() {
		boolean flag = webaction.isElementDisplayed(driver, leftpanellgdusername);
		return flag;
	}

	public boolean isSearchReparationDisplayed()

	{
		boolean flag = webaction.isElementDisplayed(driver, searchreparationtxtbx);
		return flag;
	}

	public void clickOnTheSearchReparationSearchBtn()

	{
		webaction.clickOnTheElement(driver, searchreparationsearchbtn);
	}

	public boolean isMainNavigationDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, mainnavgtn);
		return flag;
	}

	public boolean isSettingsDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, settings);
		return flag;
	}

	public void clickOnTheSettings()

	{
		webaction.clickOnTheElement(driver, settings);
	}

	public Boolean isSettingsOptionsDisplayed() {
		return webaction.isElementDisplayed(driver, settingsmenuoptions);
	}

	public void toClickOnSettingsOptionOne() {
		webaction.clickOnTheElement(driver, settingsmenuoptionone);
	}

	public boolean isHomeButtonDisplayed() {
		boolean flag = webaction.isElementDisplayed(driver, homebutton);
		return flag;
	}

	public void clickOnTheHomeButton()

	{
		webaction.clickOnTheElement(driver, homebutton);
	}

	public QuantityAlertPage quantityalert(){

		clickOnTheAlertIcon();
		clickOnTheNumOfAlrtBtn();
		return new QuantityAlertPage(driver);

	}

	public OrderAndReparationPage navigateToOrderAndReparation() {
		clickReparationLink();
		return new OrderAndReparationPage(driver);
	}

	public CustomersPage navigateToClientPage() {
		clickClientLink();
		return new CustomersPage(driver);
	}

	public void toLogOut() {
		wait.toApplyExplicitWaitTillElmntIsVisible(driver, 17, toppanellgdusername);
		clickOnTopPanelLoggedUserName();
		clickOnSignout();

	}

	public InventoryPage navigateToInventoryPage() {

		clickInventoryProductLink();

		return new InventoryPage(driver);
	}
}
