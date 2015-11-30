package com.heb.enterprise.automationtest.surrogatemapping;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heb.enterprise.automationtest.page.SurrogateMappingPage;
import com.heb.enterprise.automationtest.page.VendorManagementPage;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class SurrogateMappingTest  {

//	public WebDriver driver;	
	SurrogateMappingPage surrpage;
	@BeforeClass
	public void beforeClass() throws InterruptedException {
		surrpage = new SurrogateMappingPage();
		surrpage.login();
		//Helper.waitForWindow("[*]*Dashboard[*]*");
		this.waitForAjax(10000);
//		Menu menu = new Menu();
		surrpage.clickOnMenu(Constants.SURROGATE_MAPPING_URL_ID);
		Thread.sleep(1000);	
	}
	/*Login and navigate to surrogate mapping page*/
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
//		LoginPage loginpage = new LoginPage();
//		loginpage.login();
	//	Helper.waitForWindow("[*]*Dashboard[*]*");
		this.waitForAjax(10000);
//		Menu menu = new Menu();
		surrpage.clickOnMenu(Constants.SURROGATE_MAPPING_URL_ID);
		Thread.sleep(1000);	
	}
	@AfterClass
	public void afterClass() {
		// driver.quit();
		surrpage.close();
	}
	/*BreadCrumb*/
	@Test
	public void BreadCrumb() throws InterruptedException {
//		surrpage = new SurrogateMappingPage();
//		surrpage.login();
    	Assert.assertTrue(surrpage.breadCrumb.isDisplayed());
	}	
		
	/*Check app navigate to SurrogateMappingPage successfully*/
	@Test
	public void CheckTitle() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		surrpage.checkTitle();		
	}	
	
	/*Search by click Icon*/
	@Test
	public void SearchIconUser() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("b660509");
		Thread.sleep(3000l);
    	Assert.assertTrue(surrpage.userSearchText.isDisplayed());
		this.waitForAjax(1000);
    	Assert.assertTrue(surrpage.searchIcon.isDisplayed());
    	surrpage.searchIcon.click();
    	Assert.assertTrue(surrpage.gridView.isDisplayed());
	}
	
    /*Display all BDA assign to key search BDM*/
	@Test
	public void SearchUser() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("h");
		Thread.sleep(3000l);
    	Assert.assertTrue(surrpage.userSearchText.isDisplayed());
    	Assert.assertTrue(surrpage.listValueUser.isDisplayed());
		surrpage.userSearchText.sendKeys(Keys.DOWN);			
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.ENTER);
		Thread.sleep(3000l);
    	Assert.assertTrue(surrpage.gridView.isDisplayed());
	}
	
    /*Check PaggingBar*/
	@Test
	public void PaggingBar() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("h");
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.DOWN);			
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.ENTER);
		/*Pagging bar at Above*/
    	Assert.assertTrue(surrpage.paggingbar1.isDisplayed());
    	/*Pagging bar at bottom*/
    	Assert.assertTrue(surrpage.paggingbar2.isDisplayed());

	}
	
    /*Confirm delete a BDA*/
	@Test
	public void DeleteYes() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("h");
		surrpage.userSearchText.sendKeys(Keys.DOWN);			
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.ENTER);	
		Thread.sleep(2000l);
    	Assert.assertTrue(surrpage.DeleteButton.isDisplayed());
		surrpage.DeleteButton.click();
		Thread.sleep(3000l);	
    	Assert.assertTrue(surrpage.YesPopUp.isDisplayed());
		surrpage.YesPopUp.click();
		
	}
	
	/*Confirm doesn't delete a BDA */
	@Test
	public void DeleteNo() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("C");
		surrpage.userSearchText.sendKeys(Keys.DOWN);			
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.ENTER);	
		Thread.sleep(2000l);
    	Assert.assertTrue(surrpage.DeleteButton.isDisplayed());
		surrpage.DeleteButton.click();
		Thread.sleep(3000l);		
    	Assert.assertTrue(surrpage.NoPopUp.isDisplayed());
		surrpage.NoPopUp.click();
		
	}
	
	/*Add a new line with Add and Save button */
	@Test
	public void AddNewWithButton() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("B");
		surrpage.userSearchText.sendKeys(Keys.DOWN);			
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.ENTER);	
		this.waitForAjax(1000);
    	Assert.assertTrue(surrpage.AddButton.isDisplayed());		
    	surrpage.AddButton.click();
    	this.waitForAjax(1000);    
    	Assert.assertTrue(surrpage.UserID.isDisplayed());	
    	surrpage.UserID.sendKeys("b660509");
		surrpage.userSearchText.sendKeys(Keys.DOWN);		
		surrpage.userSearchText.sendKeys(Keys.ENTER);	    	
    	surrpage.Enddate.sendKeys("10/27/2015");   
		surrpage.Enddate.sendKeys(Keys.DOWN);			
		surrpage.Enddate.sendKeys(Keys.ENTER);
    	
		if (surrpage.getDriver() instanceof JavascriptExecutor) {
			JavascriptExecutor jsDriver = (JavascriptExecutor) surrpage.getDriver();
			jsDriver.executeScript("$('#user-table').DataTable().data()[0].subordinated = 'b660509';");
			jsDriver.executeScript("$('#user-table').DataTable().data()[0].endDt = '10/27/2015';");
		}
		
		Thread.sleep(3000l);   
    	Assert.assertTrue(surrpage.SaveButton.isDisplayed());	
    	surrpage.SaveButton.click();		
   }	
	
	/*Add a new line with Add and Save Icon */
	@Test
	public void AddNewwithIcon() throws InterruptedException {
//		SurrogateMappingPage surrpage = new SurrogateMappingPage();
		this.waitForAjax(100000);
    	surrpage.userSearchText.click();
    	surrpage.userSearchText.clear();
		surrpage.userSearchText.sendKeys("h");
		surrpage.userSearchText.sendKeys(Keys.DOWN);			
		Thread.sleep(3000l);
		surrpage.userSearchText.sendKeys(Keys.ENTER);	
		this.waitForAjax(1000);
    	surrpage.AddIcon.click();
		Thread.sleep(3000l);    	
    	surrpage.UserID.sendKeys("b660509");
		surrpage.userSearchText.sendKeys(Keys.DOWN);		
		surrpage.userSearchText.sendKeys(Keys.ENTER);	    	
    	surrpage.Enddate.sendKeys("10/27/2015");   
		surrpage.Enddate.sendKeys(Keys.DOWN);			
		surrpage.Enddate.sendKeys(Keys.ENTER);
    	
		if (surrpage.getDriver() instanceof JavascriptExecutor) {
			JavascriptExecutor jsDriver = (JavascriptExecutor) surrpage.getDriver();
			jsDriver.executeScript("$('#user-table').DataTable().data()[0].subordinated = 'b660509';");
			jsDriver.executeScript("$('#user-table').DataTable().data()[0].endDt = '10/27/2015';");
		}
		
		Thread.sleep(3000l);    
    	surrpage.SaveIcon.click();
//    	Assert.assertTrue(surrpage.noti.isDisplayed());
//		Assert.assertEquals(surrpage.noti.getText(),"The changes have been saved successfully");		
	}

	private void waitForAjax(int timeoutInSeconds) {
		try {
			if (surrpage.getDriver() instanceof JavascriptExecutor) {
				JavascriptExecutor jsDriver = (JavascriptExecutor) surrpage.getDriver();

				for (int i = 0; i < timeoutInSeconds; i++) {
					Object numberOfAjaxConnections = jsDriver
							.executeScript("return jQuery.active");
					// return should be a number
					if (numberOfAjaxConnections instanceof Long) {
						Long n = (Long) numberOfAjaxConnections;
						System.out
								.println("Number of active jquery ajax calls: "
										+ n);
						if (n.longValue() == 0L)
							break;
					}
					Thread.sleep(1000);
				}
			} else {
				System.out.println("Web driver: " + surrpage.getDriver()
						+ " cannot execute javascript");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

}
