package PageObjectModel;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Locators {
	
	public static By In = By.xpath("//*[@id=\"sv_header\"]/div/div[3]/div/a[4]/div");
	
	public static By email = By.xpath("//*[@id=\"approot\"]/app-navbar/div[3]/div/div[2]/form/input[1]");
	
	public static By password = By.xpath("//*[@id=\"approot\"]/app-navbar/div[3]/div/div[2]/form/input[2]");
	
	public static By login = By.xpath("//div[@class='hori-vertical-center']//span[contains(text(),'Login')]");
}
