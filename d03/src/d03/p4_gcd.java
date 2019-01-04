package d03;

import java.util.Scanner;

public class p4_gcd {
	public static void main(String[] args) {
		int a,b;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input two numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		a=num1;
		b=num2;

// Answer1
//		int x,y,r;
//		
//		if(num1>num2) {
//			x=num1;
//			y=num2;
//		}
//		else {
//			x=num2;
//			y=num1;
//		}
//		
//		while(y!=0) {
//			r=x%y;
//			x=y;
//			y=r;
//		}
//			System.out.println("gcd is "+r);
		
// 내가 구현한 코드
		if(num1>=num2) {
			while(num1>num2) {
				num1-=num2;
			}
			if(a%num1!=0||b%num1!=0) num1=1;
			System.out.println("gcd is "+num1);
		}
		else {
			while(num2>num1) {
				num2-=num1;
			}
			if(a%num2!=0||b%num2!=0) num2=1;
			System.out.println("gcd is "+num2);
		}
		
// Answer2
//		while(a!=b) {
//			if(a>b)
//				a-=b;
//			else
//				b-=a;
//		}
//		System.out.println("gcd is "+a);
		
		
		input.close();
	}
}
