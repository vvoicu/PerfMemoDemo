package com.pages.email;

import java.util.List;
import net.serenitybdd.core.annotations.findby.FindBy;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.abstact.AbstractPage;

public class MailinatorPage extends AbstractPage {

	@FindBy(id = "mailcontainer")
	private WebElement inboxContainer;

	@FindBy(className = "mailview")
	private WebElement mailContainer;

	@FindBy(css = "div#mailshowdivbody iframe")
	private WebElement iFrameElement;

	public String grabEmail(String title) {
		element(inboxContainer).waitUntilVisible();
		String returnText = "";
		boolean foundEmail = false;
		List<WebElement> emailList = inboxContainer.findElements(By.cssSelector("li"));

		for (WebElement itemNow : emailList) {
			String allText = itemNow.getText();
			System.out.println("Row: " + allText);
			if (allText.contains(title)) {
				itemNow.findElement(By.cssSelector("div.subject")).click();
				foundEmail = true;
				break;
			}
		}
		Assert.assertTrue("The email with the title " + title + " was not found", foundEmail);
		return returnText;
	}

}
