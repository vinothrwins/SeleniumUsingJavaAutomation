package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/tooltip-and-double-click/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement dblButton = driver.findElement(By.id("doubleClickBtn"));
		
		Actions builder = new Actions(driver);
		builder.doubleClick(dblButton).perform();
		//builder.moveToElement(dblButton).doubleClick().perform(); // Alternative way
		
	}

}
