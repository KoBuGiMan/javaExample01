package extendExample;

class Life{
	public String toString() {
		return "생물";
	}
}

class Monkey extends Life{}
class turtle extends Life{}
class SmallMonkey extends Monkey{}
class SmallTurtle extends turtle{}

public class Animal {

	public static void main(String[] args) {
		Life life = new Life();
		Monkey monkey = new Monkey();
		turtle turtle = new turtle();
		SmallMonkey sMonkey = new SmallMonkey();
		SmallTurtle sTurtle = new SmallTurtle();
		
		System.out.println(life);
		System.out.println(monkey);
		System.out.println(turtle);
		System.out.println(sMonkey);
		System.out.println(sTurtle);
		System.out.println(new Animal().toString());
	}
	
}
