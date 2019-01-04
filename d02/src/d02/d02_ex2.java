package d02;

import java.util.Scanner;

public class d02_ex2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input upper line : ");
		double up=input.nextDouble();
		System.out.print("Input under line : ");
		double down=input.nextDouble();
		System.out.print("Input height : ");
		double h=input.nextDouble();
		
		double s = (up+down)*h/2;
		
		System.out.print("Area : ");
		System.out.print(s);
		
		input.close();
	}
}
