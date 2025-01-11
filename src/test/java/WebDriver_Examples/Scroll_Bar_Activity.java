package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Scroll_Bar_Activity {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();  // To maximize the browser window
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@class='btn login-btn']")).click();
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)", "");
		
		Thread.sleep(5000);
		
		JavascriptExecutor js1=(JavascriptExecutor)driver;
		
		js1.executeScript("window.scrollBy(0,-1000)", "");
		
		driver.close();  // To Close Current browser Window
		

	}

}