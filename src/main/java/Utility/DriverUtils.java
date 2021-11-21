package Utility;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class DriverUtils{
	
	private WebDriver driver;
	
	public DriverUtils(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebDriver getWebDriver() {
		return driver;
	}
	
	public WebElement findElement(By arg0) {
		return driver.findElement(arg0);
	}
	
	public List<WebElement> findElements(By arg0) {
		return driver.findElements(arg0);
	}
}