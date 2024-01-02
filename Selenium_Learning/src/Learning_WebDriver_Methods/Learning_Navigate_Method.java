package Learning_WebDriver_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Navigate_Method {
	
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		// Method to Maximize the Browser
		
		driver.manage().window().maximize();
		
		driver.get("https://www.doubtnut.com");
		
			driver.navigate().back();
			Thread.sleep(5000);
			driver.navigate().forward();
			Thread.sleep(5000);
			driver.navigate().refresh();
			Thread.sleep(5000);
			driver.navigate().to("https://www.facebook.com/");
			
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
		
	}

}
