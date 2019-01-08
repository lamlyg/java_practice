package d07_2;

public class CarTest {
	public static void main(String[] args) {
		SuperCar scar = new SuperCar();
		scar.color = "red";
		scar.setGear(3);
		scar.speedUp(200);
		//SportCar클래스에는 color필드도 메소드도 선언되어있지 않음
		//그렇지만 부모클래스인 Car 클래스에 선언이 되어있으므로 사용가능
		System.out.println(scar);
		scar.setTurbor(true);
	}
}
