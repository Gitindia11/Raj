package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Information_Commands {
	
	public WebDriver driver;
	
  @Test(priority = 1)
  public void gmail () {
	  
String str = driver.findElement(By.linkText("Gmail")).getText();  
	  
	System.out.println(str);	  
	  
  }
  
  
  @Test(priority = 2)
  public void google () {
	  	  
	  String str1 =	driver.findElement(By.xpath("//img[@alt='Google']")).getAttribute("alt");
	  
	  System.out.println(str1);
	  	  
	    }
  
  @Test(priority = 3)
public void search () {
	  
String str2 =	driver.findElement(By.id("APjFqb")).getAttribute("title");
	  	  
	  	System.out.println(str2);
	  	 
	  	  
	    }
	    
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  
	  
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
