package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_IsSelected_Method {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
		System.out.println(radioButton.isSelected());
		Thread.sleep(2000);
		radioButton.click();
		System.out.println(radioButton.isSelected());
		Thread.sleep(2000);
		
		
		driver.quit();
		
	}

}
