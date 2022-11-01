package com.supermarket.base;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.supermarket.constants.Constants;
import com.supermarket.utilities.ScreenShot;
import com.supermarket.utilities.WaitUtility;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public FileInputStream ip;
	ScreenShot sceenshot;

	public Base() 
	{
		prop = new Properties();
		try 
		{
			ip = new FileInputStream(Constants.CONFIG_FILE_PATH);
			prop.load(ip);
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}


	public void intialise(String browser, String url) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browser.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(WaitUtility.IMPLICIT_WAIT));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(WaitUtility.PAGE_LOAD_WAIT));

	}
	@Parameters("browser")
	@BeforeMethod(enabled = false)
	public void setUpCrossBrowser(String browser) {
		//String browser;
		String url;
		//browser= prop.getProperty("browser");
		url=prop.getProperty("url");
		intialise(browser,url);

	}
	@BeforeMethod(enabled = true,alwaysRun = true)
	public void setUp() {
		String browser;
		String url;
		browser= prop.getProperty("browser");
		url=prop.getProperty("url");
		intialise(browser,url);

	}
	@AfterMethod(alwaysRun = true)
	public void tearDown(ITestResult itestresult)//inbuilt listner testcasename and screenshotname same
	{
		//driver.close();
		sceenshot= new ScreenShot();
		if(itestresult.getStatus()== ITestResult.FAILURE)
		{
			String testcaseName= itestresult.getName();
			sceenshot.take_screenShot(driver,testcaseName);
		}
		
	}
	

}
