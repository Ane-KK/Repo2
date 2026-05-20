package seleniumbasics;

import org.openqa.selenium.By;

public class Locators extends Base{
	
	public void verifyLocators()
	{
		driver.findElement(By.id("single-input-field"));
		driver.findElement(By.className("form-control"));
		driver.findElement(By.tagName("input"));
		driver.findElement(By.name("viewport"));
		driver.findElement(By.linkText("Select Input"));
		driver.findElement(By.partialLinkText("Select"));
		driver.findElement(By.cssSelector("button[id='button-one']"));
		//syntax for css SELECTOR- tagname[attribute='attribute value']
		
		
		
		
		//Absolute Xpath : /html/body/section/div/div/div[2]/div[2]/div/div[2]/form/button
		
		driver.findElement(By.xpath("//button[@id='button-two']"));
		// Relative Xpath syntax - //tagname[@attribute='attribute value']
		driver.findElement(By.xpath("//button[text()='Get Total']"));
		// use text instead of attribute, syntax //tagname[text()='text value']
		driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
		//using 'and' operator we can find element using two attribute
		driver.findElement(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
		//using 'or' operator we can find element using two attribute
		
		driver.findElement(By.xpath("//div[contains (text(), 'Single Input Field')]//parent::div[@class='card']"));
		//using parent element
		driver.findElement(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
		//child element
		
		driver.findElement(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
		//using following element
		//---//button[@id='button-one']//following::div[@class='card'][1]
		driver.findElement(By.xpath("//button[@id='button-one']//preceding:: div[@class='card']"));
		//using preceding element
		driver.findElement(By.xpath("//button[@id='button-one']//ancestor::div[1]"));
		//using ancestor element
		driver.findElement(By.xpath("//div[@class='card']//descendant::div[2]"));
		//using descendant 3rd element
		//--//div[@class='card']//descendant::div
	}
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

	}

}
