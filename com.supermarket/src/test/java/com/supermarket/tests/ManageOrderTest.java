package com.supermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageOrderPage;

public class ManageOrderTest  extends Base {
	LoginPage loginpage;
	Constants constants;
	ManageOrderPage manageorderepage;;
	
	@Test
	public void verify_SearchListOrders()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		
		manageorderepage=new ManageOrderPage(driver);
		manageorderepage.click_OnManageOrder();
		manageorderepage.click_OnSearchField();
		manageorderepage.enter_OrderId("501");
		manageorderepage.enter_UserId("@123121");
		manageorderepage.enter_StartDate("1-11-2022");
		manageorderepage.enter_EndDate("1-11-2022");
		manageorderepage.enter_PaymentMode();
		manageorderepage.enter_Status();
		manageorderepage.click_OnSearchButton();
		manageorderepage.searchButton_Enabled();
		Assert.assertTrue(	manageorderepage.searchButton_Enabled());
	}
	@Test
	public void verify_ResetListOrders()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageorderepage=new ManageOrderPage(driver);
		manageorderepage.click_OnManageOrder();
		manageorderepage.click_OnSearchField();
		manageorderepage.enter_OrderId("501");
		manageorderepage.enter_UserId("@123121");
		manageorderepage.enter_StartDate("6-11-2022");
		manageorderepage.enter_EndDate("1-12-2022");
		manageorderepage.enter_AnotherPaymentMode();
		manageorderepage.enter_Statusoforder();
		manageorderepage.click_OnResetButton();
		Assert.assertTrue(	manageorderepage. resetButton_Enabled());
		
	}
	@Test
	public void verify_DetailsOfOrderId406()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageorderepage=new ManageOrderPage(driver);
		manageorderepage.click_OnManageOrder();
		manageorderepage.get_Text("xpath");
		String expectedid=Constants.EXPECTED_ORDERID_LISTORDER;
		String actualid=manageorderepage.get_OrderId();
		Assert.assertEquals(actualid, expectedid);
	}
	@Test
	public void verify_ViewOption()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageorderepage=new ManageOrderPage(driver);
		manageorderepage.click_OnManageOrder();
		manageorderepage.click_OnViewOption();
		Assert.assertTrue(manageorderepage.image_Dispalyed());
	}
}


