package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utility.Base;
import Utility.Browser;
import pageObjects.DropDown;

public class DropDownPage {
	
	DropDown dropDown = new DropDown();
	Base base;
	WebDriver driver;
	
	public void webdriver(WebDriver driver) {
		this.driver = driver;
	}

	public void openElementscard() {
		
		WebElement element = driver.findElement(By.xpath(dropDown.card));
		element.click();
		
	}
	
	
	
}
