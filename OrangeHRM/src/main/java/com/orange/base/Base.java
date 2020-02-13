package com.orange.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.orange.utilities.WebEventListener;

public class Base {
	public static WebDriver driver;
	public static Properties prop;
	public static WebEventListener welistener;
	public static EventFiringWebDriver edriver;
	
	public Base(){
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/java/com/orange"
					+ "/config/Config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void Initialization() {
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/Gaurav/Downloads/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("IE")){
			
		}
		
		edriver = new EventFiringWebDriver(driver);
		welistener = new WebEventListener();
		edriver.register(welistener);
		driver = edriver;
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		
		driver.get(prop.getProperty("url"));
	}


}
