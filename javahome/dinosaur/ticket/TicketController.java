package ticket;

import java.util.Arrays;
import java.util.Scanner;

public class TicketController extends TicketDetail {

	Scanner sc = new Scanner(System.in);

	public int[] plusTicketInfo() {
		System.out.println();
		System.out.println("인원 수를 입력해주세요:");
		setPeopleNum(sc.nextInt());
		setTotalPrice(getPeopleNum() * price);
		setYear(local.getYear());
		setMonth(local.getMonthValue());
		setDay(local.getDayOfMonth());

		int[] newArr1 = new int[] { getYear(), getMonth(), getDay(), getPeopleNum(), getTotalPrice() };
		return newArr1;
	}

	public String plusName() {
		System.out.println("<<<<<< 티켓발권 >>>>>>");
		System.out.println();
		System.out.println("성함을 입력해주세요:");
		setName(sc.next());
		return getName();
	}

	public void addTicket() {
		String ans = null;
		do {
			String[] newArr1 = Arrays.copyOf(getNameArrList(), getNameArrList().length + 1);
			newArr1[getNameArrList().length] = plusName();
			setNameArrList(newArr1);

			int[][] newArr2 = Arrays.copyOf(getNumArrList(), getNumArrList().length + 1);
			newArr2[getNumArrList().length] = plusTicketInfo();
			setNumArrList(newArr2);
			for (int i = 0; i < getNameArrList().length; i++) {
				System.out.println();
				System.out.println((i+1)+"번 손님------------------------------------------------");
				System.out.println();
				System.out.println("이름:" + getNameArrList()[i] + "/인원:" + getNumArrList()[i][3] + "명/총액:"
						+ getNumArrList()[i][4] + "/날짜:" + getNumArrList()[i][0] + "-" + getNumArrList()[i][1] + "-"
						+ getNumArrList()[i][2]);
				System.out.println();
				System.out.println("------------------------------------------------------");
				
			}
			
			System.out.println("추가구매 하시겠습니까? (네/아니요)");
			ans = sc.next();
		} while (ans.equals("네"));
		
	}

	public void removeTicket() {
		System.out.println("성함을 입력해주세요:");
		String name = sc.next();
		System.out.println("인원을 입력해주세요:");
		int peopleNum = sc.nextInt();

		for (int i = 0; i < getNameArrList().length; i++) {
			if (name.equals(getNameArrList()[i])) {
				if (peopleNum == getNumArrList()[i][3]) {
					String[] newArr1 = new String[getNameArrList().length - 1];
					int[][] newArr2 = new int[getNumArrList().length - 1][];

					System.arraycopy(getNameArrList(), 0, newArr1, 0, i);
					System.arraycopy(getNameArrList(), i + 1, newArr1, i, getNameArrList().length - i - 1);
					setNameArrList(newArr1);

					System.arraycopy(getNumArrList(), 0, newArr2, 0, i);
					System.arraycopy(getNumArrList(), i + 1, newArr2, i, getNumArrList().length - i - 1);
					setNumArrList(newArr2);
					
					for (i = 0; i < getNameArrList().length; i++) {
						System.out.println("이름:" + getNameArrList()[i] + " 인원:" + getNumArrList()[i][3] + "명 총액:"
								+ getNumArrList()[i][4] + " 날짜:" + getNumArrList()[i][0] + "-" + getNumArrList()[i][1] + "-"
								+ getNumArrList()[i][2]);
					}
					return;
					
				}
			}
		}
		System.out.println("");
	}

}
