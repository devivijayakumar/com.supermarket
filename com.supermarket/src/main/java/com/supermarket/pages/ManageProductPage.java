package com.supermarket.pages;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.supermarket.utilities.GeneralUtilities;
import com.supermarket.utilities.PageUtility;

public class ManageProductPage {
	WebDriver driver;
	GeneralUtilities generalutilities;
	PageUtility pageutility;
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-product']")
	private WebElement manageproductoption;
	@FindBy(xpath = "//a[@class='btn btn-rounded btn-danger']")
	private WebElement productnewoption;
	@FindBy(xpath = "//input[@id='title']")
	private WebElement titlefeild;
	@FindBy(xpath = "//input[@id='tag']")
	private WebElement tagfeild;
	@FindBy(xpath = "//input[@value='Nonveg']")
	private WebElement radiobuttonproducttype;
	@FindBy(xpath = "//select[@id='cat_id']")
	private WebElement categorydropdwn;
	@FindBy(xpath = "//option[text()='Grocery & Staples']")
	private WebElement categoryselectdropdwn;
	@FindBy(xpath = "//select[@id='sub_id']")
	private WebElement subcategorydropdwn;
	@FindBy(xpath = "//option[text()='wheat']")
	private WebElement subcategoryselectdropdwn;
	@FindBy(xpath = "//select[@id='grp_id']")
	private WebElement groupdropdwn;
	@FindBy(xpath = "//option[text()='discount']")
	private WebElement groupselectdropdwn;
	@FindBy(xpath = "//input[@value='weight']")
	private WebElement radiobuttonpricetype;
	@FindBy(xpath = "//input[@id='m_weight']")
	private WebElement weighvaluefeild;
	@FindBy(xpath = "//input[@id='max_weight']")
	private WebElement maxweightfeild;
	@FindBy(xpath = "//select[@id='w_unit']")
	private WebElement weightunitdropdown;
	@FindBy(xpath = "//option[text()='kg']")
	private WebElement weightunitselectdropdown;
	@FindBy(xpath = "//input[@id='w_price']")
	private WebElement pricefeild;
	@FindBy(xpath = "//input[@id='w_mrp']")
	private WebElement mrpfeild;
	@FindBy(xpath = "//input[@id='w_stock']")
	private WebElement stockavailabilityfeild;
	@FindBy(xpath = "//input[@id='w_pp']")
	private WebElement purchasepricefeild;
	@FindBy(xpath = "//div[@class='note-editable card-block']")
	private WebElement descriptionfeild;
	@FindBy(xpath = "//input[@name='stock']")
	private WebElement radiobuttonstock;
	@FindBy(xpath = "//input[@name='main_img']")
	private WebElement image;
	@FindBy(xpath = "//input[@name='subfile[]']")
	private WebElement subimage;
	@FindBy(xpath = "//input[@name='featured']")
	private WebElement radiobuttonfeatured;
	@FindBy(xpath = "//input[@name='combo']")
	private WebElement radiobuttoncombopack;
	@FindBy(xpath = "//button[@name='create']")
	private WebElement savebutton;
	@FindBy(xpath  ="//h5[text()=' Alert!']")
	private  WebElement alerttext;
	@FindBy(xpath  ="//a[@class='btn btn-rounded btn-primary']")
	private  WebElement searchbutton;
	@FindBy(xpath  ="//input[@class='form-control']")
	private  WebElement searchtitle;
	@FindBy(xpath  ="//i[@class='fa fa-search']")
	private  WebElement searchsearch;
	@FindBy(xpath  ="//select[@id='sb']")
	private  WebElement searchsubcat;
	@FindBy(xpath  ="//table//tbody//tr[1]//td[1]")
	private  WebElement searchtable;
	
	
	public ManageProductPage(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void click_manage_product()
	{
		manageproductoption.click();
	}
	public void click_manage_product_newButton()
	{
		productnewoption.click();
	}
	public void enter_titleFeild(String data1)
	{
		titlefeild.sendKeys(data1);
	}
	public void click_productType()
	{
		radiobuttonproducttype.click();
	}
	public void enter_tagFeild(String data2)
	{
		tagfeild.sendKeys(data2);
	}
	public void click_category_dropDown()
	{
		categorydropdwn.click();
		pageutility= new PageUtility(driver);
		pageutility.select_ByIndex(2, categorydropdwn);
		
	}
	public void click_Subcategory_dropDown(String elements)
	{
		subcategorydropdwn.click();
		pageutility= new PageUtility(driver);
		pageutility.select_ByVisisbleText( elements, subcategorydropdwn);
	}
	public void click_group_dropdown(String elementg)
	{
		groupdropdwn.click();
		pageutility= new PageUtility(driver);
		pageutility.select_ByVisisbleText(elementg, groupdropdwn);
	}
	public void click_PriceTyep_RadioType()
	{
		radiobuttonpricetype.click();
	}
	public void enter_weightValue(String data3)
	{
		weighvaluefeild.sendKeys(data3);
	}
	public void click_WeightUnit_DropDown()
	{
		weightunitdropdown.click();
		pageutility= new PageUtility(driver);
		pageutility.select_ByIndex(2, weightunitdropdown);
	}
	public void enter_MaxWeightValue(String data4)
	{
		maxweightfeild.sendKeys(data4);
	}
	public void enter_price(String data5)
	{
		pricefeild.sendKeys(data5);
	}
	public void enter_Mrp(String data6)
	{
		mrpfeild.sendKeys(data6);
	}
	public void enter_StockAvailability(String data7)
	{
		stockavailabilityfeild.sendKeys(data7);
	}
	public void enter_PurchasePrice(String data8)
	{
		purchasepricefeild.sendKeys(data8);
	}
	public void enter_Description(String data9)
	{
		pageutility= new PageUtility(driver);
		pageutility.scorll_down(5, 5);
		descriptionfeild.sendKeys(data9);
	}
	public void click_StockFeild()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(radiobuttonstock);
		
	}
	public void image_Upload(String imag)
	{
		pageutility= new PageUtility(driver);
		pageutility.scorll_down(10, 10);
		image.sendKeys(imag);
		
	}
	public void sub_Image_Upload(String subimag)
	{
		//pageutility= new PageUtility(driver);
		//pageutility.scorll_down(10, 10);
		subimage.sendKeys(subimag);
	}
	public void click_Featured_radioButton()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(radiobuttonfeatured);
		radiobuttonfeatured.click();
	}
	public void click_comboPack_radioButton()
	{
		radiobuttoncombopack.click();
	}
	public void click_save_button()
	{
		pageutility= new PageUtility(driver);
		pageutility.scroll_and_click(savebutton);
	}
	public String alert_text()
	{
		return alerttext.getText();
	}
	public void click_searcheButton()
	{
		searchbutton.click();
	}
	
	public void enter_searchTitle(String titlename)
	{
		searchtitle.sendKeys(titlename);
	}
	public void click_searchsearch()
	{
		searchsearch.click();
	}
	public void click_Search_Subcategory_dropDown(String elements)
	{
		searchsubcat.click();
		pageutility= new PageUtility(driver);
		pageutility.select_ByVisisbleText( elements, searchsubcat);
	}
	public String searchTable_text()
	{
		return searchtable.getText();
	}
	
}
