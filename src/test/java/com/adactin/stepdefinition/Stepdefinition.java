package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.baseclass.BaseClass;
import com.adactin.runner.TestRunner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {

	public static WebDriver driver= TestRunner.driver;
	
	@Given("^user launch the application$")
	public void user_launch_the_application() throws Throwable {
	      
	      
	}

	@When("^user enters the valid username in the username field$")
	public void user_enters_the_valid_username_in_the_username_field() throws Throwable {
	      
	      
	}

	@When("^user enters the valid password in the password field$")
	public void user_enters_the_valid_password_in_the_password_field() throws Throwable {
	      
	      
	}

	@When("^user is able to click the login button$")
	public void user_is_able_to_click_the_login_button() throws Throwable {
	      
	      
	}

	@Then("^user verify the homepage navigates to searchhotel$")
	public void user_verify_the_homepage_navigates_to_searchhotel() throws Throwable {
	      
	      
	}


	
}
