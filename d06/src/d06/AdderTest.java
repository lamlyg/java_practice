package d06;

//한 파일에 public class는 두개는 안됨

/*
	메소드 오버로딩(Overloading)
	
		클래스 내에 같은 이름의 메소드를 여러개 선언하는 것
		하나의 메소드 이름에 여러기능을 담는다는 의미
		메소드 오버로딩의 조건은 매개변수의 타입, 갯수, 순서 중 하나가 달라야함
		
	
 */

//설계 클래스
class Adder{
	
	//정수 더하기
	public void add(int a, int b) {
		System.out.println("정수 더하기 : "+(a+b));
	}
//	public void add(int a, double b) {
//		System.out.println("정수 더하기 : "+(a+b));
//	}	
//	public void add(double a, int b) {
//		System.out.println("정수 더하기 : "+(a+b));
//	}
	
	//실수 더하기
	public void add(double a, double b) {
		System.out.println("실수 더하기 : "+(a+b));
	}
}

//살행 클래스
public class AdderTest {
	public static void main(String[] args) {
		Adder adder = new Adder();
		adder.add(3, 4);
		adder.add(3.1, 2.5);
	}
}
