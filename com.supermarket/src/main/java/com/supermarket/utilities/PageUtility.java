package com.supermarket.utilities;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PageUtility {
	WebDriver driver;
	JavascriptExecutor js;
	public PageUtility(WebDriver driver) {
		this.driver= driver;
	}
	public void select_ByIndex(int index, WebElement element)
	{
		Select select= new Select(element);
		select.selectByIndex(index);
		
	}
	public void select_ByValue(String value, WebElement element)
	{
		Select select= new Select(element);
		select.selectByValue(value);
		
	}
	public void select_ByVisisbleText(String text, WebElement element)
	{
		Select select= new Select(element);
		select.selectByVisibleText(text);
	}
	public void scorll_down(int x,int y)
	{
		js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");

	}
	public void mouse_click(WebElement element)
	{
		Actions action= new Actions(driver);
		action.click(element).build().perform();
		action.clickAndHold(element).build().perform();
		
	}
	public void scroll_and_click(WebElement element)
	{
		int x= 0;
		js=(JavascriptExecutor) driver;
		while(click_status(element))
		{
			js.executeScript("window.scrollBy(0," + x + ")");
			x = x + 50;

		}
		
	}
	public boolean click_status(WebElement element)
	{
		try 
		{
			element.click();
			return false;
			
		}
		catch(Exception e)
		{
			return true;
		}
	}
	public void keyboard_interaction(WebElement element) throws AWTException
	{
		Robot obj= new Robot();
		element.sendKeys(Keys.chord(Keys.CONTROL,"a"+Keys.BACK_SPACE));
		obj.keyPress(KeyEvent.VK_DOWN);
	}
	 
		
	
			
	

	
}
