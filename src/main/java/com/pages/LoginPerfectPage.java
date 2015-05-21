package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://nextv.perfectmemorials.com")
public class LoginPerfectPage extends PageObject {

	@FindBy(linkText = "My Account")
	private WebElementFacade MyAccountLink;

	@FindBy(id = "email")
	private WebElementFacade email;

	@FindBy(id = "pass")
	private WebElementFacade password;

	@FindBy(id = "send2")
	private WebElementFacade submitButton;

	public void clickMyAccountLink() {
		element(MyAccountLink).waitUntilVisible();
		MyAccountLink.click();
	}

	public void enterEmail(String value) {
		element(email).waitUntilVisible();
		email.type(value);
	}

	public void enterPassword(String value) {
		element(password).waitUntilVisible();
		password.type(value);
	}

	public void clickLogin() {
		submitButton.click();
	}

}
