package library_Files;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class UtilityClass 
{

	public static String getTD(int rowIndex, int colIndex) throws EncryptedDocumentException, IOException
	{
		//FileInputStream file = new FileInputStream("C:\\Users\\jasminmulla\\Downloads\\chromedriver_win32 (1)\\New Microsoft Excel Worksheet.xlsx");
		FileInputStream file = new FileInputStream("C:\\Users\\jasminmulla\\Sample1\\Files\\Data.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		String value=sh.getRow(rowIndex).getCell(colIndex).getStringCellValue();
		return value;
	}
}
	

