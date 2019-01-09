package d08;

/*
 	원의 지름구하기
 	
 	*메소드 오버라이딩
 		-상속된 메소드의 내용이 자식클래스에 맞지 않을 경우, 자식클래스에서 동일한 메소드를 정의하는 것
 		-(규칙) 부모의 메소드와 동일한 리턴타입 + 메소드이름 + 매개변수 리스트 + 접근제한을 더 강하게 오버라이딩할 수 없음
 	*메소드 오버로딩
 		-클래스 내에 같은 이름의 메소드를 여러개 선언하는 것
		-하나의 메소드 이름에 여러기능을 담는다는 의미
		-(규칙) 메소드 오버로딩의 조건은 매개변수의 타입, 갯수, 순서 중 하나가 달라야함
*/

//계산기
class Calc {
//	private double r;
	public double areaCircle(double r) {
		return r*r*3.14;
	}
}

//컴퓨터
class Computer extends Calc {//상속 & 메소드 오버라이딩(메소드 재정의)

	public double areaCircle(double r) {
		return r*r*Math.PI;
	}
	
//	@Override
//	public double areaCircle(double r) {
//		// TODO Auto-generated method stub
//		return super.areaCircle(r);
//	}
	
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
