package d07;

//Class Point + Circle + CircleTest

public class Point {
	//field
	private int x;
	private int y;
	//*field를 private로 하여 자신만 좌지우지하게 하는 것 -> 캡슐화
	
	
	//getter/setter
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "(" + x + "," + y + ")";
	}
	
	//Constructor (생성자)
	//1.기본
	//2. x,y좌표를 설정할 수 있는 생성자
	
	public Point() {//Constructor - basic
		x=0;
		y=0;
	}
	
	public Point(int x, int y) {//Constructor - setting
		this.x = x;
		this.y = y;
	}
	
	
	
	
	
}
