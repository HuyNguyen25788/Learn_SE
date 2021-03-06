/*
 * $Id: DashboardTest.java, Oct 23, 2015 4:32:43 PM$
 * 
 * Copyright (c) 2014 HEB All rights reserved.
 * 
 * This software is the confidential and proprietary information of HEB.
 */
package com.heb.enterprise.automationtest.dashboard;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.heb.enterprise.automationtest.page.DashboardPage;
import com.heb.enterprise.automationtest.utils.Constants;

public class DashboardTest  {
	private final Logger LOG = Logger.getLogger(DashboardTest.class);
	DashboardPage db;
	
	@BeforeClass
	public void setUp() throws InterruptedException {
		db = new DashboardPage();
		db.getDriver().manage().window().maximize();
		db.login();
		Thread.sleep(5000L);
	}
	@AfterClass
	public void afterClass() {
		db.close();
	}
	@Test(priority=0)
	public void T001_LoadDashboardPage() {
		Assert.assertEquals(db.getTitle(), Constants.titleMainPage);
		Assert.assertTrue(db.productOverview.isDisplayed(), "Product overview is not displayed.");
		Assert.assertTrue(db.metrics.isDisplayed(), "Metrics is not displayed.");
		Assert.assertTrue(db.retailAndCostReview.isDisplayed(), "Retail and Cost review is not displayed.");
		Assert.assertTrue(db.productSearch.isDisplayed(), "Product search is not displayed.");
		Assert.assertTrue(db.productOverviewTable.isDisplayed(), "Product overview table is not displayed.");
		Assert.assertTrue(db.retailCostTable.isDisplayed(), "Retail Cost table is not displayed.");
		Assert.assertTrue(db.prodSearchTable.isDisplayed(), "Product search table is not displayed.");
	}
	
	@Test(priority=1)
	public void T002_testProductOverview() throws InterruptedException{
		if(db.productOverviewTable.isDisplayed()){
			if(db.productOverviewTable.findElement(By.tagName("tbody")).isDisplayed()){
				Assert.assertTrue(db.productOverviewTable.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size() > 0, "Product overview table default display is wrong.");
			}			
		}else{
			Assert.fail("Product overview table is not displayed.");
		}
	}
	
	@Test(priority=2)
	public void T003_testRetailCostReviewDefault(){
		if(db.retailCostTable.isDisplayed()){
			if(db.retailCostTable.findElement(By.tagName("tbody")).isDisplayed()){
				Assert.assertTrue(db.retailCostTable.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size() > 0, "Retail And Cost Review table default display is wrong.");
			}			
		}else{
			Assert.fail("Product overview table is not displayed.");
		}
	}
	
	@Test(priority=3)
	public void T004_testProductSearch(){
		if(db.prodSearchTable.isDisplayed()){
			if(db.prodSearchTable.findElement(By.tagName("tbody")).isDisplayed()){
				Assert.assertTrue(db.prodSearchTable.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size() > 0, "Product search table default display is wrong.");
			}			
		}else{
			Assert.fail("Product search table is not displayed.");
		}
	}
	
	@Test(priority=4)
	public void T005_testDataVendorCombobox() throws InterruptedException{
		Thread.sleep(2000L);
		if(db.vendorFilter.isDisplayed()){
			Assert.assertTrue(db.vendorFilter.findElements(By.tagName("li")).size() > 0, "Vendor combobox in metrics section has no item.");
		}else{
			Assert.fail("Vendor combobox in metrics section is not displayed.");
		}
	}
	
	@Test(priority=5)
	public void T006_testSearchProduct() throws InterruptedException{
		Thread.sleep(2000L);
		if(db.upcSearchInput.isDisplayed()){
			db.upcSearchInput.clear();
			db.upcSearchInput.sendKeys("a");
			db.searchBtn.click();
			Thread.sleep(2000L);
			Assert.assertTrue(db.prodSearchTable.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size() > 0, "Product search has errors.");
		}else{
			Assert.fail("Search product text box is not displayed.");
		}
	}
	
//	@Test(priority=6)
//	public void T007_testProductTrend() throws InterruptedException{
//		if(!db.vendorFilterProduct.isDisplayed()){
//			db.productTrendTab.click();
//			Thread.sleep(2000L);
//		}
//		Assert.assertTrue(db.vendorFilterProduct.isDisplayed(), "Vendor filter product is not displayed.");
//		db.vendorFilterProduct.click();
//		Thread.sleep(2000L);
//		System.out.println(db.productTrendTab.findElement(By.tagName("ul")));
//	}
	
	@Test(priority=7)
	public void T008_testCommodityTrends() throws InterruptedException{
		if(db.commodityTrendTab.isDisplayed()){
			db.commodityTrendTab.click();
			Thread.sleep(2000L);
			if(db.commodityTrendsContent.isDisplayed()){
				Assert.assertTrue(db.lstCommodities.isDisplayed(), "List commodites in commodity trend tab is not displayed.");
				Assert.assertTrue(db.lstCommodities.findElement(By.id("commodity-Tree")).findElement(By.tagName("ul")).findElements(By.tagName("li")).size() > 0, "List commodites is null.");
				Assert.assertFalse(db.generateComdsBtn.isEnabled(), "General button is enabled with first load.");
				Assert.assertTrue(db.clearCheckComdsBtn.isEnabled(), "Clear button is disabled.");
				// Clear search text box to test clear button
				db.searchCommodities.clear();
				db.searchCommodities.sendKeys("test clear");
				db.clearCheckComdsBtn.click();
				Assert.assertTrue(db.searchCommodities.getText().isEmpty(), "Click on clear button is not working.");
				// Clear search text box and test search button
				db.searchCommodities.clear();
				db.searchCommodities.sendKeys(db.lstCommodities.findElement(By.id("commodity-Tree")).findElement(By.tagName("ul")).findElements(By.tagName("li")).get(0).findElement(By.tagName("a")).getText());
				db.btnSearchCommodities.click();
				Thread.sleep(500L);
				Thread.sleep(500L);
				Assert.assertTrue(db.lstCommodities.findElement(By.id("commodity-Tree")).findElement(By.tagName("ul")).findElements(By.tagName("li")).size() > 0, "Commodites trends search was wrong.");
				// Select check box and check generate button
				WebElement commodity = db.lstCommodities.findElement(By.id("commodity-Tree")).findElement(By.tagName("ul")).findElements(By.tagName("li")).get(0).findElement(By.className("jstree-checkbox"));
				if(!commodity.isSelected()){
					commodity.click();
					Thread.sleep(500L);
					Assert.assertTrue(db.generateComdsBtn.isEnabled(), "General button is not enabled with commodity was selected");
					db.generateComdsBtn.click();
					Thread.sleep(500L);
					Assert.assertFalse(db.lstCommodities.isDisplayed(), "List commodities is still displayed after click on general button");
				}
				if(db.lstCommodities.isDisplayed()){
					db.closeListCommdities.click();
					Thread.sleep(500L);
					Assert.assertFalse(db.lstCommodities.isDisplayed(), "Close list commodities is not worked");
				}
				if(!db.lstCommodities.isDisplayed()){
					db.showCommodityBtn.click();
					Thread.sleep(500L);
					Assert.assertTrue(db.lstCommodities.isDisplayed(), "List commodities is not displayed when click on SELECT COMMODITY button.");
					db.closeListCommdities.click();
				}
			}else{
				Assert.fail("Commodity trend tab's content is not displayed.");
			}
		}else{
			Assert.fail("Commodity trend tab is not existed.");
		}
	}
	
//	@AfterClass
//	public void tearDown() {
//		 Helper.closeWindow();
//	}
}
