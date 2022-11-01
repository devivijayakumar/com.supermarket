package com.supermarket.tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageDeliveryBoyPage;

public class ManageDeliveryBoyTest extends Base {
	ManageDeliveryBoyPage managedeliveryboypage;
	LoginPage loginpage;

	@Test
	public void verify_create_delivery_boy() {
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_new_button();
		managedeliveryboypage.create_delivery_boy();
		managedeliveryboypage.click_save_option();
	}
	@Test(groups = {"smoke","sanity"})
	public void verify_is_alert_message_visible()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_new_button();
		managedeliveryboypage.create_delivery_boy();
		managedeliveryboypage.click_save_option();
		Assert.assertTrue(managedeliveryboypage.is_alert_message_visible());
		 
	}
	@Test(groups = "sanity")
	public void verify_search_byName()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enter_search_name();
		managedeliveryboypage.click_searchSearch();
		Assert.assertTrue(managedeliveryboypage.is_table_present());
	}
	@Test
	public void verify_search_byEmail()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enter_search_email();
		managedeliveryboypage.click_searchSearch();
		Assert.assertTrue(managedeliveryboypage.is_table_present());
		
	}
	@Test(groups = {"smoke","sanity"})
	public void verify_search_byPhonenumber()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_search_button();
		managedeliveryboypage.enetr_search_phonenumber();
		managedeliveryboypage.click_searchSearch();
		Assert.assertTrue(managedeliveryboypage.is_table_present());
		
	}
	@Test
	public void verify_edit_option() throws AWTException
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managedeliveryboypage = new ManageDeliveryBoyPage(driver);
		managedeliveryboypage.click_manageDeliveryBoy();
		managedeliveryboypage.click_editOption();
		managedeliveryboypage.verify_editNmae();
		managedeliveryboypage.click_updateButton();
		System.out.println(managedeliveryboypage.update_alert_message());
		
	}

}
