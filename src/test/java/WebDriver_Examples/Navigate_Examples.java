package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Examples {

	public static void main(String[] args) throws Exception  {
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://apps17.sutisoft.com/");
		
		Thread.sleep(13000);
		
		driver.navigate().refresh();
		
		//Thread.sleep(5000);
		
		driver.navigate().back();
		//Thread.sleep(3000);
		
		driver.navigate().forward();

	}

}
