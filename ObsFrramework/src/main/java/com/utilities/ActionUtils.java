package com.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActionUtils {
	Actions action;
	JavascriptExecutor js;
	Robot robot;

	/**
	 * METHOD TO CLICK AN ELEMENT USING ACTIONS CLASS
	 * 
	 * @param driver
	 * @param element
	 */
	public void toClick(WebDriver driver, WebElement element) {

		try {
			action = new Actions(driver);

			action.click(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * METHOD TO MOUSE HOVER AN ELEMENT USING ACTIONS CLASS
	 * 
	 * @param driver
	 * @param element
	 */
	public void MouseHoverToAnElement(WebDriver driver, WebElement element) {

		try {
			action = new Actions(driver);

			action.moveToElement(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * METHOD TO PERFORM RIGHT CLICK ON A ELEMENT
	 * 
	 * @param driver
	 * @param element
	 */
	public void toRightClick(WebDriver driver, WebElement element) {

		try {
			action = new Actions(driver);

			action.contextClick(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * 
	 * METHOD TO PERFORM DOUBLE CLICK ON A ELEMENT
	 * 
	 * @param driver
	 * @param element
	 */
	public void toDoubleClick(WebDriver driver, WebElement element) {

		try {
			action = new Actions(driver);

			action.doubleClick(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * METHOD TO CLICK AT THE CURRENT MOUSE LOCATION WITHOUT RELEASING
	 * 
	 * @param driver
	 * @param element
	 */
	public void toClickAndHold(WebDriver driver, WebElement element) {

		try {
			action = new Actions(driver);

			action.clickAndHold(element).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * 
	 * METHOD TO DRAG AN ELEMENT FROM SOURCE AND DROP IT IN TO THE TARGET LOCATION
	 * 
	 * @param driver
	 * @param source
	 * @param target
	 */
	public void toDragAndDrop(WebDriver driver, WebElement source, WebElement target) {

		try {
			action = new Actions(driver);

			action.dragAndDrop(source, target).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * 
	 * MOUSE HOVER BY X,Y COORDINATES
	 * 
	 * @param driver
	 * @param x
	 * @param y
	 */
	public void mouseHoverByOffset(WebDriver driver, int x, int y) {

		try {
			action = new Actions(driver);

			action.moveByOffset(x, y).build().perform();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * 
	 * METHOD TO CLICK ON AN ELEMENT USING JAVA SCRIPT EXECUTOR
	 * 
	 * @param driver
	 * @param element
	 */
	public void toClickUsingJvscr(WebDriver driver, WebElement element) {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * METHOD TO SCROLL UP AND DOWN IN A WEB PAGE TO USING JAVA SCRIPT EXECUTOR
	 * 
	 * TO SCROLL DOWN= POSITIVE VALUE FOR PIXEL TO SCROLL UP= NEGATIVE VALUE FOR
	 * PIXEL
	 * 
	 * @param driver
	 * @param pixl
	 */
	public void toScrollUpAndDownJvscr(WebDriver driver, int pixel) {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,pixel)");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * METHOD TO SEND A TEXT TO ANY WEB ELEMENT USING JAVA SCRIPT EXECUTOR
	 * 
	 * @param driver
	 * @param elementid
	 * @param text
	 */
	public void toSendValueJvscr(WebDriver driver, String elementid, String text) {
		try {
			js = (JavascriptExecutor) driver;
			js.executeScript("document.getElementById('elementid').value='text';");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * 
	 * METHOD TO GET THE TITLE WEBPAGE USING JAVA SCRIPT EXECUTOR
	 * 
	 * @param driver
	 * @return
	 */

	public String toGetTitleUsingJvscr(WebDriver driver) {
		String title = null;
		try {
			js = (JavascriptExecutor) driver;
			title = js.executeScript("return document.title;").toString();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return title;

	}

	public void toUploadFileUsingRobot(WebDriver driver, String path) throws AWTException {

		Robot robot = new Robot();
		StringSelection selection = new StringSelection(path);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
