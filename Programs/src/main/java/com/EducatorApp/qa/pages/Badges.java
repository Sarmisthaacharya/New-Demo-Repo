package com.EducatorApp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EducatorApp.qa.base.TestBase;

public class Badges extends TestBase{
	
	
	@FindBy(xpath="//a[@class='dropdown-toggle']//span[text()='badges']")
	public WebElement badgeMenu;
	
	@FindBy(xpath="//span[@class='tnl-menu-text'][text()='Library']")
	public WebElement libraryMenu;
	
	
	public Badges()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	

}
