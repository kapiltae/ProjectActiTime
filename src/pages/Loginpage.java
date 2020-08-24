package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
public class Loginpage
{
	 String expectedTitle = "actiTIME - Login";
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(name="pwd")
	private WebElement Password;
	
	@FindBy(id="loginButton")
	private WebElement loginbutton;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement rememberme_checkbox;
	
	@FindBy (xpath = "//span[.='Username or Password is invalid. Please try again.']")
	private WebElement error;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement forgotpassword;
	
	@FindBy(xpath="//a")
	private List<WebElement> links;
	
	@FindBy(xpath="//img")
	private List<WebElement> images;
	
	public Loginpage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void setusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void setpassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void clickloginbutton()
	{
		loginbutton.click();		
	}
	
	public void clickcheckbox()
	{
		rememberme_checkbox.click();		
	}
	
	public void forgotpwd()
	{
		forgotpassword.click();		
	}
	
	public int getlinkcount()
	{
		return links.size();
	}
	
	public int getimagecount()
	{
		return images.size();
		
	}
	public boolean verifyTitle(String title)
	{
//		if(title.equals(expectedTitle))
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
		return title.equals(expectedTitle);
	}
	
	public void VerifyErrorMassage()
	{
	  boolean actual =  error.isDisplayed();
	  Assert.assertEquals(actual, true);
	}
	
	
}
