package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class GenericPropertyLib 
{
	public static String getvalue(String path,String key)
	{
		String value="";
		
		try 
		{
			FileInputStream fis = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fis);
			value=prop.getProperty(key);
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		return value;
		
		
	}

}
