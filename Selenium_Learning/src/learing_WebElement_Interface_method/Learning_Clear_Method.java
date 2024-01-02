package learing_WebElement_Interface_method;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_Clear_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.doubtnut.com/");
		
//		driver.findElement(By.xpath("//input[@type='text']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chemical Reactions and Equations for Class 10");
//		
//		Thread.sleep(5000);
//		
//		driver.findElement(By.xpath("//input[@type='text']")).clear();
//		Thread.sleep(6000);
		
		
		WebElement searchTextField = driver.findElement(By.xpath("//input[@type='text']"));
		searchTextField.click();
		
		for(int i=0; i<5; i++)
		{
			Random num = new Random();
			int number = num.nextInt();
			searchTextField.sendKeys("Chemical Reactions and Equations for Class 10"+ number);
			
			Thread.sleep(6000);
			searchTextField.clear();
			
		}
		Thread.sleep(2000);
		
		
		
		
		
		
		
		driver.quit();
		
	}

}
