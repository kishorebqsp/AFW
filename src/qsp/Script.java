package qsp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Script {
	static {
		System.setProperty("webdriver.gecko.driver","./driver/geckodriver.exe");
	}
	@Test
	public void testA() {
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
	}
}
