package d08_2;

/*
 	추상 클래스 (abstract class)
 		클래스의 공통적인 특성을 추출해서 선언한 클래스
 	
 	추상클래스 선언형식
 	
 	[public] abstract class 클래스명{
 		필드
 		생성자
 		메소드 	
 	} 	 
 	
 	추상클래스의 용도
 		
 		1. 실체클래스들의 공통된 필드와 메소드의 이름을 통일할 목적 (*실체클래스 ~= 추상클래스의 자식클래스)
 			*실체클래스 : 객체를 직접 생성할 수 있는 클래스 <-> 추상클래스 : 객체 직접 생성 불가
 			
 			*추상클래스와 실체클래스
 			-추상클래스 =부모 & 실체클래스=자식
 			-실체클래스는 추상클래스의 모든 특성을 물려받고, 추가적인 특성을 가질 수 있음
 			
 		2. 실체클래스를 작성할 때 시간을 절약
 		
 	
 	추상클래스 : 추상메소드가 있는 클래스
 			
 			*추상메소드와 오버라이딩
 				추상클래스는 실체클래스의 멤버(필드, 메소드)를 통일화하는데 목적이 있음
 				모든 실체클래스들이 가지고 있는 메소드의 실행내용이 동일하다면 추상클래스에 메소드를 지정하는 것이 좋음
 				하지만, 메소드의 선언만 통일하고 실행내용은 실체클래스마다 달라야하는 경우가 있음
 				-> 추상메소드 -> 추상클래스내에서만 선언 가능
 			*추상메소드
 				추상클래스에서만 선언가능
 				메소드의 선언부만 있고 메소드 실행내용이 없는 메소드
 */

abstract class Phone{	//추상클래스
	public String owner;
	
	public Phone(String owner) {
		this.owner = owner;
	}
	public void turnOn() {
		System.out.println("전원켬!");
	}
	public void turnOff() {
		System.out.println("전원끔!");
	}
}



class SmartPhone extends Phone {

	public SmartPhone(String owner) {
		super(owner);
		// TODO Auto-generated constructor stub
	}
	
	public void internetSearch() {
		System.out.println("인터넷연결");
	}
}

public class PhoneTest {
	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone("갤럭시");
		sp.turnOn();
		sp.turnOff();
		sp.internetSearch();
//		Phone phone = new Phone("갤럭시");//*안됨! => 추상클래스는 실체 객체를 생성할 수 없음 (∵ 자식클래스를 )
				
	}
}
