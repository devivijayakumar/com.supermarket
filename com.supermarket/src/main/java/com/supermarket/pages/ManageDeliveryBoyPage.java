package com.supermarket.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.Excel;
import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageDeliveryBoyPage {
	WebDriver driver;
	PageUtility pageutility;
	Excel excel = new Excel();
	GeneralUtilities generalutilities;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
	WebElement managedeliveryboyoption;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	WebElement newoption;
	@FindBy(xpath = "//input[@id='name']")
	WebElement namefeild;
	@FindBy(xpath = "//input[@id='email']")
	WebElement emailfeild;
	@FindBy(xpath = "//input[@id='phone']")
	WebElement phonenumberfeild;
	@FindBy(xpath = "//textarea[@id='address']")
	WebElement addressfeild;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernamefeild;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordfeild;
	@FindBy(xpath = "//button[text()='Save']")
	WebElement savebutton;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	WebElement alert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	WebElement searchbutton;
	@FindBy(xpath = "//input[@id='un']")
	WebElement searchbyname;
	@FindBy(xpath = "//input[@id='ut']")
	WebElement searchbyemail;
	@FindBy(xpath = "//input[@id='ph']")
	WebElement searchbyphonenumber;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']")
	WebElement searchsearch;
	@FindBy(xpath = "//table/tbody/tr[1]")
	WebElement table;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/edit?edit=427&page_ad=1']")
	WebElement editbutton;
	@FindBy(xpath="//input[@id='name']")
	WebElement editname;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	WebElement alertmessagecolor;

	public ManageDeliveryBoyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void click_manageDeliveryBoy() {
		managedeliveryboyoption.click();
	}

	public void click_new_button() {
		newoption.click();
	}

	public void enter_name(String name) {
		namefeild.sendKeys(name);
	}

	public void enter_email(String email) {
		emailfeild.sendKeys(email);
	}

	public void enter_phonenumber(String number) {
		phonenumberfeild.sendKeys(number);
	}

	public void enter_address(String address) {
		addressfeild.sendKeys(address);
	}

	public void enter_username(String username) {
		usernamefeild.sendKeys(username);
	}

	public void enter_password(String password) {
		passwordfeild.sendKeys(password);
	}

	public void click_save_option() {
		pageutility = new PageUtility(driver);
		pageutility.scroll_and_click(savebutton);
	}

	public void create_delivery_boy(String name, String email, String number, String address, String username,
			String password) {

		enter_name(name);
		enter_email(email);
		enter_phonenumber(number);
		enter_address(address);
		enter_username(username);
		enter_password(password);
	}

	public void create_delivery_boy() {

		excel.setExcelFile("Delivery boy details", "deliveryboylist");
		String name = excel.getCellData(0, 0);
		String email = excel.getCellData(0, 1);
		String number = excel.getCellData(0, 2);
		String address = excel.getCellData(0, 3);
		String username = excel.getCellData(0, 4);
		String password = excel.getCellData(0, 5);
		create_delivery_boy(name, email, number, address, username, password);
	}
	public boolean is_alert_message_visible()
	{
		generalutilities= new GeneralUtilities(driver);
		generalutilities.is_Displayed(alert);
		return alert.isEnabled();
	}
	public void click_search_button()
	{
		searchbutton.click();
	}
	public void enter_search_name()
	{
		searchbyname.sendKeys("paddy");
		
	}
	public void enter_search_email()
	{
		searchbyemail.sendKeys("devi1232@gmail.com");
	}
	public void enetr_search_phonenumber()
	{
		searchbyphonenumber.sendKeys("1.23456789E8");
	}
	public void click_searchSearch()
	{
		searchsearch.click();
	}
	public boolean is_table_present() 
	{
		generalutilities= new GeneralUtilities(driver);
		return generalutilities.is_Displayed(table);
	}
	public void click_editOption()
	{
		editbutton.click();
	}
	public void verify_editNmae() throws AWTException
	{
		pageutility= new PageUtility(driver);
		pageutility.keyboard_interaction(editname);
		editname.sendKeys("nameuser");
	}
	public void click_updateButton()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(updatebutton);
	}
	public String update_alert_message()
	{
		generalutilities= new GeneralUtilities(driver);
		return alertmessagecolor.getCssValue("background");
	}
	

}
