package com.pages.email;

import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

import com.tools.abstact.AbstractPage;

public class MailinatorMailPage extends AbstractPage{

	@FindBy(className = "mailview")
	private WebElement mailBodyContainer;
	
	@FindBy(css = "iframe[name='rendermail']")
	private WebElement mailIframe;
	
	
	public String grabMailContent(){
		element(mailIframe).waitUntilVisible();
		getDriver().switchTo().frame(mailIframe);
		
		element(mailBodyContainer).waitUntilVisible();
		String mailContent = mailBodyContainer.getText();
		
		getDriver().switchTo().defaultContent();
		
		return mailContent;
	}
}
