package Programs;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;

import java.io.FileInputStream;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Data_Driven {
	public WebDriver driver;
	
  @Test
  public void f() {
	 FileInputStream fi = new FileInputStream("")
	workbook wb = workbook.getworkbook(fi);
	 sheet s = wb.getsheet("raju");
	 driver.findElement(by).sendkeys(s.getcell(0,1).getcontent);
	 driver.findElement(by).sendkeys(s.getcell(1,1)).getcontent);
	 
	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	driver.get("https://github.com/login?return_to=%2Flogins");
	driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}
