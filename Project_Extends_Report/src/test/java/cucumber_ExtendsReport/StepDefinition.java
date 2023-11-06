package cucumber_ExtendsReport;



import org.testng.Assert;



import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class StepDefinition {
	UtilityClass data = new UtilityClass();
	LoginPageActions objLogin = new LoginPageActions();
	OrangeHRMHomePageActions objHome = new OrangeHRMHomePageActions();
	@Given("User is on HRMLogin page")
	public void user_is_on_hrm_login_page() {
		BaseClass.openPage(data.url);
	    System.out.println("login page");
	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		objLogin.setUserName(data.username );
		System.out.println("Username ");
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		objLogin.setPassword(data.password);
		System.out.println("password");
	}

	@Then("User should be able to login sucessfully and Home page opens")
	public void user_should_be_able_to_login_sucessfully_and_home_page_opens() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		System.out.println("sucessfull login");
	}

	
}
