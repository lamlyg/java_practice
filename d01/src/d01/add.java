package d01;

import java.util.*;

public class add {
	public static void main(String[] args) {
		//변수 선언 
		int a, b, result;
		String str = "hello" + "world";
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		b = input.nextInt();
		
		result = a+b;
		
		System.out.println(result);
		System.out.println(str);
		
		input.close();
	}
}
