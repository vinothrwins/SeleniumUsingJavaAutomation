package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardInteractions {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "http://google.com/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement searchBox = driver.findElement(By.name("q"));
		
		Actions builder = new Actions(driver);
		
		Action seriesOfActions = builder
				.moveToElement(searchBox)
				.click()
				.keyDown(searchBox, Keys.SHIFT)
				.sendKeys(searchBox, "selenium")
				.keyUp(searchBox, Keys.SHIFT)
				.pause(3000)
				.sendKeys(Keys.ENTER)
				.build();
		
		seriesOfActions.perform();
				
			}

}
