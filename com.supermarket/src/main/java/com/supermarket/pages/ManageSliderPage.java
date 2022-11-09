package com.supermarket.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageSliderPage {
	WebDriver driver;
	PageUtility pageutility;
	GeneralUtilities generalutilities;
	
	@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-slider']")
	private WebElement manageSildePage ;
	@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Slider/add']")
	private WebElement newOption ;
	@FindBy(xpath="//input[@id='main_img']")
	private WebElement image ;
	@FindBy(xpath="//input[@id='link']")
	private WebElement link ;
	@FindBy(xpath="//button[@class='btn btn-danger']")
	private WebElement saveButton ;
	
	public  ManageSliderPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void click_ManageSlide()
	{
		manageSildePage.click();
	}
	public void click_NewOption()
	{
		newOption.click();
	}
	public void upLoad_Image(String imag) {
		image.sendKeys(imag);
	}
	public void enter_Link(String url) {
		link.sendKeys(url);
	}
	public void click_save()
	{
		saveButton.click();
	}
	public boolean saveButton_Enabled() {
		generalutilities = new GeneralUtilities(driver);
		return generalutilities.is_Enabled(saveButton);
	}


}
