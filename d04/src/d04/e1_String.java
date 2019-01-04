package d04;

/*
자바의 메모리 영역
1)메소드 영역
 -메소드와 클래스 데이터를 저장하기 위한 공간
 -모든 프로그램에 의해서 공유
2)힙영역
 -동적으로 할당하여 사용할 수 있는 메모리
 -주로 Runtime으로 생성되는 객체를 저장
3)스택영역
 -메소드 호출시 메소드의 매개변수, 지역변수, 임시변수 등을 저장하기 위한 스택 구조의 메모리
 -실행 중인 프로그램에 따라 스택 프레임 할당
 
참조타입 변수 -> 주소값을 비교 (같은꾸러미를 쓰는 것인지 -!)
-기본타입 변수는 스택영역에 직접 값을 가지고 있음
-참조타입 변수는 값이 아니라 힙영역의 객체 주소를 가지고 있음

참조변수의 ==,!= 연산
==,!= 연산
-기본타입 : 변수의 값이 같은지 아닌지를 조사
-참조타입 : 주소값을 비교 / 동일한 객체를 참조하는지, 다른 객체를 참조하는지를 알아볼 때 사용

*/
public class e1_String {
public static void main(String[] args) {
		
		//문자열은 String 객체로 생성되고 변수는 String 객체로 참조함
		//자바에서는 문자열 리터럴이 동일하다면 String 객체를 공유함
		String name1 = "홍길동";//참조타입
		String name2 = "홍길동";
		
		//name1과 name2는 String 객체를 공유함
		//new연산자 : 힙영역에 새로운 객체를 만들때 사용하는 연산자, 객체 생성 연산자
		String name3 = new String("홍길동");
		String name4 = new String("홍길동");
		//name3와 name4는 주소값이 다름 / 서로 다른 객체를 공유하고 있는 것임
		//->name3와 name4는 서로 다른 객체를 참조
		
		String str1 = "홍길동";//참조타입
		String str2 = "홍길동";
		
		if(str1==str2) System.out.println("str1과 str2는 참조가 같음");
		else System.out.println("str1과 str2는 참조가 다름");
		
		
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		if(str3==str4) System.out.println("str3과 str4는 참조가 같음");
		else System.out.println("str3과 str4는 참조가 다름");
		
		//String문자열 데이터를 비교
		if(str3.equals(str4)) System.out.println("str3와 str4는 문자열이 같음");
		//참조값이 아닌 문자열 자체를 비교하기 위해서는 equals 메소드를 쓰는것이 좋음
		
		//null
		//참조 타입변수는 힙영역의 객체를 참조하지 않았다는 뜻으로 null값을 가질 수 있음
		String str5 = null;
		System.out.println(str5.length());//NullPointerException
		
		//참조타입변수가 null값을 가지고 있는 경우, 참조타입변수를 사용할 수 없음
		//참조타입변수를 사용하는 것은 곧 객체를 사용하는 것을 의미하는데
		//참조할 객체가 없으므로 사용할 수가 없음
		
		//NullPointerException이 발생하면 예외가 발생된 곳에서 객체를 참조하지 않은 상태의
		//참조타입변수가 사용되고있다는 뜻임
		//변수를 추적해서 객체를 참조하도록 수정
		
		
		//Scanner input = new Scanner(System.in);
	}
}
