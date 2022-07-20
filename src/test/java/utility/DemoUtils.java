package utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoUtils{
	WebDriver driver;
	
	public DemoUtils(WebDriver driver){
		this.driver = driver;
	}
	
	public void waitToLoad(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,15);
		element = wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String captureScreenShot() throws IOException {
		File src_file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String file_path = System.getProperty("user.dir")+"\\Reports\\"+System.currentTimeMillis()+".png";
		File destination_file = new File(file_path);
		FileUtils.copyFile(src_file, destination_file);
		return file_path;
	}
}
