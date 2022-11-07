package com.supermarket.utilities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralUtilities {
	WebDriver driver;
	public GeneralUtilities(WebDriver driver)
	{
		this.driver=driver;
	}
	public boolean is_Selected(WebElement element)
	{
		return element.isSelected();
	}
	public boolean is_Displayed(WebElement element)
	{
		return element.isDisplayed();
	}
	public boolean is_Enabled(WebElement element)
	{
		return element.isEnabled();
	}
	public String get_Text(WebElement element)
	{
		return element.getText();
	}
	public List<String> get_TextOfElemets(String xpath)
	{
		List<String> text= new ArrayList<String>();
		List<WebElement> elementlist= driver.findElements(By.xpath(xpath ));
		for(WebElement list: elementlist)
		{
			text.add(list.getText());
		}
		return text;
	}
	public boolean is_ElementTextMatched(WebElement element,String expectedText)
	{
		return element.getText().equals(expectedText);
	}
	public String get_CssValue(WebElement element, String value) {
		return element.getCssValue(value);
	}
	public static String get_timestamp()
	{
		String timstamp= new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
		return timstamp;
	}
	

}
