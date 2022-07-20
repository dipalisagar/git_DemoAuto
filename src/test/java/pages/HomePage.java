package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HomePage {
	WebDriver driver;
	Logger log = LoggerFactory.getLogger(HomePage.class);
	
	public HomePage(WebDriver driver){
		this.driver = driver;
	}
	
	//** Locators **//
	@FindBy(xpath="//img[contains(@src,'Toolsqa.jpg')]")
	WebElement img_brand_logo;
	
	@FindBy(xpath="//img[@class='banner-image']")
	WebElement img_banner;
	
	//** Core Methods **//
	
	
	//** Derived Methods**//
	public boolean assertAtHome() {
		if(img_brand_logo.isDisplayed()) {
			log.info("At home with title : ");
		}
		else {
			log.info("Not at Home");
		}
		return img_brand_logo.isDisplayed();
	}
}
