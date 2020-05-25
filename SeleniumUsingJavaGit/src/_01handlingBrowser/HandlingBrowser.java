package _01handlingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingBrowser {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
		
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		// Title Validation
		String actTitle = driver.getTitle();
		String expTitle = "Demo Site – A.I for Everyone"; // Positive Scenario
		//String expTitle = "Demo Site"; // Negative Scenario
		
		if(actTitle.equals(expTitle)) {
			System.out.println("The Title of the page is "+ actTitle);
		}
		else
		{
			System.out.println("Actual and Expected title are not same");
			System.out.println("The Actual Title is "+ actTitle);
			System.out.println("The Expected Title is "+ expTitle);
		}
		
		
		// Click on Selenium Online Training
		driver.findElement(By.partialLinkText("ONLINE")).click();
		
		// Validating the current url
		String actCurrentURL = driver.getCurrentUrl();
		String expCurrentURL = "https://aiforevery1.com/seleniumonlinetraining/";
		
		if(actCurrentURL.equals(expCurrentURL)) {
			System.out.println("The Current URL of the page is "+ actCurrentURL);
		}
		else
		{
			System.out.println("Actual and Expected URL are not same");
			System.out.println("The Actual Current is "+ actCurrentURL);
			System.out.println("The Expected Current URL is "+ expCurrentURL);
		}
		
		String pageSource = driver.getPageSource();
		
		// Length of the page source
		int pageSourceLength = pageSource.length();
		
		System.out.println("Total length of the page source is "+ pageSourceLength );
		
		// Navigating to Demo page
		driver.get(URL);
		
		// Click on New Tab Window Button
		driver.findElement(By.xpath("//button[contains(text(),'New Tab Window')]")).click();
		
		driver.quit(); // It will close all the active browser opened by the chrome driver
		
		Thread.sleep(5000); // Included for execution purpose
		
		//driver.close(); // It will close the current active browser only
		
	}

}
