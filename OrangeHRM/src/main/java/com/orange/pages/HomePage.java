package com.orange.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orange.base.Base;

public class HomePage extends Base{

	@FindBy(xpath="//h1[contains(text(),'Dashboard')]")
	WebElement dashboardLabel;

	@FindBy(xpath="//a[contains(text(),'Welcome Admin')]")
	WebElement welcomeAdminLabel;
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	WebElement logoutLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public boolean validateDashboardLabelPresence() {
		return dashboardLabel.isDisplayed();
	}
	
	public boolean validateWelcomeLabelPresence() {
		return welcomeAdminLabel.isDisplayed();
	}
	
	public LoginPage validateLogoutFunctionality() {
	//	WebDriverWait wait = new WebDriverWait(driver, 20);
	//	wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		welcomeAdminLabel.click();
		logoutLink.click();
		return new LoginPage();
	} 
	
}
