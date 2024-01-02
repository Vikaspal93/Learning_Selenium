package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Flipkart {
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		// method to launch web  Application
				driver.get("https://flipkart.com/");
				Thread.sleep(5000);
				
				
				// Method to Maximize Browser
				
				driver.manage().window().maximize();
				Thread.sleep(5000);
				
				
				// Method to fetch the Title
				
				String title = driver.getTitle();
				System.out.println(title);
				
				// Method to fetch URL
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				// method the fetch sourceCode
				
				String sourceCode = driver.getPageSource();
				//System.out.println(sourceCode);
				

				// method to fetch X_Axis
				
				int x_axis = driver.manage().window().getPosition().getX();
				System.out.println(x_axis);
				
				// method to fetch Y_Axis
				
				int y_axis = driver.manage().window().getPosition().getY();
				System.out.println(y_axis);
				
				// Method to close the browser
				
				driver.close();
				
				// Method to Quit(Close) the Browser
				
				driver.quit();
	}

}
