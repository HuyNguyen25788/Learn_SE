/*
 * $Id: DashboardPage.java, Oct 23, 2015 4:30:52 PM$
 * 
 * Copyright (c) 2014 HEB All rights reserved.
 * 
 * This software is the confidential and proprietary information of HEB.
 */
package com.heb.enterprise.automationtest.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

/**
 * DashboardPage.
 * @author huongnguyen1
 *
 */
public class DashboardPage extends CommonPage {
	/** Constant HEADER_PRODUCT_OVERVIEW */
	public static final String HEADER_PRODUCT_OVERVIEW = "Product Overview";
	
	/** Constant HEADER_METRICS */
	public static final String HEADER_METRICS = "Metrics";
	
	/** Constant HEADER_RETAIL_AND_COST */
	public static final String HEADER_RETAIL_AND_COST = "Retail and Cost Overview";
	
	/** Constant HEADER_PRODUCT_SEARCH */
	public static final String HEADER_PRODUCT_SEARCH = "Product Search";

	@FindBy(how = How.CLASS_NAME, using = "sessionHeight1")
	public WebElement productOverview;
	
	@FindBy(how = How.CLASS_NAME, using = "sessionHeight2 ")
	public WebElement metrics;
	
	@FindBy(how = How.CLASS_NAME, using = "sessionHeight3")
	public WebElement retailAndCostReview;
	
	@FindBy(how = How.CLASS_NAME, using = "sessionHeight4")
	public WebElement productSearch;
	
	@FindBy(how = How.ID, using = "prodOverview_table")
	public WebElement productOverviewTable;
	
	@FindBy(how = How.LINK_TEXT, using = "Product Trends")
	public WebElement productTrendTab;
	
	@FindBy(how = How.LINK_TEXT, using = "Commodity Trends")
	public WebElement commodityTrendTab;
	
	@FindBy(how = How.LINK_TEXT, using = "Vendor Trends")
	public WebElement vendorTrendTab;
	
	@FindBy(how = How.CLASS_NAME, using = "multiselect-class")
	public WebElement vendorFilter;
	
	@FindBy(how = How.ID, using = "retailCost_table")
	public WebElement retailCostTable;
	
	@FindBy(how = How.ID, using = "upcSearchInput")
	public WebElement upcSearchInput;
	
	@FindBy(how = How.ID, using = "search-btn")
	public WebElement searchBtn;
	
	@FindBy(how = How.ID, using = "prodSearch_table")
	public WebElement prodSearchTable;
	
	@FindBy(how = How.ID, using = "commodity-trends")
	public WebElement commodityTrendsContent;
	
	@FindBy(how = How.CLASS_NAME, using = "lst-commodity-showUp")
	public WebElement lstCommodities;
	
	@FindBy(how = How.ID, using = "search-commodity-modal")
	public WebElement searchCommodities;
	
	@FindBy(how = How.ID, using = "btn-search-commodity-modal")
	public WebElement btnSearchCommodities;
	
	@FindBy(how = How.ID, using = "generateComds")
	public WebElement generateComdsBtn;
	
	@FindBy(how = How.ID, using = "clearCheckComds")
	public WebElement clearCheckComdsBtn;
	
	@FindBy(how = How.CSS, using = "#commodity-trends > div.lst-commodity-showUp.fadeIn > div.header-div > button")
	public WebElement closeListCommdities;
	
	@FindBy(how = How.ID, using = "showCommodity")
	public WebElement showCommodityBtn;
	
	@FindBy(how = How.CSS, using = "#product-trends > div.wrapper-filter.col-md-12.margin-top15 > div > div")
	public WebElement vendorFilterProduct;
	
	
	/**
	 * DashboardPage.
	 */
	public DashboardPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
	public DashboardPage(){
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	/**
	 * getTitle.
	 * @return
	 */
	public String getTitle() {
		return driver.getTitle();
	}

}
