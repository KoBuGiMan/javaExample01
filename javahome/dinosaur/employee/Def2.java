package employee;

import java.util.Arrays;
import java.util.Scanner;

interface Rule2{
	public String[][]setEmList(String[][] arr,String[] arr2);
	public String[]setAll();
}

public class Def2 implements Rule2{
	Scanner sc = new Scanner(System.in);
	
	private String job;
	private String name;
	private String age;
	private String phone;
	private String work;
	
	public Def2(){

	}
	

	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAge() {
		return age;
	}


	public void setAge(String age) {
		this.age = age;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}


	public String getWork() {
		return work;
	}


	public void setWork(String work) {
		this.work = work;
	}


	@Override
	public String[][] setEmList(String[][] arr, String[] arr2) {
		String[][] newArr = Arrays.copyOf(arr, arr.length + 1);
		try {
			for (int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			newArr[arr.length] = arr2;
		} catch (Exception e) {
			newArr[0] = arr2;
		}

		return newArr;

	}

	public String[] setAll() {
		System.out.println("직업을 입력");
		setJob(sc.next());
		System.out.println("이름을 입력");
		setName(sc.next());
		System.out.println("나이을 입력");
		setAge(sc.next());
		System.out.println("전화번호를 입력");
		setPhone(sc.next());
		sc.nextLine();
		System.out.println("작업내용을 입력");
		setWork(sc.nextLine());
		String[] arr2 = new String[] { getJob(), getName(), getAge(), getPhone(),getWork() };
		return arr2;
	}
	



}
