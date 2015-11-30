package com.heb.enterprise.automationtest.browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

/**
 * Browser.
 * @author huongnguyen1
 */
public class Browser {
	public static WebDriver driver;
	String firefox = "firefox";
	String chrome = "chrome";
	String ie = "ie";
	String safari = "safari";

	public Browser(String brow) {
		if (firefox.equals(brow)) {
			driver = new FirefoxDriver();
		} else if (chrome.equals(brow)) {
			System.setProperty("webdriver.chrome.driver",
					"./src/test/resource/webDriver/chromedriver.exe");
			driver = new ChromeDriver();
		} else if (ie.equals(brow)) {
			System.setProperty("webdriver.ie.driver",
					"./src/test/resource/webDriver/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		} else if (safari.equals(brow)) {
			driver = new SafariDriver();
		} else {
			driver = null;
		}
		if(driver!=null){
			driver.get(Helper.loadUrl(null));//load login page
		}
	}
	public WebDriver getDriver() {
		return driver;
	}

	@SuppressWarnings("static-access")
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void close() {
		driver.close();
	}

	public void sleep() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void get(String url) {
		driver.get(url);
	}
}
