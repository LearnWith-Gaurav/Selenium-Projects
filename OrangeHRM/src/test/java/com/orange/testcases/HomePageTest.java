package com.orange.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orange.base.Base;
import com.orange.pages.HomePage;
import com.orange.pages.LoginPage;

@Listeners(com.orange.utilities.TestNGListener.class)
public class HomePageTest extends Base{
	LoginPage loginpage;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initialization();
		loginpage = new LoginPage();
		homepage = loginpage.validateLoginFunction();
	}
	
	@Test(priority=1)
	public void testDashboardLabelPresence() {
		boolean dashboardflag = homepage.validateDashboardLabelPresence();
		Assert.assertTrue(dashboardflag);
	}
	
	@Test(priority=2)
	public void testWelcomeLabelPresence() {
		boolean welcomeflag = homepage.validateWelcomeLabelPresence();
		Assert.assertTrue(welcomeflag);
	}
	
	@Test(priority=3)
	public void testLogoutFunctionaliy() {
		loginpage = homepage.validateLogoutFunctionality();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
}
