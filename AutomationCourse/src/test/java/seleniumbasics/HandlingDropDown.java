package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown extends Base{
	
	public void verifydropdown() 
	{
	driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	WebElement dropdown=driver.findElement(By.id("dropdowm-menu-1"));
	Select select= new Select(dropdown);//Dropdown selections predefined methods comes under Select Class.
	//So We need to create object for Select class. Select(dropdowm) mention that selection from which elements. 
	//select.selectByIndex(2);//select by index for dropdown
	//select.selectByValue("c#");//select by value
	select.selectByVisibleText("SQL");
	}
	
	public void verifyCheckBox()
	{
		WebElement checkbox=driver.findElement(By.xpath("//input[@type='checkbox' and @value='option-2']"));
		checkbox.click();
		
	}
	
	public void verifyRadioButton()
	{
		WebElement radiobutton=driver.findElement(By.xpath("//input[@type='radio' and @value='green']"));
		radiobutton.click();
	}
	public static void main(String[] args) {
		
		HandlingDropDown dropdownlist= new HandlingDropDown();
		dropdownlist.browserLaunch();
		dropdownlist.verifydropdown();
		dropdownlist.verifyCheckBox();
		dropdownlist.verifyRadioButton();
		// TODO Auto-generated method stub

	}

}
