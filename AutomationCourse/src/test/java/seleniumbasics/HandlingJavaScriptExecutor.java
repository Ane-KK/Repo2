package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class HandlingJavaScriptExecutor extends Base {
	
	public void verifyJs()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagBox= driver.findElement(By.id("single-input-field"));
		messagBox.sendKeys("Test Message");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", showmessage);
		js.executeScript("window.scrollBy(0,350)", "");
	}

	public static void main(String[] args) {
		
		HandlingJavaScriptExecutor jsExecutor=new HandlingJavaScriptExecutor();
		jsExecutor.browserLaunch();
		jsExecutor.verifyJs();
		// TODO Auto-generated method stub

	}

}
