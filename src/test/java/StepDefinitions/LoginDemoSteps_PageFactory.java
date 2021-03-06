
package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.HomePage_PageFactory;
import pagefactory.Login_PageFactory;

public class LoginDemoSteps_PageFactory{
	
	WebDriver driver=null;
	Login_PageFactory login; 
	HomePage_PageFactory homepage;
	@Given("browser is open")
	public void browser_is_open() {
 System.out.println("Inside steps-browser is open");
		 
		 String projectPath=System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver",projectPath+"/src/test/resources/drivers/chromedriver.exe");
		 //System.getProperty("webdriver.chrome.driver",System.getProperty("user.dir")+".drivers/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() {
	    driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) throws InterruptedException {
	   login=new Login_PageFactory(driver);
		login.enterPassword(username);
	   login.enterPassword(password);
	    Thread.sleep(2000);
	    
	}

	@And("user click on login")
	public void user_click_on_login() {
	    login.clickLogin();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
	    //driver.getPageSource().contains("logout");
		//driver.findElement(By.id("logout")).isDisplayed();
		homepage.checkLogoutIsDisplayed();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
