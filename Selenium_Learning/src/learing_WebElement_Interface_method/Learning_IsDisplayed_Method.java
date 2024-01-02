package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_IsDisplayed_Method {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.doubtnut.com/");
		
		WebElement searchTextField = driver.findElement(By.xpath("//input[@type='text']"));
		
		System.out.println(searchTextField.isDisplayed());
		
		driver.quit();
		
	}

}