package _04HandlingAdvancedWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDynamicWebTable {

	public static void main(String[] args) {

		// Step 1 : Chrome driver setup and launch application
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/webtable/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		// Step 2 : Identify the WebTable		
		WebElement empTable = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div/div/table/tbody"));
		
		// Step 3 : To retrieve the rows of the table
		List<WebElement> rowsTable = empTable.findElements(By.tagName("tr"));
		
		// Step 4: To calculate the total number of rows
		int rowCount = rowsTable.size();
		//System.out.println(rowCount); // 4
		
		// Step 5 : For Loop - Loop will be executed till the last row of the table
		for( int row = 0; row < rowCount; row++) {
			
			// Step 6 : To retrieve the columns of the SPECIFIED ROW
			List<WebElement> columnRow = rowsTable.get(row).findElements(By.tagName("td"));
			
			// Step 7 : To calculate the total number of columns
			int colCount = columnRow.size();
			//System.out.println(colCount); // 11
			
			// Step 8 : Execute the loop till the last cell of the columns
			for (int col = 0 ; col < colCount; col++) {
				
				// Step 9 : To retrieve text from all the cells
				String cellText = columnRow.get(col).getText();
				//System.out.println(cellText);
				
				// step 10 : Find the specific value
				//String empNumber = "635241";
				String firstName1 = "Vijay";
				if(cellText.equals(firstName1)) {
				//if(cellText.equals(empNumber)) {
					int rowNew = row + 1 ;
					
					// Print First NAme
					String firstName = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr["+ rowNew +"]/td[2]")).getText();
					System.out.println("The first name of the employer is "+ firstName);
					
 			       // Print the Last Name
 				   String lastNameVal = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr["+ rowNew +"]/td[3]")).getText();
 				   System.out.println("The last name of the employee is "+ lastNameVal);
 				   
 			       // Print the Company Name
 				   String companyName = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr["+ rowNew +"]/td[8]")).getText();
 				   System.out.println("The company name is "+ companyName);
 				   
 			       // Print the Salary
 				   String salary = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr["+ rowNew +"]/td[10]")).getText();
 				   System.out.println("The salary of the employee is "+ salary);
 				   	
 				   
 				  // Print the Email ID
				   WebElement email = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[2]/div/div/div/div/div/div/div/table/tbody/tr["+ rowNew +"]/td[11]"));
				   String emailId = email.getText();
				   System.out.println("Email id of the employee is "+ emailId);						
				   				   
				}
				
				
			}
						
			
		}
		
	

	}

}
