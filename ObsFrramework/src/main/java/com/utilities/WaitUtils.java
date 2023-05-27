package com.utilities;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitUtils {

	WebDriverWait wait;

	/**
	 * METHOD TO APPLY IMPLICIT WAIT TO ALL ELEMENTS
	 * 
	 * @param driver
	 * @param sec
	 */
	public void toApplyImplicitWait(WebDriver driver, long sec) {

		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * Explicit wait=Method to wait till element became visible.
	 * 
	 * @param driver
	 * @param sec
	 * @param element
	 */

	public void toApplyExplicitWaitTillElmntIsVisible(WebDriver driver, long sec, WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * Explicit wait- Method to wait till element became clickable.
	 * 
	 * @param driver
	 * @param sec
	 * @param element
	 */
	public void toApplyExplicitWaitTillElmntIsClickable(WebDriver driver, long sec, WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * Explicit wait- Method to wait till element to be in selected state.
	 * 
	 * @param driver
	 * @param sec
	 * @param element
	 */
	public void toApplyWaitTillElmntToBeSelected(WebDriver driver, long sec, WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.elementToBeSelected(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * Explicit wait- Method to wait till the alert is present.
	 * 
	 * @param driver
	 * @param sec
	 */

	public void toApplyWaitTillAlertPresent(WebDriver driver, long sec) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.alertIsPresent());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * Explicit wait- Method to wait all web elements are visible.
	 * 
	 * @param driver
	 * @param sec
	 * @param elements
	 */
	public void toApplyWaitTillAllElementsVisible(WebDriver driver, long sec, List<WebElement> elements) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.visibilityOfAllElements(elements));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	public void toApplyWaitTillTextToBePresentInElement(WebDriver driver, long sec, WebElement element, String text) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	public void waitForTheInVisibilityOfElement(WebDriver driver, long sec, WebElement element) {
		try {
			wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			wait.until(ExpectedConditions.invisibilityOf(element));
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

}
