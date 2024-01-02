package learning_manage_method;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetHeigtht_GetWidth_Method {
	
	public static void main(String[] args)
	
			throws InterruptedException
	{
		

		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		// method to launch web  Application
				driver.get("https://doubtnut.com/");
				Thread.sleep(5000);
				
				// Method to fetch the Height
				Options option = driver.manage();
				Window window = option.window();
				Dimension size = window.getSize();
				int height = size.getHeight();
				System.out.println(height);
				
				// Method to fetch the Width
				int width = size.getWidth();
				System.out.println(width);
				
				// Method Chaining
				int height2 = driver.manage().window().getSize().getHeight();
				System.out.println(height2);
				
				int width2 = driver.manage().window().getSize().getWidth();
				System.out.println(width2);
				
				Thread.sleep(2000);
				driver.quit();
				
				
				
				
	}

}
