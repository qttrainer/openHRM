package seleniumAutomation;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	private WebDriver driver;
	
	
	public WebDriver getDriver() throws IOException
	{
		return driver = initBrowser();
	}
	
	public WebDriver initBrowser() throws IOException
	{
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("E:\\workspace\\Current_Batch\\FrameworkLearning\\seleniumAutomation\\src\\main\\resources\\OR.properties");
		prop.load(fis);
		
		String browser = prop.getProperty("browser");
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:/workspace/Current_Batch/FrameworkLearning/seleniumAutomation/src/main/resources/executables/chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		driver.manage().window().maximize();
		return driver;
		
	}
}
