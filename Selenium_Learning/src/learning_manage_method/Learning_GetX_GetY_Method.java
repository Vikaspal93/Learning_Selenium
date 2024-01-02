package learning_manage_method;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetX_GetY_Method {
	
	public static void main(String[] args) 
	
		throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.doubtnut.com");
		
		
		// method to fetch X_Axis
		
		int x_axis = driver.manage().window().getPosition().getX();
		System.out.println(x_axis);
		
		// method to fetch Y_Axis
		
		int y_axis = driver.manage().window().getPosition().getY();
		System.out.println(y_axis);
		
		Thread.sleep(5000);
		driver.quit();
	}

}
