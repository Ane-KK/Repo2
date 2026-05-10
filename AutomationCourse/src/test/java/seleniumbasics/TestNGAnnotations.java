package seleniumbasics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotations extends Base{
	
	@Test
	public void sampleTestCase()
	{
		System.out.println("This is sample test case");
	}

	@Test
	public void sampleTestCase2()
	{
		System.out.println("Aneesh");
	}
	@BeforeMethod
	public void before()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void after()
	{
		System.out.println("Afterod");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("after class");
	}
	@BeforeSuite
	public void beforesuite()
	{
		System.out.println("before suite");
	}
	@AfterSuite
	public void aftersuite()
	{
		System.out.println("after suite");
	}
	
}


