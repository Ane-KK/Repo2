package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base {
	
	public void verifySimpleAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleClickMe=driver.findElement(By.id("alertButton"));
		simpleClickMe.click();
		Alert al=driver.switchTo().alert();
		al.accept();
	}

	public void verifyConfirmAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement ConfirmAlertClick=driver.findElement(By.id("confirmButton"));
		ConfirmAlertClick.click();
		Alert al=driver.switchTo().alert();
		al.dismiss();
		
	}
	
	public void verifyPromptAlert()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptClick=driver.findElement(By.id("promtButton"));
		promptClick.click();
		Alert al=driver.switchTo().alert();
		al.sendKeys("Aneesh");
		al.accept();
	}
	public static void main(String[] args) {
		
		AlertHandling alert=new AlertHandling();
		alert.browserLaunch();
		//alert.verifySimpleAlert();
		//alert.verifyConfirmAlert();
		alert.verifyPromptAlert();
		// TODO Auto-generated method stub

	}

}
