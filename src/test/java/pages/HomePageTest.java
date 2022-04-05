package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumAutomation.Base;

public class HomePageTest extends Base{

public WebDriver driver;
	@Test
	public void loadHomePage()
	{
		
		try {
			driver = getDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			String title = driver.getTitle();
			Assert.assertEquals(title, "OrangeHRM");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void navigateToForgotPasswordLink()
	{
		try {
			driver = getDriver();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			String title = driver.findElement(By.xpath("")).click();
			Assert.assertEquals(title, "OrangeHRM");
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
