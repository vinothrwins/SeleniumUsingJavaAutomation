package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleValueSelect {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/selectable/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
        WebElement itemOne = driver.findElement(By.xpath("//li[contains(text(),'Item 1')]"));
        WebElement itemThree = driver.findElement(By.xpath("//li[contains(text(),'Item 3')]"));
        WebElement itemFour = driver.findElement(By.xpath("//li[contains(text(),'Item 4')]"));
        WebElement itemSeven = driver.findElement(By.xpath("//li[contains(text(),'Item 7')]"));
		
        Actions builder = new Actions(driver);
        builder.keyDown(Keys.CONTROL)
        	   .click(itemOne)
        	   .pause(3000) // Pause the execution for 3 seconds ( milliseconds)
        	   .click(itemThree)
        	   .click(itemFour)
        	   .click(itemSeven)
        	   .keyUp(Keys.CONTROL);
        
        builder.perform();
        
        
        
        
        
        
        
        
        
        
	}

}
