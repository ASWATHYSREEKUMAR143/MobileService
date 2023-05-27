package com.utilities;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils {

	Select select;

	/**
	 * METHOD TO SELECT AN OPTION FROM DROP DOWN BY INDEX
	 * 
	 * @param driver
	 * @param element
	 * @param index
	 */
	public void selectOPtionByIndexFromDropDown(WebDriver driver, WebElement element, int index) {
		try {
			select = new Select(element);

			select.selectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * 
	 * METHOD TO SELECT OPTION FROM DROP DOWN BY VALUE
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void selectOPtionByValueFromDropDown(WebDriver driver, WebElement element, String value) {
		try {
			select = new Select(element);

			select.selectByValue(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * METHOD TO SELECT OPTION FROM DROP DOWN BY VISIBLE TEXT
	 * 
	 * @param driver
	 * @param element
	 * @param text
	 */
	public void selectOPtionByVisibleTextFromDropDown(WebDriver driver, WebElement element, String text) {
		try {
			select = new Select(element);

			select.selectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * METHOD TO DESELECT OPTION FROM DROP DOWN BY INDEX
	 * 
	 * @param driver
	 * @param element
	 * @param index
	 */
	public void deSelectOPtionByIndexFromDropDown(WebDriver driver, WebElement element, int index) {
		try {
			select = new Select(element);

			select.deselectByIndex(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * METHOD TO DESELECT OPTION FROM DROP DOWN BY VALUE
	 * 
	 * @param driver
	 * @param element
	 * @param value
	 */
	public void deSelectOPtionByValueFromDropDown(WebDriver driver, WebElement element, String value) {
		try {
			select = new Select(element);

			select.deselectByValue(value);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * 
	 * METHOD TO SELECT OPTION FROM DROP DOWN BY VISIBLE TEXT
	 * 
	 * @param driver
	 * @param element
	 * @param text
	 */
	public void deSelectOPtionByVisibleTextFromDropDown(WebDriver driver, WebElement element, String text) {
		try {
			select = new Select(element);

			select.deselectByVisibleText(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * 
	 * METHOD TO DESELECT ALL OPTIONS FROM DROP DOWN
	 * 
	 * @param driver
	 * @param element
	 */

	public void deSelectAllOptions(WebDriver driver, WebElement element) {
		try {
			select = new Select(element);

			select.deselectAll();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	/**
	 * 
	 * METHOD TO CHECK WHETHER THE DROPDOWN ALLOW MULTIPLE SELECTION
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */
	public boolean isMultipleSelectionPossible(WebDriver driver, WebElement element) {
		boolean flag = false;
		try {
			select = new Select(element);

			flag = select.isMultiple();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return flag;
	}

	/**
	 * METHOD TO GET THE FIRST SELECTED OPTION FROM DROPDOWN
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */

	public String getFirstSelectedOptionFromDropDown(WebDriver driver, WebElement element) {
		String option = null;

		try {
			select = new Select(element);
			option = select.getFirstSelectedOption().getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return option;

	}

	/**
	 * METHOD TO GET ALL THE OPTIONS FROM THE DROPDOWN ALLOW
	 * 
	 * @param driver
	 * @param element
	 * @return
	 */

	public List<WebElement> getOptionsFromDropDown(WebDriver driver, WebElement element) {
		List<WebElement> options = null;

		try {
			select = new Select(element);
			options = select.getOptions();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return options;

	}

	public void toAcceptAnAlert(WebDriver driver) {
		try {
			driver.switchTo().alert().accept();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	public void toDismissAnAlert(WebDriver driver) {
		try {
			driver.switchTo().alert().dismiss();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public String toGetAlertText(WebDriver driver) {
		String message = null;

		try {
			message = driver.switchTo().alert().getText();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
		return message;

	}

	public void enterValueToAlertBox(WebDriver driver, String text) {
		try {
			driver.switchTo().alert().sendKeys(text);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void toSwitchFrameByIndex(WebDriver driver, int index) {
		try {
			driver.switchTo().frame(index);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void toSwitchFrameByNameOrId(WebDriver driver, String name_or_id) {
		try {
			driver.switchTo().frame(name_or_id);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void toSwitchFrameByWebElement(WebDriver driver, WebElement element) {
		try {
			driver.switchTo().frame(element);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void toSwitchBackWindow(WebDriver driver) {
		try {
			driver.switchTo().defaultContent();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}
	}

	public void toHandleWindow(WebDriver driver) {

		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		for (String temp : child) {
			if (!temp.equals(parent)) {
			}

		}
		driver.switchTo().window(parent);

	}

	/**
	 * METHOD TO TAKE SCREEN SHOT
	 * 
	 * @param driver
	 * @param path
	 * @param filename
	 * @throws IOException
	 */
	public void toCaptureScreenshot(WebDriver driver, String path, String filename) throws IOException {
		try {
			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(src, new File(path + filename + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * METHOD TO GENERATE ALPHA NUMERIC DATAS RANDOMLY
	 * 
	 * @param limit
	 * @return
	 */
	public String generateAlphaNumericData(int limit) {
		String random = RandomStringUtils.randomAlphanumeric(limit);
		return random;
	}

	/**
	 * 
	 * METHOD TO GENERATE NUMERICAL DTAS RANDOMLY
	 * 
	 * @param limit
	 * @return
	 */
	public String generateNumericData(int limit) {
		String random = RandomStringUtils.randomNumeric(limit);
		return random;
	}

	/**
	 * METHOD TO GENERATE ALPHABETIC DATAS RANDOMLY
	 * 
	 * @param limit
	 * @return
	 */
	public String generateAlphabeticData(int limit) {
		String random = RandomStringUtils.randomAlphabetic(limit);
		return random;
	}

}
