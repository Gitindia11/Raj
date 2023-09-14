package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Pop_Up_Window {
	
	public WebDriver driver;
	
  @Test
  public void windowp() throws Exception {
	// to click on seperate window   
	driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
	
	// to click on click button
	driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	
	// come back to parent window handle
	
String parentwindow =	driver.getWindowHandle();

// handle child window

   for( String childwindow : driver.getWindowHandles()) {
   
  // switch to child window
   
   driver.switchTo().window(childwindow);
   
   }
   
   Thread.sleep(3000);
   
   //click on blog button 
   
   driver.findElement(By.xpath("//a[@class='nav-link']//span[contains(text(),'Blog')]")).click();
   
   
   // close child window
   
	driver.close();
	
// focus back to parent window
	
	driver.switchTo().window(parentwindow);
	
	
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	  driver.get("https://demo.automationtesting.in/Windows.html");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
