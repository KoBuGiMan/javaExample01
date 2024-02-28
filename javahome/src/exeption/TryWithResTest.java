package exeption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResTest {

	public static void main(String[] args) {
			// FileReader 는 단순히 파일을 읽는 역활(어떤 파일을 읽을지를 입력)
		try (FileReader fileReader = new FileReader("C:yyy\\input.txt");
				
				// BufferReader는 scanner기능과 같아 값을 입력할수있다 
				// 보통 스캐너는 (System.in)을 쓰지만 여기선 값을 가져와 입력할거기때문에
				// (fileReader)를 가져와 그대로 입력시킨다.
				BufferedReader buff = new BufferedReader(fileReader);
				
				// FileWriter는 어떤파일에 쓸것인지를 정한다 파일이 없으면 파일을 생성한다.
				FileWriter writer = new FileWriter("output2.txt");
				
				// BufferWiter는 print문과 비슷하다. 입력받은 값을 출력하는 역활을 한다.
				// 위에서 받은값을 output2.txt에서 출력하여 저장한다.  
				BufferedWriter buffW = new BufferedWriter(writer)) {
			
			//문자를 입력할거면 String,숫자를 쓸거면 int로 쓰고, Integer.parseInt를 사용하면된다.
			String line;
			
			// line은 buff.readLine()의 값을 부여받게되고 받은 문장이 null일때까지 반복문을 실행한다.
			while ((line = buff.readLine()) != null) {
			
				// toUpperCase는 문자들을 대문자로 변환한다. 한글을 쓸때는 효력이 없다.
				//String upperLine = line.toUpperCase();
				// BufferWrite에 line을 입력받아 저장한다. (한줄씩 저장된다)
				buffW.write(line);
				
				// newLine은 엔터의 기능을 한다. 기본적으로 띄어쓰기는 인식을 하지만 엔터는 인식을 못한다.
				buffW.newLine();
			}
			// 예외처리
		} catch (IOException e) {

			System.out.println("Ooops:" + e.getMessage());

		}

	}

}
