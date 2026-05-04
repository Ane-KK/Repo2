package seleniumbasics;

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

	
	//"C:\Users\anees\git\Repo2\AutomationCourse\src\test\resources\Test.pdf"
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileUpload fileupload=new FileUpload();
		fileupload.browserLaunch();
		fileupload.verifyFileUpload();

	}

}
