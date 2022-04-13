package seleniumAutomation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashBoard extends Page {
	
	WebElement userName = driver.findElement(By.xpath("//a[contains(text() , 'Welcome')]"));////a[contains(text() , 'Welcome')]
	
	public String getUesrName()
	{
		return userName.getText();
	}
}
