package learning_locatores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_LinkText_Locatores {
	
	public static void main(String[] args)
	throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		// Method to Maximize the Browser
		
		driver.manage().window().maximize();
		driver.get("https://doubtnut.com/");
		
		driver.findElement(By.linkText("Install Now")).click();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
