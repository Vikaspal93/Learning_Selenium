package learning_Takes_Screenshot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakesScreenshotOfWebelement {
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://doubtnut.com/");
		
		WebElement loginButton = driver.findElement(By.xpath("//div[@class='bg-primary py-16 px-2']"));
	}

}
