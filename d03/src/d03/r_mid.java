package d03;

import java.util.Scanner;

public class r_mid {

	public static void main(String[] args) {
		
		//세개의 숫자 중에 중간값을 출력
		
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, result;
		
		System.out.print("Input num1 : ");
		num1 = input.nextInt();
		System.out.print("Input num2 : ");
		num2 = input.nextInt();
		System.out.print("Input num3 : ");
		num3 = input.nextInt();
		
		// 1 2 : 큰 값
		// 1 3 : 큰 값
		// 2 3 : 큰 값
		//찾은 후 가장 작은 수가 제외된 결과가 나옴 -> 가장큰수 두번, 중간 값 한번 나옴
		
//		int a,b,c;
//		a = num1>num2?num1:num2;
//		b = num1>num3?num1:num3;
//		c = num2>num3?num2:num3;
//		
//		
//		//작은 수를 찾기
//		result = a < b ? a : b;
//		result = result < c ? result : c;
//		System.out.println("Result : "+result);
//		
		
		int max,min,mid;
		max = num1>num2?(num1>num3?num1:num3):(num2>num3?num2:num3);
		min = num1<num2?(num1<num3?num1:num3):(num2<num3?num2:num3);
		
		mid = (num1==max)?(num2==min?num3:num2):(num2==max)?(num1==min?num3:num1):(num3==max)?(num1==min?num2:num1):0;
		
		System.out.println("Result : "+mid);
		System.out.print("(if result is 0 -> default)");
		
		//다 더해서 최소값 최대값 빼면 중간값
		

	}

}
