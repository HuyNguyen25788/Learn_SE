package com.heb.enterprise.automationtest.vendormanagement;

import java.net.MalformedURLException;
import java.util.List;
import java.util.Random;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heb.enterprise.automationtest.page.VendorManagementPage;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

/**
 * @author giaule
 *
 */
public class VendorManagementTest  {
	VendorManagementPage vendorPage;

	@BeforeClass
	public void beforeMethod() {		
		vendorPage = new VendorManagementPage();
		vendorPage.login();
		Helper.waitForWindow("[*]*Dashboard[*]*");
		this.waitForAjax(10000);
	}
	
	
	@BeforeMethod
	public void setupBeforeMethod() throws MalformedURLException, InterruptedException{
		//Menu menu = new Menu();
		vendorPage.clickOnMenu(Constants.VENDOR_MANAGEMENT_URL_ID);
		waitForAjax(1000);
	}
	
	/**
	 * Click to choose vendor.
	 * @author giaule
	 */
	private void clickOnVendor(){
		Helper.waitForElementVisibily(vendorPage.vendorHierarchyMappingText, 30);
		vendorPage.vendorHierarchyMappingText.click();
		if (vendorPage.vendorSelect.isDisplayed()) {
			vendorPage.vendorSelect.click();
		}
		waitForAjax(1000);
	}
	
	@AfterMethod
	public void afterMethod() {
		// driver.quit();
	}
	@AfterClass
	public void afterClass() {
		// driver.quit();
		vendorPage.close();
	}
	
	/**
	 * Click and select the Vendor Management link displayed in the drop down list.
	 * @throws InterruptedException
	 * @author giaule
	 */
	@Test (priority = 1)
	public void vendorMangementTC1() throws InterruptedException{
		Thread.sleep(1000);
		Assert.assertTrue("Vendor management page title is not true.", vendorPage.checkTitle());
		Assert.assertEquals(vendorPage.getBreadcrumbText(), ">Home>Manage>Vendor Management");
	}
	
	/**
	 * Verify web should display the available vendor for user login in Dropdown vendor
	 * @throws InterruptedException
	 * @author giaule
	 */
	@Test (priority = 2)
	public void vendorMangementTC2(){
		vendorPage.vendorHierarchyMappingText.click();
		Assert.assertTrue(vendorPage.vendorHierarchyMappingData.isDisplayed());
	}
	
	
	/**
	 * Verify Web should display Map Vendor Hierarchy tab when user select any vendor.
	 * @throws InterruptedException
	 * @author giaule
	 */
	@Test (priority = 3)
	public void vendorMangementTC3() throws InterruptedException{
		this.clickOnVendor();
		Thread.sleep(10000L);
		Assert.assertTrue(vendorPage.datagrid.isDisplayed());
	}
	
	/**
	 * Verify Web should display download, upload, add new, Save icon on Header of Map vendor hierarchy tab when user select any vendor.
	 * @throws InterruptedException
	 * @author giaule
	 */
	@Test (priority = 4)
	public void vendorMangementTC4(){
		this.clickOnVendor();
		boolean isDisplayAddNew = vendorPage.addNewBtn.isDisplayed();
		boolean isDisplaySave = vendorPage.savebtn.isDisplayed();
		boolean isDisplayDownload = vendorPage.downloadBtn.isDisplayed();
		boolean isDisplayUpload = vendorPage.importBtn.isDisplayed();
		Assert.assertTrue(isDisplayAddNew && isDisplaySave && isDisplayDownload && isDisplayUpload);
	}
	
	/**
	 * Verify Web should display pagination of Map vendor hierarchy tab when user select any vendor.
	 * @throws InterruptedException
	 * @author giaule
	 */
	@Test (priority = 5)
	public void vendorMangementTC5(){
		this.clickOnVendor();
		boolean isDisplayPagination = vendorPage.paginationBar.isDisplayed();
		Assert.assertTrue(isDisplayPagination);
	}
	
	/**
	 * Verify Web should display value of Map vendor hierarchy tab when user select any vendor exists value.
	 * @throws InterruptedException
	 * @author giaule
	 */
	@Test (priority = 6)
	public void vendorMangementTC6() throws InterruptedException{
		this.clickOnVendor();
		List<WebElement> trMapvendor = vendorPage.trVendorHierachy;
		Assert.assertTrue(trMapvendor != null && !trMapvendor.isEmpty());
	}
	
	/**
	 * Verify Web should display Assortment Rule tab when user click on Assortment Rule tab.
	 * @author giaule
	 */
	@Test (priority = 7)
	public void vendorMangementTC7() throws InterruptedException{
		this.clickOnVendor();
		if (vendorPage.datagrid.isDisplayed()) {
			Assert.assertTrue(vendorPage.assortRuleTab.isDisplayed());
		}else{
			AssertJUnit.fail("Fail test case 3");
		}
	}
	

	/**
	 * Web should display commodity added by Map Vendor hierarchy tab on  Assortment Rule tab when user clicks on Assortment Rule tab
	 * @author giaule
	 */
	@Test (priority = 8)
	public void vendorMangementTC8() {
		this.clickOnVendor();
//		VendorManagementPage vendorPage = new VendorManagementPage();
		if (vendorPage.datagrid.isDisplayed()) {
			vendorPage.assortRuleTab.click();
			Assert.assertTrue(vendorPage.assortVendorRule.isDisplayed());
		}else{
			AssertJUnit.fail("Fail test case 3");
		}
	}
	
	/**
	 * click subcommodity.
	 * @author giaule
	 */
	@Test (priority = 9)
	public void vendorMangementTC9() {
		this.clickOnVendor();
		vendorPage.assortRuleTab.click();
		waitForAjax(1000);
		List<WebElement> commodityListAssortRules = vendorPage.commodityListAssortRule;
		if (commodityListAssortRules != null && !commodityListAssortRules.isEmpty()) {
			WebElement e = commodityListAssortRules.get(0);
			System.out.println(e.getText());
			e.findElement(By.tagName("i")).click();
			waitForAjax(1000);
			if (vendorPage.subcommodityListAssortRule != null && !vendorPage.subcommodityListAssortRule.isEmpty()) {
				vendorPage.subcommodityListAssortRule.get(0).click();
				Assert.assertTrue(vendorPage.formHideRight.isDisplayed());
			}
		}
	}
	
	/**
	 * click commodity.
	 * @author giaule
	 */
	@Test (priority = 10)
	public void vendorMangementTC10() {
		this.clickOnVendor();
		vendorPage.assortRuleTab.click();
		waitForAjax(1000);
		List<WebElement> commodityListAssortRules = vendorPage.commodityListAssortRule;
		if (commodityListAssortRules != null && !commodityListAssortRules.isEmpty()) {
			commodityListAssortRules.get(0).click();
			Assert.assertTrue(vendorPage.formHideRight.isDisplayed());
		}
	}
	
	/**
	 * click commodity.
	 * @author giaule
	 */
	@Test (priority = 11)
	public void vendorMangementTC11() {
		this.clickOnVendor();
		vendorPage.assortRuleTab.click();
		waitForAjax(1000);
		vendorPage.assortVendorRule.click();
		Assert.assertTrue(vendorPage.formHideRight.isDisplayed());
	}
	

	/**
	 * Verify the Save & Reset button displayed when user click on Sub-commodity
	 * @author giaule
	 */
	@Test (priority = 12)
	public void vendorMangementTC12() {
		this.clickOnVendor();
//		VendorManagementPage vendorPage = new VendorManagementPage();
		vendorPage.assortRuleTab.click();
		waitForAjax(1000);
		vendorPage.assortVendorRule.click();
		boolean assortSaveIsDisplay = vendorPage.assortSaveBtn.isDisplayed();
		boolean assortResetIsDisplay = vendorPage.assortResetBtn.isDisplayed();
		Assert.assertTrue("Save and reset button are not available.", assortResetIsDisplay && assortSaveIsDisplay);
	}
	
	/**
	 * verify save map vendor hierarchy (not be used now).
	 * @author giaule
	 */
	@Test (priority = 13, enabled = false)
	public void vendorMangementTC112() throws InterruptedException {
		this.clickOnVendor();
		if (vendorPage.datagrid.isDisplayed()) {
			vendorPage.addNewBtn.click();
			Helper.waitForElementVisibily(vendorPage.categoryInput1, 100);
			vendorPage.categoryInput1.sendKeys("abc");
			if (vendorPage.getDriver() instanceof JavascriptExecutor) {
				JavascriptExecutor jsDriver = (JavascriptExecutor) vendorPage.getDriver();
				jsDriver.executeScript("$('#vendor-hierarchy-mapping-table').DataTable().data()[0].category1 = 'abc';");
			}
			
			vendorPage.addNewSubCommodity.click();
			waitForAjax(1000);
			List<WebElement> listSubCommodityElement = vendorPage.subCommoditys;
			if (listSubCommodityElement != null && !listSubCommodityElement.isEmpty()) {
				WebElement subElement = this.randomElement(listSubCommodityElement);
				Helper.waitForElementVisibily(subElement.findElement(By.tagName("i")), 30);
				subElement.findElement(By.tagName("i")).click();
				waitForAjax(1000);
				List<WebElement> listSubSubCommodity = vendorPage.subSubCommoditys;
				WebElement e = listSubSubCommodity.get(0);
				System.out.println(e.getText());
				e.click();
				Actions action = new Actions(vendorPage.getDriver());
				action.doubleClick(e).perform();
				waitForAjax(1000);
				vendorPage.savebtn.click();
			}
		}
		
	}
	
	private WebElement randomElement(List<WebElement> listSubCommodityElement) {
		Random random = new Random();
		int index = random.nextInt(listSubCommodityElement.size());
		return listSubCommodityElement.get(index);
	}

	private void waitForAjax(int timeoutInSeconds) {
		try {
			if (vendorPage.getDriver() instanceof JavascriptExecutor) {
				JavascriptExecutor jsDriver = (JavascriptExecutor) vendorPage.getDriver();
				for (int i = 0; i < timeoutInSeconds; i++) {
					Object numberOfAjaxConnections = jsDriver
							.executeScript("return jQuery.active");
					if (numberOfAjaxConnections instanceof Long) {
						Long n = (Long) numberOfAjaxConnections;
						if (n.longValue() == 0L)
							break;
					}
					Thread.sleep(1000);
				}
			} else {
				System.out.println("Web driver: " + vendorPage.getDriver()
						+ " cannot execute javascript");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
