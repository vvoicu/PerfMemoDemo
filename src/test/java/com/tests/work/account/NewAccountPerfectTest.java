package com.tests.work.account;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.NewAccountPerfectSteps;
import com.tools.Constants;
import com.tools.FieldGenerators;
import com.tools.FieldGenerators.Mode;

@RunWith(SerenityRunner.class)
public class NewAccountPerfectTest {
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	public NewAccountPerfectSteps newAccountPerfectSteps;
	
	//Test Data
	public String userFirstName;
	public String userLastName;
	public String userEmail;
	public String userPassword;
	
	@Before
	public void setUp(){
		userFirstName  = FieldGenerators.generateRandomString(5, Mode.ALPHA);
		userLastName  = FieldGenerators.generateRandomString(5, Mode.ALPHA);
		userEmail  = FieldGenerators.generateRandomString(5, Mode.ALPHA) + Constants.EMAIL_SUFFIX;
		userPassword  = FieldGenerators.generateRandomString(9, Mode.ALPHA);
	}
	

	@Test
	public void newAccountTest(){
		newAccountPerfectSteps.isHomePage();
		newAccountPerfectSteps.clickTheMyAccountLink();
		newAccountPerfectSteps.clickTheNewAccountButton();
		newAccountPerfectSteps.enterYourFirstname(userFirstName);
		newAccountPerfectSteps.enterYourLastname(userLastName);
		newAccountPerfectSteps.enterYourEmail(userEmail);
		newAccountPerfectSteps.confirmYourEmail(userEmail);
		newAccountPerfectSteps.enterNewPass(userPassword);
		newAccountPerfectSteps.confirmPassword(userPassword);
		newAccountPerfectSteps.clickCreateAccountFreeButton();
		newAccountPerfectSteps.verifyContactInformation(userEmail);
	}
	
	@After
	public void saveEmailData(){
		Properties prop = new Properties();
		OutputStream output = null;
	 
		try {
			output = new FileOutputStream("CreateUser.properties");
			prop.setProperty("userEmail", userEmail);
			prop.setProperty("userPassword", userPassword);
			prop.store(output, null);
		} catch (IOException io) {
			io.printStackTrace();
		} finally {
			if (output != null) {
				try {
					output.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
