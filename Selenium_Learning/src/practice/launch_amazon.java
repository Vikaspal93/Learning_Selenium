package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class launch_amazon {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		
		// Method to Maximize
		
		driver.manage().window().maximize();
		
		// method to launch web  Application
				driver.get("https://doubtnut.com/");
				
				
				Thread.sleep(1000);
				
				// Method to fetch the Title
				
				String title = driver.getTitle();
				System.out.println(title);
				
				// Method to fetch url
				
				String url = driver.getCurrentUrl();
				System.out.println(url);
				
				// Method to Fetch SourceCode
				String sourceCode = driver.getPageSource();
				//System.out.println(sourceCode);
				
				// click on login
				driver.findElement(By.xpath("//span[@class='text-primary']")).click();
				Thread.sleep(1000);
//				Enter mobile number
				
				WebElement rml = driver.findElement(By.xpath("//input[contains(@class,'input font')]"));
				rml.click();
				rml.sendKeys("4567887654");
				Thread.sleep(1000);
				
//				Click on Generate OTP
				
				driver.findElement(By.xpath("//button[@id='send-otp']")).click();
				Thread.sleep(2000);
				
				
//				Enter OTP
				driver.findElement(By.xpath("//input[@id='OTP-0']")).sendKeys("1");
				driver.findElement(By.xpath("//input[@id='OTP-1']")).sendKeys("2");
				driver.findElement(By.xpath("//input[@id='OTP-2']")).sendKeys("3");
				driver.findElement(By.xpath("//input[@id='OTP-3']")).sendKeys("4");
				

//				Click on verify OTP
				
				driver.findElement(By.xpath("//button[@id='verify-otp']")).click();
				

				// method to fetch X_Axis
				
				int x_axis = driver.manage().window().getPosition().getX();
				System.out.println(x_axis);
				
				// method to fetch Y_Axis
				
				int y_axis = driver.manage().window().getPosition().getY();
				System.out.println(y_axis);
				
				
				Thread.sleep(5000);
				
				// Method to close the browser
				
				driver.close();
				
				// Method to Quit(Close) the Browser
				
				driver.quit();
	}
	

}
