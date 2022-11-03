package com.supermarket.tests;

import java.awt.AWTException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageExpensePage;

public class ManageExpenseTest extends Base {
	ManageExpensePage manageexpensepage;
	LoginPage loginpage;
	Constants constants;
	@Test
	public void verify_newButton()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageexpensepage= new ManageExpensePage(driver);
		manageexpensepage.click_on_manageExpense();
		manageexpensepage.click_on_ExpenseCategory();
		manageexpensepage.click_newButton();
		manageexpensepage.enter_titleFeild();
		manageexpensepage.click_saveButton();
		constants= new Constants();
		String actualresult=manageexpensepage.new_alert_message();
		Assert.assertEquals(actualresult,Constants.EXPECTED_NEW_BUTTON_ALERT_BACKGROUND_COLOR );
	}
	@Test
	public void verify_searchButton()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageexpensepage= new ManageExpensePage(driver);
		manageexpensepage.click_on_manageExpense();
		manageexpensepage.click_on_ExpenseCategory();
		manageexpensepage.click_searchButton();
		manageexpensepage.enter_search_titleFeild();
		manageexpensepage.click_searchSearch_button();
		Assert.assertTrue(manageexpensepage.is_searchresulttable_present());
	}
	@Test
	public void verify_editbutton() throws AWTException
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageexpensepage= new ManageExpensePage(driver);
		manageexpensepage.click_on_manageExpense();
		manageexpensepage.click_on_ExpenseCategory();
		manageexpensepage.click_editButton();
		manageexpensepage.enetr_edit_searchFeild();
		manageexpensepage.click_edit_updatebutton();
		constants= new Constants();
		String actualresult= manageexpensepage.edit_alert_message();
		Assert.assertEquals(actualresult, constants.EXPECTED_EDIT_BUTTON_ALERT_BACKGROUND_COLOR);
	}
	@Test
	public void verify_deleteButton()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageexpensepage= new ManageExpensePage(driver);
		manageexpensepage.click_on_manageExpense();
		manageexpensepage.click_on_ExpenseCategory();
		manageexpensepage.click_deleteButton();
		constants= new Constants();
	String actualresult= manageexpensepage.delete_alert_message();
	Assert.assertEquals(actualresult, Constants.EXPECTED_DELETE_BUTTON_ALERT_BACKGROUND);
	}
	@Test
	public void verify_Manage_expense_new()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageexpensepage= new ManageExpensePage(driver);
		manageexpensepage.click_on_manageExpense();
		manageexpensepage.click_mngexpexpenseCategory();
		manageexpensepage.click_mngexpExpenseNew();
		manageexpensepage.click_mngexpNew_userDropdown();
		manageexpensepage.select_mngexpExpenseDropdown();
		manageexpensepage.click_mngexpNew_category();
		manageexpensepage.click_mngexpNew_categoryDropdown();
		manageexpensepage.click_mngexpNew_orderid();
		manageexpensepage.click_mngexpNew_orderid_dropdown();
		manageexpensepage.click_mngexpNew_purchaseid();
		manageexpensepage.click_mngexpNew_purchaseid_dropdown();
		manageexpensepage.click_mngexpNew_expenseType();
		manageexpensepage.click_mngexpNew_expenseType_dropdown();
		manageexpensepage.enter_mngexpNew_amount();
		manageexpensepage.mngexpNew_fileUpload();
		manageexpensepage.click_mngexpSave();
		constants= new Constants();
		String actualresult= manageexpensepage.mngexpNew_alert_message();
		Assert.assertEquals(actualresult, Constants.EXPECTED_MNGEXP_NEW_ALER);
		}
	@Test
	public void verify_manageExpenseCategory_search()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageexpensepage= new ManageExpensePage(driver);
		manageexpensepage.click_on_manageExpense();
		manageexpensepage.click_mngexpexpenseCategory();
		manageexpensepage.click_mngexp_searchButton();
		manageexpensepage.click_mngexp_searchUser();
		manageexpensepage.click_mngexp_searchUserDropdown();
		manageexpensepage.click_mngexp_search();
		Assert.assertTrue(manageexpensepage.is_mngexpSearch_tablePresent());
	}

}
