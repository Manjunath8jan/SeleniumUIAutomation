package Utility;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base extends WebDriversInit {

	static WebDriver driver;

	public WebDriver browserDriver(Browser browser) throws IOException {
		return driver = getWebDriver(browser);
	}

	
}
