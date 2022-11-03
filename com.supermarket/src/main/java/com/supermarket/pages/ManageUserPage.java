package com.supermarket.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageUserPage {
	WebDriver driver;
	GeneralUtilities generalutilities;
	PageUtility pageutility;
	@FindBy(xpath = "//i[@class='nav-icon fas fa-user']")
	private WebElement manageusers;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement manageusealert;
	public ManageUserPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	public void click_manageuser()
	{
		manageusers.click();
	}
	public void click_deactivate_user(String usersName)
	{
		int j=0;
		List<String> names= new ArrayList<String>();
		generalutilities= new GeneralUtilities(driver);
		pageutility= new PageUtility(driver);
		names= generalutilities.get_TextOfElemets("//tbody//tr//td[1]");
		for(j=0;j<names.size();j++)
		{
			if(usersName.equals(names.get(j))) 
			{
				j++; break;
			}
		}
		
		WebElement deactivateButton= driver.findElement(By.xpath("//tbody//tr["+j+"]//td[5]//a"));
		deactivateButton.click();
		}
		public String manageUser_alert_message()
		{
			generalutilities= new GeneralUtilities(driver);
			return manageusealert.getCssValue("background");
		}
		
				
	

}
