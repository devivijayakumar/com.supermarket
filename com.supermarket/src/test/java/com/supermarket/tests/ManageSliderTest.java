package com.supermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageSliderPage;

public class ManageSliderTest extends Base {
	LoginPage loginpage;
	Constants constants;
	ManageSliderPage managesliderpage;
	
	@Test(groups="smoke")
	public void verify_EnterLocationInformations()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		managesliderpage=new ManageSliderPage(driver);
		managesliderpage.click_ManageSlide();
		managesliderpage.click_NewOption();
		managesliderpage.upLoad_Image(Constants.IMAGEUPLOAD_MANAGESLIDE);
		managesliderpage.enter_Link("http:onlinegrocery.in");
		managesliderpage.click_save();
		Assert.assertTrue(managesliderpage.saveButton_Enabled());
	}
	
}


