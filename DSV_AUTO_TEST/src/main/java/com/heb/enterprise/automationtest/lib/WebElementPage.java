package com.heb.enterprise.automationtest.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class WebElementPage {
	
	public WebElement getElement(WebDriver driver,String locatorType,String locatorValue) throws Exception{
		WebElement webelement=null;
		//System.out.println(locatorType+" ** "+locatorValue);
		//System.out.println(this.getLocator(locatorType,locatorValue).toString());
		webelement = driver.findElement(this.getLocator(locatorType,locatorValue));
		return webelement ;
	}
	//--------------------------
	public By getLocator(String locatorType,String locatorValue) throws Exception {	
		if (locatorType.toLowerCase().equals("id"))
			return By.id(locatorValue);
		else if (locatorType.toLowerCase().equals("name"))
			return By.name(locatorValue);
		else if ((locatorType.toLowerCase().equals("classname"))
				|| (locatorType.toLowerCase().equals("class")))
			return By.className(locatorValue);
		else if ((locatorType.toLowerCase().equals("tagname"))
				|| (locatorType.toLowerCase().equals("tag")))
			return By.className(locatorValue);
		else if ((locatorType.toLowerCase().equals("linktext"))
				|| (locatorType.toLowerCase().equals("link")))
			return By.linkText(locatorValue);
		else if (locatorType.toLowerCase().equals("partiallinktext"))
			return By.partialLinkText(locatorValue);
		else if ((locatorType.toLowerCase().equals("cssselector"))
				|| (locatorType.toLowerCase().equals("css")))
			return By.cssSelector(locatorValue);
		else if (locatorType.toLowerCase().equals("xpath"))
			return By.xpath(locatorValue);
		else{
			System.out.println("fails!");
			throw new Exception("Locator type '" + locatorType
					+ "' not defined!!");
			
		}
	}
}
