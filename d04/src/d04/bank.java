package d04;
import java.util.Scanner;

//while문과 Scanner를 이용해서 키보드로부터 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 코드를 작성하시오. 
public class bank {
public static void main(String[] args) {
		
		int sel=0;
		int income=0, outcome=0, left=0;
		
		Scanner input = new Scanner(System.in);
		
		
		while(sel!=4) {
			System.out.println("");
			System.out.println("----------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("----------------------------------------------");
			
			System.out.print("선택> ");
			sel = input.nextInt();			
			switch (sel) {
			case 1:
				System.out.print("예금액> ");
				income = input.nextInt();
				left+=income;
				break;
			case 2:
				System.out.print("출금액> ");
				outcome = input.nextInt();
				left-=outcome;
				break;
			case 3:
				System.out.println("잔고> "+left);
				
				break;
			default:
				break;
			}
		}
		System.out.println("");
		System.out.println("프로그램 종료");
		
		
		
		
		
		
		input.close();
	}
}
