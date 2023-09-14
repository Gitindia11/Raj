package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

public class Frames {

public WebDriver driver;
public Actions action;
	
  @Test
  public void clickable() {

	  //iframe concept
driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));

//Elements which needs to drag
 WebElement from = driver.findElement(By.id("draggable"));
 
 //elements which needs to drop
 
WebElement to = driver.findElement(By.id("droppable"));

//using action class for drag and drop

action = new Actions(driver);

//Dragged and droped

action.dragAndDrop(from, to).build().perform();

//back to out of frame

driver.switchTo().parentFrame();

driver.findElement(By.xpath("//a[normalize-space()='Blog']")).click();
	  
	  
  }
  
  @BeforeTest
  public void beforeTest() {
	  
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
	  
  }

  @AfterTest
  public void afterTest() {
  }

}
