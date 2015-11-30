package com.heb.enterprise.automationtest.page;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import com.heb.enterprise.automationtest.utils.Constants;

public class PricingRulePage extends CommonPage {
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentMainNav\"]/ul/li[2]/a")
	public WebElement link;
	
	@FindBy(how = How.ID, using = "pricing-rules")
	public WebElement menu_PricingRule;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"wrap\"]/div[2]/ul")
	public WebElement menu_breadcrumb;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"pricingrule\"]/div[1]/div[1]")
	public WebElement pricingruleTitlePanel;
	
	//commondity combobox
	@FindBy(how = How.ID, using = "commodityInputWrap")
	public WebElement commodityInputWrap;
	
	@FindBy(how = How.ID, using = "commodityButton")
	public WebElement commodityButton;
	
	@FindBy(how = How.ID, using = "commodityInput-id")
	public WebElement ui_autocomplete_commodity;
	
	//subcommondity combobox
	@FindBy(how = How.ID, using = "subCommodityInputWrap")
	public WebElement subCommodityInputWrap;
	@FindBy(how = How.ID, using = "subCommodityButton")
	public WebElement subCommodityButton;
	@FindBy(how = How.ID, using = "subCommodityInput-id")
	public WebElement ui_autocomplete_subcommodity;
	
	//vendor combobox
	@FindBy(how = How.ID, using = "vendorInputWrap")
	public WebElement vendorInputWrap;
	@FindBy(how = How.ID, using = "vendorButton")
	public WebElement vendorButton;
	@FindBy(how = How.ID, using = "vendor-id")
	public WebElement ui_autocomplete_vendor;
	@FindBy(how = How.ID, using = "pricing-strategy")
	public WebElement pricing_strategy_input;
	
	@FindBy(how = How.CSS, using = "#contentApp > div:nth-child(2)")
	public WebElement maincontent;
	
	
	@FindBy(how = How.ID, using = "asign-com")
	public WebElement assign_com_content;
	@FindBy(how = How.ID, using = "pricing-asign-btn")
	public WebElement pricing_asign_btn;
	
	@FindBy(how = How.ID, using = "pricing-save-btn")
	public WebElement 	pricing_save_btn;

	
	
	public PricingRulePage(String browser) {
		super(browser);
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}
	public PricingRulePage() {
		super(Constants.BROWSER);
		AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 100);
		PageFactory.initElements(factory, this);
	}
	public void reinitPage(){
		PageFactory.initElements(driver, this);
	}
	public void navigatePricingRulePage() throws InterruptedException {
		link.click();
		Thread.sleep(5000L);
		menu_PricingRule.isDisplayed();
		menu_PricingRule.click();
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
}
