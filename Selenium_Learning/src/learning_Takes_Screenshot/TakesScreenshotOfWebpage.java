package learning_Takes_Screenshot;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class TakesScreenshotOfWebpage {
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://doubtnut.com/");
		
		 TakesScreenshot ts = (TakesScreenshot) driver;
		 File source = ts.getScreenshotAs(OutputType.FILE);
		 File destination = new File("/Users/vikas.pal/git/Learning_Selenium/Selenium_Learning/screenshots/webpagess.png");
		 FileHandler.copy(source, destination);
		
		Thread.sleep(2000);
		
		 driver.quit();
	}

}
