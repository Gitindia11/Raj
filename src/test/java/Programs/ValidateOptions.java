package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class ValidateOptions {
	public WebDriver driver;
		
  @Test
  public void valid() {
	  
List<WebElement> allvalues = new Select(driver.findElement(By.id("day"))).getOptions(); 
System.out.println(allvalues.get(4).getText());

// print all values from A to Z

for (int i = 0; i < allvalues.size(); i++) {
	System.out.println(allvalues.get(i).getText());
	
	// checking comparision
	
	if (allvalues.get(i).getText().contains("5")) {
		
		System.out.println("test passed 5 is there");
		
	} else {
		
		System.out.println("test failed 5 is not there");

	}
	
}
	  	  
  }
  @BeforeTest
  public void beforeTest() throws Exception {
	 
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.get("https://www.facebook.com/reg/?app_id=1140740696088074&logger_id");
		  Thread.sleep(3000);
		  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
