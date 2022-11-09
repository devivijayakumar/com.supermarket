package com.supermarket.tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageOfferCodePage;
import com.supermarket.utilities.Excel;

public class ManageOfferCodeTest extends Base{
	ManageOfferCodePage manageoffercodepage;
	LoginPage loginpage;
	Constants constants;
	Excel excel= new Excel();
	
		@Test(priority = 1)
		public void verify_EnterOfferInformations() {
			String code;
			String Percentage;
			String amount;
			String description;

			excel = new Excel();
			excel.setExcelFile("manageoffercodeexcel", "offerinformations");
			code = excel.getCellData(0, 0);
			Percentage = excel.getCellData(0, 1);
			amount = excel.getCellData(0, 2);
			description = excel.getCellData(0, 3);

			loginpage = new LoginPage(driver);
			loginpage.login();
			manageoffercodepage = new ManageOfferCodePage(driver);
			manageoffercodepage.clickOn_ManageOfferPage();
			manageoffercodepage.clickOn_NewOption();
			manageoffercodepage.enter_OfferCodeInformation(code, Percentage, amount, description);
			manageoffercodepage.upload_OfferImage(Constants.IMAGEUPLOAD_MANAGEOFFER_CODE);
			manageoffercodepage.ScrollDown_Save();
			String actualsucessalert = (manageoffercodepage.get_SucessAlert());
			String expectedsucessalert = Constants.EXPECTED_SUCESSS_ALERT;
			Assert.assertEquals(actualsucessalert, expectedsucessalert);
		}

		@Test(dataProvider = "searchOffers", dataProviderClass = com.supermarket.base.DataProviderClass.class)
		public void verify_SearchOfferCodes(String code) {

			loginpage = new LoginPage(driver);
			loginpage.login();
			manageoffercodepage = new ManageOfferCodePage(driver);
			manageoffercodepage.clickOn_ManageOfferPage();
			manageoffercodepage.clickOn_SearchOption();
			manageoffercodepage.enter_Code(code);
			manageoffercodepage.clickOn_SearchButton();
			Assert.assertTrue(manageoffercodepage.searchButton_Enabled());
		}
	}

