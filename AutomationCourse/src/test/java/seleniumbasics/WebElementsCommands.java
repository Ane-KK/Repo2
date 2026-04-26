package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementsCommands extends Base {
	
	public void verifyCommands()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messagBox= driver.findElement(By.id("single-input-field"));
		messagBox.sendKeys("Test Message");
		WebElement showmessage=driver.findElement(By.id("button-one"));
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
