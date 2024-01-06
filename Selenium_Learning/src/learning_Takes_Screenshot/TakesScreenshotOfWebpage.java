package learning_Takes_Screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class TakesScreenshotOfWebpage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://doubtnut.com/");
		
		 ts = driver
		
		
	}

}
