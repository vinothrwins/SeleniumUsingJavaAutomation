package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement countryDropDown = driver.findElement(By.id("vfb-13-country"));
		
		// Verify the Country DropDown is displayed
		if(countryDropDown.isDisplayed()) {
			System.out.println("Country DropDown is displayed");
		}
		else
		{
			System.out.println("Country DropDown is not displayed");
		}
		
		// Verify the Country DropDown is enabled
		if(countryDropDown.isEnabled()) {
			System.out.println("Country DropDown is enabled");
		}
		else
		{
			System.out.println("Country DropDown is not enabled");
		}

		
		// To select the item from the country dropdown, create the select object
		
		Select cDropDown = new Select(countryDropDown);
		
		
        // Select using VisibleText
		cDropDown.selectByVisibleText("India");
		
		Thread.sleep(5000);
		
		// Select using value
		cDropDown.selectByValue("United States of America");
		
		Thread.sleep(5000);
		
		//Select using index
		cDropDown.selectByIndex(9); // Australia
				
	}

}
