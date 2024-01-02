package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_IsEnabled_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://printila-vendor-blush.vercel.app/");
		
		WebElement sellingButton = driver.findElement(By.xpath("//button[@type='button']"));
		Thread.sleep(2000);
		System.out.println(sellingButton.isEnabled());
		driver.findElement(By.xpath("//input[@type='number']")).sendKeys("8594454760");
		System.out.println(sellingButton.isEnabled());
		
		Thread.sleep(2000);
		driver.quit();
	}

}
