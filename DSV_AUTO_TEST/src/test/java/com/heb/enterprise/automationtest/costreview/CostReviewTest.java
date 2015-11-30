package com.heb.enterprise.automationtest.costreview;

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
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Predicate;
import com.heb.enterprise.automationtest.browsers.Browser;
import com.heb.enterprise.automationtest.page.CostReviewPage;
import com.heb.enterprise.automationtest.propertiesfile.ReadProperties;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class CostReviewTest {
	public CostReviewPage costReviewPage;

	public static final String PAGE_TITLE = "Retail And Cost Review - DSV Assortment Tool";
	public static final String PAGE_HEADER = "Retail and Cost Review";
	public static final String HOME_ICON_NAV = "<i class=\"fa fa-home fa-custom\"></i>";
	public static final String RETAIL_N_COST_REVIEW_NAV = "Retail and Cost Review";

	@BeforeClass
	public void beforeClass() {
//		this.loadBrowser("chrome", null);
		this.costReviewPage = new CostReviewPage();
		this.waitForPageLoad(10000);
		this.costReviewPage.login();
		// Helper.waitForWindow("[*]*Dashboard[*]*");
		this.waitForPageLoad(10000);
		this.costReviewPage.retailAndCostReviewDropdownMenu.click();
		this.costReviewPage.costReviewMenu.click();
	}

	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		costReviewPage.clickOnMenu(Constants.RETAIL_COST_REVIEW_URL_ID);
		Thread.sleep(3000);
	}
	@AfterClass
	public void afterClass() {
		// driver.quit();
		costReviewPage.close();
	}
	@Test(priority = 1)
	public void testCase_DSV_Cost_Reivew_001() {
		this.waitForPageLoad(10000);
		this.waitForAjax(100000);
		Assert.assertEquals(this.costReviewPage.navigationHeaderItems.size(), 3);
		Assert.assertEquals(this.costReviewPage.navigationHeaderItems.get(0).getAttribute("innerHTML"), HOME_ICON_NAV);
		Assert.assertEquals(this.costReviewPage.navigationHeaderItems.get(1).getText(), RETAIL_N_COST_REVIEW_NAV);
		Assert.assertEquals(this.costReviewPage.navigationHeaderItems.get(2).getText(), RETAIL_N_COST_REVIEW_NAV);
		Assert.assertEquals(costReviewPage.getDriver().getTitle(), PAGE_TITLE);
		Assert.assertTrue(this.costReviewPage.pageHeader.getText().contains(PAGE_HEADER));
		Assert.assertTrue(costReviewPage.commodityInput.isDisplayed());
		Assert.assertTrue(costReviewPage.vendorSelect.isDisplayed());
		Assert.assertTrue(costReviewPage.brandInput.isDisplayed());
		Assert.assertTrue(costReviewPage.productInput.isDisplayed());
		Assert.assertTrue(costReviewPage.dateBeginInput.isDisplayed());
		Assert.assertTrue(costReviewPage.dateEndInput.isDisplayed());
		Assert.assertTrue(costReviewPage.showAllMapCheck.isDisplayed());
		Assert.assertTrue(costReviewPage.marginBegin.isDisplayed());
		Assert.assertTrue(costReviewPage.marginEnd.isDisplayed());
		Assert.assertTrue(costReviewPage.showOnlyPrePriceCheck.isDisplayed());
		Assert.assertTrue(costReviewPage.failedReasonSelect.isDisplayed());
	}
	
	@Test(priority = 2)
	public void testCase_DSV_Cost_Reivew_002() {
		Assert.assertTrue(costReviewPage.searchButton.isDisplayed());
		Assert.assertTrue(costReviewPage.resetButton.isDisplayed());
	}
	
	@Test(priority = 3)
	public void testCase_DSV_Cost_Reivew_003() {
		Assert.assertTrue(costReviewPage.exportExcelButton.isDisplayed());
	}
	
	@Test(priority = 4)
	public void testCase_DSV_Cost_Reivew_004() {
		Assert.assertTrue(costReviewPage.allowButton.isDisplayed());
		Assert.assertTrue(costReviewPage.revertButton.isDisplayed());
		Assert.assertTrue(costReviewPage.unpublishButton.isDisplayed());
		Assert.assertTrue(costReviewPage.saveButton.isDisplayed());
		
	}
	
	@Test(priority = 5)
	public void testCase_DSV_Cost_Reivew_005() {
		costReviewPage.passTab.click();
		this.waitForAjax(100000);
		Assert.assertTrue(costReviewPage.revertPassedButton.isDisplayed());
		Assert.assertTrue(costReviewPage.unpublishPassedButton.isDisplayed());
		Assert.assertTrue(costReviewPage.savePassedButton.isDisplayed());
	}
	
	@Test(priority = 6)
	public void testCase_DSV_Cost_Reivew_006() {
		costReviewPage.failedTab.click();
		Assert.assertTrue(costReviewPage.allowFailedButton.isDisplayed());
		Assert.assertTrue(costReviewPage.unpublishFailedButton.isDisplayed());
		Assert.assertTrue(costReviewPage.saveFailedButton.isDisplayed());
	}
	
	@Test(priority = 7)
	public void testCase_DSV_Cost_Reivew_007() throws InterruptedException {
		costReviewPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.costReviewPage.allCostReviewTableItems);
	}
	
	@Test(priority = 8)
	public void testCase_DSV_Cost_Reivew_008() throws InterruptedException {
		this.costReviewPage.commodityButton.click();
		this.waitForElementVisibily(this.costReviewPage.commodityAutoComplete, 10000);
		Assert.assertTrue(this.costReviewPage.commodityAutoComplete.isDisplayed());
		List<WebElement> lst = this.costReviewPage.commodityAutoCompleteItems;
		Assert.assertNotNull(lst);
		WebElement item = lst.get(this.getRadomIndex(lst.size()));
		item.click();
		Assert.assertEquals(item.getText(), this.costReviewPage.commodityInput.getText());
		this.costReviewPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.costReviewPage.allCostReviewTableItems);
	}
	@Test(priority = 9)
	public void testCase_DSV_Cost_Reivew_009() throws InterruptedException {
		this.costReviewPage.vendorButton.click();
		this.waitForElementVisibily(this.costReviewPage.vendorDropdown, 5000);
		Assert.assertTrue(this.costReviewPage.vendorDropdown.isDisplayed());
		Assert.assertNotNull(this.costReviewPage.vendorDropdownItems);
		List<WebElement> lst = this.costReviewPage.vendorDropdownItems;
		Assert.assertNotNull(lst);
		WebElement item = lst.get(this.getRadomIndex(lst.size()));
		item.click();
		Assert.assertNotNull(this.costReviewPage.vendorSelect.getText());
		this.costReviewPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.costReviewPage.allCostReviewTableItems);
	}
	
	@Test(priority = 10)
	public void testCase_DSV_Cost_Reivew_010() {
		this.costReviewPage.failedReasonButton.click();
		this.waitForElementVisibily(this.costReviewPage.failedReasonDropdown, 5000);
		Assert.assertTrue(this.costReviewPage.failedReasonDropdown.isDisplayed());
		Assert.assertNotNull(this.costReviewPage.failedReasonDropdownItems);
		List<WebElement> lst = this.costReviewPage.failedReasonDropdownItems;
		Assert.assertNotNull(lst);
		WebElement item = lst.get(this.getRadomIndex(lst.size()));
		item.click();
		Assert.assertNotNull(this.costReviewPage.failedReasonSelect.getText());
		this.costReviewPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.costReviewPage.allCostReviewTableItems);
		
	}
	@Test(priority = 11)
	public void testCase_DSV_Cost_Reivew_011() {
		this.costReviewPage.dateBeginButton.click();
		this.waitForElementVisibily(this.costReviewPage.dateDiv, 5000);
		Assert.assertTrue(this.costReviewPage.dateDiv.isDisplayed());
		Assert.assertNotNull(this.costReviewPage.dateSelectItems);
		List<WebElement> lst = this.costReviewPage.dateSelectItems;
		WebElement item = lst.get(this.getRadomIndex(lst.size()));
		item.click();
		this.costReviewPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.costReviewPage.allCostReviewTableItems);
	}
	@Test(priority = 12)
	public void testCase_DSV_Cost_Reivew_012() {
		this.costReviewPage.showAllMapCheck.click();
		this.costReviewPage.showOnlyPrePriceCheck.click();
		this.costReviewPage.searchButton.click();
		this.waitForAjax(100000);
		Assert.assertNotNull(this.costReviewPage.allCostReviewTableItems);
	}
	
	/*@Test
	public void tc_Cost_Review_001_1() {
		*//**	
		*	System should display the following primary navigation links on the page header :
        *	Home-->   Retail and Cost Review --> Retail and Cost Review
        **//*
		Assert.assertEquals(costReviewPage.getBreadcrumbPage(),">Retail and Cost Review>Retail and Cost Review");
		
		*//**
		 * "Retail And Cost Review - DSV Assortment Tool" text should be displayed as the  page title 
		 * **//*
		
		Assert.assertEquals(Helper.driver.getTitle(),"Retail And Cost Review - DSV Assortment Tool");
		
		Assert.assertTrue(costReviewPage.commodityInput.isDisplayed());
		
		Assert.assertTrue(costReviewPage.vendorDropdown.isDisplayed());
		
		Assert.assertTrue(costReviewPage.brandInput.isDisplayed());
		
		Assert.assertTrue(costReviewPage.productInput.isDisplayed());
		
		Assert.assertTrue(costReviewPage.dateBegin.isDisplayed());
		
		Assert.assertTrue(costReviewPage.dateEnd.isDisplayed());
		
		Assert.assertTrue(costReviewPage.showAllMapCheck.isDisplayed());
		
		Assert.assertTrue(costReviewPage.marginBegin.isDisplayed());
		
		Assert.assertTrue(costReviewPage.marginEnd.isDisplayed());
		
		Assert.assertTrue(costReviewPage.showOnlyPrePriceCheck.isDisplayed());
		
		Assert.assertTrue(costReviewPage.failedReason.isDisplayed());
		
		Assert.assertTrue(costReviewPage.searchCostReviewButton.isDisplayed());
		
		Assert.assertTrue(costReviewPage.costReviewExportButton.isDisplayed());
		
		Assert.assertTrue(costReviewPage.costReviewSaveButton.isDisplayed());
		
	}*/
//	
//	private void loadBrowser(String browserName, String destinationUrl) {
//		(new ReadProperties()).setProp();
//		Helper.driver = new Browser(browserName).getDriver();
//		Helper.baseUrl = Helper.loadUrl(destinationUrl);
//		// Thread.sleep(1000);
//		Helper.driver.get(Helper.baseUrl);
//	}

	private void waitForAjax(int timeoutInSeconds) {
		if (costReviewPage.getDriver() instanceof JavascriptExecutor) {
			WebDriverWait wait = new WebDriverWait(costReviewPage.getDriver(), timeoutInSeconds);
			wait.until(new Predicate<WebDriver>() {
				@Override
				public boolean apply(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) costReviewPage.getDriver();
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
		if (costReviewPage.getDriver() instanceof JavascriptExecutor) {
			WebDriverWait wait = new WebDriverWait(costReviewPage.getDriver(), timeoutInSeconds);
			wait.until(new Predicate<WebDriver>() {
				@Override
				public boolean apply(WebDriver driver) {
					JavascriptExecutor js = (JavascriptExecutor) costReviewPage.getDriver();
					return js.executeScript("return document.readyState").equals("complete");
				}
			});
		}
	}

	private void waitForElementVisibily(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(costReviewPage.getDriver(), timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	private int getRadomIndex(int length) {
		int returnVal = 0;
		Random random = new Random();
		returnVal = random.nextInt(length);
		return returnVal;
	}
//	@Test
//	public void tc_Products_Review_001_2() {			
//	
//	}
}
