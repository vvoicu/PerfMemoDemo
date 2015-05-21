package com.pages;

import com.tools.Constants;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL)
public class NewAccountPerfectPage extends PageObject {

	@FindBy(linkText = "My Account")
	private WebElementFacade MyAccountLink;

	@FindBy(xpath = "//div[2]/button")
	private WebElementFacade CreateNewAccountButton;

	@FindBy(id = "firstname")
	private WebElementFacade FirstNameField;

	@FindBy(id = "lastname")
	private WebElementFacade LastNameField;

	@FindBy(id = "email_address")
	private WebElementFacade EmailAdressField;

	@FindBy(id = "confirm_email")
	private WebElementFacade ConfirmEmailField;

	@FindBy(id = "password")
	private WebElementFacade PasswordField;

	@FindBy(id = "confirmation")
	private WebElementFacade ConfirmPasswordField;

	@FindBy(xpath = "//div[3]/button")
	private WebElementFacade CreateAccountButton;

	@FindBy(linkText = "Sign Out")
	private WebElementFacade SignOutLink;

	public void clickMyAccountLink() {
		element(MyAccountLink).waitUntilVisible();
		MyAccountLink.click();
	}

	public void clickNewAccountButton() {
		element(CreateNewAccountButton).waitUntilVisible();
		CreateNewAccountButton.click();
	}

	public void enterFirstname(String value) {
		element(FirstNameField).waitUntilVisible();
		FirstNameField.type(value);
	}

	public void enterLastname(String value) {
		element(LastNameField).waitUntilVisible();
		LastNameField.type(value);
	}

	public void enterEmail(String value) {
		element(EmailAdressField).waitUntilVisible();
		EmailAdressField.type(value);
	}

	public void confirmEmail(String value) {
		element(ConfirmEmailField).waitUntilVisible();
		ConfirmEmailField.type(value);
	}

	public void enterPassword(String value) {
		element(PasswordField).waitUntilVisible();
		PasswordField.type(value);
	}

	public void confirmPassword(String value) {
		element(ConfirmPasswordField).waitUntilVisible();
		ConfirmPasswordField.type(value);
	}

	public void clickCreateAccountButton() {
		element(CreateAccountButton).waitUntilVisible();
		CreateAccountButton.click();
	}

	public void signOut() {
		element(SignOutLink).waitUntilVisible();
		SignOutLink.click();

	}

}
