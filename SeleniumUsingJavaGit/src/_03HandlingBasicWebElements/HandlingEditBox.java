package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingEditBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
		String firstNameVal = "Vinoth";
		
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement firstName = driver.findElement(By.name("vfb-5"));
		
		// Verify the first name is displayed
		if(firstName.isDisplayed()) {
			System.out.println("First Name is displayed");
			
		}
		else
		{
			System.out.println("First Name is not displayed");
		}
		
		// Verify the first name is enabled
		if(firstName.isEnabled()) {
			System.out.println("First Name is enabled");
			firstName.sendKeys(firstNameVal);
			System.out.println("First Name is entered is "+ firstNameVal);
		}
		else
		{
			System.out.println("First Name is not enabled");
		}
		
		// Get the attribute value
		String firstNameText = firstName.getAttribute("value");
		String firstNameClass = firstName.getAttribute("class");
		
		System.out.println("The value present in the first name is "+ firstNameText);
		System.out.println("The class present in the first name is "+ firstNameClass);
		
		Thread.sleep(3000);
		
		//Clear the first name
		firstName.clear();
		
		// Get the attribute value
		String firstNameText1 = firstName.getAttribute("value");
		
		System.out.println("The value present in the first name is "+ firstNameText1);
		
	}

}
