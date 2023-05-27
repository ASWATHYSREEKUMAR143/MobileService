package com.utilities;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebActionUtils {
	WebDriver driver;
	WebElement element;

	/**
	 * METHOD TO ENTER THE VALUE AUTOMATICALLY INTO AN EDITABLE FIELD
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void enterTheValue(WebDriver driver, WebElement element, String value) {
		try {
			element.sendKeys(value);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void enterTheIntegerValue(WebDriver driver, WebElement element, int value) {
		try {
			element.sendKeys(String.valueOf(value));

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * THIS METHOD SIMULATES THE CLICKING OF ANY ELEMENT
	 * 
	 * @param driver
	 * @param element
	 */
	public void clickOnTheElement(WebDriver driver, WebElement element) {
		try {
			element.click();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * METHOD TO CLEAR THE VALUE IN THE TEXT ENTRY ELEMENT
	 * 
	 * 
	 * @param driver
	 * @param element
	 */
	public void clearTheElement(WebDriver driver, WebElement element) {
		try {
			element.clear();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * METHOD SAME AS CLICK
	 * 
	 * USEFUL FOR ELEMENTS WITHIN A FORM
	 * 
	 * @param driver
	 * @param element
	 */

	public void submitTheElement(WebDriver driver, WebElement element) {
		try {
			element.submit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * 
	 * METHOD TO DETERMINE WHETHER OR NOT THIS ELEMENT IS SELECTED OR NOT
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */

	public Boolean isElementSelected(WebDriver driver, WebElement element) {
		Boolean flag = false;
		try {
			flag = element.isSelected();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}

	/**
	 * METHOD TO DETERMINE WHETHER THE ELEMENT CURRENTLY IS ENABLED OR NOT
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */

	public Boolean isElementEnable(WebDriver driver, WebElement element) {
		Boolean flag = false;
		try {
			flag = element.isEnabled();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}

	/**
	 * METHOD TO DETERMINE IF AN ELEMENT IS CURRENTLY BEING DISPLAYED OR NOT
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */
	public Boolean isElementDisplayed(WebDriver driver, WebElement element) {
		Boolean flag = false;
		try {
			flag = element.isDisplayed();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}

	/**
	 * 
	 * METHOD TO FETCH THE VISIBLE TEXT OF THE ELEMENT
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */

	public String getTheElementText(WebDriver driver, WebElement element) {
		String value = null;

		try {
			value = element.getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}

	/**
	 * METHOD TO GET THE TAG NAME OF THE ELEMENT
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */

	public String getTheElementTagName(WebDriver driver, WebElement element) {
		String value = null;
		try {
			value = element.getTagName();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}

	/**
	 * METHOD TO GET THE VALUE OF THE GIVEN ATTIRIBUTE OF THE ELEMENT
	 * 
	 * @param driver
	 * @param element
	 * @param attribute
	 * @return
	 */

	public String getTheElementAttribute(WebDriver driver, WebElement element, String attribute) {
		String value = null;
		try {
			value = element.getAttribute(attribute);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}

	/**
	 * METHOD TO FETCH CSS PROPERTY VALUE OF THE ELEMENT
	 * 
	 * @param driver
	 * @param element
	 * @param property
	 * @return
	 */
	public String getTheElementCssValue(WebDriver driver, WebElement element, String property) {
		String value = null;
		try {
			value = element.getCssValue(property);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return value;
	}

	/**
	 * Method to get the width and height of the Web Element
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */
	public Dimension getTheElementSize(WebDriver driver, WebElement element) {
		Dimension size = null;
		try {
			size = element.getSize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return size;
	}

	/**
	 * Method to get the location of a web element.
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */
	public Point getTheElementLocation(WebDriver driver, WebElement element) {
		Point location = null;
		try {
			location = element.getLocation();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return location;
	}

}