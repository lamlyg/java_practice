package d01;

import java.util.*;
public class Rec {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Input w : ");
		double w = sc.nextDouble();
		System.out.print("Input h : ");
		double h = sc.nextDouble();
		double area = w*h;
		double perimeter = 2*w + 2*h;
		
		System.out.print("area : ");
		System.out.println(area);
		System.out.print("perimeter : ");
		System.out.println(perimeter);
		
		sc.close();
	}
}
