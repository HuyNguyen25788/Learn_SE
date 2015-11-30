package com.heb.enterprise.automationtest.utils;

/**
 * Constants.
 * 
 * @author huongnguyen1
 * 
 */
public class Constants {
	public static String id1 = "";

	public final static String BROWSER = "firefox";
	// link page index
	public static String linkIndex = "http://10.10.30.155:8080/assortment/";

	// title page
	public static String titleMainPage = "Dashboard - DSV Assortment Tool";	
	public static String titleVendormanagementPage = "Vendor Management - DSV Assortment Tool";
	public static String titleSurrogateapping = "Surrogate Mapping - DSV Assortment Tool";
	public static String titleProductsReview = "Products Review - DSV Assortment Tool";
	public static String titleCostReview = "Retail And Cost Review - DSV Assortment Tool";
	// title Header 
	public static String titleProductsReviewHeader = "Products for Review";
	//title breadcrumbs 
	public static String titleProductsReviewBreadCrumb = ">Products Review";
	
	// Global's title
	public static String titleGlobalDefaultPage = "Global Assortment Rules - DSV Assortment Tool";

	// data login
	public static String LoginCase1 = "Existing User";
	public static String LoginCase2 = "Wrong Password";
	public static String LoginCase3 = "User not Exist";
	public static String LoginCase4 = "User Null";
	public static String LoginCase5 = "Password Null";
	public static String LoginCase6 = "Injection Error Testing";
	public static String LoginCase7 = "password <6 character";
	public static String LoginCase8 = "ID number too large";

	// file data
	public static String dataLogin = "LoginTC.xlsx";
	public static String datastep = "step.xlsx";

	// captcha
	public static String idcaptcha = "txtCapt";

	/**
	 * USERNAME.
	 */
	public static final String USERNAME = "vn40577";

	/**
	 * PASSWORD.
	 */
	public static final String PASSWORD = "pass1234";

	/**
	 * UPC.
	 */
	public static final String UPC = "4461701159";

	// Menu if of url
	public static final String HOME_URL_ID = "home-class";
	/**
	 * GLOBAL_URL_ID.
	 */
	public static final String GLOBAL_URL_ID = "global-assortment-default";
	/**
	 * VENDOR_MANAGEMENT_URL_ID.
	 */
	public static final String VENDOR_MANAGEMENT_URL_ID = "vendor-management";
	/**
	 * PRICING_RULE_URL_ID.
	 */
	public static final String PRICING_RULE_URL_ID = "pricing-rules";
	/**
	 * SURROGATE_MAPPING_URL_ID.
	 */
	public static final String SURROGATE_MAPPING_URL_ID = "surrogate-mapping";
	/**
	 * PRODUCT_REVIEW_URL_ID.
	 */
	public static final String PRODUCT_REVIEW_URL_ID = "product-review";
	/**
	 * RETAIL_COST_REVIEW_URL_ID.
	 */
	public static final String RETAIL_COST_REVIEW_URL_ID = "retail-cost-review";
	/**
	 * RETAIL_INQUIRY_URL_ID.
	 */
	public static final String RETAIL_INQUIRY_URL_ID = "retail-inquiry";
	/**
	 * REPORT_NEW_ITEM_URL_ID.
	 */
	public static final String REPORT_NEW_ITEM_URL_ID = "reportNewItems";

}
