package exeption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TestReader {

	
	public static void main(String[] args) {
			// Scanner와 비슷하다.
		try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//print문과 엇비슷하다
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				) {
			for(int i=1;i<5;i++) {				
				String line = br.readLine();
				bw.newLine();
				bw.write(line);
			}
			
			bw.flush();
			
		} catch (Exception e) {


		}
		
		
	}
	
}
