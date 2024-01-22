package practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchDetailsFromNewWin {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Nothing Phone",Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Nothing Phone (2) (Dark Grey, 512 GB)']")).click();
		
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		
		System.out.println(parentWindowID);
		System.out.println(allWindowID);
		
		System.out.println(driver.getCurrentUrl());
		
		allWindowID.remove(parentWindowID);
		
		for(String windowID : allWindowID) {
			
			driver.switchTo().window(windowID);
			System.out.println(driver.getTitle());
			
			WebElement mobilePrice = driver.findElement(By.xpath("//div[@class='_3I9_wc _2p6lqe']"));
			System.out.println("Mobile price : "+mobilePrice.getText());
			
			WebElement mobileDiscPrice = driver.findElement(By.xpath("//div[@class='_3I9_wc _2p6lqe']/..//div[@class='_30jeq3 _16Jk6d']"));
			System.out.println("Mobile Price After Discount : "+mobileDiscPrice.getText());
			
			WebElement mobileName = driver.findElement(By.xpath("//div[@class='_3I9_wc _2p6lqe']/..//div[@class='_30jeq3 _16Jk6d']/../../../..//span[@class='B_NuCI']"));
			System.out.println("Mobile Name : "+mobileName.getText());
			
			Thread.sleep(2000);
			driver.close();
			
			
		}
		
		driver.switchTo().window(parentWindowID);
		Thread.sleep(2000);
		
		driver.quit();
	}

}
