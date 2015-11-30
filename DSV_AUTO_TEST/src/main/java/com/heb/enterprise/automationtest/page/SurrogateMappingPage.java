package com.heb.enterprise.automationtest.page;

import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class SurrogateMappingPage extends CommonPage {
	
	public SurrogateMappingPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
	public SurrogateMappingPage() {
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	/*Title Surrogate Mapping*/
	public String title=Constants.titleSurrogateapping;
	
	/*BreadCrumb*/
	@FindBy(how = How.CLASS_NAME, using = "breadcrumb")
	public WebElement breadCrumb;
//	/*Home on breadcrumb*/
//	@FindBy(how = How.CLASS_NAME, using = "fa fa-home fa-custom")
//	public WebElement home;
//	/*Manage on Manage*/
//	@FindBy(how = How.CLASS_NAME, using = "Manage")
//	public WebElement manage;
//	/*Surrogate on Surrogateapping*/
//	@FindBy(how = How.CLASS_NAME, using = "Surrogateapping")
//	public WebElement surroGateapping;

	
	/*User text-box*/
	@FindBy(how = How.ID, using = "user-search-txt")
	public WebElement userSearchText;
	
	/*Seach Icon*/
	@FindBy(how = How.CSS, using = ".glyphicon.glyphicon-search")
	public WebElement searchIcon;
	
	/*Delete Button*/
	@FindBy(how = How.CLASS_NAME, using = "ui-autocomplete")
	
	public WebElement listValueUser;
	
	/*User text-box*/
	@FindBy(how = How.ID, using = "user-table")
	public WebElement gridView;
	
	/*Paging Above */
	@FindBy(how = How.CLASS_NAME, using = "wp-paggingbar-top")
	public WebElement paggingbar1;
	
	/*Paging bottom */
	@FindBy(how = How.CLASS_NAME, using = "pagination")
	public WebElement paggingbar2;

	
	/*Delete Button*/
	@FindBy(how = How.CLASS_NAME, using = "remove-btn")
	public WebElement DeleteButton;
	
	/*Confirm pop-up*/
	@FindBy(how = How.ID, using = "yes-select")
	public WebElement YesPopUp;
	
	@FindBy(how = How.ID, using = "no-select")
	public WebElement NoPopUp;
	
	/*Save button on Gird View*/
	
	@FindBy(how = How.ID, using = "save-user-btn")
	public WebElement SaveButton;
	
	/*Add button on Grid View*/
	
	@FindBy(how = How.ID, using = "add-user-btn")
	public WebElement AddButton;
	
	/*Save Icon */
	
	@FindBy(how = How.ID, using = "save-user-icon")
	public WebElement SaveIcon;
	
	/*Add Icon*/
	
	@FindBy(how = How.ID, using = "add-user-icon")
	public WebElement AddIcon;
	
	
	/*BDA USER text-box*/	
	@FindBy(how = How.CLASS_NAME, using = "user-id")
	public WebElement UserID;
	
	/*End date */
	@FindBy(how = How.CSS, using = ".share-date[name='endDt']")
	public WebElement Enddate;
	
	
	/*Determine a new line*/
	@FindBy(how = How.ID, using = "vendor-input-new-0")
	public WebElement UserInput;

	/*Determine a new line*/
	@FindBy(how = How.CSS, using = ".notifications.top-right")
	public WebElement noti;	
	
	/*Check title of surrgate mapping screen*/
	public void checkTitle() {
		Assert.assertTrue(driver.getTitle().equals(title));
	}

}
