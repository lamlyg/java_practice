package d09;

/*
 	익명클래스(무명클래스)
		클래스 몸체가 정의되고 이름이 없는 클래스
		클래스의 선언과 객체의 생성을 동시에 -> 일회용클래스(단 한번만 사용가능 / 오직 하나의 객체만 생성가능)
---------------------------------------------------------------
	이름이 있는 클래스										
		class TV implements RemoteControl{
			구현코드들;
		}
		
	RemoteControl rc = new TV();	클래스선언(이름붙임)->객체생성->주소를 반환->참조변수에 저장
---------------------------------------------------------------
	익명클래스
		RemoteControl rc = new RemoteControl(){			클래스선언과 동시에 객체생성해서 주소반환 
			구현코드들;
		}
 */

interface Remotable{
	void turnOn();
	void turnOff();
}

public class AnonymousClassTest {
	public static void main(String[] args) {
		//--------------------------------------------
		
		//클래스를 정의하면서 동시에 객체생성 -> 이름이 없어서 한번만 사용가능 -> 코드의 양을 줄일 수 있음
		 
		Remotable rc = new Remotable() {
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				System.out.println("ON");
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				System.out.println("OFF");				
			}
		};//세미콜론!
		//---------------------------------------------
		
		rc.turnOn();
		rc.turnOff();
	}
}
