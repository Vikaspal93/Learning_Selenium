package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_SendKeys_Enum_Method {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
//		driver.get("https://demowebshop.tricentis.com/login");
//		
//		driver.findElement(By.id("Email")).sendKeys("admin",Keys.TAB,"admin",Keys.TAB,Keys.SPACE,Keys.TAB,Keys.TAB);
		
	
		driver.get("https://www.doubtnut.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chemical Reactions and Equations",Keys.TAB,Keys.ENTER,Keys.TAB,Keys.ENTER);
		
		
		Thread.sleep(10000);
		driver.quit();
	}
}
