package _03HandlingBasicWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingTextMessage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
				
		// Launch the Application
		driver.get(URL);		
		driver.manage().window().maximize();
		
		// Positive Scenario
		WebElement regTitleText = driver.findElement(By.xpath("//h3[contains(text(),'Register For Demo')]"));
	
		//Verify the Registration Title is displayed
		
		if(regTitleText.isDisplayed()) {
			System.out.println("Registration Title is displayed");
		}
		else
		{
			System.out.println("Registration Title is not displayed");
		}
		
		// Validating the text
		String actRegTitle = regTitleText.getText();
		String expRegTitle = "Register For Demo";
		
		if(actRegTitle.equals(expRegTitle)) {
			System.out.println("The Registration Title of the page is "+ actRegTitle);
		}
		else
		{
			System.out.println("Actual and Expected Registration title are not same");
			System.out.println("The Actual Registration Title is "+ actRegTitle);
			System.out.println("The Expected Registration Title is "+ expRegTitle);
		}

		//Click on Submit Button
		driver.findElement(By.name("vfb-submit")).click();
		
		// Negative Scenario
		WebElement firstNameErrMsg = driver.findElement(By.xpath("//li[@id='item-vfb-5']//label[@class='vfb-error'][contains(text(),'This field is required.')]"));
		
		// Validating the First Name Error Message
		String actfirstNameErrMsg = firstNameErrMsg.getText();
		String expfirstNameErrMsg = "This field is required.";
		
		if(actfirstNameErrMsg.equals(expfirstNameErrMsg)) {
			System.out.println("The First Name Error Message is "+ actfirstNameErrMsg);
		}
		else
		{
			System.out.println("Actual and Expected First Name Error Message are not same");
			System.out.println("The Actual First Name Error Message is "+ actfirstNameErrMsg);
			System.out.println("The Expected First Name Error Message is "+ expfirstNameErrMsg);
		}
		
	}

}
