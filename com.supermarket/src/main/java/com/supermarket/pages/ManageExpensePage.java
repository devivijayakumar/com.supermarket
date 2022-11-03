package com.supermarket.pages;

import java.awt.AWTException;
import java.io.File;

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
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement mngexpexpensenewselect;
	@FindBy(xpath = "//select[@id='user_id']")
	private WebElement mngexpuserdpdw;
	@FindBy(xpath = "//option[text()='Sumesh(PR)']")
	private WebElement mngexpdropnew;
	@FindBy(xpath = "//select[@id='ex_cat']")
	private WebElement mngexpcategory;
	@FindBy(xpath = "//option[text()='IceCreams']")
	private WebElement mngexpcategorydrop;
	@FindBy(xpath = "//select[@id='order_id']")
	private WebElement mngexporderid;
	@FindBy(xpath = "//option[text()='211']")
	private WebElement mngexporderiddrop;
	@FindBy(xpath = "//select[@id='purchase_id']")
	private WebElement mngexppurchaseid;
	@FindBy(xpath = "//select[@id='purchase_id']//option[text()='56']")
	private WebElement mngexppurchaseiddrop;
	@FindBy(xpath = "//select[@id='ex_type']")
	private WebElement mngexpexpensetype;
	@FindBy(xpath = "//select[@id='ex_type']//option[text()='Debit Cash']")
	private WebElement mngexpexpensedrop;
	@FindBy(xpath = "//input[@id='amount']")
	private WebElement mngexpamount;
	@FindBy(xpath = "//input[@type='file']")
	private WebElement mngexpfileupload;
	@FindBy(xpath = "//button[@class='btn btn-danger']")
	private WebElement mngexpsave;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement mngexpalert;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-primary']")
	private WebElement mngexpsearchbutton;
	@FindBy(xpath = "//select[@id='um']")
	private WebElement mngexpsearchuser;
	@FindBy(xpath = "//select[@id='um']//option[text()='Sumesh(PR)']")
	private WebElement mngexpsearchdropdown;
	@FindBy(xpath = "//button[@class='btn btn-danger btn-fix']")
	private WebElement mngexpsearch;
	@FindBy(xpath = "//table[@class='table table-bordered table-hover table-sm']")
	private WebElement mngexpsearchtable;
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
	public void click_mngexpExpenseNew()
	{
		mngexpexpensenewselect.click();
	}
	public void click_mngexpNew_userDropdown()
	{
		mngexpuserdpdw.click();
	}
	public void select_mngexpExpenseDropdown()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(mngexpdropnew);
	}
	public void click_mngexpNew_category()
	{
		mngexpcategory.click();
	}
	public void click_mngexpNew_categoryDropdown()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(mngexpcategorydrop);
	}
	public void click_mngexpNew_orderid()
	{
		mngexporderid.click();
	}
	public void click_mngexpNew_orderid_dropdown()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(mngexporderiddrop);
	}
	public void click_mngexpNew_purchaseid()
	{
		mngexppurchaseid.click();
	}
	public void click_mngexpNew_purchaseid_dropdown()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(mngexppurchaseiddrop);
	}
	public void click_mngexpNew_expenseType()
	{
		mngexpexpensetype.click();
	}
	public void click_mngexpNew_expenseType_dropdown()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(mngexpexpensedrop);
	}
	public void enter_mngexpNew_amount()
	{
		mngexpamount.sendKeys("5000");
	}
	public void mngexpNew_fileUpload()
	{
		File fileDOC= new File("C:\\Users\\lenovo\\Desktop\\Doc.docx");
		mngexpfileupload.sendKeys(fileDOC.getAbsolutePath());
	}
	public void click_mngexpSave()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(mngexpsave);
		
	}
	public String mngexpNew_alert_message()
	{
	generalutilities= new GeneralUtilities(driver);
	return mngexpalert.getCssValue("background");
	}
	public void click_mngexp_searchButton()
	{
		mngexpsearchbutton.click();
	}
	public void click_mngexp_searchUser()
	{
		mngexpsearchuser.click();
	}
	public void click_mngexp_searchUserDropdown()
	{
		mngexpsearchdropdown.click();
	}
	public void click_mngexp_search()
	{
		mngexpsearch.click();
	}
	public boolean is_mngexpSearch_tablePresent()
	{
		generalutilities= new GeneralUtilities(driver);
		return generalutilities.is_Displayed(mngexpsearchtable);
	}

}
