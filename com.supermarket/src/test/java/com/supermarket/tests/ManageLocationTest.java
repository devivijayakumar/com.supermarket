package com.supermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageLocationPage;

public class ManageLocationTest extends Base {
	ManageLocationPage managelocationpage;
	LoginPage loginpage;
	Constants constants;

	@Test
	public void verify_EnterLocationInformations() {
		loginpage = new LoginPage(driver);
		loginpage.login();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_NewOption();
		managelocationpage.select_Country();
		managelocationpage.select_State();
		managelocationpage.enter_Location("Manchester");
		managelocationpage.enter_DeliveryCharge("225");
		managelocationpage.click_saveButton();
		Assert.assertTrue(managelocationpage.saveButton_Enabled());

	}

	@Test
	public void verify_UpDateLocationInformations() {
		loginpage = new LoginPage(driver);
		loginpage.login();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_EditOption();
		managelocationpage.select_StateEastMidLands("East Midlands");
		managelocationpage.enter_Location("Rutland");
		managelocationpage.enter_DeliveryCharge("250");
		managelocationpage.click_saveButton();
		Assert.assertTrue(managelocationpage.saveButton_Enabled());
	}

	@Test
	public void verify_StatusChangeOption() {
		loginpage = new LoginPage(driver);
		loginpage.login();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_OnStatusOption();
		String actualresult=managelocationpage.status_alert_text();
		String expectedresult=Constants.EXPECTED_STATUS_ALERT_TEXT;
		Assert.assertEquals(actualresult, expectedresult);

	}

	

}
