package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;//WebDriver declaration, WebDriver is predefined interface 
	public void browserLaunch()//method name start with small
	{
		driver=new ChromeDriver();//we can not create object for interface, ChromeDriver is implemented class of Webdriver
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();
	}
	public void browserCloseAndQuit()
	{
		//driver.close();
		driver.quit();
	}

	public static void main(String[] args) {
		Base base= new Base();
		base.browserLaunch();
		base.browserCloseAndQuit();//
		// TODO Auto-generated method stub

	}

}
