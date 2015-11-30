package com.heb.enterprise.automationtest.retailinquiry;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;
import com.heb.enterprise.automationtest.browsers.Browser;
import com.heb.enterprise.automationtest.page.RetailInquiryPage;
import com.heb.enterprise.automationtest.propertiesfile.ReadProperties;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class RetailInquiryTest {
	public RetailInquiryPage inquiryPage;

	public static final String PAGE_TITLE = "Retail Inquiry - DSV Assortment Tool";
	public static final String PAGE_HEADER = "Retail and Cost Review - Retail Inquiry";
	public static final String HOME_ICON_NAV = "<i class=\"fa fa-home fa-custom\"></i>";
	public static final String RETAIL_N_COST_REVIEW_NAV = "Retail and Cost Review";
	public static final String RETAIL_INQUIRY_NAV = "Retail Inquiry";

	@BeforeClass
	public void beforeClass() {
//		this.loadBrowser("firefox", null);
		this.inquiryPage = new RetailInquiryPage();
		this.waitForPageLoad(10000);
		this.inquiryPage.login();
		// Helper.waitForWindow("[*]*Dashboard[*]*");
		this.waitForPageLoad(10000);
		this.inquiryPage.retailAndCostReviewDropdownMenu.click();
		this.inquiryPage.retailInquiryMenu.click();
	}
	@AfterClass
	public void afterClass() {
		// driver.quit();
		inquiryPage.close();
	}
	@BeforeMethod
	public void setupBeforeMethod() throws MalformedURLException, InterruptedException{
		//Menu menu = new Menu();
		inquiryPage.clickOnMenu(Constants.RETAIL_INQUIRY_URL_ID);
		waitForAjax(1000);
	}
	@Test(priority = 1)
	public void testCase_DSV_Retail_Inquiry_001() {
		this.waitForPageLoad(10000);
		this.waitForAjax(100000);
		Assert.assertEquals(this.inquiryPage.navigationHeaderItems.size(), 3);
		Assert.assertEquals(this.inquiryPage.navigationHeaderItems.get(0).getAttribute("innerHTML"), HOME_ICON_NAV);
		Assert.assertEquals(this.inquiryPage.navigationHeaderItems.get(1).getText(), RETAIL_N_COST_REVIEW_NAV);
		Assert.assertEquals(this.inquiryPage.navigationHeaderItems.get(2).getText(), RETAIL_INQUIRY_NAV);
		Assert.assertEquals(inquiryPage.getDriver().getTitle(), PAGE_TITLE);
		Assert.assertTrue(this.inquiryPage.pageHeader.getText().contains(PAGE_HEADER));
		Assert.assertTrue(this.inquiryPage.commodityInput.isDisplayed());
		Assert.assertTrue(this.inquiryPage.vendorSelect.isDisplayed());
		Assert.assertTrue(this.inquiryPage.productInput.isDisplayed());
	}

	@Test(priority = 2)
	public void testCase_DSV_Retail_Inquiry_002() {
		Assert.assertTrue(this.inquiryPage.searchButton.isDisplayed());
		Assert.assertTrue(this.inquiryPage.resetButton.isDisplayed());
	}

	@Test(priority = 3)
	public void testCase_DSV_Retail_Inquiry_003() {
		Assert.assertTrue(this.inquiryPage.exportExcelButton.isDisplayed());
	}

	@Test(priority = 4)
	public void testCase_DSV_Retail_Inquiry_004() {
		this.inquiryPage.commodityButton.click();
		this.waitForElementVisibily(this.inquiryPage.commodityAutoComplete, 10000);
		Assert.assertTrue(this.inquiryPage.commodityAutoComplete.isDisplayed());
		Assert.assertNotNull(this.inquiryPage.commodityAutoCompleteItems);
		List<WebElement> lst = this.inquiryPage.commodityAutoCompleteItems;
		WebElement item = lst.get(this.getRadomIndex(lst.size()));
		item.click();
		Assert.assertEquals(item.getText(), this.inquiryPage.commodityInput.getText());
		this.inquiryPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.inquiryPage.inquiryDetailTableItems);
	}

	@Test(priority = 5)
	public void testCase_DSV_Retail_Inquiry_005() throws InterruptedException {
		Thread.sleep(3000);
		this.inquiryPage.vendorButton.click();
		this.waitForElementVisibily(this.inquiryPage.vendorDropdown, 5000);
		Assert.assertTrue(this.inquiryPage.vendorDropdown.isDisplayed());
		Assert.assertNotNull(this.inquiryPage.vendorDropdownItems);
		List<WebElement> lst = this.inquiryPage.vendorDropdownItems;
		WebElement item = lst.get(this.getRadomIndex(lst.size()));
		item.click();
		Assert.assertNotNull(this.inquiryPage.vendorSelect.getText());
		this.inquiryPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.inquiryPage.inquiryDetailTableItems);
	}

	@AfterMethod
	public void afterMethod() {
		// driver.quit();
	}

//	private void loadBrowser(String browserName, String destinationUrl) {
//		(new ReadProperties()).setProp();
//		Helper.driver = new Browser(browserName).getDriver();
//		Helper.baseUrl = Helper.loadUrl(destinationUrl);
//		// Thread.sleep(1000);
//		Helper.driver.get(Helper.baseUrl);
//	}

	private void waitForAjax(int timeoutInSeconds) {
		if (inquiryPage.getDriver() instanceof JavascriptExecutor) {
			WebDriverWait wait = new WebDriverWait(inquiryPage.getDriver(), timeoutInSeconds);
			wait.until(new Predicate<WebDriver>() {
				public boolean apply(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) inquiryPage.getDriver();
					Long n = 1L;
					Object numberOfAjaxConnections = js.executeScript("return jQuery.active");
					if (numberOfAjaxConnections instanceof Long) {
						n = (Long) numberOfAjaxConnections;
						System.out.println("Number of active jquery ajax calls: " + n);
					}
					return n.longValue() == 0L;
				}
			});
		}
	}

	private void waitForPageLoad(int timeoutInSeconds) {
		if (inquiryPage.getDriver() instanceof JavascriptExecutor) {
			WebDriverWait wait = new WebDriverWait(inquiryPage.getDriver(), timeoutInSeconds);
			wait.until(new Predicate<WebDriver>() {
				public boolean apply(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) inquiryPage.getDriver();
					return js.executeScript("return document.readyState").equals("complete");
				}
			});
		}
	}

	private void waitForElementVisibily(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(inquiryPage.getDriver(), timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	private int getRadomIndex(int length) {
		int returnVal = 0;
		Random random = new Random();
		returnVal = random.nextInt(length);
		return returnVal;
	}
}
