package WebDriver_Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verify_Title {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://apps17.sutisoft.com/");
		
		String title=driver.getTitle();
		
		System.out.println(title);
		
		if (driver.getTitle().equals("Login | SutiExpense")) {
			System.out.println("Title Matched");
		} else {
			System.out.println("Title Not Matched"+driver.getTitle());
		}

	}

}
