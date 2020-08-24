package testcases;

import org.testng.annotations.Test;

import genericlibrary.ExcelLibrary;
import pages.Loginpage;

public class Testcase2 extends BaseTest
{
	@Test
	public void invalidLogin() 
	{
		Loginpage l = new Loginpage(driver);
		String un = ExcelLibrary.getValue(XL_PATH,"TC002", 1, 0);
		String pwd= ExcelLibrary.getValue(XL_PATH,"TC002", 1, 1);
		l.setusername(un);
		l.setpassword(pwd);
		l.clickloginbutton();
		l.VerifyErrorMassage();
	}

}
