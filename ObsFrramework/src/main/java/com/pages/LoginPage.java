package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WebActionUtils;

public class LoginPage {
	WebDriver driver;

	WebActionUtils webaction = new WebActionUtils();

	@FindBy(xpath = "//input[@name='identity']")
	WebElement username;

	@FindBy(xpath = "//input[@name='password']")
	WebElement password;

	@FindBy(xpath = "//input[@name='submit']")
	WebElement login;

	@FindBy(xpath = "//ins[@class='iCheck-helper']")
	WebElement rememberme;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgotlink;

	@FindBy(linkText = "Back to home page")
	WebElement bcktohome;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterValueToUserName(String name) {
		webaction.enterTheValue(driver, username, name);

	}

	public void enterValueToPassword(String pwd) {
		webaction.enterTheValue(driver, password, pwd);

	}

	public void clickOnLogin() {
		webaction.clickOnTheElement(driver, login);

	}

	public void clickOnRememberMe() {
		webaction.clickOnTheElement(driver, rememberme);

	}

	public void clickOnForgot() {
		webaction.clickOnTheElement(driver, forgotlink);

	}

	public void clickOnHomeLink() {
		webaction.clickOnTheElement(driver, bcktohome);

	}

	public void performLogin(String username, String password) {
		enterValueToUserName(username);
		enterValueToPassword(password);
		clickOnLogin();

	}

	public HomePage login(String username, String password) {

		enterValueToUserName(username);
		enterValueToPassword(password);
		clickOnLogin();
		return new HomePage(driver);

	}

}
