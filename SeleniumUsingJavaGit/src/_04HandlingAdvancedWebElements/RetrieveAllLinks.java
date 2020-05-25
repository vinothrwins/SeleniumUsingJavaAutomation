package _04HandlingAdvancedWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RetrieveAllLinks {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/python/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();

		// Get the list of web elements with the tag name 'a'
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		// Printing all the link address
		for(WebElement link : allLinks) {
			System.out.println(link.getText() + "-" + link.getAttribute("href"));
		}		
		
	}

}
