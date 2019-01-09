package d08_2;

/*
 	Vehicle 클래스
 		run() : 차량이 달립니다. 출력
 	Bus 클래스
 		run() : 버스가 달립니다.
 	Taxi 클래스
 		run() : 택시가 달립니다.
 		
 	Driver 클래스
 		drive() : run 실행
 */

class Vehicle{
	public void run() {
		System.out.println("차량이 달립니다.");
	}
}

class Bus extends Vehicle {
	public void run() {
		System.out.println("버스가 달립니다.");
	}
}

class Taxi extends Vehicle {
	public void run() {
		System.out.println("택시가 달립니다.");
	}
}

class Driver {
	//Vehicle이 부모 -> 다형성 이용
	public void drive(Vehicle v){
		//각각의 차량이 운행되게 -> 받아온 값이 택시면 택시 슝슝 / 버스면 버스 슝슝
		if(v instanceof Bus) {
			Bus b = (Bus) v;
			b.run();
		}
		else if (v instanceof Taxi) {
			Taxi t = (Taxi) v;
			t.run();
		}
		else {
			System.out.println("Error : 운행할 수 없습니다.");
		}
		//v.run();->이거 하나만해도 instanceof 확인없이 바로 가능!
	}
}

public class DriverTest {
	public static void main(String[] args) {
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
//		bus.run();
//		taxi.run();
		
		Driver driver = new Driver();
		driver.drive(bus);
		driver.drive(taxi);
	}
}
