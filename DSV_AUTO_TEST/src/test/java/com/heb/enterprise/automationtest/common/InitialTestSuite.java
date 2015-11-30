package com.heb.enterprise.automationtest.common;

import org.testng.annotations.BeforeSuite;

import com.heb.enterprise.automationtest.browsers.Browser;
import com.heb.enterprise.automationtest.propertiesfile.ReadProperties;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class InitialTestSuite {
	@BeforeSuite
	public void beforeSuite() {
		(new ReadProperties()).setProp();
		//loadBrowser();
	}

	/**
	 * loadBrowser.
	 */
//	private static void loadBrowser() {
//		if (null == Helper.driver) {
//			Browser br = new Browser(Constants.BROWSER);
//			Helper.driver = br.getDriver();
//		}
//
//		if (null == Helper.baseUrl) {
//			Helper.baseUrl = Helper.loadUrl(Helper.baseUrl);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			Helper.driver.get(Helper.baseUrl);
//		}
//	}
}
