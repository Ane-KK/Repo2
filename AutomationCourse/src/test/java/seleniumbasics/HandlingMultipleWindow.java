package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingMultipleWindow extends Base {
	
	public void verifyMultipleWindow()
	{
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstWindow=driver.getWindowHandle();
		WebElement clickHere=driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickHere.click();
		Set<String> handleids=driver.getWindowHandles();
		System.out.println(handleids);
		Iterator<String> it=handleids.iterator();
		while(it.hasNext())
		{
			String currentid=it.next();
			if(!currentid.equals(firstWindow))
			{
				driver.switchTo().window(currentid);
				WebElement emailinput=driver.findElement(By.xpath("//input[@name='emailid']"));
				emailinput.sendKeys("aneeshbedakam@gamil.com");
				WebElement submit=driver.findElement(By.xpath("//input[@name='btnLogin']"));
				submit.click();
				driver.switchTo().window(firstWindow);
				
			}
		}
		
		
		
		
	}

	private void While(boolean hasNext) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			HandlingMultipleWindow window=new HandlingMultipleWindow();
			window.browserLaunch();
			window.verifyMultipleWindow();

	}

}
