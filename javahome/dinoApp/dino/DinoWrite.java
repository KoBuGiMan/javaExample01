package dino;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DinoWrite {
	Scanner sc = new Scanner(System.in);
	private String species;
	private String name;
	private String eat;
	private int weight;

	public DinoWrite() {

	}

	public void writeSystem() {

		try (FileWriter fw = new FileWriter("D:\\javatest\\javahome\\dinoList.txt", true);
				BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(fw);) {

			String line;

			System.out.println("종:");
			while ((line = br2.readLine()) != null) {
				if (line.equals("esc")) {
					break;
				}
				setSpecies(line);
				bw.write(line + " ");

				System.out.println("이름:");
				line = br2.readLine();
				setName(line);
				bw.write(line + " ");

				System.out.println("식성:");
				line = br2.readLine();
				setEat(line);
				bw.write(line + " ");

				System.out.println("몸무게");
				line = br2.readLine();
				setWeight(weight);
				bw.write(line + " ");

				bw.newLine();

				System.out.println("종:");

			}
			File file = new File("D:\\javatest\\javahome\\dinoList.txt");
			BufferedReader bfr = new BufferedReader(new FileReader(file));
			String out = null;
			while ((out = bfr.readLine()) != null) {
				System.out.println(out);
			}
		} catch (IOException e) {
			System.out.println("error:" + e.getMessage());
		}
	}

	public void findWord() {
		
		String file = "D:\\javatest\\javahome\\dinoList.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(new File("D:\\javatest\\javahome\\dinoList.txt")));
				FileWriter fw = new FileWriter(file,true);
				BufferedWriter bw = new BufferedWriter(fw);)
				 {
			System.out.println("공룡종:");
			String spe = sc.next();
			System.out.println("공룡이름:");
			String name = sc.next();
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				
				String newLine = line.replace(spe, name ); 
				
			}
			
			
		} catch (IOException e) {
			System.out.println("error:" + e.getMessage());
		}
		
	}

	public static void main(String[] args) {
		DinoWrite dw = new DinoWrite();
		dw.writeSystem();
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
