package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.google.common.collect.Table;

public class TableHandling extends Base {
	
	public void verifyTable()
	{
	driver.navigate().to("https://money.rediff.com/indices/nse");
	WebElement table=driver.findElement(By.id("dataTable"));
	//System.out.println(table.getText());
	WebElement raw=driver.findElement(By.xpath("//table[@id='dataTable']/tbody/tr[3]"));
	System.out.println(raw.getText());
	
	}

	public static void main(String[] args) {
		
		TableHandling tableHandle=new TableHandling();
		tableHandle.browserLaunch();
		tableHandle.verifyTable();
		// TODO Auto-generated method stub

	}

}
