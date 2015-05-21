package com.pages.account;

import net.serenitybdd.core.annotations.findby.FindBy;

import org.openqa.selenium.WebElement;

import com.tools.abstact.AbstractPage;

public class AccountDashboardPage extends AbstractPage {

	@FindBy(css = "div.box-content > p:nth-child(2)")
	private WebElement contactInfoEmailField;

	public String getContactInfoEmail() {
		element(contactInfoEmailField).waitUntilVisible();
		return contactInfoEmailField.getText();
	}
}
