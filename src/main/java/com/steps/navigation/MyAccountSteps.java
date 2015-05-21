package com.steps.navigation;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;

import com.tools.abstact.AbstractSteps;

public class MyAccountSteps extends AbstractSteps {
	private static final long serialVersionUID = 5521983410211905838L;

	@Step
	public void isHomePage() {
		myAccountPage().open();
		getDriver().manage().window().maximize();
	}

	@Step
	public void clickTheLoginLink() {
		myAccountPage().click_the_login();
	}

	@Step
	public void enter_your_email(String email) {
		myAccountPage().enter_email(email);
	}

	@Step
	public void enter_your_password(String password) {
		myAccountPage().enter_password(password);
	}

	@StepGroup
	public void enterYourCredentials(String email, String password) {
		enter_your_email(email);
		enter_your_password(password);
	}

	@Step
	public void clickTheLoginButton() {
		myAccountPage().click_login();
	}

	@Step
	public void clickAccountInformationLink() {
		myAccountPage().click_account_link();
	}

	@Step
	public void edit_your_firstname(String firstname) {
		myAccountPage().edit_firstname(firstname);
	}

	@Step
	public void edit_your_lastname(String lastname) {
		myAccountPage().edit_lastname(lastname);
	}

	@StepGroup
	public void editAccountInformation(String firstname, String lastname) {
		edit_your_firstname(firstname);
		edit_your_lastname(lastname);
	}

	@Step
	public void saveTheEditedInformation() {
		myAccountPage().click_save();
	}

	@Step
	public void clickAddressBookLink() {
		myAccountPage().click_adress_link();
	}

	@Step
	public void clickChangeLink() {
		myAccountPage().click_change_link();
	}

	@Step
	public void choose_a_state(String state) throws InterruptedException {
		myAccountPage().click_a_state(state);
//		Thread.sleep(4000);
	}

	@Step
	public void enter_the_company(String company) {
		myAccountPage().enter_company(company);
	}

	@Step
	public void enter_the_telephone(String telephone) {
		myAccountPage().enter_telephone(telephone);
	}

	@Step
	public void enter_the_street(String street) {
		myAccountPage().enter_street(street);
	}

	@Step
	public void enter_the_city(String city) {
		myAccountPage().enter_city(city);
	}

	@Step
	public void enter_the_zip_code(String zip) {
		myAccountPage().enter_zip(zip);
	}

	@Step
	public void selectAState(String state) {
		myAccountPage().click_a_state(state);
	}

	@StepGroup
	public void editAddressBookInformation(String company, String telephone, String street, String city, String zip) throws InterruptedException {
		enter_the_company(company);
		enter_the_telephone(telephone);
		enter_the_street(street);
		enter_the_city(city);
		enter_the_zip_code(zip);
	}

	@Step
	public void clickTheMyOrdersLink() {
		myAccountPage().click_my_orders_link();
	}

	@Step
	public void clickBackButton() {
		myAccountPage().click_back();
	}

	@Step
	public void clickMyProductReviewsLink() {
		myAccountPage().click_my_product_reviews();
	}

	@Step
	public void clickNewslettterSubscriptionsLink() {
		myAccountPage().click_newsletter();
	}

	@Step
	public void clickGeneralSubscriptionCheckbox() {
		myAccountPage().click_general_subscription();
	}

}
