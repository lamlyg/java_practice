package d02;

import java.util.Scanner;

public class circleArea {
	public static void main(String[] args) {
		
		final double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input r :");
		double r=input.nextDouble();
		
		System.out.print("Area :");
		System.out.println(r*r+"파이");
		System.out.println(r*r*pi);
		
		input.close();
	}
}
