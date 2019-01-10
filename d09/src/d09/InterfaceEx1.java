package d09;

/*
 	인터페이스를 사용하는 이유
 	
 		1. 시스템을 구성하는 클래스들을 효율적으로 디자인할 수 있음
 		2. 정형화된 틀안에서 클래스를 개발할 수 있음 (메소드 in/out/이름이 정해져있기 때문)
 		3. 서로 연관이 없는 클래스들끼리 관계를 맺을 수 있음

 */

/*
 	소리내기 인터페이스 : Soundable (~할 수 있는)->인터페이스 이름짓기
 		Sound() 선언
 		
 	구현클래스
 		Cat클래스
 		Dog클래스
 */

interface Soundable{
	void Sound();//함수 앞에 abstract 선언 안해도됨 (왜냐하면 인터페이스에는 추상메소드만 선언 가능함)
}

class Cat implements Soundable{

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("Meow");
	}
	
}

class Doggy implements Soundable{

	@Override
	public void Sound() {
		// TODO Auto-generated method stub
		System.out.println("Bow Wow");		
	}
	
}

public class InterfaceEx1 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Doggy dog = new Doggy();
		
		//인터페이스도 구현클래스들을 참조할 수 있음-> 3. 서로 연관이 없는 클래스들끼리 관계를 맺을 수 있음(~=다형성)
		Soundable sound = new Cat();
		Soundable sound2 = new Doggy();
	}
}
