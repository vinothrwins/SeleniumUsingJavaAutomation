package _04HandlingAdvancedWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFirefoxBrowser {

	public static void main(String[] args) {
		
	String firstName = "Vinoth";
	// Set the system property for browser
	System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");	

	// Creating the driver object for the Chrome Browser in the WebDriver Interface
	WebDriver driver = new FirefoxDriver();
	
	// Launch the URL
	driver.get("https://aiforevery1.com/demo-site/");
	
	// Maximze
	driver.manage().window().maximize();
	
	//Enter the value
	driver.findElement(By.name("vfb-5")).sendKeys(firstName);
	
	}

}
