package learning_locatores;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_CSSSelector_Locator {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		// Method to Maximize the Browser
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		// driver.findElement(By.cssSelector("[type='text']")).sendKeys("ec.vikaspal@gmail.com");
		// driver.findElement(By.cssSelector("[type='password']")).sendKeys("rekhavikas");
		// driver.findElement(By.id("loginbutton")).click();
		
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[1]/input")).sendKeys("ec.vikaspal@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[1]/div[2]/div/input")).sendKeys("rekhavikas");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		
		Thread.sleep(5000);
	}

}
