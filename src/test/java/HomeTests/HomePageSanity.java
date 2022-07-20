package HomeTests;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BaseClass;
import pages.HomePage;
import utility.DemoUtils;

public class HomePageSanity extends BaseClass{
	HomePage page_home;
	
	@BeforeMethod(dependsOnMethods = {"appSetup"})
	private void pageLoad() {
		page_home = PageFactory.initElements(driver, HomePage.class);
		page_home.assertAtHome();
	}
	
	@Test
	private void test1() {
		DemoUtils util = new DemoUtils(driver);
		try {
			System.out.println(util.captureScreenShot());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Test
	private void test2() {
		
	}
}
