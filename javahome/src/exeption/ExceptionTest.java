package exeption;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {
		
		try {
			FileReader reader = new FileReader("C:yyy\\input.txt");
			int charater;
			while((charater = reader.read()) != -1) {
				System.out.println((char)charater);
			}
			reader.close();
		} catch (IOException e) {
			System.out.println("오류");
			e.printStackTrace();
		}
		
	}
	
	
}
