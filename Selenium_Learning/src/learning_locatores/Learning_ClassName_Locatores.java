package learning_locatores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_ClassName_Locatores {
	public static void main(String[] args) throws InterruptedException{
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		// Method to Maximize the Browser
		
		driver.manage().window().maximize();
		driver.get("https://doubtnut.com/");
	// 	driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.className("h-16")).sendKeys("Class 6 Science");
		Thread.sleep(5000);
		// driver.findElement(By.className("search-box-text")).sendKeys("shoes");
		driver.findElement(By.className("button-1")).click();
		
		
		Thread.sleep(5000);
		
		// driver.quit();
		
	}

}
