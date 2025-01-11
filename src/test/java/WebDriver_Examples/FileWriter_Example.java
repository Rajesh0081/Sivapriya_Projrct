package WebDriver_Examples;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_Example {

	public static void main(String[] args) throws Exception {
		
		FileWriter file=new FileWriter("C:\\Users\\dell\\Desktop\\Saikumar.txt");
		
		file.write("I am SaiKumar");
		
		file.write("\n");
		
		file.write("Manikanta");
		
		
		file.close();
		

	}

}
