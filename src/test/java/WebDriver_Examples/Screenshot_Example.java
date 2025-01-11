package WebDriver_Examples;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_Example {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		Thread.sleep(2000);
		
		
		TakesScreenshot tss=(TakesScreenshot)driver;
		
		File src=tss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File("C:\\Users\\dell\\Desktop\\Manikanta.jpg");
		
		Files.copy(src, dest);
		
		
		

	}

}
