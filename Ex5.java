import java.util.Scanner;
import java.util.InputMismatchException;

public class Ex5 {

	public static void main(String[] args) {
		
		char day[] = {'일', '월', '화', '수', '목', '금', '토'};
		int number = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("정수를 입력하세요.");
			
			try {
			number = scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("경고! 수를 입력하지 않았습니다.");
				scanner.next();
				continue;
			}
			
			if(number < 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			else {
				System.out.println(day[number%7]);
			}
			
			
		}
		
		scanner.close();
		
	}

}
