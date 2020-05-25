package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingMultipleSelectDropDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/automation-practice-form/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement contiDropDown = driver.findElement(By.id("continentsmultiple"));
		
		Select contiDropDownValues = new Select(contiDropDown);
		
		contiDropDownValues.selectByIndex(0); // Asia
		Thread.sleep(3000);
		
		contiDropDownValues.selectByValue("AF");
		Thread.sleep(3000);
		
		contiDropDownValues.selectByVisibleText("North America");
		Thread.sleep(3000);
		
		contiDropDownValues.deselectByVisibleText("Africa");
		Thread.sleep(3000);
		
		contiDropDownValues.deselectAll();
	}

}
