package seleniumbasics;

public class BrowserCommands extends Base {
	
	public void verifyBrowserCommands()
	{
		String title=driver.getTitle();//fetch Application title
		System.out.println(title);
		String url=driver.getCurrentUrl();//fetch URL
		System.out.println(url);
		String handleId=driver.getWindowHandle();
		System.out.println(handleId);
		String source=driver.getPageSource();
		System.out.println(source);
	}
	
	public void verifyNavigationCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BrowserCommands commands= new BrowserCommands();
commands.browserLaunch();
//commands.verifyBrowserCommands();
commands.verifyNavigationCommands();

	}

}
