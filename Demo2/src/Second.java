import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
*
@author: Gaurav Wani
*
**/
public class Second {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","/Users/Gaurav/Downloads/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("India");

		
		driver.findElement(By.id("lga")).click();
		
		
		
	//	driver.findElement(By.name("btnK")).click();
		
		WebElement element = driver.findElement(By.name("btnK"));
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		
   //     driver.findElement(By.name("btnK")).click();
    
		
	}

}
