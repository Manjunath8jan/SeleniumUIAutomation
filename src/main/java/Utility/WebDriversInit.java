package Utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import Utility.Browser;

public class WebDriversInit {
	
	String browserName;
	WebDriver driver;
	Properties properties = new Properties();
	
	public void propertiesInitialisation() throws IOException {
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\resources\\frameworkProperties.properties");

		properties.load(fis);
		
	}

	public WebDriver getWebDriver(Browser browser) throws IOException {
		// properties = Settings.getInstance();
		propertiesInitialisation();
		switch (browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\main\\resources\\drivers\\chromedriver95.exe");
			driver = new ChromeDriver();
			invokeUrl();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", properties.getProperty("C:\\Program Files\\Mozilla Firefox\\firefox.exe"));
			driver = new FirefoxDriver();
			invokeUrl();
			break;

		/*
		 * case INTERNET_EXPLORER: System.setProperty("webdriver.ie.driver",
		 * properties.getProperty("InternetExplorerDriverPath")); driver= new
		 * InternetExplorerDriver(); break;
		 */

		default:
			// throw new FrameworkException("Unhandled browser!");
			System.out.println("Unhandled browser");
		}
		return driver;
	}
	
	public void invokeUrl() throws IOException {
//		FileInputStream fis = new FileInputStream(
//				System.getProperty("user.dir")+"\\src\\main\\resources\\frameworkProperties.properties");
//
//		properties.load(fis);
		String url = properties.getProperty("url");
		driver.get(url);
	}

}
