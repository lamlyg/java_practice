package d03;

import java.util.Scanner;

//일당 구하기
//시간 당 8350원
//하루에 일하는 시간을 입력받기
//8시간초과 근무시에는 초과근무시간의 1.5배 지급

public class p1_if_pay {
	public static void main(String[] args) {
		final int MINMONEY = 8350;
		double getmoney=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("하루에 일하는 시간 : ");
		double time = input.nextDouble();
		
		if(time>8) {
			getmoney = (time-8)*1.5*MINMONEY + 8*MINMONEY; //초과근무에 대한 시간만 계산되어짐!
		}
		else {
			getmoney=(double)(time*MINMONEY);
		}
		System.out.print("일당 : "+getmoney+"원");
		
		
		input.close();
	}
}
