package WebDriver_Examples;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Window_Handles_Examplle {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://apps17.sutisoft.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("login is successful");
		
		driver.findElement(By.xpath("(//a[@role='button'])[5]")).click();
		
		driver.findElement(By.xpath("(//a[@class='dropdown-item'])[17]")).click();
		
		
		Set<String> window=driver.getWindowHandles();
		
		Iterator<String> it=window.iterator();
		
		String parent=it.next();
		String child=it.next();
		
		driver.switchTo().window(parent);

	}

}
