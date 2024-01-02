package learning_Select_Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_SingleSelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(10000);
		
		WebElement countryDD = driver.findElement(By.name("country"));
		
		Select sel = new Select(countryDD);
		
		sel.selectByIndex(50);
		Thread.sleep(1000);
		sel.selectByValue("IN");
		Thread.sleep(1000);
		sel.selectByVisibleText("Indonesia");
		Thread.sleep(1000);
		driver.quit();
		
		
	}

}
