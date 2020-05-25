package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement testNGChckBox = driver.findElement(By.id("vfb-20-2"));
		
		// Verify the TestNG Checkbox is displayed
		if(testNGChckBox.isDisplayed()) {
			System.out.println("TestNG Checkbox is displayed");
		}
		else
		{
			System.out.println("TestNG Checkbox is not displayed");
		}
		
		// Verify the TestNG Checkbox is enabled
		if(testNGChckBox.isEnabled()) {
			System.out.println("TestNG Checkbox is enabled");
		}
		else
		{
			System.out.println("TestNG Checkbox is not enabled");
		}
		
		
		// Verify the TestNG Checkbox is selected
		if(testNGChckBox.isSelected()) {
			System.out.println("TestNG Checkbox is selected");
		}
		else
		{
			System.out.println("TestNG Checkbox is not selected");
			testNGChckBox.click();			
		}
		
		Thread.sleep(3000);
		
		// Verify the TestNG Checkbox is selected
		if(testNGChckBox.isSelected()) {
			System.out.println("TestNG Checkbox is selected");
			testNGChckBox.click();	
		}
		else
		{
			System.out.println("TestNG Checkbox is not selected");	
		}
		
		driver.findElement(By.id("vfb-20-0")).click();
		driver.findElement(By.id("vfb-20-4")).click();
		driver.findElement(By.id("vfb-20-5")).click();
		
	}

}
