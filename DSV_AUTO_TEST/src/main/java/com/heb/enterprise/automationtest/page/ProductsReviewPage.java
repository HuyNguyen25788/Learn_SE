package com.heb.enterprise.automationtest.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.sikuli.webdriver.ImageElement;
import org.sikuli.webdriver.support.FindByImage;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class ProductsReviewPage extends CommonPage{
	 
	@FindBy(how = How.CSS, using = "a[href*='/assortment/product-review']")
	// @FindBy(how = How.ID, using = "product-review")
	public WebElement productsReviewMenu;
	@FindBy(how = How.CLASS_NAME, using = "accordion-toggle-bdm")
	public WebElement getTitleHeader;
	//Home BreadCrumb
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div[2]/ul/li")
	public List<WebElement> getlsTitleBreadCrumb;
	@FindBy(how = How.ID, using = "commodities-input")
	public WebElement getCommoditiesDropdown;
	//Vendor Dropdown
	@FindBy(how = How.CSS, using = "#bdm-header > div:nth-child(2) > div > div:nth-child(1) > div > div")
	public WebElement getVendorDropdown;
	@FindBy(how = How.CSS, using ="#bdm-header > div:nth-child(2) > div > div:nth-child(1) > div > div > ul > li.multiselect-item.multiselect-all")
	public WebElement chkVendorDrd;
	// get table 
	@FindBy(how = How.ID, using="all-table")
	public WebElement getTable;
	@FindBy(how = How.CSS, using = "#bdm-search-form > div:nth-child(5) > div > div")
	public WebElement getFailedReason;
	
	@FindBy(how = How.ID, using = "show-all-map-check")
	public WebElement getMAPCheckbox;
	@FindBy(how = How.ID, using = "show-only-prePrice-check")
	public WebElement getPrepriceCheckbox;
	@FindBy(how = How.ID, using = "show-only-fail-products")
	public WebElement getFailProductsCheckbox;
	@FindBy(how = How.ID, using = "brand-input")
	public WebElement getBrandTxt;
	@FindBy(how = How.ID, using = "product-input")
	public WebElement getProductTxt;
	@FindBy(how = How.ID, using = "marginBegin")
	public WebElement getMarginBeginTxt;
	@FindBy(how = How.ID, using = "marginEnd")
	public WebElement getMarginEndTxt;
	@FindBy(how = How.ID, using = "dateBegin")
	public WebElement getDateBeginTxt;
	@FindBy(how = How.ID, using = "dateEnd")
	public WebElement getDateEndTxt;
	// Clear button
	@FindBy(how = How.ID, using ="reset-new-product-btn")
	public WebElement getClearbtn;
	@FindBy(how = How.ID, using ="search-new-product-btn")
	public WebElement getSearchbtn;
	// Tab All
	
	@FindBy(how = How.ID, using = "tab-all-title")
	public WebElement getTabAll;
	@FindBy(how = How.ID, using ="reject-btn-all")
	public WebElement getRejectbtn;
	@FindBy(how = How.ID, using ="approve-btn-all")
	public WebElement getApprovebtn;
	@FindBy(how = How.ID, using ="un-reject-btn-all")
	public WebElement getUnRejectbtn;
	@FindBy(how = How.ID, using ="save-btn-all")
	public WebElement getSavebtn;	
	@FindBy(how = How.ID, using = "product-input")
	public WebElement productInput;	
	@FindBy(how = How.ID, using = "product-review-export-btn")
	public WebElement getExcelExportbtn;
	//Tab Pass
	@FindBy(how = How.ID, using = "tab-passed-li")
	public WebElement getTabPass;
	@FindBy(how = How.ID, using ="approve-btn-passed")
	public WebElement getApprovebtnPass;
	@FindBy(how = How.ID, using ="save-btn-passed")
	public WebElement getSavebtnPass;
	@FindBy(how = How.ID, using ="reject-btn-passed")
	public WebElement getRejectbtnPass;
	//Tab Failed
	@FindBy(how = How.ID, using = "tab-failed-li")
	public WebElement getTabFaild;
	@FindBy(how = How.ID, using ="approve-btn-failed")
	public WebElement getApprovebtnFail;
	@FindBy(how = How.ID, using ="save-btn-failed")
	public WebElement getSavebtnFail;
	@FindBy(how = How.ID, using ="reject-btn-failed")
	public WebElement getRejectbtnFail;
	// Tab Rejected
	@FindBy(how = How.ID, using = "tab-rejected-li")
	public WebElement getTabRejected;
	@FindBy(how = How.ID, using ="un-reject-btn-rejected")
	public WebElement getUnRejectbtnReject;
	@FindBy(how = How.ID, using ="save-btn-rejected")
	public WebElement getSavebtnReject;
	
	//sikuli image
	
	ImageElement image;	 
	@FindByImage(url = "image/calendar.png")
    public ImageElement calendarImage;	
	public ProductsReviewPage() {
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	public ProductsReviewPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
	public void ProductsReviewMenuClick() throws InterruptedException {		
		productsReviewMenu.click();		
		Thread.sleep(10000l);
	}
	public String title = Constants.titleProductsReview;
	public String titleHeader = Constants.titleProductsReviewHeader;
	public String titleBreadCrumb = Constants.titleProductsReviewBreadCrumb;
	
	public void inputProduct() {
		productInput.clear();
		productInput.sendKeys(Constants.UPC);
	}

	public void cleanDate() {
		getDateBeginTxt.clear();
		getDateEndTxt.clear();
	}

	public void search() {
		getSearchbtn.click();
	}
}
