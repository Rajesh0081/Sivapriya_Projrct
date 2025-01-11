package WebDriver_Examples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Examples {

	public static void main(String[] args) throws Exception {
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();  // To maximize the Browser Window
		
		driver.get("https://demoqa.com/select-menu");
		
		Select lstbox=new Select(driver.findElement(By.xpath("//select[@id='oldSelectMenu']")));
		Thread.sleep(2000);
		
		//lstbox.selectByIndex(3);
		
		//lstbox.selectByVisibleText("Voilet");
		
		lstbox.selectByValue("4");
		

	}

}
