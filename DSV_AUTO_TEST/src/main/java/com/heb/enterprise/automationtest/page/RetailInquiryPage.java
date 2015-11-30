package com.heb.enterprise.automationtest.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class RetailInquiryPage extends CommonPage{
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentMainNav\"]/ul/li[4]")
	public WebElement retailAndCostReviewDropdownMenu;
	
	@FindBy(how = How.ID, using = "retail-inquiry")
	public WebElement retailInquiryMenu;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div[3]/div/div[1]/span")
	public WebElement pageHeader;
	
	@FindBy(how = How.CSS, using = ".breadcrumb-content ul.breadcrumb:first-child > li > a")
	public List<WebElement> navigationHeaderItems;
	
	@FindBy(how = How.ID, using = "commodity-input")
	public WebElement commodityInput;
	
	@FindBy(how = How.CSS, using = "#filter > div:nth-child(1) .wrap-caret")
	public WebElement commodityButton;
	
	@FindBy(how = How.ID, using = "ui-id-1")
	public WebElement commodityAutoComplete;
	
	@FindBy(how = How.CSS, using = "#ui-id-1 > li")
	public List<WebElement> commodityAutoCompleteItems;
	
	@FindBy(how = How.ID, using = "product-input")
	public WebElement productInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"filter\"]/div[2]/div/div[1]/div/div")
	public WebElement vendorSelect;
	
	@FindBy(how = How.CSS, using = "#filter span.wrap-caret-dropdown")
	public WebElement vendorButton;
	
	@FindBy(how = How.CSS, using = "#filter ul.multiselect-container")
	public WebElement vendorDropdown;
	
	@FindBy(how = How.CSS, using = "#filter ul.multiselect-container li")
	public List<WebElement> vendorDropdownItems;
	
	@FindBy(how = How.CSS, using = "#inquiry_detail tbody tr")
	public List<WebElement> inquiryDetailTableItems;
	
	@FindBy(how = How.ID, using = "search-retail-inquiry-btn")
	public WebElement searchButton;
	
	@FindBy(how = How.ID, using = "reset-retail-inquiry-btn")
	public WebElement resetButton;
	
	@FindBy(how = How.ID, using = "retail-inquiry-export-btn")
	public WebElement exportExcelButton;
	
	public RetailInquiryPage() {
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	public RetailInquiryPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
}
