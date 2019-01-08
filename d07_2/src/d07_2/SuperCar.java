package d07_2;

/*
	상속
	부모 클래스의 멤버를 자식클래스에 물려주는 행위
	
	상속의 장점
	상속을 통해서 기존 클래스의 필드와 메소드를 재사용
	기존 클래스의 일부도 변경 가능
	이미 작성된 검증된 소프트웨어를 재사용
	코드의 중복을 방지할 수 있음
	
부모클래스, 슈퍼클래스 : 상위클래스
자식클래스. 서브클래스 : 하위클래스(파생클래스)

class 자식클래스 extends 부모클래스{
	
}

*/

//자식클래스에서 추가되는 내용 선언 가능
public class SuperCar extends Car {//extends Car->Car를 상속받아서 SuperCar 클래스를 만들고자 함
	boolean turbo;
	
	public void setTurbor(boolean isOn) {
		turbo = isOn;
	}
	
}
