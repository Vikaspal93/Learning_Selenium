package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Gettext_Method {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.doubtnut.com/");
		
//		String returnText = driver.findElement(By.id("results-btn")).getText();// By Id
		String returnText = driver.findElement(By.xpath("//span[contains(@class,'block')]")).getText();// Get X-path by Class with Contains
		
		System.out.println(returnText);
		
		driver.quit();
	}

	

}
