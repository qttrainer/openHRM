package pages;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumAutomation.DashBoard;
import seleniumAutomation.ForgotPasswordPage;
import seleniumAutomation.LoginPage;

public class LoginPageTest {
	
	@Test(priority = 1)
	public void verifyLogin() 
	{
		System.out.println("Started verify login");
		LoginPage loginPage1 = new LoginPage();
		loginPage1.doLogin("Admin", "admin123");
		DashBoard dashboard = new DashBoard(); 
		String userName = dashboard.getUesrName();
		boolean status = userName.contains("Welcome");
		 Assert.assertTrue(status);		
		
	}
	
@Test(priority = 0)
	public void verifyForgetPasswor() throws IOException
	{
		LoginPage loginPage = new LoginPage();
		loginPage.navigateToForgotPassword();
		ForgotPasswordPage frp = new ForgotPasswordPage();
		boolean buutonStatus = frp.getRestButton().isDisplayed();
		Assert.assertTrue(buutonStatus);
		
	}
	
	

}
