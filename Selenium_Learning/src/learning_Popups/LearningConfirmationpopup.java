package learning_Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LearningConfirmationpopup {

	
	public static void main(String[] args) throws InterruptedException {
		
	
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
//System.setProperty("webdriver.edge.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/msedgedriver");
//        
//        // Create an instance of EdgeDriver and launch the browser
//
//		EdgeDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(200);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText()); 
		
		alert.accept();
//		alert.dismiss();
		
		Thread.sleep(2000);
		driver.quit();
		
	}
}
