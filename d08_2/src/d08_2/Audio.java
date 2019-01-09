package d08_2;
/*
	interface (인터페이스)
		추상클래스의 극단적인 경우
		인터페이스는 추상메소드들로만 이뤄짐
		이 추상메소들은 특정 인터페이스를 따르는 클래스들을 위한 요구조건 역할을 함
	
	인터페이스의 사전적 의미
		두 가지 주제 혹은 시스템이 상호작용하기 위한 장치
	
	(비유)
	컴퓨터 ㅡ USB ㅡ 스마트폰
		   | (인터페이스로 연결) -> 어떤 기기든 USB를 지원하기만하면 컴퓨터에 연결가능
		   카메라
		   
	(형식)
	public interface 인터페이스명{ //[인터페이스]
		반환형 추상메소드1(매개변수);
		반환형 추상메소드2(매개변수);
		반환형 추상메소드3(매개변수);		
	}
	
	(인터페이스는 추상적이기 때문에 구현클래스를 만들어야함)
	
	 
	public class 구현클래스 implements 인터페이스명 //[구현클래스]
	
 */

//RemoteControl 인터페이스를 구현
public class Audio implements RemoteControl {
	
	private int vol;
	
	
	//인터페이스의 추상메소드를 구현해야하는 의무를 가짐
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Audio ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("Audio OFF");		
	}

	@Override
	public void setVolume(int Volume) {
		// TODO Auto-generated method stub
		vol=Volume;
	}
	
}

class TV implements RemoteControl {
	
	private int vol;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV ON");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV OFF");	
	}

	@Override
	public void setVolume(int Volume) {
		// TODO Auto-generated method stub
		vol=Volume;
	}
	
}










