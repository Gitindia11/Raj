package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Print_Screen {
	
	public WebDriver driver;
	
  @Test
  public void screenshot() throws InterruptedException, IOException {
	  
	  driver.findElement(By.id("alertButton")).click();
		
		Thread.sleep(3000);

		String str = driver.switchTo().alert().getText();

		System.out.println(str);

		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(5000);
 
		String ATM ="Rajarani";	  
	  
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\user\\Desktop\\Print_S//"+ATM+".png"));
  
	  
  }
  
  @BeforeTest
  public void beforeTest() throws IOException {
	  
	  WebDriverManager.chromedriver().setup();
	  driver = new ChromeDriver();
    driver.get("https://demoqa.com/alerts");  
	  
	  
    String ATM ="RRR";
	
	File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	//org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\Charvik\\Desktop\\janakiscreens\\"+ATM+".png"));
	  
	  org.openqa.selenium.io.FileHandler.copy(scrFile, new File("C:\\Users\\user\\Desktop\\Print_S//"+ATM+".png"));
  }

  @AfterTest
  public void afterTest() {
  }

}
