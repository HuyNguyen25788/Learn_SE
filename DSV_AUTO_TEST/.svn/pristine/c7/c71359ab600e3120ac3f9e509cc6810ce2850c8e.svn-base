package com.heb.enterprise.automationtest.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class Capture {

	@BeforeClass
	public void setUp() throws Exception {
	}

	@AfterClass
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		try {
			File scrFile = ((TakesScreenshot) driver)
					.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(scrFile, new File("c:\\tmp\\main_page.png"));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
