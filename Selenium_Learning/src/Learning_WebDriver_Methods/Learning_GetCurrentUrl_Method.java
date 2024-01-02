package Learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCurrentUrl_Method {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		// method to launch web  Application
		driver.get("https://doubtnut.com/");
		
		// Method to fetch URL
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
