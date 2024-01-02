package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search_Product_In_FlipKart {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		// Method to Maximize the Browser
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		
		driver.findElement(By.id("q")).sendKeys("Nothing Phone");
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
