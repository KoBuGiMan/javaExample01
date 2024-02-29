package dino;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class DinosaurIllException extends DinoWrite {

	Scanner sc = new Scanner(System.in);

	public void healthCheck() {

		try {
			File file = new File("D:\\javatest\\javahome\\dinoList.txt");
			BufferedReader br = new BufferedReader(new FileReader(file));

			String line;

			while ((line = br.readLine()) != null) {
				String[] arr = line.split(" ");
				String species = arr[0];
				String name = arr[1];
				String eat = arr[2];
				int weight = Integer.parseInt(arr[3]);
				if (eat.equals("육식")) {
					if (weight < 50 && weight > 0) {
						throw new ArithmeticException("(!)"+species + " " + name + "이(가) 현재 " + weight + "KG으로 저체중입니다.");
					} else if (weight > 300) {
						throw new ArithmeticException("(!)"+species + " " + name + "이(가) 현재 " + weight + "KG으로 과체중입니다.");
					} else {
						System.out.println(species + " " + name + "이(가) 현재 " + weight + "KG으로 정상체중입니다.");
					}
				} else if (eat.equals("잡식")) {
					if (weight < 80 && weight > 0) {
						throw new NullPointerException("(!)"+species + " " + name + "이(가) 현재 " + weight + "KG으로 저체중입니다.");
					} else if (weight > 400) {
						throw new NullPointerException("(!)"+species + " " + name + "이(가) 현재 " + weight + "KG으로 과체중입니다.");
					} else {
						System.out.println(species + " " + name + "이(가) 현재 " + weight + "KG으로 정상체중입니다.");
					}

				} else if (eat.equals("초식")) {
					if (weight < 30 && 0 < weight) {
						throw new ClassCastException("(!)"+species + " " + name + "이(가) 현재 " + weight + "KG으로 저체중입니다.");
					} else if (weight > 200) {
						throw new ClassCastException("(!)"+species + " " + name + "이(가) 현재 " + weight + "KG으로 과체중입니다.");
					} else {
						System.out.println(species + " " + name + "이(가) 현재 " + weight + "KG으로 정상체중입니다.");
					}

				}
			}

		} catch (NullPointerException e) {
			System.out.println("<<<< 잡식 >>>>");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("<<<< 육식 >>>>");
			System.out.println(e.getMessage());
		} catch (ClassCastException e) {
			System.out.println("<<<< 초식 >>>>");
			System.out.println(e.getMessage());
		}catch (Exception e) {
			System.out.println("error:"+e.getMessage());
		}

	}

}
