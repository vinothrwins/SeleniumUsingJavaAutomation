package _04HandlingAdvancedWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseHover {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();

		WebElement demoSites = driver.findElement(By.xpath("//span[@class='text-wrap'][contains(text(),'DEMO SITES')]"));
		
		// Create an instance in the Actions class by passing WEBDRIVER INSTANCE
		Actions actBuilder = new Actions(driver);
		
		// Move/hover the move above Demo Sites
		actBuilder.moveToElement(demoSites).build().perform();
		
		
		//Click on Automation Practice Form - Scenario
		//driver.findElement(By.partialLinkText("Form")).click();
		
		
		// Scenario 2: Select the Functional Testing
		
		WebElement menuBar = driver.findElement(By.xpath("//span[@class='text-wrap'][contains(text(),'Automation Practice Menu Bar')]"));
		
		// Move/hover the move above Automation Practice Menu Bar
		actBuilder.moveToElement(menuBar).build().perform();
		
		// Click on the Functional Testing 
		//driver.findElement(By.linkText("Functional Testing")).click();
		
		// Scenario 3: Select the UFT
		
		WebElement automation = driver.findElement(By.xpath("//li[@id='menu-item-3749']//span[@class='text-wrap'][contains(text(),'Automation')]"));
		
		// Move/hover the move above Automation 
		actBuilder.moveToElement(automation).build().perform();
		
		// Click on UFT
		driver.findElement(By.linkText("UFT")).click();
		
				
	}

}
