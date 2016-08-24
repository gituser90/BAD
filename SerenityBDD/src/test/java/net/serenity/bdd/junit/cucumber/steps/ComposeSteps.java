package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.pages.AccountPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class ComposeSteps extends ScenarioSteps {

	AccountPage AP;
	@Step
	public void clickcompose(){
		
		AP.composeMail();
	}

}
