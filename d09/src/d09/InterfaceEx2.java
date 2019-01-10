package d09;

/*
 	다중인터페이스
 		자바는 다중 상속을 지원하지 않지만, 다중 인터페이스는 지원함
 */

interface SayHello{
	void sayHello();
}

interface SayBye{
	void sayBye();
}

class Kor implements SayHello{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("안녕하세요.");
	}
	
}

class Eng implements SayHello{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("Hello.");
	}
	
}

//다중인터페이스
// class 클래스명 implements 인터페이스1, 인터페이스2
class Jap implements SayHello, SayBye{

	@Override
	public void sayHello() {
		// TODO Auto-generated method stub
		System.out.println("おはよ.");
	}

	@Override
	public void sayBye() {
		// TODO Auto-generated method stub
		System.out.println("さよなら.");		
	}
	
}

public class InterfaceEx2 {
	public static void main(String[] args) {
		SayHello hello = new Kor();
		hello.sayHello();
		
		Jap jap = new Jap();
		jap.sayHello();
		jap.sayBye();
	}
	
}
