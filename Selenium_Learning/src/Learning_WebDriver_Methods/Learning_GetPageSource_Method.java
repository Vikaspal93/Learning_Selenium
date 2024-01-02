package Learning_WebDriver_Methods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_GetPageSource_Method {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://doubtnut.com/");
		
		// method to fetch the PageSource (SourceCode)
		
		String sourceCode =driver.getPageSource();
		System.out.println(sourceCode);
	}

}
