package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginInOrange {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='username']"));
		userName.click();
		userName.sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
		

		
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
