package launching_Empty_Browsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launching_Empty_Chrome_browser {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.doubtnut.com/");

	}
	

}
