package com.EducatorApp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.EducatorApp.qa.base.TestBase;
import com.EducatorApp.qa.util.SendKeysUtility;

public class LoginPage extends TestBase{
	
	Actions act = new Actions(driver);
	
	@FindBy(name="Username")
	public WebElement username;
	
	@FindBy(name="Password")
	public WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	public WebElement submit;
	
	@FindBy(xpath="//span[text()='badges']/ancestor::li[@class=' dropdown ']")
	public WebElement badgeMenu;
	
	@FindBy(xpath="//span[@class='tnl-menu-text'][text()='Library']")
	public WebElement libraryMenu;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public String ValidateLoginPageTitle()
	{
		return driver.getTitle();
	}

	public Badges clickBadgeLibrary()
	{
		
		badgeMenu.click();
		act.moveToElement(libraryMenu).build().perform();
		libraryMenu.click();
		return new Badges();
		 
	}
	
  /* public HomePage login(String un, String pwd)
   {
	   username.sendKeys(un);
	   password.sendKeys(pwd);
	   submit.click();
	    
	   
	   
	   return new HomePage();
   }*/


}
