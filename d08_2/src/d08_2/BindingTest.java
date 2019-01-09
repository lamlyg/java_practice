package d08_2;

/*
 	동적바인딩
 		부모클래스의 참조변수로 자식클래스의 객체를 참조해서 부모 클래스에 존재하는 메소드를 호출할 때
 		해당 메소드가 오버라이딩 되어있다면 실제 호출하는 함수는 
 		자식클래스의 메소드가 실행된다.
 */

class Parent{
	int x = 100;
	
	void method() {
		System.out.println("Parent Method");
	}
}

class Child extends Parent{
	int x = 200;
	
	//if 자식 객체에 오버라이딩 된 메소드가 없다면 (아래의 method()가 주석처리되면->Parent.method()가 출력됨)
	//부모메소드 찾아서 실행
	//=>동적바인딩
	void method() {//Overriding
		System.out.println("Child Method");
	}
}

public class BindingTest {
	public static void main(String[] args) {
		Parent p = new Child();
		Child c = new Child();
		
		System.out.println(p.x);
		System.out.println(c.x);
		p.method();
		c.method();
	}
}
