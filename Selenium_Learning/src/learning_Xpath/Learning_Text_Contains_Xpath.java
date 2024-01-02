package learning_Xpath;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Text_Contains_Xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
