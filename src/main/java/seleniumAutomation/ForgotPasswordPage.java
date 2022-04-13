package seleniumAutomation;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage extends Page {
	
	WebElement restbutton = driver.findElement(By.id("btnSearchValues"));
	
	public ForgotPasswordPage()
	{
		/*
		 * if(driver.getWindowHandles().size()>1) { Set<String> windowIds
		 * =driver.getWindowHandles(); for(String window :windowIds) {
		 * if(!(window.equalsIgnoreCase(parentWindowId))) {
		 * driver.switchTo().window(window); } } }
		 */
		
		System.out.println("In Forgot password class constructor");
		
	}
	
	public WebElement getRestButton()
	{
		return restbutton;
	}

}
