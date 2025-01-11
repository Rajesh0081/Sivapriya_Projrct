package WebDriver_Examples;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Robot_Actions {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		Thread.sleep(2000);
		
		Robot r=new Robot();
		
		r.keyPress(KeyEvent.VK_SHIFT);
		
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.findElement(By.name("userpassword")).sendKeys("test@1234");
		
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		

	}

}
