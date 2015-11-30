package com.heb.enterprise.automationtest.propertiesfile;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * Read properties.
 * @author huongnguyen1
 */
public class ReadProperties {
	InputStream inputStream;
	public static Map<String, String> propsText = new HashMap<String, String>();

	/**
	 * Set properties.
	 * 
	 * @author huongnguyen1
	 */
	public void setProp() {
		Properties prop = new Properties();
		InputStream input = null;
		ArrayList<String> listProFile = this.listAllPropertiesFile();
		try {
			if (listProFile.size() > 0) {
				for (String fileName : listProFile) {
					input = getClass().getClassLoader().getResourceAsStream(
							fileName);
					if (input == null) {
						System.out.println("Sorry, unable to find " + fileName);
						return;
					}
					// load a properties file from class path
					prop.load(input);
					
					for (String key : prop.stringPropertyNames()) {
						propsText.put(key, prop.getProperty(key));
					}
				}
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * @return {@link ArrayList} all properties file.
	 * @author huongnguyen1
	 */
	private ArrayList<String> listAllPropertiesFile() {
		ArrayList<String> listProFile = new ArrayList<String>();
		listProFile.add("Login.properties");
		listProFile.add("Url.properties");
		return listProFile;
	}
}
