package d09;

import java.util.Date;
import java.util.StringTokenizer;

//자바 기본 기능 및 기본 클래스 및 기본 함수

public class Test {
	public static void main(String[] args) {
		/*
		 	자바 API클래스
		 		프로그램에서 자주 사용되는 클래스 및 인터페이스 모음
		 	
		 	System 클래스
		 		자바프로그램은 운영체제상에서 바로 실행되지 않고 JVM위에서 실행됨
		 		따라서 운영체제의 모든기능을 자바코드로 직접 접근하기 어려움
		 		System클래스를 이용하면 운영체제의 일부기능 사용가능
		 */
//		System.out.println(System.currentTimeMillis());//System하고 . 찍으면 기능이 나옴 -> static
		//currentTimeMillis() : 컴퓨터 시계로부터 현재시간을 읽어서 밀리세컨 단위로 리턴 (1970년 1월 1일 자정과 현재 시간의 차이)
//		System.out.println(System.nanoTime());//나노세컨으로 출력
		//1~1000000까지의 합을 구하는 프로그램이 실행되는 시간 출력
		int sum=0;
		long time1 = System.currentTimeMillis();
		for(int i=1;i<=1000000;i++) {
			sum+=i;
		}
		long time2 = System.currentTimeMillis();
		System.out.println("It takes "+(time2-time1)+" millisec");
		
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		
		//Class 클래스
		//클래스와 인터페이스의 메타데이터
		
		
		//String 클래스
		String s1 = new String("홍길동");
		
		//charAt : 문자추출
		System.out.println(s1.charAt(1));
		
		//equals() : 비교
		
		//문자열 대치 : replace
		//(이전문자열).replace(첫,두) : 첫번째 매개면수에 있는 문자열을 찾아 두번째 매개변수에 있는 문자열로 대치한 다음 참조값 리턴
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "java");
		System.out.println(newStr);
		
		//문자열 찾기 : indexof()
		int index = oldStr.indexOf("프로그래밍");
		System.out.println(index);
		
		//문자열 잘라내기 : subString()
		String ssn = "880918-1234567";
		String firstNum = ssn.substring(0, 6);
		System.out.println(firstNum);
		
		//split()
		String str1 = "철수,영희,자바,형식";
		String[] str_arr = str1.split(",");
		for(String s : str_arr) {
			System.out.println(s);
		}
		
		//StringTokenizer 클래스 - 문자열을 자르는 기능
		StringTokenizer st= new StringTokenizer("hello world welcome to hell");
		while(st.hasMoreTokens()) {	//문자열을 가지고 있는지 없는지
			System.out.println(st.nextToken());
		}
		
		//StringBuffer 클래스
		StringBuffer sb = new StringBuffer();
		String str2 = sb.append("Hello").append("world").append("\n").append("welcome").toString();
		System.out.println(str2);
		
		/*
		 	Wrapper 클래스
		 	기초자료형 객체로 포장해주는 클래스
		 	
		 	Integer 클래스 : 기초자료형 int를 객체로 포장해줌
		 */
		int i1 = 10; //기초자료형, 기능이 없음!
		Integer in1 = new Integer(10);//박싱 : 기본타입 -> 포장객체
		int i2 = in1.intValue();//언박싱 : 포장객체 -> 기본타입
		
		Integer in2 = 10; //자동 박싱
		int i3 = in2; //자동 언박싱
		
		//문자열 -> 기초자료형
		int i4 = Integer.parseInt("10"); //parseInt : 문자열을 int형으로 바꿔줌
		
		//기초자료형 ->(바로안됨)->박싱(포장객체만들어야함)-> 문자열
		String s5 = in2.toString();
		
		//Date 클래스 : 날짜를 표현하는 클래스
		Date d = new Date();//Util로 바꿔야함
		Date d2 = new Date(System.currentTimeMillis());
		System.out.println(d2.getDate());
		
		
		
	}
}
