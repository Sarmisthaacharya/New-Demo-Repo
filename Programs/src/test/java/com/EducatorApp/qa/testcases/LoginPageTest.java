package com.EducatorApp.qa.testcases;

import java.lang.annotation.Target;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.EducatorApp.qa.base.TestBase;
import com.EducatorApp.qa.pages.HomePage;
import com.EducatorApp.qa.pages.LoginPage;
import com.EducatorApp.qa.util.ButtonClick;
import com.EducatorApp.qa.util.SendKeysUtility;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	
	SendKeysUtility sk = new SendKeysUtility();
	ButtonClick bc = new ButtonClick();
	
	public LoginPageTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
		loginPage = new LoginPage();
	
	}
	
	@Test
	public void loginTest()
    {
	//homePage = loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
	sk.sendKeys(loginPage.username, prop.getProperty("username"));
	sk.sendKeys(loginPage.password, prop.getProperty("password"));
	bc.Click(loginPage.submit);
	loginPage.clickBadgeLibrary();
	
	
    }
	
	/*@Test
	public void badgeLibraryMenu()
	{
		
		loginPage.clickBadgeLibrary();
	}
*/
	
	
	
	
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
