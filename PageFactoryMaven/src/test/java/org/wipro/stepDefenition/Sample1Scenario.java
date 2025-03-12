package org.wipro.stepDefenition;

import org.testng.Assert;
import org.wipro.Browser.Browser;
import org.wipro.Pages.Page1;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Sample1Scenario {
	
	@Given("User opens the Browser")
	public void user_opens_the_browser() {
	    Browser.openBrowser();
	}

	@And("User navigate to the {string} web page")
	public void user_navigate_to_the_web_page(String string) {
	  Browser.navigateToUrl("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@Then("User verifies the title of web page")
	public void user_verifies_the_title_of_web_page() {
	    Assert.assertEquals(Browser.driver.getTitle(), "OrangeHRM");
	}

	@Then("User closes the Browser")
	public void user_closes_the_browser() {
	    Browser.closeBrowser();
	}


}
