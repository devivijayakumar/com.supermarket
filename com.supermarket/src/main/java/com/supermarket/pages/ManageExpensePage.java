package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageExpensePage {
	WebDriver driver;
	@FindBy(xpath = "//p[text()='Manage Expense']")
	private WebElement manageexpense;
	@FindBy(xpath="//p[text()='Expense Category']")
	private WebElement expensecategory;
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
	

}
