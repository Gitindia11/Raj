package PageObjectModel;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Repository1 {
  
	public static WebDriver driver;

	public static void log() {
		driver.findElement(Locators.In).click();
	driver.findElement(Locators.email).sendKeys(TestData.Username1);
	driver.findElement(Locators.password).sendKeys(TestData.password1);
	driver.findElement(Locators.login).click();
	
	
	
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get(TestData.url);
	  Thread.sleep(3000);
	  
	  
  }

}
