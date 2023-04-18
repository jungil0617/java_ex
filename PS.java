//Ex8

public class PS {
	String name;
	int age;
	
	public PS(String st, int n) {
		name = st;
		age = n;
	}
	
	public PS(PS p) {
		this.name = p.name;
		this.age = p.age;
	}
	
	public void printPS() {
		System.out.println("나의 이름은 " + name);
		System.out.println("나는 " + age + "살이다.");
	}

	public static void main(String[] args) {
		PS p1 = new PS("장길산", 20);
		PS p2 = new PS(p1);
		
		p1.printPS();
		p2.printPS();
	}

}
