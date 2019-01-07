package d06_2;

public class Car {
	
	/*
		main메소드를 가지지 않는 대부분의 클래스는 외부클래스에서 이용할 목적으로 설계된 라이브러리 클래스
		
		라이브러리 클래스를 설계할 때는 외부 클래스에서 접근할 수 있는 멤버와 접근할 수 없는 멤버를 구분하는 것이 바람직함.
		
		이러한 기능을 구현하기 위해 접근 제한자(Access Modifier)를 사용
		
		클래스 내에서만 사용할지 외부 클래스에서 사용가능하게 할 것인지 접근제한자 설정이 가능
		
		public : 모든 클래스로부터 접근가능
		private : 클래스 내부에서만 접근 가능
		
		getter/setter 메소드
		
		일반적으로 객체지향 프로그래밍에서는 객체의 데이터는 객체 외부에서 직접적으로 접근하는 것을 막음
		-객체의 데이터를 외부에서 마음대로 읽고 변경할 경우 객체의 무결성(결정이 없는 상태)이 깨어질 가능성이 커짐
		
		예를 들어 외부에서 직접 데이터에 접근하여 Car객체의 speed를 음수로 설정하면
		우리가 설계한 Car클래스에 결점이 생김
		이러한 문제점을 해결하기 위해서 
		메소드를 통해서 데이터를 변경하는 방법을 선호함
		
		필드의 값을 설정하는 것이 필요함
		->설정자(setter) : 필드의 값을 설정하는 메소드
		->접근자(getter) : 필드의 값을 가져오는 메소드
		
		설정자/접근자 사용 이유
		1. 외부에서 데이터 직접 전근하는 것을 막기 위해
		2. 입력값에 대한 검증 가능
		3. 세분화된 접근제어 가능(일기전용, 쓰기전용, 둘다 됨, 둘다 안됨)
		
		getter
			1. 접근제한자 : public
			2. 반환유형 : getter를 통해서 리턴하고자 하는 필드의 반환형
			3. 메소드명 : get+필드명(첫글자 대문자) 
			4. 매개변수 : 없음
			5. 실행코드 : return 필드명;
			
		setter
			1. 접근제한자 : public
			2. 반환유형 : void
			3. 메소드명 : set+필드명(첫글자 대문자)
			4. 매개변수 : setter를 통해서 필드에 설정 데이터 타입과 같은 매개변수
			5. 실행코드 : 필드데이터 = 매개변수;
		
		
	*/
	
	private int speed;
	private String color;
	int mileage;
	
	//외부에서 속도값을 하나받아서 속도필드에 넣어주는 메소드
	//외부에서 받은 값이 0~300일 경우만 저장되게 하는 메소드
	
	
	//setter
	public void setSPEED(int s) {
		if(s>=100&&s<=300) speed = s;
	}
	public void setCOLOR(String c) {
		color = c;
	}
	public void setMILEAGE(int m) {
		mileage = m;
	}
	
	//getter
	public int getSPEED() {
		return speed;
	}
	public String getCOLOR() {
		return color;
	}
	public int getMILEAGE() {
		return mileage;
	}
	
	
	public void speedUp(int s) {
		speed+=s;
	}
	
	public void speedDown(int s) {
		speed-=s;
	}
	
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", mileage=" + mileage + "]";
	}
	
	
}
