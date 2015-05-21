package com.pages.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.serenitybdd.core.annotations.findby.FindBy;

import com.tools.abstact.AbstractPage;

public class SearchListPage extends AbstractPage {

	@FindBy(css = "div.category-products.product-list")
	private WebElement searchResultsContainer;
	
	
	
	public void searchAndSelect(String productSearch){
		element(searchResultsContainer).waitUntilVisible();
		List<WebElement> productsList = searchResultsContainer.findElements(By.cssSelector("div.item"));
		
		theFor: 
		for (WebElement productNow : productsList) {
			String productName = productNow.findElement(By.className("product-name")).getText();
//			System.out.println("Prduct: " + productName);
			if(productName.contains(productSearch)){
				productNow.findElement(By.cssSelector("h3.product-name a")).click();
//				System.out.println("Found It!!!");
				break theFor;
			}
			
		}
	}
	
}
