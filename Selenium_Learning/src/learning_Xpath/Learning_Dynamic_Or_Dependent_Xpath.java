package learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Dynamic_Or_Dependent_Xpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='✕']")).click();
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Iphone 14");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		String mobileName= driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).getText();
		System.out.println(mobileName);
		String mobilePrice= driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../../..//div[text()='₹58,999']")).getText();
		System.out.println(mobilePrice);
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
