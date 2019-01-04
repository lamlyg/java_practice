package d03;

import java.util.Scanner;

public class r_pencil {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input Pencil : ");
		int pencil = input.nextInt();
		System.out.println("Input Student : ");
		int stu = input.nextInt();
		
		int result = pencil/stu;
		
		System.out.println("Result : "+result+" left : "+pencil%stu);
		
		input.close();
	}
}
