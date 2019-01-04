package d02;

public class ex1_Variable {
	public static void main(String[] args) {
		/*
		 데이터 타입
		 - 기본 타입 
			 정수형
			 문자형
			 실수형
			 논리형
		 */
		
		int i = 26; //10진수로 26을 표현
		int oi = 032; //8진수로 26을 표현
		int xi = 0x1a; //16진수로 26을 표현
		
		System.out.println(i);
		System.out.println(oi);
		System.out.println(xi);
		
		//long : 부호가 있는 정수
		//64bit로 정수를 저장
		//수치가 큰 데이터를 다루는 프로그램에서 long타입 사용
		//은행, 우주관련 프로그램
		long lightspeed;
		long distance;
		
		lightspeed = 300000L; //맨뒤에 L을 붙이면 long타입이라는 것을 알려줌
		distance = lightspeed * 365 * 24 * 60 * 60;
		System.out.println("빛이 1년동안 가는거리 : "+distance+"km");
		
		//실수형
		//소수점이 있는 실수 데이터를 저장
		//float : 32bit (7개 정도의 유효숫자 표현)
		//double : 64bit (15개 정도의 유효숫자 표현)
		
		//자바는 실수의 지본타입을 double로 간주함
		
		
		float rad, area;
//		float PI = 3.141592; -> 오류
		float PI = 3.141592F;
//		double PI = 3.141592; -> F없음
		rad=5;
		
		System.out.println(rad*rad*PI);
		
		//boolean
		boolean b = 1>2;
		System.out.println("b : "+b);
		
		//문자형
		char c;
		c = 'A';
		System.out.println(c);
		c = 65; //10진수로 저장
		System.out.println(c);
		c ='\u0041'; //16진수로 저장
		System.out.println(c);
		
		c='가';
		System.out.println(c);
		c=44032;//10진수로 저장
		System.out.println(c);
		c='\uac00';//16진수로 저장
		System.out.println(c);
		
		//*Tip : char형은 보통 string형의 데이터 중 문자를 찾을 때 사용
		
		//문자열 (String) -> 큰따옴표로 표시
		String s = "hello";
		System.out.println(s);
		//문자열끼리 +로 결합
		System.out.println(s+s);
		
		
		
		
	}
}
