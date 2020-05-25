package _06HandlingMultipleBrowsers;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingMultipleMsgWindow {

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
		driver.findElement(By.name("newmessagewindow")).click();
		
		System.out.println("******* New Message Window is Opened********");
		
		// To find the window id's
		Set<String> windowID = driver.getWindowHandles();
		
		// It will iterate the window
		Iterator<String> iterator = windowID.iterator();
		
		String homePage = iterator.next(); // Main Window
		String newWindow = iterator.next(); // New Tab
		
		System.out.println(homePage);
		System.out.println(newWindow);
		
		// Switching the control to new window
		driver.switchTo().window(newWindow);
		
		Thread.sleep(3000);
		
		// Close the new message window
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
