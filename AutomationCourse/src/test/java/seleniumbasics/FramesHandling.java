package seleniumbasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FramesHandling extends Base {
	
	public void verifyFrames()
	{
		driver.navigate().to("https://demoqa.com/frames");
		List<WebElement>totalFrame=driver.findElements(By.tagName("iframe"));
		System.out.println(totalFrame.size());
		WebElement fram1=driver.findElement(By.id("frame1"));
		driver.switchTo().frame(fram1);
		WebElement heading=driver.findElement(By.id("sampleHeading"));
		System.out.println(heading.getText());
		driver.switchTo().defaultContent();
		
	}

	public static void main(String[] args) {
		
		FramesHandling frams=new FramesHandling();
		frams.browserLaunch();
		frams.verifyFrames();
		// TODO Auto-generated method stub

	}

}
