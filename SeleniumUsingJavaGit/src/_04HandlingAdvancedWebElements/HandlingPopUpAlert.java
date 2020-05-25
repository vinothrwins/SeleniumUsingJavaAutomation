package _04HandlingAdvancedWebElements;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPopUpAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/alertandpopup/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		// 1. Handing Alert Box
		//click on Alert Button
		driver.findElement(By.name("alertbox")).click();
		
		Thread.sleep(3000);
		
		// To capture the alert message
		String alertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(alertBoxMsg);
		
				
		//Click on Ok button 
		driver.switchTo().alert().accept();		
		
		Thread.sleep(3000);
		
		// 2. Handling the Confirm Alert Box
		//Click on Confirm Alert Button
		driver.findElement(By.name("confirmalertbox")).click();
		
		// To capture the alert message
		String confirmAlertBoxMsg = driver.switchTo().alert().getText();
		System.out.println(confirmAlertBoxMsg);
		
		Thread.sleep(3000);
		
		//Click on Ok button
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		
		//Click on Confirm Alert Button
		driver.findElement(By.name("confirmalertbox")).click();
		
		Thread.sleep(3000);
		
	    // click on cancel button
		driver.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		// 3. Handling the  Prompt Alert Box
		//click on Prompt Alert Box
		driver.findElement(By.name("promptalertbox")).click();
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		// Enter Yes
		alert.sendKeys("Yes");
		
		// Click on Ok
		alert.accept();
		
		Thread.sleep(3000);
		
		//click on Prompt Alert Box
		driver.findElement(By.name("promptalertbox")).click();
				
		Thread.sleep(3000);
		
		// Enter Yes
		alert.sendKeys("No");
		
		// Click on Ok
		alert.accept();
		
		Thread.sleep(3000);
		
		//click on Prompt Alert Box
		driver.findElement(By.name("promptalertbox")).click();
		
		Thread.sleep(3000);
		
		// To capture the alert message
		String promptAlertBoxMsg = alert.getText();
		System.out.println(promptAlertBoxMsg);
		
		// Click on Cancel
		alert.dismiss();
		
	}

}
