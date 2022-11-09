package com.supermarket.pages;

	import java.util.List;

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import com.supermarket.utilities.GeneralUtilities;
	import com.supermarket.utilities.PageUtility;
	import com.supermarket.utilities.WaitUtility;
	
	public class ManageOrderPage {
		WebDriver driver;
		PageUtility pageutility;
		GeneralUtilities generalutilities;
		
		@FindBy(xpath="//li[@class='nav-item']//a[@href='https://groceryapp.uniqassosiates.com/admin/list-order']")
		WebElement manageOrder;
		@FindBy(xpath="//a[@class='btn btn-rounded btn-primary']")
		WebElement searchField;
		@FindBy(xpath="//input[@id='od']")
		WebElement orderId;
		@FindBy(xpath="//input[@id='um']")
		WebElement userId;
		@FindBy(xpath="//input[@id='sd']")
		WebElement startDate;
		@FindBy(xpath="//input[@id='ed']")
		WebElement endDate;
		@FindBy(xpath="//select[@id='pt']")
		WebElement paymentMode;
		@FindBy(xpath="//select[@id='st']")
		WebElement status;
		@FindBy(xpath="//button[@name='Search']")
		WebElement searchButton;
		@FindBy(xpath="//button[@class='btn btn-default btn-fix']")
		WebElement resetButton;
		@FindBy(xpath="//tbody//tr[1]//td[1]")
		WebElement orderid;
		@FindBy(xpath="//a[@href='https://groceryapp.uniqassosiates.com/admin/Order/details?details=399&page_ad=1']")
		WebElement viewOption;
		@FindBy(xpath="//img[@src='https://groceryapp.uniqassosiates.com/public/uploads/small/1601796976_dae72f5a4836c0e99ed2.jpg']")
		WebElement imageProduct;
		
		
		
		public ManageOrderPage(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
			}
		public void click_OnManageOrder()
		{
			manageOrder.click();
		}
		public void click_OnSearchField()
		{
			searchField.click();
		}
		public void enter_OrderId(String orderid)
		{
			orderId.sendKeys(orderid);
		}
		public void enter_UserId(String userid)
		{
			userId.sendKeys(userid);
		}
		public void enter_StartDate(String date)
		{
			startDate.sendKeys(date);
		}
		public void enter_EndDate(String date)
		{
			endDate.sendKeys(date);
		}
		
		public void enter_PaymentMode() {
			pageutility = new PageUtility(driver);
			pageutility.select_ByValue("Cash on Delivery",paymentMode);
		}
		public void enter_Status() {
			pageutility = new PageUtility(driver);
			pageutility.select_ByValue("Out For Delivery",status);
		}
		public void click_OnSearchButton()
		{
			searchButton.click();
		}
		public boolean searchButton_Enabled() {
			generalutilities = new GeneralUtilities(driver);
			return generalutilities.is_Enabled(searchButton);
		}
		public void enter_AnotherPaymentMode() {
			pageutility = new PageUtility(driver);
			pageutility.select_ByValue("Net Banking/Debit/Credit Card",paymentMode);
		}
		public void enter_Statusoforder() {
			pageutility = new PageUtility(driver);
			pageutility.select_ByValue("Paid",status);
		}
		public void click_OnResetButton()
		{
			resetButton.click();
		}
		public boolean resetButton_Enabled() {
		generalutilities = new GeneralUtilities(driver);
			return generalutilities.is_Enabled(resetButton);
		}
		public List<String>  get_Text(String xpath)
		{
			 generalutilities = new GeneralUtilities(driver);
			
			return generalutilities.get_TextOfElemets("//tbody//tr[1]//td");
		
		}
		public String get_OrderId() {
			generalutilities = new GeneralUtilities(driver);
			return generalutilities.get_Text(orderid);
		}
		public void click_OnViewOption()
		{
			pageutility = new PageUtility(driver);
			pageutility.scroll_and_click(viewOption);
			
		}
		public boolean image_Dispalyed() {
			generalutilities = new GeneralUtilities(driver);
			return generalutilities.is_Displayed(imageProduct);
		}
	}


