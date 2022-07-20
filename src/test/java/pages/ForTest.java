package pages;

import java.io.IOException;

import org.testng.annotations.Test;

import utility.DemoUtils;

public class ForTest extends BaseClass {
	DemoUtils util = new DemoUtils(driver);
	@Test
	private void test1() {
		try {
			System.out.println(util.captureScreenShot());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
