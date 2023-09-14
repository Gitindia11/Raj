package Grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cross {
	
	public WebDriver driver;
	
  @Test
  @Parameters("browser")
  public void runallbrowsers(String browsersname) 
  {
	  
	  if (browsersname.equalsIgnoreCase("Chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		
	} else {browsersname.equalsIgnoreCase("Firefox");
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();

	}
	  
  }
}
