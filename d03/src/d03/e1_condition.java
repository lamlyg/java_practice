package d03;

import java.util.Scanner;

public class e1_condition {
	public static void main(String[] args) {
		
		//switch문
		//여러가지 중에서 하나를 선택하는데 사용
		//if문과 같은 조건문이 아니라 특정 값으로 결정되는 식이 온다.
		
		int num;
		System.out.println("숫자를 입력 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		switch (num) {//switch문이 지켜볼 변수 : num
		case 1://num변수 안의 내용물이 1일때 실행
			System.out.println("하나");
			break;
		case 2:
			System.out.println("둘");			
			break;
		case 3:
			System.out.println("셋");						
			break;
		case 4:
			System.out.println("넷");									
			break;

		default:
			break;
		}
		
		sc.close();
	}
}
