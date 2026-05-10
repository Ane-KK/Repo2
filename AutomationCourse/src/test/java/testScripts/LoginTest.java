package testScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.TestNGBase;
import utilities.ExcelUtilies;

public class LoginTest extends TestNGBase {
	
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException
	{
		//WebElement username = driver.findElement(By.id("user-name"));
		//username.sendKeys("standard_user");
		//WebElement password =driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		//WebElement submit = driver.findElement(By.id("login-button"));
		//submit.click();
		/*-----------Data Driven Approach----*/
		String usernamevalue=ExcelUtilies.readStringData(0, 0, "LoginPage");
		String passwordvalue=ExcelUtilies.readStringData(0, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameInUsernanefield(usernamevalue);
		loginpage.enterPasswordInPasswordfield(passwordvalue);
		loginpage.loginButtonClick();
		
		
	}
	
	@Test
	public void verifyUserLoginWithInvalidUsername() throws IOException
	{
		/*WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invalid");
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("secret_sauce");
		WebElement submit = driver.findElement(By.id("login-button"));
		submit.click();*/
		/*-----------Data Driven Approach----*/
		
		String usernamevalue=ExcelUtilies.readStringData(1, 0, "LoginPage");
		String passwordvalue=ExcelUtilies.readStringData(1, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameInUsernanefield(usernamevalue);
		loginpage.enterPasswordInPasswordfield(passwordvalue);
		loginpage.loginButtonClick();
		
		
	}
	
	@Test
	public void verifyUserLoginWithInvalidPassword() throws IOException
	{
		/*WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("standard_user");
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("invalid");
		WebElement submit = driver.findElement(By.id("login-button"));
		submit.click();*/
		
		/*-----------Data Driven Approach below----*/
		
		String usernamevalue=ExcelUtilies.readStringData(2, 0, "LoginPage");
		String passwordvalue=ExcelUtilies.readStringData(2, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameInUsernanefield(usernamevalue);
		loginpage.enterPasswordInPasswordfield(passwordvalue);
		loginpage.loginButtonClick();
		
		
	}

	@Test
	
	public void verifyUserLoginWithInvalidCredentials() throws IOException
	{
		/*WebElement username = driver.findElement(By.id("user-name"));
		username.sendKeys("invalid");
		WebElement password =driver.findElement(By.id("password"));
		password.sendKeys("invalid");
		WebElement submit = driver.findElement(By.id("login-button"));
		submit.click();*/
		
		/*-----------Data Driven Approach below----*/
		
		String usernamevalue=ExcelUtilies.readStringData(3, 0, "LoginPage");
		String passwordvalue=ExcelUtilies.readStringData(3, 1, "LoginPage");
		
		LoginPage loginpage = new LoginPage(driver);
		loginpage.enterUsernameInUsernanefield(usernamevalue);
		loginpage.enterPasswordInPasswordfield(passwordvalue);
		loginpage.loginButtonClick();
	}
	
	

}
