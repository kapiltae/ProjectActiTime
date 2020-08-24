package testcases;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import genericlibrary.GenericPropertyLib;
import genericlibrary.GetImage;
import genericlibrary.IautoConstant;

public class BaseTest implements IautoConstant
{
	public WebDriver driver;
	static
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	}
	
	@BeforeMethod
	public void openApp() 
	{
		String appURL = GenericPropertyLib.getvalue(CONFIG_PATH,"url");
		long ito = Long.parseLong(ITO);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ito, TimeUnit.SECONDS);
		driver.get(appURL);
		
	}
	
	@AfterMethod
	public void closeApp(ITestResult result)
	{
		int status = result.getStatus();
		String name=result.getName();
		if(status==1)
		{
			Reporter.log("PASSED"+name, true);
		}
		else
		{
			Reporter.log("FAILED"+name, true);
			GetImage.getphoto(driver, name);
			
			
		}
		driver.quit();
	}
	
	

}
