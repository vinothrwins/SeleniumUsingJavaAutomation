package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameName {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	    	    	    
	    String listFrame= "packageListFrame";
	    String packageFrame = "packageFrame";
	    String classFrame = "classFrame";
	    
	    // Activate the List Frame
	    driver.switchTo().frame(listFrame);
	    
	    // Click on "org.openqa.selenium.chrome" link
	    driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chrome')]")).click();
	    
        // Mandatory Step - Back to default Frame
	    driver.switchTo().defaultContent();
	    
	    // Activate the Package Frame
	    driver.switchTo().frame(packageFrame);
	    
	    Thread.sleep(3000);

	    // Click on ChromeOptions link
	    driver.findElement(By.xpath("//a[contains(text(),'ChromeOptions')] ")).click();
	    
	    // Back to default frame
	    driver.switchTo().defaultContent();
	    
	    // Activate the class Frame
	    driver.switchTo().frame(classFrame);
	    
	    Thread.sleep(3000);
	    
	    // Click on Help
	    driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Help')]")).click();
	    
	    
	}

}
