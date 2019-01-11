package d10_2;

import java.io.IOException;

/*
 	예외 처리 방법
 	1. 예외를 잡아서 그자리에서 처리하는 방법 -> (ex) try-catch문
 	2. 메소드가 예외를 발생시킨다고 기술하는 방법

 */
public class ExceptionThrowsTest {
	public static void main(String[] args) {
		try {
			System.out.println(readString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//메소드를 호출한 곳에서 try/catch 처리
	}

	public static String readString() throws IOException {//throws~ : 메소드를 호출할때 예외처리를 처리하는 명령
		byte[] buf = new byte[100];
		System.out.println("문자열 입력 : ");
		//		try {
		//			System.in.read(buf);//System.in -> 입력스트림을 열게됨
		//		} catch (IOException e) {
		//			// TODO Auto-generated catch block
		//			e.printStackTrace();
		//		}//바이트 입력을 넣으면 바이트 뭐???-> 꼭 책참고해보기

		System.in.read(buf);//System.in -> 입력스트림을 열게됨

		return new String(buf);
	}
	/*
	 	static : 프로그램 실행하자마자 생성 -> 바로 호출가능함
	 	static이 아닌 함수 호출 -> 객체생성후 호출해야함
	 */
}
