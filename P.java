//Ex7

public class P {
	
	String name;
	int age;
	
	public P(String x, int y) {
		name = x;
		age = y;
	}
	
	public void printP() {
		System.out.println("나의 이름은 " + name);
		System.out.println("나는 " + age + "살이다.");
	}

	public static void main(String[] args) {
		P p1 = new P("홍길동", 22);
		P p2 = new P("장길산", 40);
		
		p1.printP();
		p2.printP();
	}

}
