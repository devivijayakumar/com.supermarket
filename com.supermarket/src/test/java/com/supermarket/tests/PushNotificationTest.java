package com.supermarket.tests;

import java.util.HashMap;

import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.PushNotificationPage;
import com.supermarket.utilities.PdfReader;

public class PushNotificationTest extends Base {
	PushNotificationPage pushnotificationpage;
	LoginPage loginpage;
	PdfReader pdfreader;
	@Test(groups = "smoke")
	public void verify_PushNotification()
	{
		HashMap<String,String> map= new HashMap<String, String>();
		loginpage= new LoginPage(driver);
		loginpage.login();
		pushnotificationpage= new PushNotificationPage(driver);
		pushnotificationpage.clickon_pushNotification();
		//pushnotificationpage.getTextSucessAlert_PushNotification("abc","def");
		//System.out.println(pushnotificationpage.getTextSucessAlert_PushNotification("abc","def"));
		pdfreader= new PdfReader();
		map= pdfreader.Pdf_ReadData("pushnotificationdata");
		System.out.println(map.get("title"));
		System.out.println(map.get("title"));
	}

}
