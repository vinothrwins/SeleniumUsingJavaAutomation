package _05HandlingMouseKeyBoardEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrameIndex {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    
	    driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
	
	    // Activate the list frame
	    driver.switchTo().frame(0);
	    
	    // Click on "org.openqa.selenium.chrome" link
	    driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.chrome')]")).click();	

	    Thread.sleep(3000);
	    
	    // Mandatory step - back to default frame
	    driver.switchTo().defaultContent();
	    
	    // Activate the package frame
	    driver.switchTo().frame(1);
	    
        // Click on ChromeOptions link
	    driver.findElement(By.xpath("//a[contains(text(),'ChromeOptions')] ")).click();
	    
	    Thread.sleep(3000);
	    
	    // Back to default frame
	    driver.switchTo().defaultContent();
	    
	    // Activate the class frame
	    driver.switchTo().frame(2);
	    
	    // Click on Help
	    driver.findElement(By.xpath("//div[@class='topNav']//a[contains(text(),'Help')]")).click();
	    

	}

}
