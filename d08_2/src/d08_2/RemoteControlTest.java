package d08_2;

public class RemoteControlTest {
	public static void main(String[] args) {
		
		/*
		 	TV 구현클래스를 작성!
		 */
		RemoteControl rc1 = new Audio();
		
		RemoteControl rc2 = new TV();
		
		rc1.turnOn();
		rc1.turnOff();
		
		rc1 = new TV();
		
		rc1.turnOn();
		rc1.turnOff();

		rc2.turnOn();
		rc2.turnOff();
	}
}
