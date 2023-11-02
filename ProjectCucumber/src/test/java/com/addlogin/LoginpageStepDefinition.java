package com.addlogin;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginpageStepDefinition {
	
	UtilityClass data = new UtilityClass();
	LoginPageActions objLogin = new LoginPageActions();
	HomepageActions objHome = new HomepageActions();
	
	@Given("the user opens the HRM application")
	public void the_user_opens_the_hrm_application() {
		HelperClass.openPage(data.url);
	    System.out.println("login page");
	}

	@When("the user enter the username")
	public void the_user_enter_the_username() {
		objLogin.setUserName(data.username );
		System.out.println("Username ");
	}

	@When("the user enter the password")
	public void the_user_enter_the_password() {
		objLogin.setPassword(data.password);
		System.out.println("password");
	}

	@When("the user click login.")
	public void the_user_click_login() {
		objLogin.clickLogin();
		System.out.println("login button");
	}

	@Then("the user should be on the HRM login page")
	public void the_user_should_be_on_the_hrm_login_page() {
		Assert.assertTrue(objHome.getVerifyText().contains("Dashboard"));
		System.out.println("sucessfull login");
	}



}
