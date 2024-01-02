package learning_Xpath;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Learning_Logical_Xpath {
	
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.edge.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/msedgedriver");
		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.xpath("//span[contains(@id,'nav-link') and contains(@class,'nav-line-1 nav-progressive-content')]")).click();
		driver.findElement(By.xpath("//input[@type='email' and contains(@class,'a-input-text')]")).sendKeys("9467769498");
		driver.findElement(By.xpath("//input[@class='a-button-input' and @id='continue']")).click();
		
		Thread.sleep(5000);
		driver.quit();
	}
		
		

}
