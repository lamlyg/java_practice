package d07;

/*
UML(Unified Modeling Language)
통합 모델링 언어

객체지향 소프트웨어에서 집약시스템을 개발할 때 산출물을 명세화, 시각화, 문서화할 때 사용

클래스 다이어그램 (Java에서 많이 사용하게 되는 UML)
: 클래스 내부의 정적인 내용이나 클래스 사이의 관계를 표현하는 다이어그램으로 시스템의 일부 또는 전체 구조를 나타냄

클래스의 이름, (속성), (기능)  //():생략가능
-속성 : 필드
-기능 : 메소드


	///////////////////
	//               // 클래스의 이름
	//  User         //
	//               //
	///////////////////
	//               // 필드
	// -age : int    // 
	// -name :String //
	//               //
	///////////////////
	//               // 메소드
	//  +            //
	//               //
	//               //
	///////////////////
	
	//접근제한자 : (-) private (+)public
*/


class DeskLamp {
	
	private boolean isOn;
	
	public void turnOn() {
		isOn=true;
	}
	
	public void turnOff() {
		isOn=false;		
	}

	public String toString() {
		return "DeskLamp : "+((isOn==true)?"ON":"OFF");
	}	
}

public class DeskLampTest{
	public static void main(String[] args) {
		DeskLamp d1 = new DeskLamp();
		d1.turnOn();
		System.out.println(d1);
		d1.turnOff();
		System.out.println(d1);		
	}
}

	//////////////////////
	// DeskLamp         //
    //////////////////////
	// -isOn : bool		//
	//////////////////////
	// +turnOn()		//
	// -turnOff()		//
	//////////////////////