package _06HandlingMultipleBrowsers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleTabs {

	public static void main(String[] args) throws InterruptedException {

		// Set the system property for browser
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");

		// Creating the driver object for the Chrome Browser in the WebDriver Interface
		WebDriver driver = new ChromeDriver();
		
		// Launch the URL
		driver.get("https://aiforevery1.com/multiplewindows/");
		
		// Maximze
		driver.manage().window().maximize();
		
		// Click on New Browser Window Button - Multiple Browser
		driver.findElement(By.name("newbrowsertab")).click();
		
		System.out.println("******* New Browser Tab is Opened********");
		
		// To find the window id's
		Set<String> windowID = driver.getWindowHandles();
		
		// It will iterate the window
		Iterator<String> iterator = windowID.iterator();
		
		String homePage = iterator.next(); // Main Window
		String newTab = iterator.next(); // New Tab
		
		System.out.println(homePage);
		System.out.println(newTab);
		
		// Switching the control to new window
		driver.switchTo().window(newTab);
		
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		// Click on Blog Page
		driver.findElement(By.linkText("BLOG")).click();
		
		Thread.sleep(3000);
		
		// Close the new browser window
		driver.close();
		
		// Switching the control to the main window
		driver.switchTo().window(homePage);
		
		//Click on Home Link
		driver.findElement(By.linkText("HOME")).click();
		
		Thread.sleep(3000);
		
		// Close the main window
		driver.close();
		
		
	}

}
