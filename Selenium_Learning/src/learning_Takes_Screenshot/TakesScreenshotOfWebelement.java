package learning_Takes_Screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakesScreenshotOfWebelement {
	
	public static void main(String[] args) throws IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.get("https://doubtnut.com/");
		
		WebElement header = driver.findElement(By.xpath("//div[contains(@class,'bg-primary py')]"));
		File source = header.getScreenshotAs(OutputType.FILE);
		File destination = new File("/Users/vikas.pal/git/Learning_Selenium/Selenium_Learning/screenshots/webElementSS.png");
		FileHandler.copy(source, destination);
		
		driver.quit();
	}

}
