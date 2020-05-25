package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// Right click is also called as contextClick

public class RightClick {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://demoqa.com/tooltip-and-double-click/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		WebElement contextClick = driver.findElement(By.id("rightClickBtn"));
		WebElement favOption = driver.findElement(By.xpath("//*[@id=\"rightclickItem\"]/div[4]"));
		
				
		Actions builder = new Actions(driver);
		//builder.contextClick(contextClick).click(favOption).perform(); // Alternative way
		builder.moveToElement(contextClick)
		       .contextClick() // Right Click
		       .click(favOption)
		       .perform();		
		
	}

}
