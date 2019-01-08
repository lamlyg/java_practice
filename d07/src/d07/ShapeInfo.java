package d07;

import java.util.Scanner;

//메소드 오버로딩 문제->ex) println이 대표적인 오버로딩

//사각형의 면적과 육면체의 면적을 구하는 ShapeInfo 클래스를 설계하세요!

//구현클래스-ShapeInfo
public class ShapeInfo {
	//필드
	private double a;//가로
	private double b;//세로
	private double h;//높이
	
	//getter
	public double getA() {
		return a;
	}
	public void setA(double a) {
		this.a = a;
	}
	public double getB() {
		return b;
	}
	//setter
	public void setB(double b) {
		this.b = b;
	}
	public double getH() {
		return h;
	}
	public void setH(double h) {
		this.h = h;
	}
	
	//method
	public void InputInfo(double a, double b) {
		System.out.println("Area of Square : "+(a*b));
	}
	public void InputInfo(double a, double b, double h) {
		System.out.println("Area of hexahedron : "+(2*(a*b+b*h+a*h)));
	}
	
	
}

