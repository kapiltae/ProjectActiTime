 package genericlibrary;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class GetImage 
{
	public static void getphoto(WebDriver driver, String name)
	{
		LocalDateTime ldt = LocalDateTime.now();
		String date = ldt.toString().replace(':', '-');
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File(IautoConstant.IMAGE_PATH+date+name+".png");
		try 
		{
		FileUtils.copyFile(srcFile, destFile);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
		

}
