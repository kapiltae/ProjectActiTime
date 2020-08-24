package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	@FindBy(tagName ="userProfileLink username ")
	private WebElement userprofile;
	
	@FindBy(id ="container_tt")
	private WebElement module_timetrack;
	
	@FindBy(id ="container_tasks")
	private WebElement module_task;
	
	@FindBy(id ="container_reports")
	private WebElement module_report;
	
	@FindBy(id ="container_users")
	private WebElement module_user;
	
	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void  clicklogout()
	{
		logout.click();
	}
	
	public void  userprofile()
	{
		userprofile.click();
	}
	
	public void  menu_timetrack()
	{
		module_timetrack.click();
	}
	
	public void  menu_task()
	{
		module_task.click();
	}
	
	public void  menu_report()
	{
		module_report.click();
	}
	
	public void  menu_user()
	{
		module_user.click();
	}
	
	
	
	
	

}
