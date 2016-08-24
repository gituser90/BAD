package net.serenity.bdd.junit.cucumber.stepDefination;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenity.bdd.junit.cucumber.steps.ComposeSteps;
import net.serenity.bdd.junit.cucumber.steps.LoginTestSteps;
import net.thucydides.core.annotations.Steps;

public class ComposeTestStepDef {

	@Steps
	LoginTestSteps LT_steps;
	@Steps
	ComposeSteps CT_steps;
	
	@Given("^I should see my Account Mails$")
	public void i_should_see_my_Account_Mails() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions - Glue Code
	    //throw new PendingException();
		LT_steps.isComposePresent();
		
	}

	@When("^I compose an email to \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
	public void i_compose_an_email_to(String arg1, String arg2, String arg3) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions - Glue Code
	    //throw new PendingException();
		CT_steps.clickcompose();
	}

	@Then("^I should see a successful mail sent\\.$")
	public void i_should_see_a_successful_mail_sent() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions - Glue Code
	    throw new PendingException();
	}

	
}
