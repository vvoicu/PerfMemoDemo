package com.pages.product;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.Constants;
import com.tools.abstact.AbstractPage;

@DefaultUrl(Constants.BASE_URL + "cremation-urns/pet-urns/metal-pet-urns/small-brass-nickel-plated-mother-of-pearl-keepsake-cremation-urn.html")
public class ProductOptionsPage extends AbstractPage {

	@FindBy(css = "input#options_127_text")
	private WebElement productFirstEngravingLine;

	@FindBy(css = "input#options_128_text")
	private WebElement productSecondEngravingLine;

	@FindBy(id = "select_130")
	private WebElement productEngravingExample;

	public void selectFontStyle(String fontStyle) {

		WebElement productFontStyle = getDriver().findElement(By.id("select_129"));
		element(productFontStyle).selectByValue("389");

	}

	public void typeFirstEngravingLine(String firstEngravingTerms) {
		element(productFirstEngravingLine).waitUntilVisible();
		element(productFirstEngravingLine).typeAndEnter(firstEngravingTerms);
	}

	public void typeSecondEngravingLine(String secondEngravingTerms) {
		element(productSecondEngravingLine).waitUntilVisible();
		element(productSecondEngravingLine).typeAndEnter(secondEngravingTerms);
	}

	public void selectEngravingExample(String engravingExample) {
		WebElement productEngravingExample = getDriver().findElement(By.id("select_130"));
		element(productEngravingExample).selectByValue("390");

		/*
		 * List<WebElement> fontStyleList =
		 * selectFontStyle.findElements(By.tagName("option"));
		 * 
		 * for (WebElement fontNow : fontStyleList) {
		 * if("Century".equals(fontNow.getText())) fontNow.click(); }
		 */
	}

}
