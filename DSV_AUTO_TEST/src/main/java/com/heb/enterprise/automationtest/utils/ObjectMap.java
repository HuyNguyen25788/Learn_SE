package com.heb.enterprise.automationtest.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.support.How;

public class ObjectMap {
	Properties properties;

	public ObjectMap(String mapFile) {
		properties = new Properties();
		try {
			FileInputStream in = new FileInputStream(mapFile);
			properties.load(in);
			in.close();
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}

	// ---------------------
	public By getLocator(String logicalElementName) throws Exception {
		// Read value using the logical name as Key
		String locator = properties.getProperty(logicalElementName);
		// Split the value which contains locator type and locator value
		String locatorType = locator.split(">")[0];
		String locatorValue = locator.split(">")[1];
		// Return a instance of By class based on type of locator
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
		else
			throw new Exception("Locator type '" + locatorType
					+ "' not defined!!");
	}
	//-----------------
	public How getHow(String logicalElementName){
		String locator = properties.getProperty(logicalElementName);
		String how = locator.split(">")[0];
		if (how.toLowerCase().equals("id"))
			return How.ID;
		else if (how.toLowerCase().equals("name"))
			return How.NAME;
		else if ((how.toLowerCase().equals("classname"))
				|| (how.toLowerCase().equals("class")))
			return How.CLASS_NAME;
		else if ((how.toLowerCase().equals("tagname"))
				|| (how.toLowerCase().equals("tag")))
			return How.TAG_NAME;
		else if ((how.toLowerCase().equals("linktext"))
				|| (how.toLowerCase().equals("link")))
			return How.LINK_TEXT;
		else if (how.toLowerCase().equals("partiallinktext"))
			return How.PARTIAL_LINK_TEXT;
		else if ((how.toLowerCase().equals("cssselector"))
				|| (how.toLowerCase().equals("css")))
			return How.CSS;
		else if (how.toLowerCase().equals("xpath"))
			return How.XPATH;
		return null;
	}
	//------------------

}