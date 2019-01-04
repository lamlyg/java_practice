package d01;

//Scanner라는 꾸러미가 import됨
import java.util.Scanner;

public class add2 {
	public static void main(String[] args) {
		final int num = 10;
		//Scanner : 사용자로 부터 입력을 받기 위해 필요한 꾸러미
		//Scanner는 import해야만 사용가능
		//ctrl + shift + o : import 정리
		Scanner input = new Scanner(System.in);
		//System.in : 키보드로 부터 들어오는 데이터를 읽음
		
		System.out.print("Input First number : ");
		int x = input.nextInt();
		System.out.print("Input Second number : ");
		int y = input.nextInt();
		
		int sum = x+y;
		
		System.out.print("Result : ");
		System.out.println(sum);
		System.out.println("using final ex : ");
		System.out.println(num);
		
		input.close();
	}
}
