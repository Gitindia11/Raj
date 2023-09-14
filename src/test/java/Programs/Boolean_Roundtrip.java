package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Boolean_Roundtrip {
	
	public WebDriver driver;
	
  @Test
  public void validation() {
	  
	// switch to round trip from oneway  
 driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).click();
 
 //checking boolean expression
 
boolean ele = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']")).isDisplayed();
 
 System.out.println(ele);
 
 // checking true or false with if statement
 
WebElement ele1 = driver.findElement(By.xpath("//button[normalize-space()='Round Trip']"));
	  
if (ele1.isDisplayed()) {
	
	System.out.println("round trip is there");
	
} else {
	
	System.out.println("round trip is not there");

}
	  
	  
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	 driver.get("https://savaari.com/"); 
	 driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
