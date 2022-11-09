package com.supermarket.base;

import org.testng.annotations.DataProvider;

public class DataProviderClass {
	@DataProvider(name="manageproductnew")
		public Object[][] manage_product()
		{
			return new Object[][] {{"wheat","grocery","5","15","335","340","51","670","high quality wheat"}};
		}
	@DataProvider(name="searchOffers")
		public Object[][] manageOfferCode()
	{
		return new Object[][] {{"TRYNEW20"}};
		
	}

}
