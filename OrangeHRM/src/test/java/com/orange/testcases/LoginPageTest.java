package com.orange.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.orange.base.Base;
import com.orange.pages.HomePage;
import com.orange.pages.LoginPage;

public class LoginPageTest extends Base{
	LoginPage  loginpage;
	HomePage homepage;
	
	public LoginPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		loginpage = new LoginPage();
	}
	
	@Test(groups={"regression"})
	public void testPageTitle() {
		String title = loginpage.validatePageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(groups={"regression"})
	public void testPageLogoPresence() {
		boolean flag = loginpage.validatePageLogo();
		Assert.assertTrue(flag);
		System.out.println("*******LOGO********  "+flag);
	}
	
	@Test(groups={"smoke"})
	public void testLoginFunctionality() {
		homepage = loginpage.validateLoginFunction();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
