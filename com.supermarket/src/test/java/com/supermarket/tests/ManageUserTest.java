package com.supermarket.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageUserPage;

public class ManageUserTest extends Base {
	LoginPage loginpage;
	ManageUserPage manageuserpage;
	Constants constants;
	@Test
	public void verify_user_deactivation()
	{
		loginpage= new LoginPage(driver);
		loginpage.login();
		manageuserpage= new ManageUserPage(driver);
		manageuserpage.click_manageuser();
		manageuserpage.click_deactivate_user("jothish thachamoochikkal");
		constants= new Constants();
		String actualresult= manageuserpage.manageUser_alert_message();
		String expectedresult=Constants.EXPECTED_ALERT_MESSAGE1;
		Assert.assertEquals(actualresult,expectedresult);
	}

}
