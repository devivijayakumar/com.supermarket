package com.supermarket.constants;

public class Constants {

	public static final String CONFIG_FILE_PATH= System.getProperty("user.dir")+"\\src\\main\\resources\\config.properties";
	public static final String PDF_FILE_PATH= "file:\\"+System.getProperty("user.dir")+"\\src\\main\\resources\\PdfFiles";
	//public static final String EXCEL_FILE_PATH= System.getProperty("user.dir")+"\\src\\main\\resources\\ExcelFiles";
	public static final String EXTENT_REPORT_PATH= System.getProperty("user.dir")+"\\ExtentReport";
	
	/**Login Page**/
	public static final String EXPECTED_FONT_COLOUR="rgba(255, 255, 255, 1)";
	/**deliveryboy**/
	public static final String EXPECTED_NEW_ALERT_TEXT="Alert!";
	public static final String EXPECTED_NEW_TIMESTAMP_ALERT_TEXT="Alert!";
	public static final String EXPECTED_BACKGROUND_COLOR="rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	public static final String EXPECTED_ALERT_BACKGROUND_COLOR="rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	/**manageexpense**/
	public static final String EXPECTED_NEW_BUTTON_ALERT_BACKGROUND_COLOR= "rgb(220, 53, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	public static final String EXPECTED_EDIT_BUTTON_ALERT_BACKGROUND_COLOR= "rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	public static final String EXPECTED_DELETE_BUTTON_ALERT_BACKGROUND="rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	public static final String EXPECTED_MNGEXP_NEW_ALER="rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	/**manageuser alert**/
	public static final String EXPECTED_ALERT_MESSAGE1="rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	/**pushnotification**/
	public static final String EXPECTED_ALERT_MESSAGE_PUSHNOTIFICATION="rgb(40, 167, 69) none repeat scroll 0% 0% / auto padding-box border-box";
	/**managepoduct type**/
	public static final String EXPECTED_IMAGE_UPLOAD=System.getProperty("user.dir")+"\\src\\main\\resources\\ImagesUpload\\wheat.jpg";
	public static final String EXPECTED_SUB_IMAGE_UPLOAD=System.getProperty("user.dir")+"\\src\\main\\resources\\ImagesUpload\\wheategrain.jpg";
	
	/**manageorderpage**/
	public static final String EXPECTED_ORDERID_LISTORDER="406";
	
	/**MANAGESLIDERPAGE**/
	public static final String IMAGEUPLOAD_MANAGESLIDE=System.getProperty("user.dir")+"\\src\\main\\resources\\ImagesUpload\\grocery.jpg"; 
	
	/**manageoffercodepage**/
	public static final String IMAGEUPLOAD_MANAGEOFFER_CODE=System.getProperty("user.dir")+"\\src\\main\\resources\\ImagesUpload\\veggies.jpg";
	public static final String EXPECTED_SUCESSS_ALERT="alert alert-sucess alert-dismissible";
	
	/**mobilesliderpage**/
	public static final String IMAGEUPLOAD_MOBILE_SLIDER=System.getProperty("user.dir")+"\\src\\main\\resources\\ImagesUpload\\bakery.jpg";
	
	/**managelocationpage**/
	public static final String EXPECTED_ALERTFOR_DELETE="Do you want to delete this location";
}
