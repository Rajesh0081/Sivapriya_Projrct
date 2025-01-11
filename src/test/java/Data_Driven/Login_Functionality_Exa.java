package Data_Driven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;

public class Login_Functionality_Exa {
	
  public WebDriver driver;
	
	@BeforeClass
	public void launch() {
		 driver=new EdgeDriver();
		driver.get("https://apps17.sutisoft.com/Loginpage.jsp?lang=");
	}
	
	
	@Test
	public void login() throws Exception {
		FileInputStream  fis=new FileInputStream("C:\\Users\\dell\\Desktop\\Book1.xls");
		
		Workbook wb=Workbook.getWorkbook(fis);
		
		Sheet s=wb.getSheet("Sheet1");
		
		String un=s.getCell(0, 1).getContents();
	    String pw=s.getCell(1, 1).getContents();
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys(un);
		
		driver.findElement(By.id("userpassword")).sendKeys(pw);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("login is successful");
	}
	
	
	
	@AfterClass
	public void logout() {
		driver.close();
	}
	
	

}
