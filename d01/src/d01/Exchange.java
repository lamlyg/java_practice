package d01;
import java.util.*;
//사용자가 입력하는 원화를 달러화로 변환하는 프로그램 변환
//달러에 대한 환율 (1120원)은 실수형 변수에 저장
//사용자로부터 받은 원화는 정수형 변수에 저장
//원화를 환율로 나눠서 사용자가 입력한 원화가 몇 달러에 해당하는지 계산
public class Exchange {
	public static void main(String[] args) {
		final double $dollar = 1120.0;
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input won : ");
		int won = input.nextInt();
		double dollar = won / $dollar;
		
		System.out.print("Result Exchange : ");
		System.out.println(dollar);
		System.out.printf("%f",dollar);
		//%d : 부호가 있는 정수
		//%f : 실수
		input.close();
	}
}
