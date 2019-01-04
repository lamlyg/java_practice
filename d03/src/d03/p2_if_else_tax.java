package d03;

import java.util.Scanner;

//세금 계산 프로그램 작성
//과세 표준 기준 금액을 사용자에게 입력받음 (단위 : 만원)

//과세기준
//1000만원이하 : 9%
//1000만원초과 4000만원 이하 : 18%
//4000만원초과 8000만원 이하 : 27%
//8000만원 초과 36%

public class p2_if_else_tax {
	public static void main(String[] args) {
		double tax=0.0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input money : ");
		double money = input.nextDouble();
		
		if(money>0&&money<=1000) {
			tax = money * 0.09;
		}
		else if(/*money>1000&&*/money<=4000) {
			tax = money * 0.18;
		}
		else if(/*money>4000&&*/money<=8000) {
			tax = money * 0.27;
		}
		else if(money>8000) {
			tax = money * 0.36;
		}
		else {
			System.out.println("Error");
		}
		
		System.out.println("Result : "+ tax);
		
		input.close();
	}
}
