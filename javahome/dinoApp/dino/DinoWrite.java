package dino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public abstract class DinoWrite {

	public DinoWrite() {

	}
	Scanner sc = new Scanner(System.in);

	public void writeSystem() {
		try (FileWriter fw = new FileWriter("D:\\javatest\\javahome\\dinoList.txt", true);
				BufferedReader br2 = new BufferedReader(new FileReader(new File("D:\\javatest\\javahome\\dinoList.txt")));
				BufferedWriter bw = new BufferedWriter(fw);) {

			String line;

			while ((line = br2.readLine()) != null) {

				System.out.println("종:");
				line = sc.next();
				bw.write(line + " ");

				System.out.println("이름:");
				line = sc.next();
				bw.write(line + " ");

				System.out.println("식성:");
				line = sc.next();
				bw.write(line + " ");

				System.out.println("몸무게");
				line = sc.next();
				bw.write(line + " ");

				bw.newLine();
				
				System.out.println("다시?");
				int a = sc.nextInt();
				if(a == 1) {
					break;
				}
				
				System.out.println("종");

			}

			File file = new File("D:\\javatest\\javahome\\dinoList.txt");
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			String out = null;
			while ((out = bfr.readLine()) != null) {
				System.out.println(out);
			}
			bfr.close();
		} catch (IOException e) {
			System.out.println("error:" + e.getMessage());
		}
	}

	public void findWord() {

		try {
			File file = new File("D:\\javatest\\javahome\\dinoList.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));
			if (file.exists() == false) {
				System.out.println("파일이 없습니다.");
			}

			System.out.println("종:");
			String spe = sc.next();
			System.out.println("이름:");
			String name = sc.next();

			StringBuilder build = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				String species = arr[0];
				String nameFix = arr[1];
				if (spe.equals(species) && name.equals(nameFix)) {
					System.out.println("수정 종:");
					String spe2 = sc.next();
					System.out.println("수정 이름:");
					String name2 = sc.next();
					System.out.println("수정 식성");
					String eat2 = sc.next();
					System.out.println("수정 몸무게:");
					int weight2 = sc.nextInt();

					line = spe2 + " " + name2 + " " + eat2 + " " + weight2;
				}
				build.append(line).append("\n");
			}

			PrintWriter pw = new PrintWriter(new FileWriter(file));
			pw.print(build.toString());

			System.out.println("완료");
			pw.close();
			br.close();
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}

	}

	public void removeDino() {

		try {
			File file = new File("D:\\javatest\\javahome\\dinoList.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));

			if (file.exists() == false) {
				System.out.println("파일이 없습니다.");
			}

			System.out.println("삭제 종:");
			String dSpe = sc.next();
			System.out.println("삭제 이름:");
			String dName = sc.next();
			StringBuilder sb = new StringBuilder();
			String line;

			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				String specise = arr[0];
				String name = arr[1];
				if (!specise.equals(dSpe) || !name.equals(dName)) {
					
					sb.append(line).append("\n");
				}
				
			}
			br.close();
			PrintWriter pw = new PrintWriter(new FileWriter(file));
			pw.print(sb.toString());
			pw.close();
		} catch (IOException e) {
			System.out.println("error: " + e.getMessage());
		}

	}

	public static void main(String[] args) {
		DinosaurIllException dw = new DinosaurIllException() ;
		Scanner sc = new Scanner(System.in);
		int a = 1;
		do{
			System.out.println("입력");
			int d = sc.nextInt(); 
			if(d == 1) {
				dw.writeSystem();				
			}else if(d == 2) {
				dw.removeDino();
				
			}else if(d == 3) {
				dw.healthCheck();
			}
			
		}while(a == 1);
		sc.close();
	}


}
