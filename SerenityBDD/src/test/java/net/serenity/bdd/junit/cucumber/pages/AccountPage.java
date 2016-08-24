package net.serenity.bdd.junit.cucumber.pages;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends GenericPageObject {

	
	@FindBy(xpath="//.//*[@id=':yl']/div/div")
	private WebElementFacade compose_btn;
	
	public boolean iscompose_btn_present(){
		
		return compose_btn.isCurrentlyVisible();
		
	}
	
	public void composeMail(){
		compose_btn.click();
		
		
	}
	
}
