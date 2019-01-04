package d02;

import java.util.Scanner;

public class p3_YunYear {
	public static void main(String[] args) {
		/*
		 p3_YunYear
		 사용자에게 연도를 입력받아서 윤년인지를 검사하는 프로그램
		 윤년이 되려면 먼저 4의 배수이어야 하고, 동시에 100의 배수가 아니어야 함
		 또 400의 배수는 무조건 윤년
		 */
		String result;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년도 입력");
		int year = sc.nextInt();
		
		if(year%400==0) {
			result="윤년";
		}
		else {
			result = (year%4==0)?((year%100!=0)?"윤년":"윤년이 아님"):"윤년이 아님";			
		}
		
//		((year%4==0)&&(year%100!=0))||(year%400==0)?"윤년":"윤년이 아님";
		
		System.out.println(result);
		
		
		
		sc.close();
		
	}
}
