package d06;
//To Execute class Car (in Car.java)

//실행클래스
//메인 함수가 있는 클래스
//객체를 생성해서 사용하는 클래스
public class CarTest {
	public static void main(String[] args) {
		Car c1 = new Car();//Car라는 클래스로 객체를 생성
		//->new연산 수행 후, 힙영역에 생성(Car는 참조타입)->힙 영역에 있는 주소값을 가지고 옴 (주소값->c1변수에 저장)
		
		Car c2 = new Car();//Car라는 클래스로 객체를 생성

		c1.color = "RED";
		c1.speed = 300;
		c1.mileage = 10000;
		
		c2.color = "BLACK";
		c2.speed = 200;
		c2.mileage = 5000;

		c1.print();
		c2.print();
		c1.speedUp(10);
		c1.print();
		
		System.out.println(c1);//[Source]->[Generate toString]->[Generate] 이용 : (주소값출력이 아닌)필드안의 내용을 출력하도록 만듬
		
		/*
		 	클래스의 구성
		 	
		 	필드
		 		객체의 데이터가 저장되는 곳
		 		생성자와 메소드전체에서 사용되고 객체가 소멸하지 않는 한 객체와 함께 존재함
		 		
		 	메소드
		 		객체의 동작에 해당하는 실행 블록
		 	
		 	생성자(constructor)
		 		객체 생성시 초기화 역할을 담당
		 		
		 	
		 	객체의 일생
		 	1. 객체의 생성 : new연산자를 이용해서 힙영역에 객체가 생성됨
		 	2. 객체의 사용 : 참조변수를 이용해서  속성 및 메소드를 사용함
		 	3. 객체의 소멸 : 참조를 잃으면(객체를 참조하고 있는 참조변수가 없다면) garbage collector에 의해 소멸함
		 	
		 	객체의 생성
		 	 : new연산자
		 	객체의 메소드 호출
		 	 : . 도트연산자(접근연산자)를 이용해서 메소드 호출
		 	 
		 	 클래스에서 변수와 필드
		 	 -변수: 생성자와 메소드 내에서만 사용되고 생성자와 메소드가 실행종료되면 자동으로 소멸함
		 	 -필드: 클래스 블록{} 안에서 어디든지 선언가능 (생성자와 메소드안 제외)
		 	 
		 */
		
	}
}
