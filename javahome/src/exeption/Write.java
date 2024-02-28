package exeption;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

	public static void main(String[] args) {
		FileReader reader = null;
		
		try {
			FileReader read = new FileReader("C:yyy\\input.txt");
			FileWriter write = new FileWriter("C:yyy\\input.txt");
			for(int j=1; j<=5;j++) {
				String con = "아야어여오요우유우이"+j+"\n" ;
				write.write(con);
			}
			write.close();
			BufferedReader br = new BufferedReader(read);
			String txt = "";
			for(int i=1; (txt = br.readLine()) != null;i++) {
				System.out.println(txt);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("error1:" + e.getMessage());
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			if(reader == null) {
				try {
					System.out.println("success");
					reader.close();
				} catch (IOException e) {
					System.out.println("error2:"+e.getMessage());
				}
			}
		}
		
		
	}
	
}
