package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Login_Example {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://apps17.sutisoft.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("login is successful");
	}

}
