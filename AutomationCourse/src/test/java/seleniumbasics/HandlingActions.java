package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {
	
	public void verifyRightClick()
	{
		WebElement otherMenu=driver.findElement(By.id("others"));
		Actions a=new Actions(driver);
		a.contextClick(otherMenu).build().perform();
	}

	public static void main(String[] args) {
		
		HandlingActions act=new HandlingActions();
		act.browserLaunch();
		act.verifyRightClick();
		
		// TODO Auto-generated method stub

	}

}
