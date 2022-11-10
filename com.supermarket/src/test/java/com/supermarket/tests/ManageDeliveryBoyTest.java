package com.supermarket.tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageDeliveryBoyPage;
import com.supermarket.utilities.Excel;
import com.supermarket.utilities.GeneralUtilities;

public class ManageDeliveryBoyTest extends Base {
	ManageDeliveryBoyPage managedeliveryboypage;
	LoginPage loginpage;
	Constants constants;
	Excel excel= new Excel();

	@Test
	public void verify_create_delivery_boy() {
		loginpage = new LoginPage(driver);
		loginpage.login();
		
		excel.setExcelFile("Delivery boy details", "deliveryboylist");
		String name = excel.getCellData(0, 0);
		String email = excel.getCellData(0, 1);
		String number = excel.getCellData(0, 2);
		String address = excel.getCellData(0, 3);
		String username = excel.getCellData(0, 4);
		String password = excel.getCellData(0, 5);
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_new_button();
		managedeliveryboypage.create_delivery_boy(name, email, number, address, username, password);
		managedeliveryboypage.click_save_option();
		String actualresult= managedeliveryboypage.get_text_alert_new();
		String expectedresult= Constants.EXPECTED_NEW_ALERT_TEXT;
		Assert.assertEquals(actualresult, expectedresult);
	}
	@Test(groups = "sanity")
	public void verify_search_byName()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enter_search_name("paddy");
		managedeliveryboypage.click_searchSearch();
		String actualresult=managedeliveryboypage.table_name();
		String expectedresult= Constants.EXPECTED_SEARCH_BY_NAME_TEXT;
		Assert.assertEquals(actualresult, expectedresult);
		
	}
	@Test
	public void verify_search_byEmail()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enter_search_email("devi1232@gmail.com");
		managedeliveryboypage.click_searchSearch();
		String actualresult=managedeliveryboypage.table_email();
		String expectedresult=constants.EXPECTED_SEARCH_BY_EMAIL_TEXT;
		Assert.assertEquals(actualresult, expectedresult);
	}
	@Test(groups = {"smoke","sanity"})
	public void verify_search_byPhonenumber()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enetr_search_phonenumber("9632587410");
		managedeliveryboypage.click_searchSearch();
		String actualresult=managedeliveryboypage.table_phonenumber();
		String expectedresult=constants.EXPECTED_SEARCH_BY_PHONENUMBER_TEXT;
		Assert.assertEquals(actualresult, expectedresult);
	}
	@Test
	public void verify_edit_option() throws AWTException
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_editOption();
		managedeliveryboypage.enter_editName("nameuser");
		managedeliveryboypage.enter_editUserName("nameuser123");
		managedeliveryboypage.enter_editPassword("user123!@#name");
		managedeliveryboypage.click_updateButton();
		String actualresult=managedeliveryboypage.background_edit_alert_message();
		String expectedresult= Constants.EXPECTED_EDIT_ALERT_BACKGROUND_COLOR;
		Assert.assertEquals(actualresult, expectedresult);		
	}
	@Test
	public void verify_deleteButton_editOption()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.editOption_delete_button();
		constants= new Constants();
		String actualresult= managedeliveryboypage.alert_message_shown();
		String expectedresult= Constants.EXPECTED_BACKGROUND_COLOR;
		Assert.assertEquals(actualresult, expectedresult);
		
	}
	@Test
	public void verify_status()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.status_click();
		System.out.println(managedeliveryboypage.status_alert());
		constants= new Constants();
		String actualresult= managedeliveryboypage.status_alert();
		String expectedresult= Constants.EXPECTED_ALERT_BACKGROUND_COLOR;
		Assert.assertEquals(actualresult, expectedresult);
	}
	@Test
	public void verify_new_deliveryBoy_creation()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		
		excel.setExcelFile("Delivery boy details", "deliveryboylist");
		String name = excel.getCellData(0, 0);
		String email = excel.getCellData(0, 1);
		String number = excel.getCellData(0, 2);
		String address = excel.getCellData(0, 3);
		String username = excel.getCellData(0, 4);
		String password = excel.getCellData(0, 5);
		String timestamp=GeneralUtilities.get_timestamp();
		
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_new_button();
		managedeliveryboypage.create_delivery_boy(name+timestamp, email, number, address, username+timestamp, password);
		managedeliveryboypage.click_save_option();
		
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enter_search_name(name+timestamp);
		managedeliveryboypage.click_searchSearch();
		Assert.assertTrue(managedeliveryboypage.timestamp_get_text_matched(name+timestamp));	
	}
	

}
