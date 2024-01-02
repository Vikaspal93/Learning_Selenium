package learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Attribute_Xpath {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// method to launch web  Application
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ec.vikas.pal@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rekhavikas");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
		
		
	}

}
