package _04HandlingAdvancedWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingStaticWebTable {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/webtable/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		// Print the First Name
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/table/tbody/tr[1]/td[2]"));
		String empFirstName = firstName.getText();
		System.out.println("The first name of the employee is "+ empFirstName);
	
		// Print the Employer number
		WebElement empNumber = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/table/tbody/tr[8]/td[2]"));
		String empNumberValue = empNumber.getText();
		System.out.println("The employer number is "+ empNumberValue);
		
		// Print the email id
		WebElement email = driver.findElement(By.xpath("//*[@id=\"content\"]/article/div/div/div/div/section[1]/div/div/div/div/div/div/div/table/tbody/tr[10]/td[2]"));
		String empEmailID = email.getText();
		System.out.println("The email id of the employee is "+ empEmailID);
		
		
	}

}
