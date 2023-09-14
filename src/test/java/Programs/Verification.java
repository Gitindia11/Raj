package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Verification {
public WebDriver driver;

	
  @Test
  public void fun() {
	  
	String ourtitle =  "merucry tours";
	String actualtitle = driver.getTitle();
	
	System.out.println(actualtitle);
	
	//1st statement
	System.out.println("welcome to selenium");
	
	//2nd statement
Assert.assertEquals(ourtitle, actualtitle);
	  
	 //3rd statement
System.out.println("assertion starts here");

//4th statement

System.out.println("blog for testing");

driver.quit();

  }
  
  
  @BeforeTest
  public void beforeTest() {
	  
	WebDriverManager.chromedriver().setup();  
	driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/newtours/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
