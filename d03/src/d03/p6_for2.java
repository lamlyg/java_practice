package d03;

import java.util.Scanner;
//숫자로 이루어진 문자열 str이 있을 때,
//각 자리의 합을 더한 결과를 출력하는 코드를 완성하라
//만일 문자열이 "12345"라면 '1+2+3+4+5'의 결과인 15를 출력이 출력되어야 한다.

public class p6_for2 {
	public static void main(String[] args) {
		String str;
		int [] num = new int[100];
		int sum=0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input str : ");
		str=input.nextLine();
		
		for(int i=0;i<str.length();i++) {
			num[i]=Integer.parseInt(str.substring(i,i+1));//String에서 int로 변환 + 문자열자르기함수
		}
		
		for(int j=0;j<str.length();j++) {
			System.out.print(num[j]);
			sum+=num[j];
			if(j==str.length()-1)
				break;
			else
				System.out.print("+");
		}
		System.out.println("="+sum);	
		input.close();

		//Answer-ex
//		String str = "12345";
////		System.out.println(str.length());
////		System.out.println(str.charAt(0));
//		
//		//char '0'은 유니코드 48
//		//sum2 int형
//		//int형과 char연산의 연산은 int형이 데이터 크기가 크르모 int형으로 형변환
//		//그러므로 0 + '1'의 결과가 49
//		
//		int sum2 = 0;
//		for(int j =0;j<str.length();j++) {
//			sum2 = sum2 + str.charAt(j) - 48;
//			System.out.println(sum);
//		}
		
	}
}
