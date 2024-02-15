package extendtest3;

enum Season{
	SPRING("봄"),
	SUMMER("여름"),
	FALL("가을"),
	WINTER("겨울");
	
	private String season;
	
	private Season(String season) {
		this.season = season;
	}
	
	public String getSeason() {
		return season;
	}
}

public class EnumTest2 {
	
	public static void main(String[] args) {
		Season summer = Season.SUMMER;
		System.out.println(summer.name());
		System.out.println(summer.getSeason());
	}

}
