package com.heb.enterprise.automationtest.page;


import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class CostReviewPage extends CommonPage{
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentMainNav\"]/ul/li[4]")
	public WebElement retailAndCostReviewDropdownMenu;
	
	@FindBy(how = How.ID, using = "retail-cost-review")
	public WebElement costReviewMenu;

	@FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div[3]/div/div[1]/span")
	public WebElement pageHeader;
	
	@FindBy(how = How.CSS, using = ".breadcrumb-content ul.breadcrumb:first-child > li > a")
	public List<WebElement> navigationHeaderItems;
	
	@FindBy(how = How.ID, using = "commodities-input")
	public WebElement commodityInput;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[1]/form/div[1]/div/div")
	public WebElement commodityButton;
	
	@FindBy(how = How.ID, using = "ui-id-1")
	public WebElement commodityAutoComplete;
	
	@FindBy(how = How.CSS, using = "#ui-id-1 > li")
	public List<WebElement> commodityAutoCompleteItems;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[2]/div/div[1]/div/div")
	public WebElement vendorSelect;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[2]/div/div[1]/div/div/div/span[3]")
	public WebElement vendorButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[2]/div/div[1]/div/div/ul")
	public WebElement vendorDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[2]/div/div[1]/div/div/ul/li")
	public List<WebElement> vendorDropdownItems;
	
	@FindBy(how = How.ID, using = "brand-input")
	public WebElement brandInput;
	
	@FindBy(how = How.ID, using = "product-input")
	public WebElement productInput;
	
	@FindBy(how = How.ID, using = "dateBegin")
	public WebElement dateBeginInput;
	
	@FindBy(how = How.ID, using = "dateBegin-icon-wp")
	public WebElement dateBeginButton;
	
	@FindBy(how = How.ID, using = "dateEnd")
	public WebElement dateEndInput;
	
	@FindBy(how = How.ID, using = "dateEnd-icon-wp")
	public WebElement dateEndButton;
	
	@FindBy(how = How.CSS, using = ".datepicker-days")
	public WebElement dateDiv;
	
	@FindBy(how = How.CSS, using = ".datepicker-days td.day")
	public List<WebElement> dateSelectItems;
	
	@FindBy(how = How.ID, using = "marginBegin")
	public WebElement marginBegin;
	
	@FindBy(how = How.ID, using = "marginEnd")
	public WebElement marginEnd;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[1]/form/div[5]/div/div")
	public WebElement failedReasonSelect;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[1]/form/div[5]/div/div/div/span[3]")
	public WebElement failedReasonButton;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[1]/form/div[5]/div/div/ul")
	public WebElement failedReasonDropdown;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"new-and-changes-header\"]/div[1]/form/div[5]/div/div/ul/li")
	public List<WebElement> failedReasonDropdownItems;
	
	@FindBy(how = How.ID, using = "show-all-map-check")
	public WebElement showAllMapCheck;
	
	@FindBy(how = How.ID, using = "show-only-prePrice-check")
	public WebElement showOnlyPrePriceCheck;
	
	@FindBy(how = How.CSS, using = "#new-and-changes-all-table tbody tr")
	public List<WebElement> allCostReviewTableItems;
	
	@FindBy(how = How.CSS, using = "#new-and-changes-passed-table tbody tr")
	public List<WebElement> passedCostReviewTableItems;
	
	@FindBy(how = How.CSS, using = "#new-and-changes-failed-table tbody tr")
	public List<WebElement> failedCostReviewTableItems;
	
	@FindBy(how = How.ID, using = "reset-cost-review-btn")
	public WebElement resetButton;
	
	@FindBy(how = How.ID, using = "search-cost-review-btn")
	public WebElement searchButton;
	
	@FindBy(how = How.ID, using = "cost-review-export-btn")
	public WebElement exportExcelButton;

	@FindBy(how = How.ID, using = "accept-btn-all")
	public WebElement allowButton;
	
	@FindBy(how = How.ID, using = "reject-btn-all")
	public WebElement revertButton;
	
	@FindBy(how = How.ID, using = "remove-btn-all")
	public WebElement unpublishButton;

	@FindBy(how = How.ID, using = "save-btn-all")
	public WebElement saveButton;
	
	@FindBy(how = How.ID, using = "tab-all-title")
	public WebElement allTab;
	
	@FindBy(how = How.ID, using = "reject-btn-passed")
	public WebElement revertPassedButton;
	
	@FindBy(how = How.ID, using = "remove-btn-passed")
	public WebElement unpublishPassedButton;

	@FindBy(how = How.ID, using = "save-btn-passed")
	public WebElement savePassedButton;
	
	@FindBy(how = How.ID, using = "tab-passed-title")
	public WebElement passTab;
	
	@FindBy(how = How.ID, using = "accept-btn-failed")
	public WebElement allowFailedButton;
	
	@FindBy(how = How.ID, using = "remove-btn-failed")
	public WebElement unpublishFailedButton;

	@FindBy(how = How.ID, using = "save-btn-failed")
	public WebElement saveFailedButton;
	
	@FindBy(how = How.ID, using = "tab-failed-title")
	public WebElement failedTab;
	
	public CostReviewPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
	public CostReviewPage() {
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	/*public void navigateCostReviewPage() throws InterruptedException {
		link.click();
		Thread.sleep(5000L);
		menu_CostReview.isDisplayed();
		menu_CostReview.click();
		Thread.sleep(5000L);
	}
	public String getBreadcrumbPage(){
		String text= "";
		List<WebElement> lst=menu_breadcrumb.findElements(By.tagName("a"));
		for(int i=0;i<lst.size();i++){
			text+=lst.get(i).getText();
			if(i<lst.size()-1){
				text+=">";
			}
		}
		return text;
	}
	public List<WebElement> getListAutocompled(WebElement e,String tag){
		List<WebElement> lst=e.findElements(By.tagName(tag));
		return lst;
	}
	*/
	

}
