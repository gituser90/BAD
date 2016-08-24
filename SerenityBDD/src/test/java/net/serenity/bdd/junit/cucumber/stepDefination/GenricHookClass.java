package net.serenity.bdd.junit.cucumber.stepDefination;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import net.serenitybdd.core.Serenity;

public class GenricHookClass extends GenericDeclarationClass {
	
	@Before
	public void beforeTest(Scenario scenario) throws FileNotFoundException, IOException{
		
		for(String s:scenario.getSourceTagNames()){
			System.out.println("Tag:"+s);
		}
		
		prop = new Properties();
		prop.load(new FileInputStream(Configpath));
		
		FirefoxProfile myProfile = new ProfilesIni().getProfile("SerenityBDD");
		Serenity.useFirefoxProfile(myProfile);
	}

}
