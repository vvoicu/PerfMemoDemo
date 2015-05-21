package com.pages.header;

import java.util.List;

import net.serenitybdd.core.annotations.findby.FindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.tools.abstact.AbstractPage;

public class NavigationPage extends AbstractPage {

	@FindBy(css = "div#pronav-container")
	private WebElement navigationContainer;

	public void selectCategory(String category) {
		element(navigationContainer).waitUntilVisible();

		List<WebElement> categoriesList = navigationContainer.findElements(By.cssSelector("li > a"));

		theFor: for (WebElement categoryNow : categoriesList) {

			String categoryText = categoryNow.getText();
			System.out.println("Category: " + categoryText);
			if (categoryText.toLowerCase().contains(category.toLowerCase())) {
				Actions action = new Actions(getDriver());
				action.moveToElement(categoryNow).build().perform();
				break theFor;
			}
		}
	}

	public void selectSubCategory(String category) {
		element(navigationContainer).waitUntilVisible();

		List<WebElement> categoriesList = navigationContainer.findElements(By.cssSelector("li > a"));

		theFor: for (WebElement categoryNow : categoriesList) {

			String categoryText = categoryNow.getText();
			System.out.println("Category: " + categoryText);
			if (categoryText.toLowerCase().contains(category.toLowerCase())) {
				categoryNow.click();
				break theFor;
			}
		}
	}

}
