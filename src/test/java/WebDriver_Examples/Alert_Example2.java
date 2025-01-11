package WebDriver_Examples;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Example2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//ul[@class='nav nav-tabs nav-stacked']/li[2]")).click();
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Alert alt=driver.switchTo().alert();
		
		alt.dismiss();
		
		

	}

}
