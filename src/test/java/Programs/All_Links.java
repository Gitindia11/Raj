package Programs;

import org.testng.annotations.Test;
import org.w3c.dom.Text;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class All_Links {
	
	public WebDriver driver;
	
  @Test
  public void clickable() {
	  java.util.List<WebElement> str = driver.findElements(By.tagName("a"));
	  
	  System.out.println(str.size());
	  
	  for (int i = 0; i <= str.size(); i++) {
		  
		  
		
	}
	  
	  System.out.println(str.get(i).get Text());
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
