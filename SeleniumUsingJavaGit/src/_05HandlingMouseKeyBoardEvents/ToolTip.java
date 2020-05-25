package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/tooltip/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement age = driver.findElement(By.id("age"));
		
		// Adding '1' to move the cursor inside the editbox 
		int xCoordinate = age.getLocation().getX() + 1;
		int yCoordinate = age.getLocation().getY() + 1;
		
		
		System.out.println("X Coordinate "+ xCoordinate);
		System.out.println("Y Coordinate "+ yCoordinate);
		
		Actions builder = new Actions(driver);
		builder.moveByOffset(xCoordinate, yCoordinate).perform();
			
	}

}
