package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class PushNotificationPage {
	WebDriver driver;
	GeneralUtilities generalutilities;
	PageUtility pageutility;
	@FindBy(xpath = "//p[text()='Push Notifications']")
	private WebElement pushNotification;
	@FindBy(xpath = "//input[@id='title']")
	private WebElement titleFeild;
	@FindBy(xpath = "//input[@id='description']")
	private WebElement descriptionFeild;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	private WebElement sendButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertSucessText;
	
	public PushNotificationPage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void clickon_pushNotification()
	{
		pushNotification.click();
	}
	public void enter_titleFeild(String title1)
	{
		titleFeild.sendKeys(title1);
	}
	public void enter_descriptionFeild(String description1)
	{
		descriptionFeild.sendKeys(description1);
	}
	public void click_sendButton()
	{
		sendButton.click();
	}
	public String getbackgroundColor_PushNotification(String title1,String description1)
	{
		enter_titleFeild(title1);
		enter_descriptionFeild(description1);
		click_sendButton();
		generalutilities= new GeneralUtilities(driver);
		return alertSucessText.getCssValue("background");
	}
	

}
