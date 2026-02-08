package ShammiPackage;

import org.testng.annotations.*;



public class TestNG1 {
	@Test
	public void cTest1() {
		System.out.println("Test1");
		
	}
	@AfterMethod		
	public void AfMethod() {
		System.out.println(" I am AfterMethod");
		
	}
	
	@BeforeMethod
	public void BefMethod() {
		System.out.println(" I am BeforeMethod");
		
	}
	@BeforeSuite	
	public void BeforeSuite() {
		System.out.println(" I am BeforeSuite");
		
	}
	@AfterClass
	public void AfterClass() {
		System.out.println(" I am AfterClass");
		
	}
	@BeforeClass	
	public void BeforeClass() {
		System.out.println(" I am BeforeClass");
		
	}
	@AfterTest	
	public void AfterTest() {
		System.out.println(" I am AfterTest");
		
	}
	@BeforeTest
	public void BeforeTest() {
		System.out.println(" I am BeforeTest");
		
	}
	@Parameters({"Fname"})
	@Test
	public void bTest2(String Myname) {
		System.out.println("Test2"+ Myname);
		
	}
	public void aGoodTest() {
		System.out.println("GoodTest");
	}
	
}
