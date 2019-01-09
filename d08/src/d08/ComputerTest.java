package d08;

/*
 	원의 지름구하기
*/

//계산기
class Calc {
//	private double r;
	public double areaCircle(double r) {
		return r*r*3.14;
	}
}

//컴퓨터
class Computer extends Calc {//상속 & 메소드 오버라이딩
	public double areaCircle(double r) {
		return r*r*Math.PI;
	}
	
}

//실행클래스
public class ComputerTest {
	public static void main(String[] args) {
		Calc c = new Calc();
		Computer com = new Computer();
		System.out.println(c.areaCircle(5));
		System.out.println(com.areaCircle(5));
		System.out.println(Math.PI);
	}
}
