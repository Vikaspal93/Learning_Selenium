package learning_manage_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Maximize_Method {
	
	public static void main(String[] args) 
	
			throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.doubtnut.com");
		
		// Method to Maximize the Browser
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		driver.quit();
		
		
	}

}
