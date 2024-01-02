package learing_WebElement_Interface_method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetCssValue_Method {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		
		/*
		driver.get("https://demowebshop.tricentis.com/");
		
		WebElement cssValues = driver.findElement(By.linkText("Register"));
		
		System.out.println(cssValues.getCssValue("font"));
		System.out.println(cssValues.getCssValue("color"));
		System.out.println(cssValues.getCssValue("size"));
		System.out.println(cssValues.getCssValue("text"));
		System.out.println(cssValues.getCssValue("border"));
		System.out.println(cssValues.getCssValue("positioning"));
		*/
		
		driver.get("https://www.doubtnut.com/");
		
		WebElement cssValues = driver.findElement(By.xpath("//input[@type='text']"));
		System.out.println(cssValues.getCssValue("font"));
		System.out.println(cssValues.getCssValue("color"));
		System.out.println(cssValues.getCssValue("border"));
		System.out.println(cssValues.getCssValue("pixel"));

		
		
		Thread.sleep(200);
		
		driver.quit();
		
		
		
		
	}

}
