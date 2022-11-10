package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class MobileSliderPage {
	WebDriver driver;
	PageUtility pageutility;
	GeneralUtilities generalutilities;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-mobileslider']")
	private WebElement mobileSilderPage;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Mobileslider/add']")
	private WebElement newOption;
	@FindBy(xpath="//select[@id='cat_id']")
	private WebElement selectCategory;
	@FindBy(xpath="//input[@id='main_img']")
	private WebElement image;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement saveButton;
	@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/uploads/small/1667726156_f3e737d7ac87f34c2e44.png']")
	private WebElement displayedImage;
	@FindBy(xpath="//span[@class='badge bg-success']")
	private WebElement status;
	@FindBy(xpath = "//h5[text()=' Alert!']")
	private WebElement alert;
	@FindBy(xpath = "//span[@class='badge bg-warning']")
	private WebElement statuscheck;
	
	
	public MobileSliderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void click_MobileSlide()
	{
		mobileSilderPage.click();
	}
	public void click_NewOption()
	{
		newOption.click();
	}
	public void click_SelectCategory()
	{
		selectCategory.click();
	}
	public void enter_Category() {
		pageutility = new PageUtility(driver);
		pageutility.select_ByVisisbleText("Bake Products1", selectCategory);
	}
	public void upLoad_Image(String img) {
		image.sendKeys(img);
	}
	public void click_SaveButton()
	{
		saveButton.click();
	}
	public String alert_getText()
	{
		return alert.getText();
	}
	public boolean savedImage_Displayed() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.is_Displayed(displayedImage);
	}
	public void click_StatusOption()
	{
		 status.click();
	}
	public String status_getText()
	{
		return statuscheck.getText();
	}
	
}
