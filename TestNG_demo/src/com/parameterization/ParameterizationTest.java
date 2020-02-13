package com.parameterization;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
*
@author: Gaurav Wani
*
**/
public class ParameterizationTest {
	WebDriver driver;
	
	@Test
	public void initialize(){
		
		System.setProperty("webdriver.chrome.driver", "/Users/Gaurav/Downloads/chromedriver");
		driver = new ChromeDriver();
		
	}
	

}
