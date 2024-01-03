package launching_Empty_Browsers;



import org.openqa.selenium.edge.EdgeDriver;

public class launching_Empty_Edge_Browser {
    public static void main(String[] args) {
    	
        // Set the system property for EdgeDriver

        System.setProperty("webdriver.edge.driver", "/Users/vikas.pal/Desktop/Selenium_weekend_Batch/msedgedriver");
        
        // Create an instance of EdgeDriver and launch the browser

		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.doubtnut.com/");
        

    }
}

