package seleniumAutomation;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends Page{
	
	
	public LoginPage()
	{
		System.out.println("IN LOGIN PAGE CONSTRUCTOR");
		System.out.println(driver.getCurrentUrl());
		if(!(driver.getCurrentUrl().equalsIgnoreCase(prop.getProperty("url"))))
		{
		driver.get(prop.getProperty("url"));
		}
	}

	WebElement username = driver.findElement(By.name("txtUsername"));
	WebElement password = driver.findElement(By.name("txtPassword"));
	WebElement login = driver.findElement(By.id("btnLogin"));
	WebElement forgotPassword = driver.findElement(By.xpath("//*[text() = 'Forgot your password?']"));
	
	WebElement youtube = driver.findElement(By.xpath("//img[@alt = 'OrangeHRM on youtube']"));
	

	
	
	
	public void doLogin(String username1, String password1)
	{
		username.sendKeys(username1);
		password.sendKeys(password1);
		login.click();
		
	}
	
	public void navigateToForgotPassword()
	{
		forgotPassword.click();
		
	}
	
	public String getTitle()
	{
		
		return driver.getTitle();
	}
	
	public void negatigateToYoutube()
	{
		
		youtube.click();
	}
	

}
