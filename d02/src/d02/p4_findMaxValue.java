package d02;

//사용자로 부터 두개의 숫자를 입력받아서
//더 큰 숫자를 출력하는 프로그램 작성

//세개의 숫자 입력 -> 가장 큰 숫자

//->중간값구하기
import java.util.Scanner;

public class p4_findMaxValue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input 3 numbers : ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		int temp1,temp2,temp3;
		int mid;
		
		temp1 = (num1>num2)?(num1):num2;
		temp3 = (num1<num2)?(num1):num2;
		temp2 = (temp1<num3)?temp1:num3;
		mid = (temp3>temp2)?temp3:temp2;
		
		System.out.print("mid value is : "+mid);

		
		input.close();
	}
}
