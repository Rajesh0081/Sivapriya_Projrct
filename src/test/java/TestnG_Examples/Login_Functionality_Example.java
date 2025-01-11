package TestnG_Examples;

import org.apache.commons.math3.geometry.spherical.twod.Edge;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Login_Functionality_Example {
	
	public WebDriver driver;
	
	
	@BeforeTest
	public void launch() throws Exception {
		
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\dell\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
		 driver=new EdgeDriver();
		 
		
		driver.get("https://apps17.sutisoft.com/Loginpage.jsp?lang=");
		Thread.sleep(3000);
	}
	
	@Test
	public void login() throws Exception {
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("login is successful");
	}
	
	
	@AfterTest
	public void logout() {
		driver.close();
	}
	
	@test1vcgahsvdysadfyug

}
