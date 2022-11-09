
package com.supermarket.pages;

import java.awt.AWTException;
import java.util.Iterator;
import java.util.Set;

import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.supermarket.utilities.Excel;
import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageDeliveryBoyPage {
	WebDriver driver;
	PageUtility pageutility;
	Excel excel = new Excel();
	GeneralUtilities generalutilities;

	@FindBy(xpath = "//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-deliveryboy']")
	private WebElement managedeliveryboyoption;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newoption;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement namefeild;
	@FindBy(xpath = "//input[@id='email']")
	private WebElement emailfeild;
	@FindBy(xpath = "//input[@id='phone']")
	private WebElement phonenumberfeild;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement addressfeild;
	@FindBy(xpath = "//input[@id='username']")
	private WebElement usernamefeild;
	@FindBy(xpath = "//input[@id='password']")
	private WebElement passwordfeild;
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement savebutton;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchbutton;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement searchbyname;
	@FindBy(xpath = "//table//tbody//tr[1]//td[1]")
	private WebElement searchtableresult;
	@FindBy(xpath = "//input[@id='ut']")
	private WebElement searchbyemail;
	@FindBy(xpath = "//input[@id='ph']")
	private WebElement searchbyphonenumber;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-danger']")
	private WebElement searchsearch;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Deliveryboy/edit?edit=427&page_ad=1']")
	private WebElement editbutton;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement editname;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement updatebutton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement alertmessagecolor;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']")
	private WebElement editdelete;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editdeletecolor;
	@FindBy(xpath = "//table/tbody/tr[3]/td[6]")
	private WebElement activestatus;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement statusalert;
	@FindBy(xpath = "//table/tbody/tr[1]/td[1]")
	private WebElement searchnameactaul;

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

	public String get_text_alert_new() {
		generalutilities = new GeneralUtilities(driver);

		return alert.getText();
	}

	public void click_search_button() {
		searchbutton.click();
	}

	public void enter_search_name(String name) {
		searchbyname.sendKeys(name);
	}

	public String table_name() {
		return searchnameactaul.getText();
	}

	public void enter_search_email(String email) {
		searchbyemail.sendKeys(email);
	}

	public void enetr_search_phonenumber(String number) {
		searchbyphonenumber.sendKeys(number);
	}

	public void click_searchSearch() {
		searchsearch.click();
	}

	public String get_attribute_search() {
		generalutilities = new GeneralUtilities(driver);
		return searchbyname.getAttribute("value");

	}

	public String get_attribute_searchresult() {
		generalutilities = new GeneralUtilities(driver);
		return searchtableresult.getAttribute("value");
		
	}

	public void click_editOption() {
		editbutton.click();
	}

	public void verify_editNmae() throws AWTException {
		pageutility = new PageUtility(driver);
		pageutility.keyboard_interaction(editname);
		editname.sendKeys("nameuser");
	}

	public void click_updateButton() {
		pageutility = new PageUtility(driver);
		pageutility.scroll_and_click(updatebutton);
	}

	public String update_alert_message() {
		generalutilities = new GeneralUtilities(driver);
		return alertmessagecolor.getCssValue("background");
	}

	public void editOption_delete_button() {
		editdelete.click();
		driver.switchTo().alert().accept();
	}

	public String alert_message_shown() {
		generalutilities = new GeneralUtilities(driver);
		return editdeletecolor.getCssValue("background");
	}

	public void status_click() {
		activestatus.click();
	}

	public String status_alert() {
		generalutilities = new GeneralUtilities(driver);
		return statusalert.getCssValue("background");
	}

}
