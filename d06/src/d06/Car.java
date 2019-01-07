package d06;

//클래스 (설계 클래스) : 클래스 구조에 집중
public class Car {//Execute in class CarTest (in CarTest.java)
	/*
	 객체 : 데이터+기능
	 클래스 : 객체를 생성하기 위한 틀
	 
	 클래스의 구조 
	 [public] class 클래스이름{
	 	데이터를 담을 변수1;
	 	데이터를 담을 변수2;
	 	데이터를 담을 변수3;
	 	
	 	어떤 기능을 수행할 메소드1
	 	어떤 기능을 수행할 메소드2
	 	어떤 기능을 수행할 메소드3
	 }
	 
	 객체지향 프로그램의 순서
	 1.만들고 싶은 존재(객체)를 만들어내기 위한 틀(class)을 먼저 생성
	 2.틀(class)를 선언한 다음에는 필요할때마다 객체(object,instance)를 만들어서 각자의 필요에 맞게 사용
	 */
	
	//데이터(상태,속성) : 속도, 색상, 주행거리
	//기능(동작) : 감속, 가속, 현재상태 출력
	
	//////필드, 멤버변수///
	int speed;		///
	String color;	///
	int mileage; 	///
	///////////////////
	
	//가속기능
	public void speedUp(int s) {//->상태정보가 저장되어있는 field에 접근해서 데이터를 변경해줄 수 있음
		speed += s;
	}
	public void speedDown() {
		speed--;
	}
	public void print() {//->field의 데이터 사용가능
		System.out.println(speed);
		System.out.println(color);
		System.out.println(mileage);
	}
	
	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", mileage=" + mileage + "]";
	}
	/*
	 	메인메소드???
	 	
	 	객체지향프로그램은 클래스 구조 설계에 초점을 맞춤
	 	클래스 나중에 재사용할 것을 고려해서 만드는 틀(데이터+로직)이기 때문에
	 	이 기능을 실행하기 위한 main메소드는 만들지 않음
	 */
}
