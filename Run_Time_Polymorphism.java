package launching_Empty_Browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Run_Time_Polymorphism {
	
	public static void main(String[] args) {
		java.util.Scanner s =new java.util.Scanner(System.in);
		System.out.println("Enter the Browser Name");
		
		String Browser = s.nextLine();
		
		if (Browser.equals("Chrome"))
		
		{
			System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://google.com/");
		}
		
		else if(Browser.equals("Edge"))
		
		{
			System.setProperty("webdriver.edge.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/msedgedriver");
			EdgeDriver driver = new EdgeDriver();
			driver.get("https://facebook.com/");
		}
	}

}
