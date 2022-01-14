package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.SeleniumUIAutomation.WebElementUtils;

public class HomePage extends WebElementUtils{

	WebDriver driver;
	By ElementsCard = By.xpath("//div/h5[text()='Elements']");
	
	
	public HomePage(WebDriver driver){
		super(driver);
		this.driver = driver;
	}
	
	
	
	public void clickElementsCard() {
		clickElement(ElementsCard);
	}
	
	
	
	
}
