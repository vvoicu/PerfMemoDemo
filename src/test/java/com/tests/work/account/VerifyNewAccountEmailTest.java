package com.tests.work.account;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.steps.email.EmailClientSteps;
import com.tools.Constants;

@RunWith(SerenityRunner.class)
public class VerifyNewAccountEmailTest {
	
	
	@Managed(uniqueSession = true)
	public WebDriver webdriver;
	
	@ManagedPages(defaultUrl = Constants.BASE_URL)
	public Pages pages;

	@Steps
	public EmailClientSteps emailClientSteps;

	public String accountEmail;
	public String accountEmailName;
	public String userPassword;

	@Before
	public void setUp() {
		Properties prop = new Properties();
		InputStream input = null;

		try {

			input = new FileInputStream(Constants.RESOURCES_PATH + "CreateUser.properties");
			prop.load(input);

			accountEmail = prop.getProperty("userEmail");
			userPassword = prop.getProperty("userPassword");

		} catch (IOException ex) {
			ex.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		accountEmailName = accountEmail.replace(Constants.EMAIL_SUFFIX, "");
	}

	@Test
	public void verifyNewAccountEmailTest() {
		emailClientSteps.openMailinator();
		String email = emailClientSteps.grabEmail(accountEmailName, "Welcome,");

//		System.out.println("Email Content: " + email);
		emailClientSteps.verifyEmail(email, accountEmail);
		emailClientSteps.verifyEmail(email, userPassword);
		
		//to make it fail
//		emailClientSteps.verifyEmail(email, userPassword+userPassword);
	}

}
