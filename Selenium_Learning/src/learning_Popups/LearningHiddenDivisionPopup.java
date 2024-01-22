package learning_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningHiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://jqueryui.com/datepicker/");
		
		driver.switchTo().frame(0);
		
		WebElement dateBox = driver.findElement(By.xpath("//input[@id='datepicker']"));
		dateBox.click();
		
		
		driver.findElement(By.xpath("//a[@data-date='14']")).click();
		
		Thread.sleep(2000);
		
		dateBox.clear();
		
		dateBox.click();
		
		
//		dateBox.sendKeys("15/08/1947");
	
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
	
	
}
