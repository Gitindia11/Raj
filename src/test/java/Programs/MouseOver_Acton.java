package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class MouseOver_Acton {
	
	public WebDriver driver;
	public Actions action;
	
	
  @Test
  public void mouse() throws InterruptedException {
	  
	 action = new Actions(driver);
	  
	 WebElement ele = driver.findElement(By.linkText("SwitchTo"));
	 action.moveToElement(ele).build().perform();
	 
	  Thread.sleep(3000);
	  driver.findElement(By.linkText("Windows")).click();
	  
	  Thread.sleep(3000);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	  
	  
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
