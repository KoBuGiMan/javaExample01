package extendtest3;

import java.util.Arrays;
import java.util.Scanner;

public class MainArea {
	Scanner sc = new Scanner(System.in);
	private int i;
	private String[][] info;
	private String name;
	private String address;
	private String num;
	private String ans;

	MainArea() {
		i = 0;
		info = new String[i][3];
	}

	public String setName(String name) {
		this.name = name;
		return this.name;
	}

	public String getName() {
		return name;
	}

	public String setAddress(String address) {
		this.address = address;
		return this.address;
	}

	public String getAddress() {
		return address;
	}

	public String setNum(String num) {
		this.num = num;
		return this.num;
	}

	public String getNum() {
		return num;
	}

	public void total(MainArea ma) {
		do {
			String[][] copyArr = lastTotal();
			System.out.println("이름을 입력해주세요: ");
			String myName = sc.next();
			setName(myName);
			System.out.println("주소를 입력하해주세요: ");
			String myAddress = sc.next();
			setAddress(myAddress);
			System.out.println("전화번호를 입력해주세요: ");
			String myNum = sc.next();
			setNum(myNum);
			String[][] newArr = Arrays.copyOf(lastTotal(),lastTotal().length + 1);
			newArr[copyArr.length] = new String[] { getName(), getAddress(), getNum() };
			copyArr = newArr;
			i++;
			System.out.println();
			System.out.println("////////////////////////////////////////////////////////////");
			for (int j = 0; j < copyArr.length; j++) {
				System.out.println(" | "+(j+1)+"번 | "+"이름: "+copyArr[j][0] +" | 주소: "+copyArr[j][1]+" | 전화번호: "+copyArr[j][2]+" | ");
			}
			System.out.println("////////////////////////////////////////////////////////////");
			System.out.println();
			System.out.println("계속 등록을 진행하시겠습니까? (네/아니요)");
			ans = sc.next();

		} while (ans.equals("네"));
		return;

	}

	public String[][] lastTotal(){
		return Arrays.copyOf(info, info.length);
	}
	
	public static void main(String[] args) {
		MainArea ma = new MainArea();
		ma.total(ma);
	}

}
