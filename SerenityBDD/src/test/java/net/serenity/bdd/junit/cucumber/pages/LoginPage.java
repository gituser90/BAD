package net.serenity.bdd.junit.cucumber.pages;

import net.serenity.bdd.junit.cucumber.model.LoginData;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends GenericPageObject {
	
	
	@FindBy(xpath=".//*[@id='Email']" )
	private WebElementFacade userName_txtbox;
	
	@FindBy(xpath =".//*[@id='next']")
	private WebElementFacade NextButton;
	
	@FindBy(xpath=".//*[@id='Passwd']")
	private WebElementFacade password_txtbox;
	
	@FindBy(xpath=".//*[@id='signIn']")
	private WebElementFacade SignInButton;
	
	public void openHomePage_PO(){
		open(); //Sernity will take care of it to open the url from serenity.properties.
	}
	
	public void performLogin(LoginData dp){
		
		userName_txtbox.sendKeys(dp.getUserName());
		NextButton.click();
		password_txtbox.sendKeys(dp.getPassword());
		SignInButton.click();
	}
}
