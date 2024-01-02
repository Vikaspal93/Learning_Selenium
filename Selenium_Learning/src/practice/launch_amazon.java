package practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		
		// method to launch web  Application
				driver.get("https://amazon.com/");
				
				
				Thread.sleep(5000);
				
				// Method to fetch the Title
				
				String title = driver.getTitle();
				System.out.println(title);
				
				// Method to fetch url
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				// Method to Fetch SourceCode
				String sourceCode = driver.getPageSource();
				//System.out.println(sourceCode);
				
				// Method to Full Screen Browser
				
				driver.manage().window().fullscreen();
				

				// method to fetch X_Axis
				
				int x_axis = driver.manage().window().getPosition().getX();
				System.out.println(x_axis);
				
				// method to fetch Y_Axis
				
				int y_axis = driver.manage().window().getPosition().getY();
				System.out.println(y_axis);
				
				// method to maximize Browser
				
				//driver.manage().window().maximize();
				//Thread.sleep(5000);
				
				// Method to close the browser
				
				driver.close();
				
				// Method to Quit(Close) the Browser
				
				driver.quit();
	}
	

}
