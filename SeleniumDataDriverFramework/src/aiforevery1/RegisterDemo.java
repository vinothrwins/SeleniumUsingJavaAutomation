package aiforevery1;

import com.aiforevery1.Utility.ExcelUtil;
import com.aiforevery1.Utility.ExcelUtils;

public class RegisterDemo {

	static String excelPath = ".\\TestData\\Aiforevery1_TestData.xlsx";
	static String sheetName = "RegisterDemo";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExcelUtil excel = new ExcelUtil(excelPath, sheetName);
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(1, 2);
		
	}

}
