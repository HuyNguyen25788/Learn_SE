package com.heb.enterprise.automationtest.utils;

import java.net.MalformedURLException;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.AssertJUnit;

import com.heb.enterprise.automationtest.browsers.Browser;
import com.heb.enterprise.automationtest.propertiesfile.ReadProperties;

/**
 * the base test that includes all Selenium 2 functionality that you will need
 * to get you rolling.
 * 
 * @author huongnguyen
 * 
 */
public class Helper extends ReadProperties {

//	public static WebDriver driver = null;

	// max seconds before failing a script.
	private static final int MAX_ATTEMPTS = 5;

	private static int attempts = 0;

	private static Actions actions;

	private JSONArray jsonDataArr;

	/**
	 * The url that an automated test will be testing.
	 */
	public static String baseUrl;

	private static Pattern p;
	private static Matcher m;

	public JSONBeforeAnnotated jsonBeforeAnnotated = new JSONBeforeAnnotated();

	/**
	 * Helper.
	 * @author huongnguyen1
	 */
	public Helper() {
	}

	public void setUp() throws MalformedURLException {
		jsonDataArr = null;
		if (jsonBeforeAnnotated != null
				&& jsonBeforeAnnotated.getJsonBeforeTest() != null
				&& !StringUtils.isEmpty(jsonBeforeAnnotated
						.getJsonBeforeTestValue())) {
			try {
				String jsonDataStr = IOUtils.toString(
						getClass().getResourceAsStream(
								jsonBeforeAnnotated.getJsonBeforeTestValue()),
						"UTF-8");
				jsonDataArr = (JSONArray) new JSONParser().parse(jsonDataStr);
				AssertJUnit.assertNotNull(jsonDataArr);
				AssertJUnit.assertTrue("JSON Data array must greater 0",
						jsonDataArr.size() > 0);
			} catch (Exception x) {
				System.err.println("ERROR : " + x.getMessage());
			}
		}

		if (actions == null) {
			actions = new Actions(Browser.driver);
		}
	}

	/**
	 * Private method that acts as an arbiter of implicit timeouts of sorts..
	 * sort of like a Wait For Ajax method.
	 */
	public static WebElement waitForElement(By by) {
		int attempts = 0;
		int size = Browser.driver.findElements(by).size();
		// System.out.println("Wait element : " + by.toString() + " -- " +
		// size);
		while (size == 0) {
			size = Browser.driver.findElements(by).size();
			if (attempts == MAX_ATTEMPTS)
				Assert.fail(String.format("Could not find %s after %d seconds",
						by.toString(), MAX_ATTEMPTS));
			attempts++;
			try {
				Thread.sleep(2500); // sleep for 1 second.
			} catch (Exception x) {
				Assert.fail("Failed due to an exception during Thread.sleep!");
				x.printStackTrace();
			}
		}

		if (size > 1)
			System.err.println("WARN: There are more than 1 " + by.toString()
					+ " 's!");

		return Browser.driver.findElement(by);
	}

	/**
	 * Get elements
	 * 
	 * @param by
	 *            input list
	 * @return
	 */
	public static List<WebElement> waitForElements(By by) {
		int attempts = 0;
		int size = Browser.driver.findElements(by).size();

		while (size == 0) {
			size = Browser.driver.findElements(by).size();
			if (attempts == MAX_ATTEMPTS)
				Assert.fail(String.format("Could not find %s after %d seconds",
						by.toString(), MAX_ATTEMPTS));
			attempts++;
			try {
				Thread.sleep(2500); // sleep for 1 second.
			} catch (Exception x) {
				Assert.fail("Failed due to an exception during Thread.sleep!");
				x.printStackTrace();
			}
		}
		return Browser.driver.findElements(by);
	}

	/**
	 * Click an element.
	 * 
	 * @param by
	 *            The element to click.
	 */
	public static void click(By by) {
		waitForElement(by).click();
	}

	/**
	 * Drag and Drop an element.
	 * 
	 * @param by
	 *            The element to drag and drop.
	 */
	public static void dragDropElement(WebElement webElement, By byDrop) {
		actions.dragAndDrop(webElement, waitForElement(byDrop)).perform();
	}

	/**
	 * Drag and Drop elements.
	 * 
	 * @param by
	 *            The element to drag and drop.
	 */
	public static void dragDropElements(List<WebElement> elements, By byDrop) {
		for (WebElement element : elements) {
			actions.click(element);
		}
		// actions.clickAndHold(Elements.get(1)).clickAndHold(Elements.get(2)).click();
		// Action selectMultiple = actions.build();
		actions.dragAndDrop(elements.get(0), waitForElement(byDrop)).build()
				.perform();
	}

	/**
	 * Drag and Drop
	 * 
	 * @param by
	 *            The element to drag and drop.
	 */
	public static void DragDrop(By byDrag, By byDrop) {
		actions.dragAndDrop(waitForElement(byDrag), waitForElement(byDrop))
				.perform();
	}

	/**
	 * Clears the text from a text field, and sets it.
	 * 
	 * @param by
	 *            The element to set the text of.
	 * @param text
	 *            The text that the element will have.
	 */
	public static void setText(By by, String text) {
		WebElement element = waitForElement(by);
		element.clear();
		element.sendKeys(text);
	}

	/**
	 * Input value into textbox.
	 * 
	 * @param by
	 */
	public static void setKey(By by) {
		WebElement element = waitForElement(by);
		element.sendKeys(Keys.RETURN);
	}

	/**
	 * Hover over an element.
	 * 
	 * @param by
	 *            The element to hover over.
	 */
	public static void hoverOver(By by) {
		actions.moveToElement(Browser.driver.findElement(by)).perform();
	}

	/**
	 * Hover over an webelement.
	 * 
	 * @param by
	 *            The element to hover over.
	 */
	public static void hover(WebElement e) {
		actions.moveToElement(e).perform();
	}

	/**
	 * Checks if the element is checked or not.
	 * 
	 * @param by
	 * @return <i>this method is not meant to be used fluently.</i><br>
	 * <br>
	 *         Returns <code>true</code> if the element is checked. and
	 *         <code>false</code> if it's not.
	 */
	public static boolean isChecked(By by) {
		return waitForElement(by).isSelected();
	}

	/**
	 * Checks if the element is present or not.<br>
	 * 
	 * @param by
	 * @return <i>this method is not meant to be used fluently.</i><br>
	 * <br
	 *         . Returns <code>true</code> if the element is present. and
	 *         <code>false</code> if it's not.
	 */
	public static boolean isPresent(By by) {
		if (Browser.driver.findElements(by).size() > 0)
			return true;
		return false;
	}

	/**
	 * Get the text of an element. <blockquote>This is a consolidated method
	 * that works on input's, as select boxes, and fetches the value rather than
	 * the innerHTMl.</blockquote>
	 * 
	 * @param by
	 * @return
	 */
	public static String getText(By by) {
		String text = null;
		WebElement e = waitForElement(by);

		if (e.getTagName().equalsIgnoreCase("input")
				|| e.getTagName().equalsIgnoreCase("select"))
			text = e.getAttribute("value");
		else
			text = e.getText();

		return text;
	}

	public static String getTextInsideElement(WebElement e, By byChild) {
		String text = "";
		WebElement ec = e.findElement(byChild);
		if (ec.getTagName().equalsIgnoreCase("input")
				|| ec.getTagName().equalsIgnoreCase("select"))
			text = ec.getAttribute("value");
		else
			text = ec.getText();

		return text;
	}

	public static String getTextInsideElementFromDropDown(WebElement child) {
		String text = "";
		if (child.getTagName().equalsIgnoreCase("option")
				|| child.getTagName().equalsIgnoreCase("input"))
			text = child.getAttribute("value");
		else
			text = child.getText();

		return text;
	}

	public static void clickInsideElement(WebElement e, By byChild) {
		hover(e);
		WebElement ec = (new WebDriverWait(Browser.driver, 120)
				.until(ExpectedConditions.visibilityOfElementLocated(byChild)));
		ec.click();
	}

	/**
	 * Check a checkbox, or radio button.
	 * 
	 * @param by
	 *            The element to check.
	 */
	public static void check(By by) {
		if (!isChecked(by)) {
			waitForElement(by).click();
			AssertJUnit.assertTrue(by.toString() + " did not check!",
					isChecked(by));
		}
	}

	/**
	 * Uncheck a checkbox, or radio button.
	 * 
	 * @param by
	 *            The element to uncheck.
	 */
	public static void uncheck(By by) {
		if (isChecked(by)) {
			waitForElement(by).click();
			AssertJUnit.assertFalse(by.toString() + " did not uncheck!",
					isChecked(by));
		}
	}

	/**
	 * Selects an option from a dropdown ({@literal <select> tag}) based on the
	 * text displayed.
	 * 
	 * @param by
	 * @param text
	 *            The text that is displaying.
	 * @see #selectOptionByValue(By, String)
	 */
	public static void selectOptionByText(By by, String text) {
		Select box = new Select(waitForElement(by));
		box.selectByVisibleText(text);
	}

	/**
	 * Selects an option from a dropdown ({@literal <select> tag}) based on the
	 * value.
	 * 
	 * @param by
	 * @param value
	 *            The <code>value</code> attribute of the option.
	 * @see #selectOptionByText(By, String)
	 */
	public static void selectOptionByValue(By by, String value) {
		Select box = new Select(waitForElement(by));
		box.selectByValue(value);
	}

	/**
	 * Gets an option from list order ({@literal <select> tag}) based on the
	 * text displayed.
	 * 
	 * @param by
	 * @param text
	 *            The text that is displaying.
	 * @see #getOptionByStatus(By, String)
	 * @return List<WebElement>
	 */
	public static List<WebElement> getOptionByText(By by) {
		List<WebElement> e = waitForElements(by);
		return e;
	}

	/**
	 * Selects options from a dropdown ({@literal <select> tag}) based on the
	 * value.
	 * 
	 * @param by
	 * @param value
	 *            The <code>value</code> attribute of the option.
	 * @see #selectOptionByText(Webelement, String)
	 * @return {@link Select}
	 */
	public static Select selectOption(By by) {
		Select box = new Select(waitForElement(by));
		return box;
	}

	/* Window / Frame Switching */

	/**
	 * Waits for a window to appear, then switches to it.
	 * 
	 * @param regex
	 *            Regex enabled. Url of the window, or title.
	 * @return {@link Boolean}
	 */
	public static boolean waitForWindow(String regex) {
		Set<String> windows = Browser.driver.getWindowHandles();

		for (String window : windows) {
			try {
				Browser.driver.switchTo().window(window);

				p = Pattern.compile(regex);
				m = p.matcher(Browser.driver.getCurrentUrl());

				if (m.find()) {
					attempts = 0;
					return switchToWindow(regex);
				} else {
					// try for title
					m = p.matcher(Browser.driver.getTitle());

					if (m.find()) {
						attempts = 0;
						return switchToWindow(regex);
					}
				}
			} catch (NoSuchWindowException e) {
				if (attempts <= MAX_ATTEMPTS) {
					attempts++;

					try {
						Thread.sleep(3000);
					} catch (Exception x) {
						x.printStackTrace();
					}

					return waitForWindow(regex);
				} else {
					Assert.fail("Window with url|title: " + regex
							+ " did not appear after " + MAX_ATTEMPTS
							+ " tries. Exiting.");
				}
			}
		}

		// when we reach this point, that means no window exists with that
		// title..
		if (attempts == MAX_ATTEMPTS) {
			Assert.fail("Window with title: " + regex
					+ " did not appear after 5 tries. Exiting.");
			return false;
		} else {
			System.out.println("#waitForWindow() : Window doesn't exist yet. ["
					+ regex + "] Trying again. " + attempts + "/"
					+ MAX_ATTEMPTS);
			attempts++;
			return waitForWindow(regex);
		}
	}

	/**
	 * Switch's to a window that is already in existance.
	 * 
	 * @param regex
	 *            Regex enabled. Url of the window, or title.
	 * @return {@link Boolean}
	 */
	public static boolean switchToWindow(String regex) {
		Set<String> windows = Browser.driver.getWindowHandles();

		for (String window : windows) {
			Browser.driver.switchTo().window(window);
			System.out.println(String.format(
					"#switchToWindow() : title=%s ; url=%s", Browser.driver.getTitle(),
					Browser.driver.getCurrentUrl()));

			p = Pattern.compile(regex);
			m = p.matcher(Browser.driver.getTitle());

			if (m.find())
				return true;
			else {
				m = p.matcher(Browser.driver.getCurrentUrl());
				if (m.find())
					return true;
			}
		}

		Assert.fail("Could not switch to window with title / url: " + regex);
		return false;
	}

	/**
	 * Close an open window. <br>
	 * If you have opened only 1 external window, then when you call this
	 * method, the context will switch back to the window you were using before.<br>
	 * <br>
	 * If you had more than 2 windows displaying, then you will need to call
	 * {@link #switchToWindow(String)} to switch back context.
	 * 
	 * @param regex
	 *            The title of the window to close (regex enabled). You may
	 *            specify <code>null</code> to close the active window. If you
	 *            specify <code>null</code> then the context will switch back to
	 *            the initial window.
	 */
	public static void closeWindow(String regex) {
		if (regex == null) {
			Browser.driver.close();

			if (Browser.driver.getWindowHandles().size() == 1)
				Browser.driver.switchTo().window(
						Browser.driver.getWindowHandles().iterator().next());

			return;
		}

		Set<String> windows = Browser.driver.getWindowHandles();

		for (String window : windows) {
			try {
				Browser.driver.switchTo().window(window);

				p = Pattern.compile(regex);
				m = p.matcher(Browser.driver.getTitle());

				if (m.find()) {
					switchToWindow(regex); // switch to the window, then close
											// it.
					Browser.driver.close();

					if (windows.size() == 2) // just default back to the first
												// window.
						Browser.driver.switchTo().window(windows.iterator().next());
				} else {
					m = p.matcher(Browser.driver.getCurrentUrl());
					if (m.find()) {
						switchToWindow(regex);
						Browser.driver.close();

						if (windows.size() == 2)
							Browser.driver.switchTo().window(windows.iterator().next());
					}
				}

			} catch (NoSuchWindowException e) {
				Assert.fail("Cannot close a window that doesn't exist. ["
						+ regex + "]");
			}
		}
		return;
	}

	/**
	 * Closes the current active window. Calling this method will return the
	 * context back to the initial window.
	 * 
	 */
	public static void closeWindow() {
		closeWindow(null);
	}

	/**
	 * Switches to a frame or iframe.
	 * 
	 * @param idOrName
	 *            The id or name of the frame.
	 */
	public static void switchToFrame(String idOrName) {
		try {
			Browser.driver.switchTo().frame(idOrName);
		} catch (Exception x) {
			Assert.fail("Couldn't switch to frame with id or name [" + idOrName
					+ "]");
		}
	}

	/**
	 * Switch back to the default content (the first window / frame that you
	 * were on before switching)
	 * 
	 */
	public static void switchToDefaultContent() {
		Browser.driver.switchTo().defaultContent();
	}

	/* ************************ */

	/* Validation Functions for Testing */

	/**
	 * Validates that an element is present.
	 * 
	 * @param by
	 */
	public static void validatePresent(By by) {
		waitForElement(by);
		AssertJUnit.assertTrue("Element " + by.toString() + " does not exist!",
				isPresent(by));
	}

	/**
	 * Validates that an element is not present.
	 * 
	 * @param by
	 */
	public static void validateNotPresent(By by) {
		AssertJUnit.assertFalse("Element " + by.toString() + " exists!",
				isPresent(by));
	}

	/**
	 * Validate that the text of an element is correct.
	 * 
	 * @param by
	 *            The element to validate the text of.
	 * @param text
	 *            The text to validate.
	 */
	public static void validateText(By by, String text) {
		String actual = getText(by);

		AssertJUnit.assertTrue(String.format(
				"Text does not match! [expected: %s] [actual: %s]", text,
				actual), text.equals(actual));
	}

	/**
	 * Validate that the text of an element is not matching text.
	 * 
	 * @param by
	 *            The element to validate the text of.
	 * @param text
	 *            The text to validate.
	 */
	public static void validateTextNot(By by, String text) {
		String actual = getText(by);

		AssertJUnit.assertFalse(String.format(
				"Text matches! [expected: %s] [actual: %s]", text, actual),
				text.equals(actual));
	}

	/**
	 * Validate that a checkbox or a radio button is checked.
	 * 
	 * @param by
	 */
	public static void validateChecked(By by) {
		AssertJUnit.assertTrue(by.toString() + " is not checked!",
				isChecked(by));
	}

	/**
	 * Validate that a checkbox or a radio button is unchecked.
	 * 
	 * @param by
	 */
	public static void validateUnchecked(By by) {
		AssertJUnit.assertFalse(by.toString() + " is not unchecked!",
				isChecked(by));
	}

	/**
	 * Validates an attribute of an element.<br>
	 * <br>
	 * Example:<br>
	 * <blockquote> {@literal <input type="text" id="test" />} <br>
	 * <br>
	 * <code>.validateAttribute(css("input#test"), "type", "text") // validates that the "type" attribute equals "test"</code>
	 * </blockquote>
	 * 
	 * @param by
	 *            The element
	 * @param attr
	 *            The attribute you'd like to validate
	 * @param regex
	 *            What the attribute <b>should</b> be. (this method supports
	 *            regex)
	 * @return {@link Boolean}
	 */
	public static boolean validateAttribute(By by, String attr, String regex) {
		String actual = null;
		try {
			actual = Browser.driver.findElement(by).getAttribute(attr);
			if (actual.equals(regex))
				return true; // test passes.
		} catch (NoSuchElementException e) {
			Assert.fail("No such element [" + by.toString() + "] exists.");
		} catch (Exception x) {
			Assert.fail("Cannot validate an attribute if an element doesn't have it!");
		}

		p = Pattern.compile(regex);
		m = p.matcher(actual);

		AssertJUnit
				.assertTrue(
						String.format(
								"Attribute doesn't match! [Selector: %s] [Attribute: %s] [Desired value: %s] [Actual value: %s]",
								by.toString(), attr, regex, actual), m.find());

		return false;
	}

	/* ================================ */

	/**
	 * Navigates the browser back one page. Same as
	 * <code>driver.navigate().back()</navigate>
	 * 
	 */
	public static void goBack() {
		Browser.driver.navigate().back();
	}

	/**
	 * Navigates to an absolute or relative Url.
	 * 
	 * @param url
	 *            Use cases are:<br>
	 *            <blockquote>
	 *            <code>navigateTo("/login") // navigate to a relative url. slash meaning start fresh from the base url.</code>
	 * <br>
	 * <br>
	 *            <code>navigateTo("path") // navigate to a relative url. will simply append "path" to the current url.</code>
	 * <br>
	 * <br>
	 *            <code>navigateTo("http://google.com") // navigates to an absolute url.</code>
	 *            </blockquote>
	 */
	public static void navigateTo(String url) {
		// absolute url
		if (url.contains("://"))
			Browser.driver.navigate().to(url);
		else if (url.startsWith("/"))
			Browser.driver.navigate().to(baseUrl.concat(url));
		else
			Browser.driver.navigate().to(Browser.driver.getCurrentUrl().concat(url));
	}

	/**
	 * Log something to 'out'
	 * 
	 * @param object
	 *            What to log.
	 */
	public static void log(Object object) {
		System.out.println(object);
	}

	/**
	 * Wait until Web element is present and visible
	 * 
	 * @param driver
	 * @param timeout
	 * @param by
	 */
	public static boolean waitUntilInvisibilityOfElement(int timeout, By by) {
		return (new WebDriverWait(Browser.driver, timeout).until(ExpectedConditions
				.invisibilityOfElementLocated(by)));
	}

	/**
	 * Wait.
	 * 
	 * @param driver
	 * @param timeout
	 * @param by
	 */
	public static void waitImplicity(int time) {
		Browser.driver.manage().timeouts().implicitlyWait(time, TimeUnit.MILLISECONDS);
	}
	
	/**
	 * waitForAjax.
	 * @param timeoutInSeconds
	 * @author HungPham
	 */
	public void waitForAjax(int timeoutInSeconds) {
		try {
			if (Browser.driver instanceof JavascriptExecutor) {
				JavascriptExecutor jsDriver = (JavascriptExecutor) Browser.driver;

				for (int i = 0; i < timeoutInSeconds; i++) {
					Object numberOfAjaxConnections = jsDriver.executeScript("return jQuery.active");
					// return should be a number
					if (numberOfAjaxConnections instanceof Long) {
						Long n = (Long) numberOfAjaxConnections;
						System.out.println("Number of active jquery ajax calls: " + n);
						if (n.longValue() == 0L)
							break;
					}
					Thread.sleep(1000);
				}
			} else {
				System.out.println("Cannot execute javascript");
			}
		} catch (InterruptedException e) {
			System.out.println(e);
		}
	}

	/**
	 * @param destination
	 *            Name of suburl in {@link Url.properties} file.
	 * @return url will be navigated
	 */
	public static String loadUrl(String destination) {
		String url = propsText.get("url_base").concat(
				propsText.get("url_login"));
		if (null != destination) {
			url = propsText.get("url_base") + propsText.get(destination);
		}
		return url;
	}
	
	public static void waitForElementVisibily(WebElement element, int timeoutInSeconds) {
		WebDriverWait wait = new WebDriverWait(Browser.driver, timeoutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
