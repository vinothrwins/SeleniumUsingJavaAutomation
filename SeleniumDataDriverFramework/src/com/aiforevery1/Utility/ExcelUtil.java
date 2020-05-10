package com.aiforevery1.Utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {

	static String excelPath ;
	static String sheetName ;

	static XSSFWorkbook workbook; 
	static XSSFSheet sheet; 	

	public ExcelUtil(String excelPath, String sheetName) {
		try {
			  workbook = new XSSFWorkbook(excelPath);
			  sheet = workbook.getSheet(sheetName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}

	public static int getRowCount(){
		int rowCount=0;
		try {
			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("Total number of rows = " +rowCount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}

	public static int getColCount(){
		int colCount=0;
		try {
			// Retriving the total number of header column with hardcoded value zero
			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			System.out.println("Total number of Columns = " +colCount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}

	public static String getCellDataString(int rowNum,int colNum) {
		String cellData = null;	    
		try {
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue(); // row , col
			System.out.println(cellData);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;	
	}

	/* In order to retrive the number from the excel sheet , we have to use getNumericCellValue method
	 * 
	 */
	public static double getCellDataNumber(int rowNum,int colNum) {
		double cellData = 0;    
		try {
		cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue(); // row , col
		System.out.println(cellData);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;	
	}
	
	
	public static void main(String[] args) {
		getRowCount();
		getColCount(); 
		getCellDataString(1,2);
	}

}
