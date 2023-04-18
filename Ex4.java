
public class Ex4 {

	public static void main(String[] args) {
		
		int odd = 0;
		int four = 0;
		
		for(int i=1; i<=100; i++) {
			
			if( i%2 == 1 )     odd += i;
			else if (i%4 == 0)  four += i;
		
		}
		
		System.out.println("홀수의 합은 " + odd);
		System.out.println("4의 배수의 합은 " +four);
		
	}
}
