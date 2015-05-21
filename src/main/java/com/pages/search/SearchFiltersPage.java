package com.pages.search;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.tools.Constants;
import com.tools.abstact.AbstractPage;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl(Constants.BASE_URL + "catalogsearch/result/")
public class SearchFiltersPage extends AbstractPage{
	
	@FindBy(className = "catalogsearch-result-index")
	private WebElement catalogBodyContainer;
	
	public void selectColor(String color){
		element(catalogBodyContainer).waitUntilVisible();
		
		List<WebElement> colorsList = catalogBodyContainer.findElements(By.cssSelector("div#pm_urns_color li a > span"));
		
//		System.out.println("Color list size: " + colorsList.size())
		
		for (WebElement colorNow : colorsList) {
			String colorText = colorNow.findElement(By.cssSelector("span.pull-left")).getText().toLowerCase();
			if(colorText.contains(color.toLowerCase())){
				colorNow.click();
				break;
			}
			
		}
		
		
	}

}
