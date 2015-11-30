package com.heb.enterprise.automationtest.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.heb.enterprise.automationtest.browsers.Browser;
import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

public class CommonPage extends Browser {

	// form login
	@FindBy(how = How.ID, using = "j_username")
	private WebElement username;

	@FindBy(how = How.ID, using = "password")
	private WebElement password;

	@FindBy(how = How.ID, using = "loginBtn")
	private WebElement buttonsubmit;

	@FindBy(how = How.CSS, using = "a[href*='/assortment/logout']")
	private WebElement clicklogout1;

	@FindBy(how = How.ID, using = "errorId")
	private WebElement errorId;
	@FindBy(how = How.ID, using = "errorPass")
	private WebElement errorPass;
	@FindBy(how = How.ID, using = "errorCaptcha")
	private WebElement errorCaptcha;

	//menu header
	@FindBy(how = How.XPATH, using = "//*[@id=\"contentMainNav\"]/ul/li[2]/a")
	private WebElement link;

	@FindBy(how = How.ID, using = Constants.HOME_URL_ID)
	private WebElement assortmentHome;

	@FindBy(how = How.ID, using = Constants.GLOBAL_URL_ID)
	private WebElement globalAssortment;

	@FindBy(how = How.ID, using = Constants.VENDOR_MANAGEMENT_URL_ID)
	private WebElement vendorManagement;

	@FindBy(how = How.ID, using = Constants.PRICING_RULE_URL_ID)
	private WebElement pricingRule;

	@FindBy(how = How.ID, using = Constants.SURROGATE_MAPPING_URL_ID)
	private WebElement surrogateMapping;

	@FindBy(how = How.ID, using = Constants.PRODUCT_REVIEW_URL_ID)
	private WebElement productReview;

	@FindBy(how = How.ID, using = Constants.RETAIL_COST_REVIEW_URL_ID)
	private WebElement retailCostReview;

	@FindBy(how = How.ID, using = Constants.RETAIL_INQUIRY_URL_ID)
	private WebElement retailInquiry;

	@FindBy(how = How.ID, using = Constants.REPORT_NEW_ITEM_URL_ID)
	private WebElement reportNewItems;

	/**
	 * CommonPage.
	 */
	public CommonPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}

	public void inputUsername(String value) {
		username.clear();
		username.sendKeys(value);
	}

	public void inputPassword(String value) {
		password.clear();
		password.sendKeys(value);
	}

	public void submit() {
		buttonsubmit.click();
	}

	public void logout() throws InterruptedException {
		Thread.sleep(5000l);
		System.out.println(clicklogout1.getText());

		clicklogout1.click();
	}

	public boolean equalsErrorId(String abc) {
		System.out.println(abc + "%%" + errorId.getText());
		return abc.equals(errorId.getText());
	}

	public boolean equalsErrorPass(String abc) {
		System.out.println(abc + "%%" + errorPass.getText());
		return abc.equals(errorPass.getText());
	}

	public boolean equalsErrorCaptcha(String abc) {
		System.out.println(abc + "%%" + errorCaptcha.getText());
		return abc.equals(errorCaptcha.getText());
	}

	public void login() {
		this.inputUsername(Constants.USERNAME);
		this.inputPassword(Constants.PASSWORD);
		this.submit();
	}

	/**
	 * Navigate on menu.
	 * 
	 * @param idUrl
	 * @author huongnguyen1
	 */
	public void clickOnMenu(String idUrl) {
		Helper.waitForElement(By.id(idUrl));
		if (assortmentHome.equals(idUrl) && assortmentHome.isDisplayed()) {
			assortmentHome.click();
		} else {
			link.click();
			switch (idUrl) {
			case Constants.GLOBAL_URL_ID:
				if (globalAssortment.isDisplayed()) {
					globalAssortment.click();
				}
				break;
			case Constants.VENDOR_MANAGEMENT_URL_ID:
				if (vendorManagement.isDisplayed()) {
					vendorManagement.click();
				}
				break;
			case Constants.PRICING_RULE_URL_ID:
				if (pricingRule.isDisplayed()) {
					pricingRule.click();
				}
				break;
			case Constants.SURROGATE_MAPPING_URL_ID:
				if (surrogateMapping.isDisplayed()) {
					surrogateMapping.click();
				}
				break;
			case Constants.PRODUCT_REVIEW_URL_ID:
				if (productReview.isDisplayed()) {
					productReview.click();
				}
				break;
			case Constants.RETAIL_COST_REVIEW_URL_ID:
				if (retailCostReview.isDisplayed()) {
					retailCostReview.click();
				}
				break;
			case Constants.RETAIL_INQUIRY_URL_ID:
				if (retailInquiry.isDisplayed()) {
					retailInquiry.click();
				}
				break;
			case Constants.REPORT_NEW_ITEM_URL_ID:
				if (reportNewItems.isDisplayed()) {
					reportNewItems.click();
				}
				break;
			default:

				break;
			}
		}
	}
}
