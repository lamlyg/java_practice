package d08_2;

import d08_2.OuterClass.InnerClass;


/* 외부클래스
 	
	class 외부클래스{
		class 내부클래스{
			
		}
	}
	
	내부클래스를 사용하는 이유
	- 특정 멤버변수를 외부에서 자주 사용한다고 할 떄 사용이 효율적이지 못한 경우가 있음
	    특정 멤버를 public으로 하는 것은 캡슐화에 어긋함. 이럴경우 내부 클래스를 이용해서 
	    특정 필드는 private을 유지하면서 자유롭게 사용가능
	- 하나의 장소에서만 사용되는 클래스를 한 곳에 모을 수 있음
	- 보다 읽기 쉽고 유지보수가 쉬운 코드
	
	
 */

class OuterClass{
	private String secret = "키키";
	
	/*
	 	외부클래스 생성하면 내부클래스 객체가 생성될까? -> 생성되지 않음
	 	즉, 외부클래스 생성시 내부클래스 객체가 생성되게 하고싶다면 생성자호출해야함
	 */
	public OuterClass() {
		//내부클래스 객체화
		InnerClass in = new InnerClass();
		in.method();
	}
	class InnerClass{
		public InnerClass() {
			System.out.println("내부 클래스 생성자");
		}
		
		public void method() {
			System.out.println(secret);
			//외부함수의 private 접근제한자에도 접근 가능
		}
	}
	
}

public class OuterClassTest {
	public static void main(String[] args) {
		OuterClass out = new OuterClass();
		InnerClass in = out.new InnerClass();//import 선언해야함
		
		//OuterClass.InnerClass in = out.new InnerClass(); //<- 내부클래스 호출 방법 (import 선언없이 사용가능)
		
	}
}
