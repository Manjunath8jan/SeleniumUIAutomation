package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Utility.Base;
import Utility.Browser;
import pages.DropDownPage;

public class DropDowntest extends Base {

	DropDownPage dropDownpage = new DropDownPage();
	
	WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = browserDriver(Browser.CHROME);
	}

	@Test
	public void performAction() throws IOException {
		dropDownpage.webdriver(this.driver);
		dropDownpage.openElementscard();
	}
}
