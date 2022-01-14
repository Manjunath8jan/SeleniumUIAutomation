package com.SeleniumUIAutomation;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.Elements;
import Pages.HomePage;
import junit.framework.Assert;

public class Test1 extends WebDrivers{
	WebDriver driver;
	HomePage hp;
	Elements ele;

	
	@BeforeTest
	public void initialize() {
		driver = getWebDriver("chrome");
		hp = new HomePage(driver);
		ele = new Elements(driver);
		driver.get("https://demoqa.com");
	}
	
	@Test
	public void testme() {
		hp.clickElementsCard();
		Assert.assertTrue(ele.VerifyElementsTitle());
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
