package aiforevery1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aiforevery1.Utility.*;

public class LoginApplication {

	WebDriver driver=null;
	
	@DataProvider(name = "test1data")
	public Object[][] getData() {
		String excelPath = ".\\TestData\\Aiforevery1_TestData.xlsx";
		Object data[][] = testData(excelPath, "RegisterDemo");
		return data;
		
	}
	
	@BeforeMethod
	public void setUpTest() {
			System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://aiforevery1.com/demo-site/");
			driver.manage().window().maximize();
	}
	
	@Test(dataProvider="test1data")
	public void test1(String username, String password) throws Exception {
		System.out.println(username+" | "+password);	
		
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.findElement(By.id("txtPassword")).sendKeys(password);
		Thread.sleep(2000);
				
	}
	
	@AfterMethod
	public void closeApp() {
		driver.close();
	}
	
	
	public Object[][] testData(String excelPath, String sheetName) {
		
		ExcelUtils excel = new ExcelUtils(excelPath, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		//declaring the 2dimensional object array. Reason to declare it as 
		// Object because we dont know the input data type. We may get any data type input
		Object data[][] = new Object[rowCount-1][colCount]; // mention the size 
		
		// here i = 0 will be the header row , so we are starting from i=1
		for(int row=1; row<rowCount; row++) {
			// Since the values in column zero also needed, we are starting from col=0
			for(int col=0; col<colCount; col++) {
				
				// This will get the data corresponding to row,col 
				String cellData = ExcelUtils.getCellDataString(row, col);
				//System.out.print(cellData+" | ");
				
				// The cell data value will be saved to multi dimensional array
				data[row-1][col] = cellData;
				
			}
			//System.out.println();
		}
		return data;
		
	}

}
