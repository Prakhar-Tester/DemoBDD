package StepDefinitions;

import java.util.List;
//import cucumber.api.DataTable;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;

public class DealsStepDefinitions {

	@Then("^user enters username and paswword$")
	public void user_enters_username_and_password(DataTable credentials) {
		//List<List<String>> data=credentials.raw(); list from util package datatable should be from cucumber.api(cucumber.api.DataTable)
		/*driver.findElement(By.name("username")).sendKeys(data.get(0).get(0));
		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
*/	}
	
	@Then("^user enters deal details$")
	public void user_enters_deal_details(DataTable dealData) {
		//List<List<String>> dealValues=dealData.raw();
		/*driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
		driver.findElement(By.id("comission")).sendKeys(dealValues.get(0).get(3));
*/	}
}
