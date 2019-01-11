package d10_2;

/*
 	사용자 정의 예외
 	예외클래스를 상속받아서 사용
 */

class MyException extends Exception{
	public MyException() {
		super("내가 만든 예외");
	}
}

public class MyExceptionTest {
	public static void main(String[] args) {
		try {
			method1();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void method1() throws MyException {
		throw new MyException(); //예외 객체 생성
		/*
		 	new MyException(); -> 예외객체 발생
		 	throw new MyException(); -> 예외객체를 생성해서 예외를 발생
		 */
	}
}
