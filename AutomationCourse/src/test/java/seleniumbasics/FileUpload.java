package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUpload extends Base {
	
	public void verifyFileUpload()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement choosefile=driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
		choosefile.sendKeys("C:\\Users\\anees\\git\\Repo2\\AutomationCourse\\src\\test\\resources\\Test.pdf");
	    WebElement checkbox=driver.findElement(By.id("terms"));
	    checkbox.click();
	    WebElement submit=driver.findElement(By.id("submitbutton"));
	    submit.click();
		
	}
	
	public void verifyFileUploadUsingRobot() throws AWTException
	{
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement pickfiles=driver.findElement(By.id("pickfiles"));
		pickfiles.click();
		StringSelection selection=new StringSelection("C:\\Users\\anees\\git\\Repo2\\AutomationCourse\\src\\test\\resources\\Test.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);
		Robot robot= new Robot();
		robot.delay(2500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		
		
	}

	
	//"C:\Users\anees\git\Repo2\AutomationCourse\src\test\resources\Test.pdf"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload=new FileUpload();
		fileupload.browserLaunch();
		//fileupload.verifyFileUpload();
		try {
			fileupload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
