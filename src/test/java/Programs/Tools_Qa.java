package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Tools_Qa {
	
	public WebDriver driver;
	
	
  @Test
  public void studentform() throws InterruptedException {
	  
	  
	 driver.findElement(By.id("firstName")).sendKeys("Raju");
	 
	 driver.findElement(By.id("lastName")).sendKeys("Reddy");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("userEmail")).sendKeys("raju@gmail.com");
	 Thread.sleep(3000);
	 
	  driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("userNumber")).sendKeys("9876543212");
	  Thread.sleep(3000);
	  
	  driver.findElement(By.id("userNumber")).sendKeys(Keys.TAB);
	  
	  //calender
	  //driver.findElement(By.id("dateOfBirthInput")).click();
	  Thread.sleep(3000);
	  
	  // select month
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"))).selectByVisibleText("June");
	  Thread.sleep(3000);
	  
	  //select year
	  new Select(driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"))).selectByVisibleText("1994");
	  Thread.sleep(3000);
	  
	  //select date
	  driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, June 22nd, 1994']")).click();
	  Thread.sleep(3000);
	  
	  // select subjects
	 // driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]")).sendKeys("computerscience");
	  //Thread.sleep(3000);
	  //driver.findElement(By.xpath("//*[@id=\"subjectsContainer\"]/div/div[1]/div[1]/div[1]")).sendKeys(Keys.ENTER);
	  //Thread.sleep(3000);
	  
	 // driver.findElement(By.xpath("//div[@class='subjects-auto-complete__value-container subjects-auto-complete__value-container--is-multi css-1hwfws3']")).click();
	  driver.findElement(By.id("subjectsInput")).sendKeys("Computer Science");
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
	  driver.findElement(By.id("subjectsInput")).sendKeys(Keys.TAB);
	  Thread.sleep(3000);
	 
	  // select hobbies
	 //driver.findElement(By.xpath("//label[normalize-space()='Sports']")).click();
	  driver.switchTo().activeElement().click();
	  //driver.findElement(By.id("hobbies-checkbox-1")).click();
	 Thread.sleep(3000);
	 
	 //select picture
	 driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\user\\Pictures\\Saved Pictures");
	 Thread.sleep(3000);
	 
	 driver.findElement(By.id("currentAddress")).sendKeys("From Hyderabad city in Telangana"); 
	 Thread.sleep(3000);
	 // shift to next module by using tab
	 driver.findElement(By.id("currentAddress")).sendKeys(Keys.TAB);
	 Thread.sleep(3000);
	 // select state by using tab
	 driver.switchTo().activeElement().sendKeys("NCR");
	 driver.switchTo().activeElement().sendKeys(Keys.TAB);
	 Thread.sleep(3000);
	 // select city
	 driver.switchTo().activeElement().sendKeys("Delhi");
	 driver.switchTo().activeElement().sendKeys(Keys.TAB);
	 
	 
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
	 driver.get("https://demoqa.com/automation-practice-form"); 
	 Thread.sleep(5000);
	 driver.manage().window().maximize(); 
	   
  }

  @AfterTest
  public void afterTest() {
  }

}
