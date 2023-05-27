package com.base;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.constants.AutomationConstants;
import com.pages.LoginPage;
import com.utilities.PropertyUtils;
import com.utilities.WebBrowserUtils;

public class AutomationBase {

	public WebDriver driver;
	WebBrowserUtils webbrowser;
	LoginPage login;
	PropertyUtils propertyutil;
	Properties prop;

	@BeforeMethod
	@Parameters("browserName")
	public void preRun(String browserName) {
		launchBrowser(browserName);
		login = new LoginPage(driver);
		webbrowser = new WebBrowserUtils();
		propertyutil = new PropertyUtils();
		prop = PropertyUtils.getProperty("config.properties");
		webbrowser.launchUrl(driver, prop.getProperty("url"));
		webbrowser.toMaximizeWindow(driver);
	}

	public void launchBrowser(String browserName) {

		switch (browserName) {
		case "chrome":

			launchChromeBrowser();
			break;

		case "edge":

			launchEdgeBrowser();
			break;

		case "firefox":

			launchFirefoxBrowser();
			break;

		default:
			throw new RuntimeException(AutomationConstants.BrowserNameCheck);

		}

	}

	private void launchChromeBrowser() {

		driver = new ChromeDriver();
	}

	private void launchEdgeBrowser() {

		driver = new EdgeDriver();
	}

	private void launchFirefoxBrowser() {

		driver = new FirefoxDriver();
	}

	public  WebDriver getDriver() {

		return driver;
	}
}
