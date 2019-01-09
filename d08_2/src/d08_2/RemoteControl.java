package d08_2;
/*
 	인터페이스 : 추상메소드들로만 이뤄짐 (필드X)
 	 cf. 필드 O -> 추상클래스
 */

public interface RemoteControl {
	//추상메소드
	void turnOn();
	void turnOff();
	void setVolume(int Volume);
}
