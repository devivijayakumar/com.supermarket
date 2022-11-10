package com.supermarket.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.supermarket.base.Base;
import com.supermarket.constants.Constants;
import com.supermarket.pages.LoginPage;
import com.supermarket.pages.ManageProductPage;



public class ManageProductTest extends Base  {

	LoginPage loginpage;
	Constants constants;
	ManageProductPage manageproductpage;
	@Test(dataProvider="manageproductnew",dataProviderClass= com.supermarket.base.DataProviderClass.class)
	public void verify_create_new_product(String data1, String data2,String data3,String data4,String data5,String data6,String data7,String data8,String data9)
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageproductpage= new ManageProductPage(driver);
		manageproductpage.click_manage_product();
		manageproductpage.click_manage_product_newButton();
		manageproductpage.enter_titleFeild(data1);
		manageproductpage.click_productType();
		manageproductpage.enter_tagFeild(data2);
		manageproductpage.click_category_dropDown();
		manageproductpage.click_Subcategory_dropDown("wheat");
		manageproductpage.click_group_dropdown("discount");
		manageproductpage.click_PriceTyep_RadioType();
		manageproductpage.enter_weightValue(data3);
		manageproductpage.click_WeightUnit_DropDown();
		manageproductpage.enter_MaxWeightValue(data4);
		manageproductpage.enter_price(data5);
		manageproductpage.enter_Mrp(data6);
		manageproductpage.enter_StockAvailability(data7);
		manageproductpage.enter_PurchasePrice(data8);
		manageproductpage.enter_Description(data9);
		manageproductpage.click_StockFeild();
		manageproductpage.image_Upload(Constants.EXPECTED_IMAGE_UPLOAD);
		manageproductpage.sub_Image_Upload(Constants.EXPECTED_SUB_IMAGE_UPLOAD);
		manageproductpage.click_Featured_radioButton();
		manageproductpage.click_comboPack_radioButton();
		manageproductpage.click_save_button();
		String actualresult= manageproductpage.alert_text();
		String expectedresult=Constants.EXPECTED_ALERT_TEXT;
		Assert.assertEquals(actualresult, expectedresult);
	}
	@Test
	public void verify_search_functionality()
	{
		loginpage = new LoginPage(driver);
		loginpage.login();
		manageproductpage= new ManageProductPage(driver);
		manageproductpage.click_manage_product();
		manageproductpage.click_searcheButton();
		manageproductpage.enter_searchTitle("wheat");
		manageproductpage.click_category_dropDown();
		manageproductpage.click_Search_Subcategory_dropDown("wheat");
		manageproductpage.click_searchsearch();	
		String actualresult=(manageproductpage.searchTable_text());
		String expectedresult=Constants.EXPECTED_SEARCH_ALERT_TEXT;
		Assert.assertEquals(actualresult, expectedresult);
		
	}
}
