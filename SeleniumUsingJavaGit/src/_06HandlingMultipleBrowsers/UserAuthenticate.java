package _06HandlingMultipleBrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAuthenticate {

	public static void main(String[] args) {
		// 
		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String url = "http://admin:admin@the-internet.herokuapp.com/digest_auth";
		
		driver.get(url);		
		
	}

}
