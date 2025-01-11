package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar_Example {

	public static void main(String[] args) throws Exception {
		
	String	month="November 1994";
		
		
		WebDriver driver=new ChromeDriver();
		

		driver.get("https://apps17.sutisoft.com");
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("login is successful");
		
		driver.findElement(By.xpath("(//ul[@id='_helpid']/li[3])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='fromDate']")).click();
		
		while(true) {
			String text=driver.findElement(By.xpath("(//th[@class='datepicker-switch'])[1]")).getText(); // current month and year
			
			if(text.matches(month)) {
				break;
			}
			else {
				driver.findElement(By.xpath("(//th[@class='prev'])[1]")).click();
			}
		}
		
		driver.findElement(By.xpath("(//td[@class='day'])[1]")).click();
	}

}
