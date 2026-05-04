package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

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
	
	public void verifyMouseHover()
	{
		WebElement otherMenu=driver.findElement(By.id("others"));
		Actions a=new Actions(driver);
		a.moveToElement(otherMenu).build().perform();
	}

	public void verifyKeyboardAction() throws AWTException
	{
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);
		
		
		
	}
	public void verifyDragAndDrop()
	{
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		
	}
	public static void main(String[] args) {
		
		HandlingActions act=new HandlingActions();
		act.browserLaunch();
		//act.verifyRightClick();
		//act.verifyMouseHover();
		//act.verifyDragAndDrop();
		try {
			act.verifyKeyboardAction();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// TODO Auto-generated method stub

	}

}
