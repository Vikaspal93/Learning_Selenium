package learning_Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningImplicitilyWait {
	
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS );
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin",Keys.TAB,"admin123",Keys.ENTER);
	
	Thread.sleep(5000);
	
	
	driver.quit();
}

}
