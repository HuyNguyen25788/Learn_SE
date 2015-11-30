package com.heb.enterprise.automationtest.pricingrule;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.heb.enterprise.automationtest.browsers.Browser;
import com.heb.enterprise.automationtest.page.PricingRulePage;

public class PricingRuleTest{
	PricingRulePage pricingRulePage;
	
	@BeforeTest
	public void setupAllTest() throws InterruptedException{
		pricingRulePage=new PricingRulePage("firefox");
		pricingRulePage.login();
	}
	@BeforeMethod
	public void setupTest() throws MalformedURLException, InterruptedException{
		pricingRulePage.navigatePricingRulePage();
	}
	@Test
	public void TC_Pricing_Rules_001_Test() {
		System.out.println("TC_Pricing_Rules_001_Test!");
		/**	Step 1
		*	System should display the following primary navigation links on the page header :
        *	Home-->   Manage --> Pricing Rules**/
		Assert.assertEquals(pricingRulePage.getBreadcrumbPage(),">Manage>Pricing Rules");
		
		/**
		 * Step 2
		 * "Pricing Rules - DSV Assortment Tool" text should be displayed as the  page title 
		 * **/
		Assert.assertEquals(pricingRulePage.driver.getTitle(),"Pricing Rules - DSV Assortment Tool");
		
		/**
		 * Step 3
		 * "DSV Pricing Rules" text should be displayed as the  page header.
		 * **/
		Assert.assertEquals(pricingRulePage.pricingruleTitlePanel.getText(),"DSV Pricing Rules");
		
		/**
		 * Step 4
		 * "Sub Commodity" dropdown should be displayed
		 * **/
		Assert.assertTrue(pricingRulePage.commodityInputWrap.isDisplayed());
		
		/**
		 * Step 5
		 * "Sub Commodity" dropdown should be displayed
		 * **/
		Assert.assertTrue(pricingRulePage.subCommodityInputWrap.isDisplayed());
		
		/**
		 * Step 6
		 * "Vendor" dropdown should be displayed
		 * **/
		Assert.assertTrue(pricingRulePage.vendorInputWrap.isDisplayed());
		
		/**
		 * Step 7
		 * ""Pricing Strategy" dropdown should be displayed and disable
		 * **/
		Assert.assertTrue(pricingRulePage.pricing_strategy_input.isDisplayed());
		Assert.assertFalse(pricingRulePage.pricing_strategy_input.isEnabled());
	}
	@Test
	public void TC_Pricing_Rules_002_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_002_Test");
		/**
		 * Step 1
		 * The  list value of "Commodity"  dropdown should be displayed 
		 * **/
		pricingRulePage.commodityButton.click();
		Thread.sleep(5000L);
		Assert.assertTrue(pricingRulePage.ui_autocomplete_commodity.isDisplayed());
	}
	@Test
	public void TC_Pricing_Rules_003_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_003_Test");
		/**
		 * Step 1
		 * The  list value of "Sub Commodity"  dropdown should be displayed 
		 * **/
		pricingRulePage.subCommodityButton.click();
		Thread.sleep(7000L);
		Assert.assertTrue(pricingRulePage.ui_autocomplete_subcommodity.isDisplayed());
	}
	@Test
	public void TC_Pricing_Rules_004_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_004_Test");
		/**
		 * Step 1
		 * The  list value of "Vendor"  dropdown should be displayed 
		 * **/
		pricingRulePage.vendorButton.click();
		Thread.sleep(5000L);
		Assert.assertTrue(pricingRulePage.ui_autocomplete_vendor.isDisplayed());
	}
	
	@Test
	public void TC_Pricing_Rules_005_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_005_Test");
		/**
		 * Step 1
		 * web should display the available vendor for user login in Dropdown vendor
		 * **/
		pricingRulePage.vendorButton.click();
		Thread.sleep(5000L);
		Assert.assertNotNull(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_vendor, "li"));
		Assert.assertTrue(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_vendor, "li").size()>0);
	}
	@Test
	public void TC_Pricing_Rules_006_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_006_Test");
		pricingRulePage.commodityButton.click();
		Assert.assertNotNull(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_commodity, "li"));
		Assert.assertTrue(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_commodity, "li").size()>0);
		pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_commodity, "li").get(1).click();
		Thread.sleep(5000L);
		Assert.assertTrue(pricingRulePage.maincontent.isDisplayed());
		Assert.assertTrue(pricingRulePage.assign_com_content.isDisplayed());
		Assert.assertTrue(pricingRulePage.pricing_asign_btn.isDisplayed());
		Assert.assertTrue(pricingRulePage.pricing_save_btn.isDisplayed());
	}
	@Test
	public void TC_Pricing_Rules_007_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_007_Test");
		pricingRulePage.subCommodityButton.click();
		Assert.assertNotNull(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_subcommodity, "li"));
		Assert.assertTrue(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_subcommodity, "li").size()>0);
		pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_subcommodity, "li").get(1).click();
		Thread.sleep(5000L);
		Assert.assertTrue(pricingRulePage.maincontent.isDisplayed());
		Assert.assertTrue(pricingRulePage.assign_com_content.isDisplayed());
		Assert.assertTrue(pricingRulePage.pricing_asign_btn.isDisplayed());
		Assert.assertTrue(pricingRulePage.pricing_save_btn.isDisplayed());
	}
	@Test
	public void TC_Pricing_Rules_008_Test() throws InterruptedException {
		System.out.println("TC_Pricing_Rules_008_Test");
		pricingRulePage.vendorButton.click();
		Assert.assertNotNull(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_vendor, "li"));
		Assert.assertTrue(pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_vendor, "li").size()>0);
		pricingRulePage.getListAutocompled(pricingRulePage.ui_autocomplete_vendor, "li").get(1).click();
		Thread.sleep(5000L);
		Assert.assertTrue(pricingRulePage.maincontent.isDisplayed());
		Assert.assertTrue(pricingRulePage.assign_com_content.isDisplayed());
		Assert.assertTrue(pricingRulePage.pricing_asign_btn.isDisplayed());
		Assert.assertTrue(pricingRulePage.pricing_save_btn.isDisplayed());
	}
	@AfterMethod
	public void teardown() {
		// System.out.println("teardown");
	}

	@AfterClass
	public void teardownClass() throws InterruptedException {
		//pricingRulePage.logout();
		pricingRulePage.close();
	}
}
