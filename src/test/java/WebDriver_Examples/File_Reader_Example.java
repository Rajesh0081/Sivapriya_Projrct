package WebDriver_Examples;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class File_Reader_Example {

	public static void main(String[] args) throws Exception {
		
		FileReader file=new FileReader("C:\\Users\\dell\\Desktop\\personal_7pm.txt");
		
		
		BufferedReader reader=new BufferedReader(file);
		
		String line;
		
		while ((line=reader.readLine())!=null) {
			System.out.println(line);
		}
		
		
	}

}
