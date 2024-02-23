package ticket;

import java.util.Arrays;

public class TicketDetail extends TicketDate {

	private String[] nameArrList;
	private String name;
	

	public TicketDetail() {
		
		nameArrList = new String[] { "김복복" };
	}
	
	
	public String[] getNameArrList() {
		return Arrays.copyOf(nameArrList, nameArrList.length);
	}

	public void setNameArrList(String[] nameArrList) {
		this.nameArrList = nameArrList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
