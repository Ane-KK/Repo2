package seleniumbasics;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebElementsCommands extends Base {
	
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagBox= driver.findElement(By.id("single-input-field"));
		Wait <WebDriver>fluentWait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(1)).ignoring(NoSuchElementException.class);
		fluentWait.until(ExpectedConditions.visibilityOf(messagBox));//fluent wait for messagebox element
		messagBox.sendKeys("Test Message");
		WebElement showmessage=driver.findElement(By.id("button-one"));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(showmessage));//Explict wait for showmessage element
		showmessage.click();
		WebElement yourmsg= driver.findElement(By.id("message-one"));
		System.out.println(yourmsg.getText());
		System.out.println(showmessage.getTagName());
		messagBox.clear();
	}

	public static void main(String[] args) {
		
		WebElementsCommands element=new WebElementsCommands();
		element.browserLaunch();
		element.verifyCommands();
		// TODO Auto-generated method stub

	}

}
