package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload_Example {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.name("username")).sendKeys("rajeshv@sutisoft.in");
		
		driver.findElement(By.id("userpassword")).sendKeys("test@1234");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("login is successful");
		
		driver.findElement(By.xpath("(//img[@id='acuserImg'])[1]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//a[@title='My Account']")).click();
		
		driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\dell\\Downloads\\Rajesh_EAadhar_11272024_033218.pdf");
		
		//"C:\\Users\\dell\\Downloads\\Rajesh_EAadhar_11272024_033218.pdf"
	}

}
