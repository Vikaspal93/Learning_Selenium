package learning_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learing_Attribute_ContainsXpath {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		// method to launch web  Application
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.xpath("//input[contains(@class,'search-box-text')]")).sendKeys("Mobiles");
		driver.findElement(By.xpath("(//input[contains(@class,'button-1')])[1]")).click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}
}
