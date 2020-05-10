package com.aiforevery1.Utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static XSSFWorkbook workbook; 
	static XSSFSheet sheet; 
	
	public ExcelUtils(String excelPath, String SheetName){
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(SheetName);
		} catch (IOException e) {
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
			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue(); // Row , column
			System.out.println(cellData);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return cellData;	

	}

	public static void getCellDataNumber(int rowNum,int colNum) {
		int cellData;
		try {
			cellData = (int) sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println(cellData);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}	

	}

	public static void main(String[] args) {
		getRowCount();
		getCellDataString(1,0);
		getCellDataNumber(1,2);
	}

}
