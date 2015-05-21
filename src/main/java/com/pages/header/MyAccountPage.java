package com.pages.header;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

import com.tools.abstact.AbstractPage;

public class MyAccountPage extends AbstractPage {

	@FindBy(linkText = "Log In")
	private WebElementFacade logInLink;

	@FindBy(id = "email")
	private WebElementFacade emailInput;

	@FindBy(id = "pass")
	private WebElementFacade passwordInput;

	@FindBy(id = "send2")
	private WebElementFacade logInButton;

	@FindBy(linkText = "Account Information")
	private WebElementFacade accountInformationLink;

	@FindBy(xpath = "//div[2]/div/div/ul/li[3]/a")
	private WebElementFacade adressBookLink;

	@FindBy(linkText = "Change")
	private WebElementFacade changeLink;

	@FindBy(id = "firstname")
	private WebElementFacade firstName;

	@FindBy(id = "lastname")
	private WebElementFacade lastName;

	@FindBy(css = "button.btn.btn-yellow")
	private WebElementFacade saveButton;

	@FindBy(id = "company")
	private WebElementFacade companyField;

	@FindBy(id = "telephone")
	private WebElementFacade telephoneField;

	@FindBy(id = "street_1")
	private WebElementFacade adressField;

	@FindBy(id = "city")
	private WebElementFacade cityField;

	@FindBy(id = "zip")
	private WebElementFacade zipField;

	@FindBy(xpath = "//div[3]/a")
	private WebElementFacade myOrdersLink;

	@FindBy(linkText = "Back")
	private WebElementFacade backButton;

	@FindBy(xpath = "//div[2]/div/div/ul/li[5]/a")
	private WebElementFacade myProductReviewsLink;

	@FindBy(linkText = "Newsletter Subscriptions")
	private WebElementFacade newsletterLink;

	@FindBy(xpath = "//label")
	private WebElementFacade generalSubscription;

	public void click_the_login() {
		element(logInLink).waitUntilVisible();
		logInLink.click();
	}

	public void enter_email(String email) {
		element(emailInput).waitUntilVisible();
		emailInput.type(email);
	}

	public void enter_password(String password) {
		element(passwordInput).waitUntilVisible();
		passwordInput.type(password);
	}

	public void click_login() {
		element(logInButton).waitUntilVisible();
		logInButton.click();
	}

	public void click_account_link() {
		element(accountInformationLink).waitUntilVisible();
		accountInformationLink.click();
	}

	public void edit_firstname(String value) {
		element(firstName).waitUntilVisible();
		firstName.type(value);
	}

	public void edit_lastname(String value) {
		element(lastName).waitUntilVisible();
		lastName.type(value);
	}

	public void click_save() {
		element(saveButton).waitUntilVisible();
		saveButton.click();
	}

	public void click_adress_link() {
		element(adressBookLink).waitUntilVisible();
		adressBookLink.click();
	}

	public void click_change_link() {
		element(changeLink).waitUntilVisible();
		changeLink.click();
	}

	public void enter_company(String company) {
		element(companyField).waitUntilVisible();
		companyField.type(company);
	}

	public void enter_telephone(String telephone) {
		element(telephoneField).waitUntilVisible();
		telephoneField.type(telephone);
	}

	public void enter_street(String street) {
		element(adressField).waitUntilVisible();
		adressField.type(street);
	}

	public void enter_city(String city) {
		element(cityField).waitUntilVisible();
		cityField.type(city);
	}

	public void enter_zip(String zip) {
		element(zipField).waitUntilVisible();
		zipField.type(zip);
	}

	public void click_a_state(String state) {
		WebElement select = getDriver().findElement(By.id("region_id"));
		java.util.List<WebElement> options = select.findElements(By.tagName("option"));
		for (WebElement option : options) {
			if ("Nova Scotia".equals(option.getText()))
				option.click();
		}
	}

	public void click_my_orders_link() {
		element(myOrdersLink).waitUntilVisible();
		myOrdersLink.click();
	}

	public void click_back() {
		element(backButton).waitUntilVisible();
		backButton.click();
	}

	public void click_my_product_reviews() {
		element(myProductReviewsLink).waitUntilVisible();
		myProductReviewsLink.click();
	}

	public void click_newsletter() {
		element(newsletterLink).waitUntilVisible();
		newsletterLink.click();
	}

	public void click_general_subscription() {
		element(generalSubscription).waitUntilVisible();
		generalSubscription.click();
	}

}
