package com.supermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;

public class LoginTest extends Base {
	LoginPage loginpage;
	
	@Test(groups = "smoke")
	public void verify_login()
	{
		loginpage= new LoginPage(driver);
		loginpage.login();
		
		
	}
	@Test(groups ="sanity")
	public void verify_profile_image()
	{
		loginpage= new LoginPage(driver);
		loginpage.login();
		Assert.assertTrue(loginpage.is_ProfileImageDisplayed());
	}
	@Test
	public void verify_textcolor_admin()
	{
		loginpage= new LoginPage(driver);
		loginpage.login();
		loginpage.admin_font_color();
		String actualresult= loginpage.admin_font_color();
		Assert.assertEquals(actualresult, Constants.EXPECTED_FONT_COLOUR);
	}
	
	
	

}
