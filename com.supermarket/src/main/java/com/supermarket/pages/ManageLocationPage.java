package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageLocationPage {
	WebDriver driver;
	PageUtility pageutility;
	GeneralUtilities generalutilities;
	
	@FindBy(xpath="//i[@class='nav-icon fas fa-map-marker']")
	private WebElement manageLocation;
	@FindBy(xpath="//a[@class='btn btn-rounded btn-danger']")
	private WebElement newOption;
	@FindBy(xpath="//select[@id='country_id']")
	private WebElement selectCountry;
	@FindBy(xpath="//select[@id='st_id']")
	private WebElement selectState;
	@FindBy(xpath="//input[@id='location']")
	private WebElement locationField;
	@FindBy(xpath="//input[@id='delivery']")
	private WebElement deliveryCharge;
	@FindBy(xpath="//button[@name='create']")
	private WebElement saveButton;
	@FindBy(xpath="//button[@name='create']")
	private WebElement searchField;
	@FindBy(xpath="//i[@class='fas fa-edit']")
	private WebElement editOption;
	@FindBy(xpath="//button[@name='update']")
	private WebElement updateButton;
	@FindBy(xpath="//span[@class='badge bg-success']")
	private WebElement statusOption;
	@FindBy(xpath="//h5[text()=' Alert!']")
	private WebElement statusOptionalert;
	@FindBy(xpath="//i[@class='fas fa-trash-alt']")
	private WebElement deleteButton;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Location/delete?del=662&page_ad=1']")
	private WebElement delete;
	
	
	public ManageLocationPage(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void click_MnageLocationPage()
	{
		manageLocation.click();
	}
	public void  click_NewOption()
	{
		newOption.click();
	}
	public void select_Country() {
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("230", selectCountry);
	}
	public void select_State()
	{
		PageUtility pageUtility = new PageUtility(driver);
		pageUtility.select_ByValue("3817", selectState);
	}
	public void enter_Location(String place)
	{
		locationField.sendKeys(place);
	}
	public void enter_DeliveryCharge(String charge)
	{
		 deliveryCharge.sendKeys(charge);
	}
	public void click_saveButton()
	{
		saveButton.click();
	}
	public boolean saveButton_Enabled() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.is_Enabled(saveButton);
	}
	public void click_searchfield()
	{
		searchField.click();
	}
	
	public void select_StateEastMidLands(String text)
	{
		pageutility = new PageUtility(driver);
		pageutility.select_ByVisisbleText(text, selectState);
	}
	public void enetre_location_feild(String location)
	{
		
	}
	public void click_EditOption()
	{
		editOption.click();
	}
	public void click_UpdateButton()
	{
		 updateButton.click();
	} 
	
	public void click_OnStatusOption()
	{
		 statusOption.click();
	}
	public String status_alert_text()
	{
		return statusOptionalert.getText();
	}
	public void click_DeleteButton()
	{
		deleteButton.click();
	}
	

}
