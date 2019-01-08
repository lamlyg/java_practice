//package d07;
//
////정적필드
///*
// 	정적필드의 용도
// 	1. 모든 객체가 하나의 데이터를 공유하기 위해서
// 	2. 모든 객체에서 공통적으로 사용할 상수를 설정하기 위해서
//-------------------------------------------------------------------------------------------
//지역변수 : 메소드 내에서 생성, 메소드가 종료될 때 사라짐
//필드 : 클래스 내부에 정의 ,해당 클래스가 객체화될때마다 각 객체에서 생성, 해당 객체가 소멸할 때 사라짐
//정적필드 : 클래스 내부에 static 키워드를 포함해서 정의, 프로그램이 실행될 때 생성, 프로그램이 종료될때 사라짐 -> 클래스 변수라고도 부름
//-------------------------------------------------------------------------------------------
//정적 메소드
//	정적 필드를 private으로 주면 클래스 밖에서 접근이 안됨
//	getter가 필요함 -> 정적 메소드 이용
//*/
//
//class Car2{
//	private int speed;
//	private String color;
//	private int mileage;
//	private int id;
//	
//	//정적필드
//	//Car클래스의 모든 객체들이 해당 클래스로 부터 몇개의 객체들이 지금까지 만들어졌는지에 대한 정보를 공유
//	
//	//public static int numberofCars;//차의 갯수를 저장하기 위한  (객체를 생성할때마다 증가)
//	//->정적변수를 private으로 바꿈
//	private static int numberofCars;
//	
//	public static int getNumberofCars() {//static을 붙인 이유 -> getter가 static을 만든다음에 불러야하기 때문
//		return numberofCars;
//	}
//	
//	public Car2() {
//		id = ++numberofCars;
//	}	
//	
//	//자동차 속도 상수지정
//	//private final int INCREASE_AMOUNT=10; (X)
//	//각각의 객체가 항상 같은 값을 가질테니까 각각의 객체에 따로 저장공간을 두는 것은 낭비->static
//	//이런 상황을 해결하기 위해 정적변수(필드) 사용
//	private static final int INCREASE_AMOUNT = 10;
//	
//	
//	public void speedUp() {
//		speed += INCREASE_AMOUNT;
//	}
//	
//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//
//	public int getSpeed() {
//		return speed;
//	}
//	public void setSpeed(int speed) {
//		this.speed = speed;
//	}
//	public String getColor() {
//		return color;
//	}
//	public void setColor(String color) {
//		this.color = color;
//	}
//	public int getMileage() {
//		return mileage;
//	}
//	public void setMileage(int mileage) {
//		this.mileage = mileage;
//	}
//
//	@Override
//	public String toString() {
//		return "Car2 [speed=" + speed + ", color=" + color + ", mileage=" + mileage + ", id=" + id + "]";
//	}
//
//	
//	
//}
//public class CarTest2 {
//	public static void main(String[] args) {
//		Car2 c1 = new Car2();
//		Car2 c2 = new Car2();
//		
//		c1.setColor("BLUE");
//		c1.setSpeed(100);
//		c1.setMileage(10000);
//		
//		c2.setColor("RED");
//		c2.setSpeed(200);
//		c2.setMileage(20000);
//		
//		System.out.println(c1);
//		System.out.println(c2);
//
////		System.out.println(c1.numberofCars); (△) // 참조변수->객체 
//		System.out.println(Car2.numberofCars);//(O) 참조변수->객체 
//		/*  ↑
//		 	객체참조변수로 접근 가능하지만
//		 	기본적으로 정적 필드는 클래스명, 정적변수로 접근하는 것이 맞음
//		 	이유? 객체가 없을 때에도 존재하고 그때도 사용하려면 클래스, 정적변수로 사용하는 것이 적절함
//		 */
//		
//		
//		//Car2 -> 각각의 객체에 필드, 메소드가 존재!
//		//정적필드/정적
//	}
//}
