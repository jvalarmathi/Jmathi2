package SeleniumTest3;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readexcelcountrows {
@Test
	public void ReadExcelTest() throws IOException
	{
	/*FileInputStream excel=new FileInputStream("C:/Users/IBM_ADMIN/Documents/Selenium/SeleniumTest.xlsx");
	XSSFWorkbook wb = new XSSFWorkbook(excel);
	XSSFSheet sheet = wb.getSheet("Credentials");
	XSSFRow row= sheet.getRow(0);
		int rows = sheet.getLastRowNum()+1;
		int column = row.getLastCellNum();
		System.out.println("No.of.rows:"+rows);
		System.out.println("No.of.Columns:"+column);*/
	FileInputStream excel = new FileInputStream("C:/Users/IBM_ADMIN/Documents/Selenium/SeleniumTest.xlsx");
	XSSFWorkbook wb= new XSSFWorkbook(excel);
	XSSFSheet sheet=wb.getSheet("Credentials");
	XSSFRow row=sheet.getRow(0);
	int rows,columns;
	rows=sheet.getLastRowNum()+1;
	columns=row.getLastCellNum();
	System.out.println("No.of.rows:"+rows);
	System.out.println("No.of.columns:"+columns);
	
	
			
		
	}
}
