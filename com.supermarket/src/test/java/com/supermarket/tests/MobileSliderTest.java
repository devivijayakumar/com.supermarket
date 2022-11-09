package com.supermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.MobileSliderPage;

public class MobileSliderTest extends Base {
	MobileSliderPage mobilesliderpage;
	LoginPage loginpage;
	Constants constants;
	@Test(groups="sanity")
	public void verify_AddingNewListOfMobileSlider()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		mobilesliderpage=new MobileSliderPage(driver);
		mobilesliderpage.click_MobileSlide();
		mobilesliderpage.click_NewOption();
		mobilesliderpage.click_SelectCategory();
		mobilesliderpage.enter_Category();
		mobilesliderpage.upLoad_Image(Constants.IMAGEUPLOAD_MOBILE_SLIDER);
		mobilesliderpage.click_SaveButton();
		 Assert.assertTrue( mobilesliderpage.savedImage_Displayed());
}
	@Test(groups="smoke")
	public void verify_StatusOptionForListOfMobileSlider()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		mobilesliderpage=new MobileSliderPage(driver);
		mobilesliderpage.click_MobileSlide();
		mobilesliderpage.click_StatusOption();
		Assert.assertTrue( mobilesliderpage.sucessStatusChangeIcon_Displayed());
}

}
