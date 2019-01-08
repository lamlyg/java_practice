package d07;

import java.util.Scanner;

//실행클래스-ShapeInfo의 실행클래스

public class TestInfo{
	public static void main(String[] args) {
		ShapeInfo s = new ShapeInfo();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Input line-a (line1) : ");
		double a = input.nextDouble();
		s.setA(a);
		System.out.println("Input line-b (line2) : ");
		double b = input.nextDouble();	
		s.setB(b);
		System.out.println("Input height : ");
		double h = input.nextDouble();		
		s.setH(h);
		
		s.InputInfo(a, b);
		
		s.InputInfo(a, b, h);
		
		input.close();
	}
}

