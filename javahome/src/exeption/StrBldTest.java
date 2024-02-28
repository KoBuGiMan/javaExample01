package exeption;

import java.io.FileReader;
import java.io.IOException;

public class StrBldTest {

	public static void main(String[] args) {
		
		try (FileReader fileReader = new FileReader("C:yyy\\input.txt")){
			int Character;
			
			StringBuilder content = new StringBuilder();
			
			while((Character = fileReader.read()) != -1) {
				content.append((char)Character);
			}
			
			System.out.println(content.toString());
		} catch (IOException e) {
			System.out.println("Oops:"+e.getMessage());
		}
		
		
	}
	
}
