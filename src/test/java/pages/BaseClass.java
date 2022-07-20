package pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utility.BrowserFactory;

public class BaseClass {
	protected WebDriver driver;
	HomePage page_home;

	@BeforeMethod
	protected void appSetup() {
		driver = BrowserFactory.launchApp(driver,"chrome","https://demoqa.com");
		System.out.println("Log: app launched successfully");
	}
	
	@AfterMethod
	protected void appTearDown() {
		driver.quit();
		System.out.println("Log: driver closed successfully");
	}
		
}
