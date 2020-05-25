package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();

		WebElement submitBtn = driver.findElement(By.name("vfb-submit"));
		
		
		// Verify the Submit Button is displayed
		if(submitBtn.isDisplayed()) {
			System.out.println("Submit Button is displayed");
		}
		else
		{
			System.out.println("Submit Button is not displayed");
		}
		
		// Verify the Submit Button is enabled
		if(submitBtn.isEnabled()) {
			System.out.println("Submit Button is enabled");
			//Click on Submit Button 
			submitBtn.click();
			//submitBtn.submit();
			System.out.println("Submit Button is clicked");
		}
		else
		{
			System.out.println("Submit Button is not enabled");
		}
		
	}

}
