package _02HandlingLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorTagName {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
	    //Launch URL
	    driver.get("https://wordpress.com/log-in?redirect_to=https%3A%2F%2Fwordpress.com%2F");
	        
	    driver.manage().window().maximize();
	    
	    //Tagname
	    driver.findElement(By.tagName("INPUT")).sendKeys("sample@gmail.com");
	    
	    //ClassName
	    driver.findElement(By.className("form-text-input")).sendKeys("vinoth@gmail.com");

	}

}
