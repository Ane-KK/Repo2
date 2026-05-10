package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestNGBase {

		public WebDriver driver;//WebDriver declaration, WebDriver is predefined interface 
		
		@BeforeMethod
		public void browserLaunch()//method name start with small
		{
			driver=new ChromeDriver();//we can not create object for interface, ChromeDriver is implemented class of Webdriver
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
		}
		@AfterMethod
		public void browserCloseAndQuit()
		{
			//driver.close();
			driver.quit();
		}
	}


