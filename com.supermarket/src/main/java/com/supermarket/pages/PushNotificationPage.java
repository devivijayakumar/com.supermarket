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
	@FindBy(xpath = "//div[@class='alert alert-sucess alert-dismissible']")
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
	public void enter_titleFeild(String title)
	{
		titleFeild.sendKeys(title);
	}
	public void enter_descriptionFeild(String description)
	{
		descriptionFeild.sendKeys(description);
	}
	public void click_sendButton()
	{
		sendButton.click();
	}
	public String getTextSucessAlert_PushNotification(String title,String description)
	{
		enter_titleFeild(title);
		enter_descriptionFeild(description);
		click_sendButton();
		generalutilities= new GeneralUtilities(driver);
		return generalutilities.get_Text(alertSucessText);
	}
	

}
