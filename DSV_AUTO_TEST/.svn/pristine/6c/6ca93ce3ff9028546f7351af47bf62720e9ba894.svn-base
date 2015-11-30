package com.heb.enterprise.automationtest.productreview;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.seleniumemulation.WaitForPageToLoad;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.heb.enterprise.automationtest.page.ProductsReviewPage;
import com.heb.enterprise.automationtest.utils.Helper;

public class ProductReviewTest {
	ProductsReviewPage prp;
	Helper hp;

	@BeforeClass
	public void setup() throws InterruptedException {
		prp = new ProductsReviewPage();
		prp.getDriver().manage().window().maximize();
//		LoginPage lp = new LoginPage();
		prp.login();
		Thread.sleep(9000l);

	}
	@BeforeMethod 
	public void setupMethod() throws InterruptedException{
		prp.ProductsReviewMenuClick();
		Thread.sleep(5000l);
	}
	@AfterClass
	public void afterClass() {
		// driver.quit();
		prp.close();
	}
	@Test (priority = 0)	
	public void tc_Products_Review_001_1_Test() throws InterruptedException {
		// ProductsReviewPage prp = new ProductsReviewPage(driver);
		
		
		hp.waitForAjax(30);
		// "Products Review - DSV Assortment Tool" text should be displayed as
		// the page title "
		try {

			Assert.assertTrue(prp.getDriver().getTitle().equals(prp.title));
		} catch (Exception e) {
		}

	}

	@Test(priority = 1)
	public void tc_Products_Review_001_2_Test() {

		// "Products for Review" text should be displayed as the page header.
		Assert.assertTrue(prp.getTitleHeader.getText().equals(prp.titleHeader));
		// prp.checkTitleHeader();
	}

	
	@Test(priority = 2)
	public void tc_Products_Review_001_3_Test() {	
		Assert.assertTrue(getBreadcrumbPage().equals(prp.titleBreadCrumb));
	}

	@Test(priority = 3)
	public void tc_Products_Review_001_4_Test() {
		Assert.assertTrue(prp.getCommoditiesDropdown.isDisplayed());
	}

	@Test(priority = 4)
	public void tc_Products_Review_001_5_Test() {
		Assert.assertTrue(prp.getVendorDropdown.isDisplayed());
	}

	@Test(priority = 5)
	public void tc_Products_Review_001_6_Test() {
		Assert.assertTrue(prp.getFailedReason.isDisplayed());
	}

	@Test(priority = 6)
	public void tc_Products_Review_001_7_Test() {
		Assert.assertTrue(prp.getMAPCheckbox.isDisplayed());
	}

	@Test(priority = 7)
	public void tc_Products_Review_001_8_Test() {
		Assert.assertTrue(prp.getPrepriceCheckbox.isDisplayed());
	}

	@Test(priority = 8)
	public void tc_Products_Review_001_9_Test() {
		Assert.assertTrue(prp.getFailProductsCheckbox.isDisplayed());
	}

	@Test(priority = 9)
	public void tc_Products_Review_001_10_Test() {
		Assert.assertTrue(prp.getBrandTxt.isDisplayed());
	}

	@Test(priority = 10)
	public void tc_Products_Review_001_11_Test() {
		Assert.assertTrue(prp.getProductTxt.isDisplayed());
	}

	@Test(priority = 11)
	public void tc_Products_Review_001_12_Test() {
		Assert.assertTrue(prp.getDateBeginTxt.isDisplayed());
	}

	@Test(priority = 12)
	public void tc_Products_Review_001_13_Test() {
		Assert.assertTrue(prp.getDateEndTxt.isDisplayed());
	}

	@Test(priority = 13)
	public void tc_Products_Review_001_14_Test() {
		Assert.assertTrue(prp.getMarginBeginTxt.isDisplayed());
	}
	@Test(priority = 14)
	public void tc_Products_Review_001_15_Test() {
		Assert.assertTrue(prp.getMarginEndTxt.isDisplayed(),
				"Margin End not show");
	}

	@Test(priority = 15)
	public void tc_Products_Review_001_16_Test() {
		try {
			prp.calendarImage.click();
		} catch (Exception e) {
			System.out.println("Loi image");
		}
	}

	@Test(priority = 16)
	public void tc_Products_Review_002_1_Test() {
		hp.waitForAjax(30);
		Assert.assertTrue(prp.getClearbtn.isDisplayed(),
				"Clear button not show");
		Assert.assertTrue(prp.getClearbtn.isEnabled(),
				"Clear button is Disable");
	}

	@Test(priority = 17)
	public void tc_Products_Review_002_2_Test() {
		Assert.assertTrue(prp.getSearchbtn.isDisplayed(),
				"Search button not show");
		Assert.assertTrue(prp.getSearchbtn.isEnabled(),
				"Search button is Disable");
	}

	@Test(priority = 18)
	public void tc_Products_Review_003_Test() throws InterruptedException {
		hp.waitForAjax(30);
		Assert.assertTrue(prp.getExcelExportbtn.isDisplayed(),
				"Excel Export button not show");
		Thread.sleep(3000l);
		System.out.println("-----------------------------------"
				+ prp.getExcelExportbtn.getAttribute("class"));
		Assert.assertTrue(
				prp.getExcelExportbtn.getAttribute("class").contains(
						"disable-class"), "Excel Export button is Enable");

	}

	@Test(priority = 19)
	public void tc_Products_Review_004_1_Test() {
		hp.waitForAjax(30);
		Assert.assertTrue(prp.getRejectbtn.isDisplayed(),
				"Reject button not show in Tab All");
		Assert.assertTrue(!prp.getRejectbtn.isEnabled(),
				"Reject button is Enable in Tab All");
	}

	@Test(priority = 20)
	public void tc_Products_Review_004_2_Test() {

		Assert.assertTrue(prp.getApprovebtn.isDisplayed(),
				"Approve button not show in Tab All");
		Assert.assertTrue(!prp.getApprovebtn.isEnabled(),
				"Approve button is Enable in Tab All");
	}

	@Test(priority = 21)
	public void tc_Products_Review_004_3_Test() {
		Assert.assertTrue(prp.getUnRejectbtn.isDisplayed(),
				"Un-Reject button not show in Tab All");
		Assert.assertTrue(!prp.getUnRejectbtn.isEnabled(),
				"Un-Reject button is Enable in Tab All");
	}

	@Test(priority = 22)
	public void tc_Products_Review_004_4_Test() {
		Assert.assertTrue(prp.getSavebtn.isDisplayed(),
				"Save button not show in Tab All");
		Assert.assertTrue(!prp.getSavebtn.isEnabled(),
				"Save button is Enable in Tab All");
	}

	// TC_Products Review_005_Verify the "Reject, Approve, Save "button should
	// displayed on tab "Pass" of Search Results Section
	@Test(priority = 23)
	public void tc_Products_Review_005_1_Test() throws InterruptedException {		
		System.out.println("Click on Tab Pass");
		prp.getTabPass.click();
		hp.waitForAjax(30);
	}

	@Test(priority = 24)
	public void tc_Products_Review_005_2_Test() {
		Assert.assertTrue(prp.getRejectbtnPass.isDisplayed(),
				"Reject button not show in Tab Pass");
		Assert.assertTrue(!prp.getRejectbtnPass.isEnabled(),
				"Reject button is Enable in Tab Pass");
	}

	@Test(priority = 25)
	public void tc_Products_Review_005_3_Test() {
		Assert.assertTrue(prp.getApprovebtnPass.isDisplayed(),
				"Approve button not show in Tab Pass");
		Assert.assertTrue(!prp.getApprovebtnPass.isEnabled(),
				"Approve button is Enable in Tab Pass");
	}

	@Test(priority = 26)
	public void tc_Products_Review_005_4_Test() {
		Assert.assertTrue(prp.getSavebtnPass.isDisplayed(),
				"Save button not show in Tab Pass");
		Assert.assertTrue(!prp.getSavebtnPass.isEnabled(),
				"Save button is Enable in Tab Pass");
	}

	// TC_Products Review_006_ Verify the "Reject, Approve, Save "button should
	// displayed on tab "Failed" of Search Results Section
	@Test(priority = 27)
	public void tc_Products_Review_006_1_Test() throws InterruptedException {
		System.out.println("Click on Tab Failed");
		prp.getTabFaild.click();
		hp.waitForAjax(30);
	}

	@Test(priority = 28)
	public void tc_Products_Review_006_2_Test() {
		Assert.assertTrue(prp.getRejectbtnFail.isDisplayed(),
				"Reject button not show in Tab Failed ");
		Assert.assertTrue(!prp.getRejectbtnFail.isEnabled(),
				"Reject button is Enable in Tab Failed ");
	}

	@Test(priority = 29)
	public void tc_Products_Review_006_3_Test() {
		Assert.assertTrue(prp.getApprovebtnFail.isDisplayed(),
				"Approve button not show in Tab Failed ");
		Assert.assertTrue(!prp.getApprovebtnFail.isEnabled(),
				"Approve button is Enable in Tab Failed ");
	}

	@Test(priority = 30)
	public void tc_Products_Review_006_4_Test() {
		Assert.assertTrue(prp.getSavebtnFail.isDisplayed(),
				"Save button not show in Tab Failed ");
		Assert.assertTrue(!prp.getSavebtnFail.isEnabled(),
				"Save button is Enable in Tab Failed ");
	}

	// TC_Products Review_007_ Verify the "Un-Reject,  Save "button should
	// displayed on tab "Reject" of Search Results Section
	@Test(priority = 31)
	public void tc_Products_Review_007_1_Test() throws InterruptedException {
		System.out.println("Click on Tab Rejected");
		prp.getTabRejected.click();
		hp.waitForAjax(30);
	}

	@Test(priority = 32)
	public void tc_Products_Review_007_2_Test() {
		Assert.assertTrue(prp.getUnRejectbtnReject.isDisplayed(),
				"UnReject button not show in Tab Rejected ");
		Assert.assertTrue(!prp.getUnRejectbtnReject.isEnabled(),
				"UnReject button is Enable in Tab Rejected ");
	}

	@Test(priority = 33)
	public void tc_Products_Review_007_3_Test() {
		Assert.assertTrue(prp.getSavebtnReject.isDisplayed(),
				"Save button not show in Tab Rejected ");
		Assert.assertTrue(!prp.getSavebtnReject.isEnabled(),
				"Save button is Enable in Tab Rejected");
	}

	/*
	 * Verify web should be display value on  Search Results Section 
	 * when user click on search button with any vendor in Drop-down exists value in DB
	 */
	@Test(priority = 34)
	public void tc_Products_Review_008_Test() throws InterruptedException {
		prp.getTabAll.click();
		hp.waitForAjax(30);
		prp.getClearbtn.click();
		prp.getVendorDropdown.click();
		hp.waitForAjax(30);
		prp.chkVendorDrd.click();
		hp.waitForAjax(30);
		prp.getSearchbtn.click();
		hp.waitForAjax(30);	
		if(prp.getTable.isDisplayed()){
			System.out.println("bb: " + prp.getTable.getAttribute("class"));
			if(prp.getTable.findElement(By.tagName("tbody")).isDisplayed()){
				Assert.assertTrue(prp.getTable.findElement(By.tagName("tbody")).findElements(By.tagName("tr")).size() > 0, "Retail And Cost Review table default display is wrong.");
			}			
		}else{
			Assert.fail("Product overview table is not displayed.");
		}
	}

	public String getBreadcrumbPage(){
			String text= "";
			List<WebElement> lst = prp.getlsTitleBreadCrumb;			
			if(lst != null){
			for(int i=0;i<lst.size();i++){
					text+=lst.get(i).getText();
						if(i<lst.size()-1){
							text+=">";
						}
					}
			System.out.println("text-------------------------------------"+text);
			}
			return text;
			
		}

	@Test
	public void imageTestSikuli(){
	//	prp.calendarImage.click();
	}
	@AfterTest
	public void tearDown() throws InterruptedException {
		Helper.closeWindow();
		/*LoginPage lp = new LoginPage();
		lp.logout();*/
	}
	
}
