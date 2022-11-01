package com.supermarket.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageUserPage;

public class ManageUserTest extends Base {
	LoginPage loginpage;
	ManageUserPage manageuserpage;
	@Test
	public void verify_user_deactivation()
	{
		loginpage= new LoginPage(driver);
		loginpage.login();
		manageuserpage= new ManageUserPage(driver);
		manageuserpage.click_manageuser();
		manageuserpage.click_deactivate_user("jothish thachamoochikkal");
		
	}

}
