package _01handlingBrowser;
//package _01HandlingBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowerNavigation {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
		
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		// Click on Selenium Online Training
		driver.findElement(By.partialLinkText("ONLINE")).click();
		
		Thread.sleep(3000);//Execution Purpose
		
		// Navigate using back method
		driver.navigate().back();
		
		Thread.sleep(3000);//Execution Purpose		
		
		// Navigate using forward method
		driver.navigate().forward();
		
		Thread.sleep(3000);//Execution Purpose
		
		//Navigate to video course url
		driver.navigate().to("https://aiforevery1.com/seleniumvideocourse/");
		
		Thread.sleep(3000);//Execution Purpose
		
		// Refresh the page
		driver.navigate().refresh();
		
		Thread.sleep(3000);//Execution Purpose
		
		//Close the application
		driver.quit();
			

	}

}
