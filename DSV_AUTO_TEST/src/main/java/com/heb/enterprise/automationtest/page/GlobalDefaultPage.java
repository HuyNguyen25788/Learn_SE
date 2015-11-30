package com.heb.enterprise.automationtest.page;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.AssertJUnit;

import com.heb.enterprise.automationtest.utils.Constants;
import com.heb.enterprise.automationtest.utils.Helper;

/**
 * Global default page.
 * 
 * @author huongnguyen1
 * 
 */
public class GlobalDefaultPage extends CommonPage{
	public GlobalDefaultPage(String browser) {
		super(browser);
		PageFactory.initElements(driver, this);
	}
	public GlobalDefaultPage() {
		super(Constants.BROWSER);
		PageFactory.initElements(driver, this);
	}
	/**
	 * MAX_TIME_RETRY.
	 */
	private final static int MAX_TIME_RETRY = 5;

	/**
	 * TEMP_TIME_RETRY.
	 */
	private int TEMP_TIME_RETRY = 0;

	@FindBy(how = How.ID, using = "treeHie")
	public WebElement treeHie;

	@FindBy(how = How.ID, using = "turnOnAllRule")
	public WebElement turnOnAllRule;

	@FindBy(how = How.CSS, using = "#formHie > div:nth-child(1) > div.col-sm-8.control-label.text-left.option-left > div")
	public List<WebElement> listCheckbox;

	@FindBy(how = How.ID, using = "retailStart")
	public WebElement retailStart;

	@FindBy(how = How.ID, using = "retailEnd")
	public WebElement retailEnd;

	@FindBy(how = How.ID, using = "maginStart")
	public WebElement maginStart;

	@FindBy(how = How.ID, using = "maginEnd")
	public WebElement maginEnd;

	@FindBy(how = How.ID, using = "reset-toDefault-btn")
	public WebElement resetToDefaultBtn;

	@FindBy(how = How.ID, using = "global-save-btn")
	public WebElement globalSaveBtn;
	
	@FindBy(how = How.CLASS_NAME, using="rule-modified")
	public List<WebElement> lstModifiedRule;
	
	/**
	 * checkGlobalTitle.
	 */
	public void checkGlobalTitle(){
		AssertJUnit.assertTrue(Constants.titleGlobalDefaultPage.equalsIgnoreCase(driver.getTitle()));
	}

	/**
	 * Click save button.
	 * 
	 * @return whether click event is okay.
	 */
	public boolean save() {
		boolean result = true;
		System.out.println("save: " + TEMP_TIME_RETRY);
		if (TEMP_TIME_RETRY < MAX_TIME_RETRY) {
			TEMP_TIME_RETRY++;
			if (globalSaveBtn.isDisplayed()) {
				globalSaveBtn.click();
			} else {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.save();
			}
		} else {
			result = false;
		}
		TEMP_TIME_RETRY = 0;
		return result;
	}

	/**
	 * Click reset button.
	 * 
	 * @return whether click event is okay.
	 */
	public boolean reset() {
		boolean result = true;
		System.out.println("reset: " + TEMP_TIME_RETRY);
		if (TEMP_TIME_RETRY < MAX_TIME_RETRY) {
			TEMP_TIME_RETRY++;
			if (resetToDefaultBtn.isDisplayed()) {
				resetToDefaultBtn.click();
			} else {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.reset();
			}
		} else {
			result = false;
		}
		TEMP_TIME_RETRY = 0;
		return result;
	}

	/**
	 * Input value for retail start.
	 * 
	 * @param value
	 * @return whether input into retail start text box is okay.
	 */
	public boolean inputRetailStart(String value) {
		boolean result = true;
		System.out.println("inputRetailStart: " + TEMP_TIME_RETRY);
		if (TEMP_TIME_RETRY < MAX_TIME_RETRY) {
			TEMP_TIME_RETRY++;
			if (retailStart.isDisplayed()) {
				retailStart.clear();
				retailStart.sendKeys(value);
			} else {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.inputRetailStart(value);
			}
		} else {
			result = false;
		}
		TEMP_TIME_RETRY = 0;
		return result;
	}

	/**
	 * Input value for retail end.
	 * 
	 * @param value
	 * @return whether input into retail end text box is okay.
	 */
	public boolean inputRetailEnd(String value) {
		boolean result = true;
		System.out.println("inputRetailEnd: " + TEMP_TIME_RETRY);
		if (TEMP_TIME_RETRY < MAX_TIME_RETRY) {
			TEMP_TIME_RETRY++;
			if (retailStart.isDisplayed()) {
				retailStart.clear();
				retailStart.sendKeys(value);
			} else {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.inputRetailEnd(value);
			}
		} else {
			result = false;
		}
		TEMP_TIME_RETRY = 0;
		return result;
	}

	/**
	 * Input value for magin start.
	 * 
	 * @param value
	 * @return whether input into magin start text box is okay.
	 */
	public boolean inputMaginStart(String value) {
		boolean result = true;
		System.out.println("inputMaginStart: " + TEMP_TIME_RETRY);
		if (TEMP_TIME_RETRY < MAX_TIME_RETRY) {
			TEMP_TIME_RETRY++;
			if (maginStart.isDisplayed()) {
				maginStart.clear();
				maginStart.sendKeys(value);
			} else {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.inputMaginStart(value);
			}
		} else {
			result = false;
		}
		TEMP_TIME_RETRY = 0;
		return result;
	}

	/**
	 * Input value for magin end.
	 * 
	 * @param value
	 * @return whether input into magin end text box is okay.
	 */
	public boolean inputMaginEnd(String value) {
		boolean result = true;
		System.out.println("maginEnd: " + TEMP_TIME_RETRY);
		if (TEMP_TIME_RETRY < MAX_TIME_RETRY) {
			TEMP_TIME_RETRY++;
			if (maginEnd.isDisplayed()) {
				maginEnd.clear();
				maginEnd.sendKeys(value);
			} else {
				try {
					Thread.sleep(5000L);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				this.inputMaginEnd(value);
			}
		} else {
			result = false;
		}
		TEMP_TIME_RETRY = 0;
		return result;
	}
}
