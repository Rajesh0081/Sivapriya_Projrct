package TestnG_Examples;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_2 {
	
	
	@BeforeTest
	public void beforetest() {
		System.out.println("This is a before test");
	}
	
	
	@AfterTest
	
	public void aftertest() {
		System.out.println("This is a after test");
	}
	
	
	@Test(enabled = true)
	public void main1() {
		System.out.println("This is a main method1");
	}
	
	
	@Test(priority = 10)
	public void main2() {
		System.out.println("This is a main method2");
	}

}
