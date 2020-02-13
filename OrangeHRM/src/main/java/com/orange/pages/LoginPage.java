package com.orange.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.orange.base.Base;
import com.orange.utilities.Miscellaneous;

public class LoginPage extends Base{

	//Web Elements
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(id="btnLogin")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[@id='divLogo']/img")
	private WebElement HRMlogo;
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validatePageTitle() {
		return driver.getTitle();
	}
	
	public boolean validatePageLogo() {
		return HRMlogo.isDisplayed();
	}
	
	public HomePage validateLoginFunction() {
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginBtn.click();
		return new HomePage();
	}
	
	public void name() {
		
	}
}
