package learning_Select_Class;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Learning_MultiSelectDropDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/chromedriver-mac-arm64/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(1000);
		
		WebElement monthDD= driver.findElement(By.name("Month"));
		Select sel = new Select(monthDD);
		System.out.println(sel.isMultiple());
		
		sel.selectByIndex(8);
		sel.selectByValue("Feb");
		sel.selectByVisibleText("June");
		Thread.sleep(2000);
		
		
		List<WebElement> allSelected = sel.getAllSelectedOptions();
		for (WebElement webElement : allSelected) {
			System.out.println(webElement.getText());
		}
		
		sel.deselectByIndex(2);
		sel.deselectByValue("Aug");
		sel.deselectByVisibleText("June");
//		sel.deselectAll();
		
		
		
		
		Thread.sleep(1000);
		driver.quit();
		
	}

}
