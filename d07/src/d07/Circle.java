package d07;

//Class Point + Circle + CircleTest

public class Circle {
	
	//Field
	private int rad;//반지름  cf.파란색 - 필드 / 갈색 - 변수
	private Point center;//좌표
	
	public Circle() {
		rad = 0;
		center = new Point();
	}
	
	public int getRad() {
		return rad;
	}
	
	public void setRad(int rad) {
		this.rad=rad;
	}
	
	public Point getCenter() {
		return center;
	}
	
	public void setCenter(Point center) {
		this.center.setX(center.getX());
		this.center.setY(center.getY());
	}

	@Override
	public String toString() {
		return "Circle [rad=" + rad + ", center=" + center + "]";
	}
	
	
	
}
