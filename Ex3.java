import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("국어 성적을 입력하세요.");
		int korean = scanner.nextInt();
		
		System.out.println("영어 성적을 입력하세요.");

		int english = scanner.nextInt();
		System.out.println("수학 성적을 입력하세요.");
		int math = scanner.nextInt();
		
		int score = korean + english + math;
		
		if(score > 270) 	  System.out.println('A');
		else if (score > 240) System.out.println('B');
		else if (score > 210) System.out.println('C');
		else if (score > 180) System.out.println('D');
		else 				  System.out.println('F');
		
		scanner.close();
	}

}
