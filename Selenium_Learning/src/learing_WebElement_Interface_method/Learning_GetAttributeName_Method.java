package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetAttributeName_Method {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.doubtnut.com/");
		
		WebElement attributeName = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(attributeName.getAttribute("type"));
		System.out.println(attributeName.getAttribute("placeholder")); // not getting full placeholder
		System.out.println(attributeName.getAttribute("class"));
//		System.out.println(attributeName.getAttribute("text"));
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
	}

}
