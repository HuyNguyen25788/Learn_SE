package com.heb.enterprise.automationtest.page;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class VendorManagementPage extends CommonPage{
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div[2]/ul")
	public WebElement menuBreadcrumb;
	
	@FindBy(how = How.ID, using = "vendor-hierarchy-mapping-text")
	public WebElement vendorHierarchyMappingText;
	
	@FindBy(how = How.CSS, using = "#example-selectedClass-container ul.multiselect-container")
	public WebElement vendorHierarchyMappingData;
	
	@FindBy(how = How.XPATH, using = "/html/body/div[1]/div[3]/div/div[2]/div[2]/div/ul/li[2]")
	public WebElement vendorSelect;
	
	
	@FindBy(how = How.ID, using = "vendor-hierarchy-mapping-table_wrapper")
	public WebElement datagrid;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentMainNav\"]/ul/li[2]/a")
	private WebElement link;
	
	@FindBy(how = How.ID, using = "vendor-management")
	@CacheLookup
	private WebElement menu_vendor;
	
	public String title=Constants.titleVendormanagementPage;
	
	@FindBy(how = How.CLASS_NAME, using = "add-new-row-id")
	public WebElement addNewBtn;
	
	@FindBy(how = How.CSS, using = "td.category1-cls.text-left.hasclear > input")
	public WebElement categoryInput1;
	
	@FindBy(how = How.CLASS_NAME, using = "vendor-hierarchy-save-btn")
	public WebElement savebtn;
	
	@FindBy(how = How.CLASS_NAME, using = "vendor-hierarchy-download-btn")
	public WebElement downloadBtn;
	
	@FindBy(how = How.CLASS_NAME, using = "vendor-hierarchy-import-btn")
	public WebElement importBtn;
	
	@FindBy(how = How.CSS, using = ".add-subCommodity i")
	public WebElement addNewSubCommodity;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id='196_com']/i")
	public WebElement subCommodityChoosen;
	
	@FindBy(how = How.CSS, using = "ul.jstree-container-ul li")
	public List<WebElement> subCommoditys;
	
	@FindBy(how = How.CSS, using = ".jstree-container-ul li ul.jstree-children li")
	public List<WebElement> subSubCommoditys;
	
	@FindBy(how = How.ID, using = "1253")
	public WebElement subSubId;
	
	@FindBy(how = How.CSS, using = ".deleteBtn-cls button")
	public List<WebElement> deleteRowButtons; 
	
	
	@FindBy(how = How.ID, using = "vendor-hierarchy-mapping-table_paginate")
	public WebElement paginationBar; 
	
	@FindBy(how = How.CSS, using = "#vendor-hierarchy-mapping-table tbody tr")
	public List<WebElement> trVendorHierachy; 
	
	@FindBy(how = How.ID, using = "assortment-rules-a")
	public WebElement assortRuleTab; 
	
	@FindBy(how = How.ID, using = "vendorRules")
	public WebElement assortVendorRule;
	
	@FindBy(how = How.CSS, using = "#jstreeCommo ul.jstree-container-ul li")
	public List<WebElement> commodityListAssortRule;
	
	@FindBy(how = How.CSS, using = "#jstreeCommo ul.jstree-container-ul li ul.jstree-children li")
	public List<WebElement> subcommodityListAssortRule;
	
	@FindBy(how = How.ID, using = "vendorRules")
	public WebElement assortSaveBtn;
	
	@FindBy(how = How.ID, using = "vendorRules")
	public WebElement assortResetBtn; 
	
	@FindBy(how = How.ID, using = "map-vendor-hierarchy-a")
	public WebElement vendorHierarchyTab; 
	
	@FindBy(how = How.ID, using = "formHie")
	public WebElement formHideRight; 
	
	public VendorManagementPage() {
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	public VendorManagementPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
	
	public boolean checkTitle() {
		return driver.getTitle().equals(title);
	}

	public String getBreadcrumbText(){
		String naviText = "";
		List<WebElement> lst = menuBreadcrumb.findElements(By.tagName("a"));		
		for (WebElement webElement : lst) {
			naviText += ">";
			if (webElement.getText().equals("")) {
				naviText += "Home";
			}else{
				naviText += webElement.getText();
			}
			
		}
		System.out.println(naviText);
		return naviText;
	}
}
