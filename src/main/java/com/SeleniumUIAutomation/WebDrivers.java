package com.SeleniumUIAutomation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.CapabilityType;

public class WebDrivers {
	
	
	
	public WebDriver setWebDriver(Browsers browser) {
		WebDriver driver = null;
		switch (browser) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "C:\\manju\\UI Automation\\SeleniumUIAutomation\\src\\resources\\drivers\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--js-flags=--expose-gc");
			options.addArguments("--enable-precise-memory-info");
			options.addArguments("--disable-popup-blocking");
			options.addArguments("--disable-default-apps");
			options.addArguments("test-type=browser");
			options.addArguments("disable-infobars");
			options.addArguments("start-maximized"); // open Browser in maximized mode
			options.addArguments("disable-infobars"); // disabling infobars
			options.addArguments("--disable-extensions"); // disabling extensions
			options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
			options.addArguments("--no-sandbox"); // Bypass OS security model
			//options.addArguments("headless");
			options.addArguments("window-size=1366x768");
			driver = new ChromeDriver(options);
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"/../../resources/drivers/chromedriver/firefoxdriver.exe");
			FirefoxOptions firefoxOptions = new FirefoxOptions();
		    firefoxOptions.setCapability("marionette", true);
		    firefoxOptions.setCapability("acceptInsecureCerts", true);
		    firefoxOptions.setCapability("assume_untrusted_cert_issuer", true);
		    firefoxOptions.setCapability(CapabilityType.ForSeleniumServer.ENSURING_CLEAN_SESSION, true);
		    //firefoxOptions.setHeadless(true);
			driver = new FirefoxDriver(firefoxOptions);
		default:
			throw new FrameworkException("Unhandled browser!");
		}
		return driver;
	}
	
	public WebDriver getWebDriver(String browser) {
		WebDriver driver = null;
		if(browser.equalsIgnoreCase("chrome")) {
			driver = setWebDriver(Browsers.CHROME);
		}
		//driver.get(url);
		return driver;
	}
	
	public void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}
