package net.serenity.bdd.junit.cucumber.steps;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenity.bdd.junit.cucumber.pages.AccountPage;
import net.serenity.bdd.junit.cucumber.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginTestSteps extends ScenarioSteps {

	LoginPage LP;
	AccountPage AP;
	
	@Step
	public void OpenHomepage(){
		LP.openHomePage_PO();
	}

	public void performLogin(LoginData dp) {
		
		LP.performLogin(dp);
	}
	
	public void isComposePresent(){
		
		System.out.println(AP.iscompose_btn_present());
	}
}
