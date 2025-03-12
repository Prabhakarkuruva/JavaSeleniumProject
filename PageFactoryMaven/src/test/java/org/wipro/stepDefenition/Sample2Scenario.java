package org.wipro.stepDefenition;

import org.testng.Assert;
import org.wipro.Pages.Page1;
import org.wipro.Pages.Page2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Sample2Scenario {
	@When("User enters {string} the username")
	public void user_enters_the_username(String string) {
	    Page1.enterUsername("Admin");
	}

	@And("User enters {string} the password")
	public void user_enters_the_password(String string) {
	   Page1.enterPassword("admin123");
	}

	@And("User clicks the login button")
	public void user_clicks_the_login_button() {
	   Page1.login();
	}

	@Then("User verifies the profile account")
	public void user_verifies_the_profile_account() {
		Assert.assertEquals(Page2.Username(), "manda user");

	}



}
