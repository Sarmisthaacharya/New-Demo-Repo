package com.EducatorApp.qa.util;

import org.openqa.selenium.WebElement;

public class SendKeysUtility {
	
	
	public void sendKeys(WebElement element, String text)
	{	
		element.sendKeys(text);
	}

}
