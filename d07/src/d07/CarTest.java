package d07;

class Car{
	private int speed;
	private String color;
	private int mileage;
	
	/* 생성자 문법
	 	
	 	접근제한자 클래스명(매개변수){
	 		초기설정코드;
	 	}
	 	
	 */
	public Car(){ //Constructor
		speed = 0;
		color = "red";
		mileage = 0;
	}
	
	public Car(int s, String c, int m){ //Constructor
		speed = s;
		color = c;
		mileage = m;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", color=" + color + ", mileage=" + mileage + "]";
	}
	
	
	/*
	 	생성자(Constructor)
	 		객체가 생성될 때, 필드에 초기값을 제공하고 필요한 초기화 절차를 하는 메소드
	 	
	 		Car mycar = new Car(); -> 컴파일러가 자동으로 기본생성자를 생성
	 		주의! - 생성자를 따로 선언 및 생성을 하면 기본생성자 지원 X -> 사용자가 기본 생성자를 직접 만들어야함
	 		
	 	기본생성자 (:매개변수가 없는 생성자)
	 	: 만약 클래스 작성시에 생성자를 하나도 만들지 않았을 경우에는 자동적으로 메소드의 몸체가 비어있는 생성자가 만들어짐
	 	그러나, 생성자가 하나라도 정의되어있다면 기본 생성자는 만들어지지 않음
	 	-> 즉, 컴파일러가 자동적으로 기본 생성자를 추가해주는 경우는 *클래스내에 생성자가 하나도 없을 때*뿐!!!
	 	
	 	클래스에 생성자가 명시적으로 선언되어있을 경우세는 반드시 선언된 생성자를 호출해서 객체를 생성해야함
	 	기본생성자도 작성해야함
	 */
	
	/*
	 	생성자 오버로딩
	 	
	 	외부에서 제공되는 다양한 데이터를 이용해서 객체를 초기화하기 위해서는 생성자도 다양화될 필요가 있음
	 	자바는 다양한 방법으로 객체를 생성할 수 있도록 생성자 오버로딩을 제공
	 	생성자 오버로딩이란 매개변수를 달리하는 생성자를 여러개 선언하는 것
	 */
	
	public Car(String color) {
		this(color, 80, 100); //* this() : 자신의 다른 생성자를 호출 코드, 반드시 생성자의 첫줄에만 쓸 수 있음!
	}
	public Car(String color,int speed) {
		this(color,speed, 1000);//->this를 이용하여 소스코드를 줄일 수 있음
	}
	public Car(String color,int speed, int mileage) {//마지막생성자를 호출해서 반복되는 코드를 막을 수 있음
		this.color = color;
		this.speed = speed;
		this.mileage = mileage;
	}
	//but, 생성자가 쓸데없이 반복되고 있음!
}

public class CarTest {
	public static void main(String[] args) {
		Car mycar = new Car(); //기본생성자를 만들어줌
		//new : 객체 생성연산자 / Car() : Car클래스의 기본 생성자
		Car mycar2 = new Car(100,"black",10);//내가 정의한 생성자의 매개변수에 맞춰서 인자를 넣어줌 
		Car mycar3 = new Car("pink");
		System.out.println(mycar);
		System.out.println(mycar2);
		System.out.println(mycar3);
	}
}
