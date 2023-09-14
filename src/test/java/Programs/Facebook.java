package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

public class Facebook {
	
	public WebDriver driver;
	
  @Test
  public void f() {
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	 // WebDriverManager.firefoxdriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
