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
		managelocationpage.select_StateEastMidLands();
		managelocationpage.click_UpdateButton();

	}

	@Test
	public void verify_StatusChangeOption() {
		loginpage = new LoginPage(driver);
		loginpage.login();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_OnStatusOption();

	}

	@Test
	public void verify_DeleteOption() {
		loginpage = new LoginPage(driver);
		loginpage.login();loginpage = new LoginPage(driver);
		loginpage.login();
		managelocationpage = new ManageLocationPage(driver);
		managelocationpage.click_MnageLocationPage();
		managelocationpage.click_DeleteButton();
		String actualalert = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		String expectedalert = Constants.EXPECTED_ALERTFOR_DELETE;
		Assert.assertEquals(actualalert, expectedalert);

	}

}
