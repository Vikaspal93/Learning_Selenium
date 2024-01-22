package learning_javaScriptExecutor_interface;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PerformingActionOnDisbaledWebelement {

	
		public static void main(String[] args) {
			
			System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
			WebDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://demoapp.skillrary.com/");
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
//			driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("Vikas");
			
			js.executeScript("arguments[0].value='Vikas'", driver.findElement(By.xpath("//input[@class='form-control']")));
			
			
		}
}
