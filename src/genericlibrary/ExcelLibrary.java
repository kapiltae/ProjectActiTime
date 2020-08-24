package genericlibrary;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary 
{
	public static String getValue(String path,String sheetName,int r,int c)
	{
		String value="";
		try {
			FileInputStream fin = new FileInputStream(path);
			Workbook wf=WorkbookFactory.create(fin);
			value=wf.getSheet(sheetName).getRow(r).getCell(c).getStringCellValue();
			
		} 
		catch (IOException e)
		{
			e.printStackTrace();
		}
		return value;
	}
	
	

}

