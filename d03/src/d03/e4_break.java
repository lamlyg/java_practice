package d03;

import java.util.Scanner;

//break문
//반복문의 실행을 중단하고 반복문을 빠져나감

/*
 	사용자에게 성적을 입력받아서 평균을 구하는 프로그램
 	사용자가 음수값을 입력할 때까지 점수를 반복적으로 입력받음
 	음수가 입력되면 반복을 멈추고 그때까지 사용자가 입력한 점수의 평균을 구해서 출력
 */

public class e4_break {
	public static void main(String[] args) {
		double []num=new double[100];
		double sum=0.0,result=0.0;
		int count=0;
		Scanner input = new Scanner(System.in);
		
		
		for(int i=0;i<100;i++) {
			System.out.print("Input grade : ");
			num[i]=input.nextDouble();
			
			if(num[i]<0) {
				count=i;
				for(int j=0;j<count;j++) {
					sum+=num[j];
				}
				result=(double)(sum/count);
				System.out.println("Result : "+result);
				break;
			}
		}
	}
}
