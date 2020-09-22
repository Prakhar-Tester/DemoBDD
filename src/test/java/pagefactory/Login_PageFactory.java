package pagefactory;

import java.awt.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class Login_PageFactory {

	@FindBy(id="name")
	@CacheLookup
	WebElement txt_username;
	@FindBy(id="password")
	WebElement txt_password;
	@FindBy(id="login")
	WebElement btn_login;
	
	@FindBy(how=How.ID,using="name")
	WebElement abc;
	
	WebDriver driver;
	public Login_PageFactory(WebDriver driver) {
		this.driver=driver;
		//PageFactory.initElements(driver, Login_PageFactory.class);
		PageFactory.initElements(driver, this);
		/*In case of ajax application where element need diff load time
		 * AjaxElementLocatorFactory factory=new AjaxElementLocatorFactory(driver, 30);
		PageFactory.initElements(factory, this);
		or
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 30), this);
	
		*/
		}
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	public void enterPassword(String password) {
		txt_username.sendKeys(password);
	}
	public void clickLogin() {
		btn_login.click();
	}
	
}
