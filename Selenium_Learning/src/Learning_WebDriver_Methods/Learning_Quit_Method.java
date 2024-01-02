package Learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Quit_Method {

	public static void main(String[] args) 
	
	throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		// method to launch web  Application
				driver.get("https://doubtnut.com/");
				Thread.sleep(5000);
				
		// Method to Quit(Close) the Browser
				
				driver.quit();
	}
}
