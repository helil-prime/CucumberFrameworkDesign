package step_definitions;

import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CraterDashboardPage;
import pages.CraterLoginPage;
import utils.BrowserUtils;
import utils.Driver;
import utils.TestDataReader;

public class UserManagementSteps {
	
	CraterLoginPage craterLogin = new CraterLoginPage();
	CraterDashboardPage dashboard = new CraterDashboardPage();
	BrowserUtils utils = new BrowserUtils();
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	    Driver.getDriver().get(TestDataReader.getProperty("craterUrl"));
	    Driver.getDriver().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	@When("user enters valid {string} and {string}")
	public void user_enters_valid_and(String useremail, String password) {
	   utils.sendKeysWithActionsClass(craterLogin.useremail, useremail);
	   utils.sendKeysWithActionsClass(craterLogin.password, password);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	   craterLogin.loginButton.click();
	}

	@Then("user should be on the dashboard page")
	public void user_should_be_on_the_dashboard_page() {
		utils.waitUntilElementVisible(dashboard.amountDueText);
		Assert.assertTrue(dashboard.amountDueText.isDisplayed());
	}
	
	
	// invalid login steps
	
	@When("user enters invalid {string} and {string}")
	public void user_enters_invalid_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("an error message appears")
	public void an_error_message_appears() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user is not logged in")
	public void user_is_not_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}
	

}
