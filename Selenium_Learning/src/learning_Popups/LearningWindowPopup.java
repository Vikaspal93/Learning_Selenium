package learning_Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowPopup {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		
		System.out.println(parentWindowID);
		System.out.println(allWindowID);
		
		System.out.println(driver.getCurrentUrl());
		
		allWindowID.remove(parentWindowID);
		
		for(String windowID : allWindowID)
		{
			
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			Thread.sleep(2000);
			driver.close();
		}
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		
		driver.quit();
		
		
	}

}
