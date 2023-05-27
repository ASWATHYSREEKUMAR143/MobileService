package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utilities.WebActionUtils;

public class QuantityAlertPage {

	WebDriver driver;

	WebActionUtils webaction = new WebActionUtils();

	@FindBy(xpath = "//select[@class='form-control input-sm select input-xs']")
	WebElement showdropdown;

	@FindBy(xpath = "//input[@class='form-control input-sm input-xs']")
	WebElement searchbox;

	@FindBy(xpath = "//table[@class='display compact table table-bordered table-striped dataTable']")
	WebElement table;

	@FindBy(xpath = "//div[@id='dynamic-table_paginate']")
	WebElement pagination;

	@FindBy(xpath = "//table[@id='dynamic-table']//th[1]")
	WebElement productname;

	@FindBy(xpath = "//table[@id='dynamic-table']//th[2]")
	WebElement productcode;

	@FindBy(xpath = "//table[@id='dynamic-table']//th[3]")
	WebElement quantity;

	@FindBy(xpath = "//table[@id='dynamic-table']//th[4]")
	WebElement alertquantity;

	public QuantityAlertPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public boolean isShowDropdownDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, showdropdown);

		return flag;

	}

	public boolean isTableDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, table);
		return flag;

	}

	public boolean isSearchBoxDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, searchbox);

		return flag;
	}

	public boolean isPaginationDisplayed() {

		boolean flag = webaction.isElementDisplayed(driver, pagination);
		return flag;

	}

	public boolean isProductNameDisplayedInTable() {

		boolean flag = webaction.isElementDisplayed(driver, productname);
		return flag;

	}

	public boolean isProductCodeDisplayedInTable() {

		boolean flag = webaction.isElementDisplayed(driver, productcode);
		return flag;

	}

	public boolean isQuantityDisplayedInTable() {

		boolean flag = webaction.isElementDisplayed(driver, quantity);
		return flag;

	}

	public boolean isAlertQuantityDisplayedInTable() {

		boolean flag = webaction.isElementDisplayed(driver, alertquantity);
		return flag;

	}

}
