package com.steps.product;

import net.thucydides.core.annotations.Step;

import com.tools.abstact.AbstractSteps;

public class ProductSteps extends AbstractSteps  {

	
	private static final long serialVersionUID = 1561357797122927786L;
	
	@Step
	public void chooseFontStyle(String fontStyle ) {
		productFontStylePage().selectFontStyle(fontStyle);
	}
	
	
	@Step
	public void enterFirstEngravingLine(String firstEngraving ) {
		firstEngravingLinePage().typeFirstEngravingLine(firstEngraving);
	}
	
	@Step
	public void enterSecondEngravingLine(String secondEngraving ) {
		secondEngravingLinePage().typeSecondEngravingLine(secondEngraving);
	}
	
	@Step
	public void chooseEngravingExample(String engravingExample)  {
		productEngravingExamplePage().selectEngravingExample(engravingExample);
		
	}
}
