package _02HandlingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsExample {

	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
	WebDriver driver = new ChromeDriver();
	
	String URL = "https://aiforevery1.com/demo-site/";
	String firstName = "Pranav";
	String lastName = "Vinoth";
	String addressOne = "MRA Homes";
	String addressTwo = "Gandhi Nagar";
	String city = "Chennai";
	String state = "Tamil Nadu";
	String pincode = "600100";
	String emailID = "vinothrwins@gmail.com";
	String mobileNumber = "6383544892";
	
	// Launch the Application
	driver.get(URL);
	
	driver.manage().window().maximize();
	
	// 1. name locator
	// First Name
	driver.findElement(By.name("vfb-5")).sendKeys(firstName);
	
	// Last Name
	driver.findElement(By.name("vfb-7")).sendKeys(lastName);
	
	// 2. id locator
	// Street Address 
	driver.findElement(By.id("vfb-13-address")).sendKeys(addressOne);
	
	driver.findElement(By.id("vfb-13-address-2")).sendKeys(addressTwo);
	

	// 3. Link Text
	  driver.findElement(By.linkText("HOME")).click();
	
	// 4. Partial Link Text
	  driver.findElement(By.partialLinkText("ONLINE")).click();
	
	// 5. X path
	// City
	driver.findElement(By.xpath("//input[@id='vfb-13-city']")).sendKeys(city);
	
	// State
	driver.findElement(By.xpath("//input[@id='vfb-13-state']")).sendKeys(state);
	
	// Pincode
	driver.findElement(By.xpath("//input[@id='vfb-13-zip']")).sendKeys(pincode);
	
	// 6 . CSS Locators
	// Email id
	driver.findElement(By.cssSelector("#vfb-14")).sendKeys(emailID);
	
	// Mobile Number
	driver.findElement(By.cssSelector("#vfb-19")).sendKeys(mobileNumber);
	
	
	}

}
