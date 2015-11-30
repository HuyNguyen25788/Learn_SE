package com.heb.enterprise.automationtest.page;

import junit.framework.Assert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.heb.enterprise.automationtest.utils.Constants;


public class MainPage {
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentMainNav\"]/ul/li[2]/a")
	private WebElement link;
	
	@FindBy(how = How.ID, using = "vendor-management")
	@CacheLookup
	private WebElement menu_vendor;
	
	public String title = Constants.titleMainPage;

	public WebDriver driver;

	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
		
	}
	public boolean equalsHello(String abc){
//		System.out.println(abc+"%%"+hello.getText());
//		return abc.equals(hello.getText());
		return true;
	}
	public void checkTitle() {
		Assert.assertTrue(driver.getTitle().equals(title));
	}
	public void navigateVendorPage() throws InterruptedException{
		link.click();
		Thread.sleep(5000L);
		menu_vendor.isDisplayed();
		//Thread.sleep(5000L);
	//	System.out.println(menu_vendor.isDisplayed());
		menu_vendor.click();
		//Thread.sleep(5000L);
	}
	
}
