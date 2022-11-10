package com.supermarket.tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.PushNotificationPage;
import com.supermarket.utilities.PdfReader;

public class PushNotificationTest extends Base {
	PushNotificationPage pushnotificationpage;
	LoginPage loginpage;
	PdfReader pdfreader;
	Constants constants;
	
	@Test(groups = "smoke")
	public void verify_PushNotification()
	{
		HashMap<String,String> map= new HashMap<String, String>();
		loginpage= new LoginPage(driver);
		loginpage.login();
		pushnotificationpage= new PushNotificationPage(driver);
		pushnotificationpage.clickon_pushNotification();
		pdfreader= new PdfReader();
		map= pdfreader.Pdf_ReadData("pushnotificationdata");
		String actualresult= pushnotificationpage.getbackgroundColor_PushNotification("abc","def");
		constants= new Constants();
		Assert.assertEquals(actualresult, Constants.EXPECTED_ALERT_MESSAGE_PUSHNOTIFICATION);
	}

}
