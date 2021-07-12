package seleniumScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHandling {
	public String url;
	public String username;
	public String password;

	public  void excelReader() throws Exception 
	{
	    //Path      filepath
		//Filename   testdata.xlsx
		//sheet name  sheet1
		//column 1
		//row2
		
		
		FileInputStream fis = new FileInputStream("C:\\Personal\\Selenium\\Projects\\TestData.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		 
		 url = sheet.getRow(1).getCell(0).getStringCellValue();
		 username = sheet.getRow(1).getCell(1).getStringCellValue();
		 password = sheet.getRow(1).getCell(2).getStringCellValue();
		
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		
		workbook.close();

		
		

	}
	
	
	public void excelWrite() throws Exception
	{
        FileInputStream fis = new FileInputStream("C:\\Personal\\Selenium\\Projects\\TestData.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(2);
		Cell cell =row.createCell(1);
		
		cell.setCellValue("JHON");
		
		FileOutputStream fos = new FileOutputStream("C:\\Personal\\Selenium\\Projects\\TestData.xlsx");
		workbook.write(fos);
		
		workbook.close();
		

		
	}

}
