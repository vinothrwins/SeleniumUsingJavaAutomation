package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRadioButton {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement femaleRadioBtn = driver.findElement(By.id("vfb-8-2"));
		
		// Verify the Female Radio Button is displayed
		if(femaleRadioBtn.isDisplayed()) {
			System.out.println("Female Radio Button is displayed");
		}
		else
		{
			System.out.println("Female Radio Button is not displayed");
		}
		
		// Verify the Female Radio Button is enabled
		if(femaleRadioBtn.isEnabled()) {
			System.out.println("Female Radio Button is enabled");
		}
		else
		{
			System.out.println("Female Radio Button is not enabled");
		}
		
		
		// Verify the Female Radio Button is selected
		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female Radio Button is selected");
		}
		else
		{
			System.out.println("Female Radio Button is not selected");
			femaleRadioBtn.click();
		}
		
		
		// Verify the Female Radio Button is selected
		if(femaleRadioBtn.isSelected()) {
			System.out.println("Female Radio Button is selected");
		}
		else
		{
			System.out.println("Female Radio Button is not selected");
		}
				
	}

}
