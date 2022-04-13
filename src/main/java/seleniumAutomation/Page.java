package seleniumAutomation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

	public static WebDriver driver;
	FileInputStream fis;
	String parentWindowId;;
	Properties prop;
	public Page() 
	{
		System.out.println("IN Page class constructor");
		if(driver == null)
		{
		
			System.out.println("intializinf the driver");
		 prop = new Properties();
		try {
			fis = new FileInputStream("E:\\workspace\\Current_Batch\\FrameworkLearning\\seleniumAutomation\\src\\main\\resources\\OR.properties");
			prop.load(fis);
		} catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		String browser = prop.getProperty("browser");
		String url = prop.getProperty("url");
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:/workspace/Current_Batch/FrameworkLearning/seleniumAutomation/src/main/resources/executables/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		parentWindowId = driver.getWindowHandle();
		}
		else
		{
			System.out.println("driver is already initalized");
			System.out.println(driver.getCurrentUrl());
		}
		
	
		
	}
}
