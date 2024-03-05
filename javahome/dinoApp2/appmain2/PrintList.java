package appmain2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import time.Birth;
import time.Schedule;

public class PrintList {
	Scanner sc = new Scanner(System.in);

	public void printing(Birth birth, Schedule sch) {
		System.out.println(birth.getDinoList());
		try {
			File file = new File("DinoAppList.txt");
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));

			if (file.createNewFile()) {
				System.out.println("파일생성");
			} else {
				String line;
				line = "------------------------------";
				bw.write(line + "\n");
				line = "      <<< 공룡리스트 >>>";
				bw.write(line + "\n");
				bw.newLine();
				System.out.println(birth.getDinoList().size());
				for (int i = 0; i < birth.getDinoList().size(); i++) {
					bw.write("("+(i+1)+"번) "+"종: "+birth.getDinoList().get(i).get(0) + " / ");
					bw.write("이름: "+birth.getDinoList().get(i).get(1) + " / ");
					bw.write("건강상태: "+birth.getDinoList().get(i).get(2) + " / ");
					bw.write("특징: "+birth.getDinoList().get(i).get(3) + " / ");
					if(birth.getDinoList().get(i).size() <5) {
						bw.write("\n");
						continue;
					}else {
						bw.write("생일: "+birth.getDinoList().get(i).get(4)+" / ");
						bw.write("\n");
					}
				}
				bw.newLine();
				line = "------------------------------";
				bw.write(line + "\n");
				bw.newLine();
				line = "------------------------------";
				bw.write(line + "\n");
				line = "      <<< 스케줄 리스트 >>>";
				bw.write(line + "\n");
				System.out.println(sch.getScheduleList());
				for (int i = 0; i < sch.getScheduleList().size(); i++) {
					line = sch.getScheduleList().get(i);
					switch (i) {
					case 0:
						bw.write("아침식사시간: " + line);
						bw.newLine();
						continue;
					case 1:
						bw.write("저녁식사시간: " + line);
						bw.newLine();
						continue;
					case 2:
						bw.write("청소시간: " + line);
						bw.newLine();
						continue;
					case 3:
						bw.write("비상훈련: " + line);
						bw.newLine();
						continue;
					case 4:
						bw.write("안전점검일: " + line);
						bw.newLine();
						continue;
					}

				}
				line = "------------------------------";
				bw.write(line);
				bw.close();
			}
		} catch (Exception e) {

		}
	}
}
