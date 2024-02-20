package extendExample;

class One{
	private String name;
	private String id;
	public One(String name,String id) {
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "이름:"+name+"\n"+"아이디:"+id;
	}
}

class Two extends One{
	private String password;
	public Two(String name,String id,String password){
		super(name,id);
		this.password = password;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\n"+"비밀번호:"+password;
	}
}

class Three extends Two{
	private String address;
	private String phone;
	public Three(String name,String id,String passwoed, String address, String phone){
		super(name, id, passwoed);
		this.address = address;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return super.toString()+ "\n"+"주소:"+address+"\n"+"전화번호:"+phone;
	}
}


public class SuperTest {
	
	public static void main(String[] args) {
		
		Three three = new Three("벅벅이", "bugbug", "bugbugking", "대전광역시", "010-3333-4444");
		System.out.println(three.toString());
		
	}

}
