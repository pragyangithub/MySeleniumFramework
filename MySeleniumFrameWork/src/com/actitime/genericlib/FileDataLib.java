package com.actitime.genericlib;

import java.io.FileInputStream;

import java.util.Properties;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileDataLib {
	
	public Properties getPropertyObj() throws Throwable  {
		FileInputStream fis = new FileInputStream("./testData/config.properties");
		Properties pObj = new Properties();
		pObj.load(fis);
		return pObj;
	}
	
	public String getExcelData(String sheetNAme , int rowNum, int celNem) throws Throwable{
		FileInputStream fis = new FileInputStream("./testData/testData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet(sheetNAme);
		Row row = sh.getRow(rowNum);
		String data = row.getCell(celNem).getStringCellValue();
		return data;
	}

}
