package ticket;

import java.time.LocalDate;
import java.util.Arrays;

public class TicketDate {

	LocalDate local = LocalDate.now();
	private int year;
	private int month;
	private int day;
	private int peopleNum;
	private int[][] numArrList;
	private int totalPrice;
	private int count;
	private int i2;

	int price = 5000;


	public TicketDate() {
		i2 = 0;
		count = 1;
		year = local.getYear();
		month = local.getMonthValue();
		day = local.getDayOfMonth();
		numArrList = new int[][] { { this.year, this.month, this.day ,3,15_000} };

	}
	public int getCount() {
		return count;
	}
	
	public void setCount(int count) {
		this.count = count;
	}
	
	public int getI2() {
		return i2;
	}
	
	public void setI2(int i2) {
		this.i2 = i2;
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getPeopleNum() {
		return peopleNum;
	}

	public void setPeopleNum(int peopleNum) {
		this.peopleNum = peopleNum;
	}

	public int[][] getNumArrList() {
		return Arrays.copyOf(numArrList, numArrList.length);
	}

	public void setNumArrList(int[][] numArrList) {
		this.numArrList = numArrList;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

}
