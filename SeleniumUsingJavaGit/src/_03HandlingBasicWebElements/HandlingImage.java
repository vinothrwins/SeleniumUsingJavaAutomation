package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingImage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
				
		// Launch the Application
		driver.get("http://newtours.demoaut.com/");		
		driver.manage().window().maximize();
		
		WebElement mercuryImage = driver.findElement(By.xpath("//body/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/p[1]/img[1]"));
		
		// Verify the Mercury Image is displayed
		if(mercuryImage.isDisplayed()) {
			System.out.println("Mercury Image is displayed");
			// Get the Image Text
			System.out.println(mercuryImage.getAttribute("alt"));
		}
		else
		{
			System.out.println("Mercury Image is displayed");
		}

		WebElement signIn = driver.findElement(By.name("login"));
		
		// Verify the Sign In Image is enabled
		if(signIn.isEnabled()) {
			System.out.println("Sign In Image is enabled");
			signIn.click();
			System.out.println("Sign In Image is clicked");
		}
		else
		{
			System.out.println("Sign In Image is not enabled");
		}
		
		// Navigate to the demo page 
		driver.get("https://aiforevery1.com/demo-site/");
		
		WebElement logoImage = driver.findElement(By.xpath("//img[@class='custom-logo']"));
	
		// Click on the Image Link		
		if(logoImage.isDisplayed()) {
			logoImage.click();
			System.out.println("Logo Image is clicked");
		}
		else
		{
			System.out.println("Logo Image is clicked");
		}
		
		
	}

}
