package TestnG_Examples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Example1 {
	
	
	
	@BeforeSuite
	
	public void m1() {
		System.out.println("This is @BeforeSuite");
	}
	
	
	@AfterSuite
	public void m2() {
		System.out.println("This is @AfterSuite");
	}
	
	
	@AfterTest
	public void m3() {
		System.out.println("This is @AfterTest");
	}
	
	
	@BeforeTest
	public void m4() {
		System.out.println("This is @BeforeTest");
	}
	
	
	@BeforeMethod
	public void m5() {
		System.out.println("This is @BeforeMethod");
	}
	
	
	
	@AfterMethod
	public void m6() {
		System.out.println("This is @AfterMethod");
	}
	
	
	@BeforeClass
	public void m7() {
		System.out.println("This is @BeforeClass");
	}
	
	
	@AfterClass
	public void m8() {
		System.out.println("This is @AfterClass");
	}
	
	@Test
	
	public void m10() {
		System.out.println("THis is main method");
	}
	
	@Test
	
	public void m11() {
		System.out.println("THis is main method2");
	}
	
	

}
