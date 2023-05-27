package com.utilities;

import org.openqa.selenium.WebDriver;

public class WebBrowserUtils {

	/**
	 * METHOD TO FETCH A WEBPAGE
	 * 
	 * @param driver
	 * @param url
	 */
	public void launchUrl(WebDriver driver, String url) {
		try {
			driver.get(url);

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

	}

	/**
	 * METHOD TO GET PAGE TITLE
	 * 
	 * @param driver
	 * @return
	 */
	public String getWebpageTitle(WebDriver driver) {
		String title = null;
		try {
			title = driver.getTitle();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return title;

	}

	/**
	 * METHOD TO GET THE CURRENT WEB PAGE URL IN STRING FORMAT
	 * 
	 * @param driver
	 * @return
	 */
	public String getCurrentBrowserUrl(WebDriver driver) {
		String currenturl = null;
		try {
			currenturl = driver.getCurrentUrl();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return currenturl;

	}

	/**
	 * 
	 * METHOD TO RETRIVE THE PAGE SOURCE OF THE WEB PAGE
	 * 
	 * @param driver
	 * @return
	 */
	public String getwebPageSourceCode(WebDriver driver) {
		String sourcecode = null;
		try {
			sourcecode = driver.getPageSource();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
		}

		return sourcecode;

	}

	/**
	 * 
	 * METHOD TO NAVIGATE FORWARD BY ONE PAGE
	 * 
	 * @param driver
	 */

	public void navigateToNextPage(WebDriver driver) {

		try {
			driver.navigate().forward();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * METHOD TO LOADS A NEW WEB PAGE
	 * 
	 * @param driver
	 * @param url
	 */

	public void navigateToWebpage(WebDriver driver, String url) {

		try {
			driver.navigate().to(url);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * 
	 * METHOD TO NAVIGATE BACKWARD BY ONE PAGE
	 * 
	 * @param driver
	 */
	public void navigateBack(WebDriver driver) {

		try {
			driver.navigate().back();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * METHOD TO REFRESH/RELOAD THE CURRENT WEBPAGE
	 * 
	 * @param driver
	 */
	public void refreshWebpage(WebDriver driver) {

		try {
			driver.navigate().refresh();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * METHOD TO MAXIMIZE CURRENT WINDOW
	 * 
	 * @param driver
	 */
	public void toMaximizeWindow(WebDriver driver) {

		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * METHOD TO MINIMIZE CURRENT WINDOW
	 * 
	 * @param driver
	 */

	public void toMinimizeWindow(WebDriver driver) {

		try {
			driver.manage().window().minimize();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * 
	 * 
	 * @param driver
	 */
	public void fullscreenView(WebDriver driver) {

		try {
			driver.manage().window().fullscreen();

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * 
	 * METHOD TO TERMINATE THE CURRENT BROWSER WINDOW
	 * 
	 * 
	 * @param driver
	 */
	public void toCloseTheCurrentPage(WebDriver driver) {

		try {
			driver.close();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

	/**
	 * 
	 * METHOD TO TERMINATES ALL TABS AS WELL AS THE BROWSER ITSELF
	 * 
	 * 
	 * @param driver
	 */
	public void quitFormWebpage(WebDriver driver) {

		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());

		}

	}

}
