package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assert_Veify {
	
	public WebDriver driver;
	
  @Test
  public void fun() {
	  
	  String ourvalue = "$5";
	  String actvalue = driver.findElement(By.xpath("//b[normalize-space()='$398']")).getText();
	  
	  System.out.println(actvalue);
	  
	  try {
		
		  System.out.println("Assertion starts here");
		  
		  //2nd statement
		  
		  Assert.assertEquals(ourvalue, actvalue);
		  	 	
	} 

		
 catch (Throwable t) {
		
	//3rd statement
	  
	  System.out.println("Apple");
	  
	  //4th statement
	  
	  System.out.println("A blog for  testers");
	}
	  	  
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
