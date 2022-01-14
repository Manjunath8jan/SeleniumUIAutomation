package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SeleniumUIAutomation.WebElementUtils;

public class Elements extends WebElementUtils {
	
	WebDriver driver;
	By ElementsCard = By.xpath("//div[@class='main-header' and text()='Elements']");
	
	
	public Elements(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	public boolean VerifyElementsTitle() {
		 return verifyText(ElementsCard, "Elements");
	}
	
	
}
