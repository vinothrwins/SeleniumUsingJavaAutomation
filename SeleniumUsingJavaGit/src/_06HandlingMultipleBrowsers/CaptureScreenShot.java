package _06HandlingMultipleBrowsers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CaptureScreenShot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",".\\Drivers\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		
		String URL = "https://aiforevery1.com/demo-site/";
		
		// Launch the Application
		driver.get(URL);
		
		driver.manage().window().maximize();
		
		// Taking Screenshot 
		File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\ScreenShot\\HomePage.jpg"));		
		
		// Screenshot for failure
		try {
			driver.findElement(By.name("vfb-submittt")).click();
		}
		catch(Throwable e)
		{
			FileUtils.copyFile(file, new File(".\\ScreenShot\\ErrorPage.jpg"));
		}
				
	}

}
