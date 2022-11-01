package com.supermarket.utilities;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot {
	TakesScreenshot takescreenshot;
	public void take_screenShot(WebDriver driver, String ImageName)
	{
		try
		{
			takescreenshot= (TakesScreenshot) driver;
			File screenshotfile= takescreenshot.getScreenshotAs(OutputType.FILE);//will take screenshot
			String timstamp= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date()); //difference BETWEEN IMAGES
			String destination= System.getProperty("user.dir")+"\\ScreenShots\\"+ImageName+timstamp+".png";
			File finalDestination= new File(destination);//WHERETOPLACE
			FileHandler.copy(screenshotfile, finalDestination);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
