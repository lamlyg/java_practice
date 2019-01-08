package d07_2;

public class Car {
	public int speed;
	public int gear;
	public String color;
	
	public void setGear(int newGear) {
		gear = newGear;
	}
	
	public void speedUp(int increament) {
		speed+=increament;
	}
	
	public void speedDown(int increament) {
		speed-=increament;
	}

	@Override
	public String toString() {
		return "Car [speed=" + speed + ", gear=" + gear + ", color=" + color + "]";
	}
	
	
	
}
