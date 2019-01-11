package d10_2;
/*
	ArithmeticException을 상속받아 만든 사용자 정의 예외 클래스 생성
	DivideByZeroException 클래스

	두개의 정수를 나누는 메소드 div 설계

	두개의 정수를 매개변수로 받아서 나누고 결과 리턴
	두번째 정수가 0이면 예외를 발생
 */

class DivideByZeroException extends ArithmeticException{
	public DivideByZeroException() {
		super("0으로 나눌 수 없음!!!");		
	}
}

public class MyExceptionTest2 {
	public static void main(String[] args) {
		try {
			div(10,2);
			div(10,0);
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static double div(int num1, int num2) throws DivideByZeroException{
		if(num2==0) throw new DivideByZeroException();
		return num1/num2;
	}
}
