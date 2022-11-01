package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.Excel;
import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class LoginPage {
	WebDriver driver;
	PageUtility pageutility;
	Excel excel = new Excel();
	GeneralUtilities generalutilities;

	@FindBy(xpath = "//input[@name='username']")
	 private WebElement userData1;
	@FindBy(xpath = "//input[@name='password']")
	WebElement passData2;
	@FindBy(xpath = "//button[@class='btn btn-dark btn-block']")
	WebElement signIn;
	@FindBy(xpath="//img[@class='img-circle elevation-2']")
	private WebElement profileimage;
	@FindBy(xpath = "//a[@class='nav-link']")
	public WebElement adminoption;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enter_user_name(String username) {
		userData1.sendKeys(username);
	}

	public void enter_pass_word(String password) {
		passData2.sendKeys(password);
	}

	public void click_on_login_button() {
		signIn.click();
	}

	public void login(String username, String password) {
		enter_user_name(username);
		enter_pass_word(password);
		click_on_login_button();
	}
	public void login()
	{
		String username;
		String password;
		excel.setExcelFile("Login","valid login credentials");
		username= excel.getCellData(0, 0);
		password= excel.getCellData(0, 1);
		login(username,password);
	}
	public boolean is_ProfileImageDisplayed() 
	{
		generalutilities= new GeneralUtilities(driver);
		return generalutilities.is_Displayed(profileimage);
	}
	public String admin_font_color()
	{
		adminoption.click();
		generalutilities= new GeneralUtilities(driver);
		return adminoption.getCssValue("color");
	}
	
	
	

	
	
	
	
	

}
