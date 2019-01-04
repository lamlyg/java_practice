package d01;

import java.util.*;
public class CircleArea {
	public static void main(String[] args) {
		final double pi = 3.14;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input r : ");
		double r = input.nextDouble();
		double area = r*r*pi;
		
		System.out.print("area of circle : ");
		System.out.println(area);
		System.out.print("area of circle : ");
		System.out.println(r*r + "파이");
		
		input.close();
	}
}
