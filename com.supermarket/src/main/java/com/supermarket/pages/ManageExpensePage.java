package com.supermarket.pages;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageExpensePage {
	WebDriver driver;
	PageUtility pageutility;
	GeneralUtilities generalutilities;
	
	@FindBy(xpath = "//i[@class='fas fa-angle-left right']")
	private WebElement manageexpense;
	@FindBy(xpath="//p[text()='Expense Category']")
	private WebElement expensecategory;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement newbutton;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement newtitlefeild;
	@FindBy(xpath = "//div[@class='card-footer center']//button[@class='btn btn-block-sm btn-danger']")
	private WebElement newsavebutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement searchbutton;
	@FindBy(xpath = "//input[@id='un']")
	private WebElement searchtitlefeild;
	@FindBy(xpath = "//div[@class='card-body']//button[@class='btn btn-block-sm btn-danger']")
	private WebElement searchsearchbutton;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-warning']")
	private WebElement resetbutton;
	@FindBy (xpath = "//a[@class='btn btn-sm btn btn-primary btncss']")
	private WebElement editbutton;
	@FindBy(xpath = "//input[@id='name']")
	private WebElement editsearchfeild;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")
	private WebElement editupdatebutton;
	@FindBy(xpath = "//a[@class='btn btn-sm btn btn-danger btncss']")
	private WebElement deletebutton;
	@FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
	private WebElement newalert;
	@FindBy(xpath = "//table//tbody")
	private WebElement searchresulttable;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement editalert;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement deltalert;
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-expense']")
	private WebElement mngexpexpense;
	@FindBy(xpath = "//select[@id='user_id']")
	private WebElement mngexpexpensenewselect;
	public ManageExpensePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	public void click_on_manageExpense()
	{
		manageexpense.click();
	}
	public void click_on_ExpenseCategory()
	{
		expensecategory.click();
	}
	public void click_newButton()
	{
		newbutton.click();
	}
	public void enter_titleFeild()
	{
		newtitlefeild.sendKeys("Beverages");
	}
	public void click_saveButton()
	{
		newsavebutton.click();
	}
	public void click_searchButton()
	{
		searchbutton.click();
	}
	public void enter_search_titleFeild()
	{
		searchtitlefeild.sendKeys("vegetables");
	}
	public void click_searchSearch_button()
	{
		searchsearchbutton.click();
	}
	public void click_resetButton()
	{
		resetbutton.click();
	}
	public void click_editButton()
	{
		editbutton.click();
	}
	public void enetr_edit_searchFeild() throws AWTException
	{
		pageutility= new PageUtility(driver);
		pageutility.keyboard_interaction(editsearchfeild);
		editsearchfeild.sendKeys("Baby Food");
		
	}
	public void click_edit_updatebutton()
	{
		editupdatebutton.click();
	}
	public void click_deleteButton()
	{
		deletebutton.click();
		driver.switchTo().alert().accept();
	}
	public String new_alert_message()
	{
	generalutilities= new GeneralUtilities(driver);
	return newalert.getCssValue("background");
		
	}
	public boolean is_searchresulttable_present() 
	{
		generalutilities= new GeneralUtilities(driver);
		return generalutilities.is_Displayed(searchresulttable);
	}
	public String edit_alert_message()
	{
	generalutilities= new GeneralUtilities(driver);
	return editalert.getCssValue("background");
		
	}
	public String delete_alert_message()
	{
	generalutilities= new GeneralUtilities(driver);
	return deltalert.getCssValue("background");
	}
	public void click_mngexpexpenseCategory()
	{
		mngexpexpense.click();
	}
	

}
