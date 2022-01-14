package com.SeleniumUIAutomation;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebElementUtils{
	
	
	private WebDriver driver;
	
	
	public WebElementUtils(WebDriver driver) {
		this.driver = driver;
	}
	public WebElement findElement(By arg0) {
		return driver.findElement(arg0);
	}
	
	public List<WebElement> findElements(By arg0) {
		return driver.findElements(arg0);
	}
	
	public void clickElement(By arg0) {
		driver.findElement(arg0).click();
	}
	
	public boolean verifyText(By arg0, String text) {
		String text1 = this.findElement(arg0).getText();
		if(text1.equals(text)) {
			return true;
		}
		return false;
	}
}
