package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class BaseClass 
{
	public static WebDriver driver;
	
	public static void launchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/");
		driver.manage().window().maximize();		
	}
	
	public static void quitDriver()
	{
		driver.close();
		driver.quit();
	}
}
