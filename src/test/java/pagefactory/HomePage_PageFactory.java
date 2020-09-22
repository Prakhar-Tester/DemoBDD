package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PageFactory {

	WebDriver driver;
	public HomePage_PageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, HomePage_PageFactory.class);
		//PageFactory.initElements(driver, this);
	}
	@FindBy(id="logout")
	WebElement btn_logout;
	
	public void checkLogoutIsDisplayed() {
		btn_logout.isDisplayed();
	}
}
