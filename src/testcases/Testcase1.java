package testcases;

import org.testng.annotations.Test;

import genericlibrary.ExcelLibrary;
import pages.Loginpage;

public class Testcase1 extends BaseTest
{
	@Test
	public void validLogin() 
	{
		Loginpage l = new Loginpage(driver);
		String un = ExcelLibrary.getValue(XL_PATH,"TC001", 1, 0);
		String pwd= ExcelLibrary.getValue(XL_PATH,"TC001", 1, 1);
		l.setusername(un);
		l.setpassword(pwd);
		l.clickloginbutton();
		
	}

}
